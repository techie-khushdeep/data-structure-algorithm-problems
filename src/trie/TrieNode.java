package trie;

public class TrieNode {
    public TrieNode[] children;
    public boolean isEndWorld;
    static final int ALPHABET_SIZE = 26;

    TrieNode(){
        this.isEndWorld = false;
        this.children = new TrieNode[ALPHABET_SIZE];
    }

    public void markAsLeaf(){
        this.isEndWorld = true;
    }

    public void unMarkAsLeaf(){
        this.isEndWorld = false;
    }
}
