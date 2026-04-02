package FirstPhaseLearning.trie;

public class WordFilter {
    public class TrieNode{
        TrieNode[] children = new TrieNode[27];
        int index;
    }

    private TrieNode root;
    public WordFilter(String[] words) {
        root = new TrieNode();
        for (int weight = 0; weight < words.length; weight++) {
            String word = words[weight];
            for (int idx = 0; idx <= word.length(); idx++) {
                String toInsert = word.substring(idx) + "{" + word;
                insert(toInsert, weight);
            }
        }
    }

    public void insert(String string, int index){
        TrieNode node = root;

        for (char ch : string.toCharArray()){
            int childIdx = (ch=='{') ? 26 : ch - 'a';
            if (node.children[childIdx]==null){
                node.children[childIdx] = new TrieNode();
            }

            node = node.children[childIdx];
            node.index = index;
        }
    }

    public int f(String pref, String suff) {
        String wordToSearch = suff +"{" + pref;

        TrieNode node = root;
        for (char ch : wordToSearch.toCharArray()){
            int childIdx = (ch == '{') ? 26 : ch - 'a';
            if (node.children[childIdx]==null){
                return -1;
            }

            node = node.children[childIdx];
        }

        return node.index;
    }
}

