package FirstPhaseLearning.trie;

class WordDictionary {
    TrieNode root;
    public WordDictionary() {
        root = new TrieNode();
    }

    public void addWord(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()){
            int idx = ch - 'a';
            if (node.children[idx] == null){
                node.children[idx] = new TrieNode();
            }
            node=node.children[idx];
        }

        node.isLastElement = true;
    }

    public boolean search(String word) {
        return searchUtility(root, word, 0);
    }

    public boolean searchUtility(TrieNode root, String word, int pos) {
        if (pos == word.length()) {
            return root.isLastElement;
        }

        char ch = word.charAt(pos);
        if (ch=='.'){
            for (int idx = 0; idx < 26; idx++) {
                if (root.children[idx] != null) {
                    if (searchUtility(root.children[pos], word, pos + 1)) {
                        return true;
                    }
                }
            }

            return false;
        }

        int idx = ch - 'a';
        if (root.children[idx]==null){
            return false;
        }

        return searchUtility(root.children[idx], word, pos+1);
    }

    class Solution {
        TrieNode root;
        public Solution() {root = new TrieNode();}

        public String longestCommonPrefix(String[] strs) {
            //Fill all strings to Tries
            for (String str : strs) {
                addStrings(str);
            }

            // Search Traversing Tries
            TrieNode node = root;
            StringBuilder string = new StringBuilder();
            while (true) {

                int count = 0, index = -1;
                for (int idx = 0; idx < 26; idx++) {
                    if (node.children[idx] != null) {
                        count++;
                        index = idx;
                    }
                }

                if (count == 1 && !node.isLastElement) {
                    string.append((char) (index + 'a'));
                    node = node.children[index];
                } else {
                    break;
                }
            }

            return string.toString();
        }

        public void addStrings(String str) {
            TrieNode node = root;
            for (char ch : str.toCharArray()) {
                int idx = ch - 'a';
                if (node.children[idx] == null) {
                    node.children[idx] = new TrieNode();
                }

                node = node.children[idx];
            }

            node.isLastElement = true;
        }
    }
}