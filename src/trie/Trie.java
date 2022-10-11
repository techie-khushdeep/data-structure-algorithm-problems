package trie;


public class Trie {
    private TrieNode root;

    Trie(){
        this.root = new TrieNode();
    }

    public int getIndex(char x){
        return x - 'a';
    }

    public void insert(String key){
        if(key == null){
            System.out.println("Null key can not be inserted");
            return;
        }
        int index = 0;
        key = key.toLowerCase();
        TrieNode currentNode = this.root;
        for (int level=0;level<key.length();level++){
            index = getIndex(key.charAt(level));

            if(currentNode.children[index]==null){
                currentNode.children[index] = new TrieNode();
            }
            currentNode = currentNode.children[index];
        }
        currentNode.markAsLeaf();
    }
    public boolean search(String key){
        if (this.root ==null || key == null){
            return false;
        }
        TrieNode currentNode = this.root;
        key = key.toLowerCase();
        int index = 0;

        for (int level = 0; level < key.length(); level++) {
            index = getIndex(key.charAt(level));
            if(currentNode.children[index] == null){
                return false;
            }
            currentNode = currentNode.children[index];
        }
        return currentNode.isEndWorld;
    }

    public void delete(String key){
        if(this.root==null || key == null){
            System.out.println("Null key or empty trie error");
            return;
        }
        this.deleteHelper(key,root,key.length(),0);
    }

    private boolean hasNoChildren(TrieNode currentNode){
        for (int i = 0; i < currentNode.children.length; i++) {
            if (currentNode.children[i] !=null){
                return false;
            }
        }
        return true;
    }

    private boolean deleteHelper(String key, TrieNode currentNode, int length, int level) {
        boolean deletedSelf = false;

        if(currentNode == null){
            System.out.println("Keys does not exist");
            return deletedSelf;
        }

        if(level == length){
            if(hasNoChildren(currentNode)){
                currentNode = null;
                deletedSelf = true;
            }
            else{
                deletedSelf = false;
                currentNode.unMarkAsLeaf();
            }
        }else{
            TrieNode childNode = currentNode.children[getIndex(key.charAt(level))];
            boolean childDeleted = deleteHelper(key,childNode,length,level+1);
            if(childDeleted){
                currentNode.children[getIndex((key.charAt(level)))] = null;
                if (currentNode.isEndWorld){
                    deletedSelf = false;
                }else if(!hasNoChildren(currentNode)){
                    deletedSelf = false;
                }else{
                    currentNode = null;
                    deletedSelf = true;
                }
            }else{
                deletedSelf = false;
            }
        }
        return deletedSelf;

    }
}
