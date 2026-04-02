package FirstPhaseLearning.trie;

public class TrieNode {
    TrieNode[] children;
    boolean isLastElement;
    public TrieNode(){
        children=new TrieNode[26];
        isLastElement=false;
    }
}
