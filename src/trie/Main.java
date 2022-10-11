package trie;

public class Main {
    public static void main(String[] args) {
        String keys[] = {"the", "a", "there", "answer", "any",
            "by", "bye", "their","abc" };

        Trie trie = new Trie();
        for (int i=0;i<keys.length;i++){
            trie.insert(keys[i]);
            System.out.println("\""+ keys[i]+ "\"" + "Inserted.");
        }

        System.out.println("Search for key");
        System.out.println("answer key searched result :" +trie.search("answer"));
        System.out.println("hello key searched result :" +trie.search("hello"));
        if(trie.search("abc")){
            System.out.println("delete abc :");
            trie.delete("abc");
        }
    }
}
