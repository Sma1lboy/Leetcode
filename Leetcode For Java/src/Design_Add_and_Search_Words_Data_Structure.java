public class Design_Add_and_Search_Words_Data_Structure {

    class WordDictionary {
        //create a trie node class
        class TrieNode {
            //26 letter
            public TrieNode[] children = new TrieNode[26];
            public boolean isWord = false;
            public String fullWord = "";
        }
        TrieNode root;
        public WordDictionary() {
            root = new TrieNode();
        }

        public void addWord(String word) {
            //curr node
            TrieNode curr = root;
            for(char c : word.toCharArray()){
                //check if already exist
                if(curr.children[c - 'a'] == null) {
                    curr.children[c - 'a'] = new TrieNode();
                }
                //into next node
                curr = curr.children[c- 'a'];
            }
            //set it on the finnal node
            curr.fullWord = word;
            curr.isWord = true;
        }
        public boolean search(String word) {
            return dfsMatch(word, 0, root);
        }
        public boolean dfsMatch(String word, int i, TrieNode node) {
            //base case when i == word.length()
            if(i == word.length()) {
                return node.isWord;
            }
            //initial the character we curr have
            char c = word.charAt(i);
            // if the character is not .
            if(c != '.') {
                return node.children[c - 'a'] != null && dfsMatch(word, i + 1, node.children[c - 'a']);
            } else {
                //we go through all the children that node have
                for(int j = 0; j < node.children.length; j++) {
                    TrieNode currChild = node.children[j];
                    //check if the children has trienode, if not avoid it
                    if(currChild != null) {
                        //if finally we got correct path we return true
                        if(dfsMatch(word, i + 1, currChild)) {
                            return true;
                        }
                    }

                }
            }
            return false;
        }
//        public boolean search(String word) {
//            return dfsMatch(word.toCharArray(), 0, root, word);
//        }
//        public boolean dfsMatch(char[] chars, int i, TrieNode node, String word) {
//            //base case
//            if(i == word.length()) {
//                return !node.fullWord.equals("");
//            }
//            //if the character is . we can go through every node we have
//            if(chars[i] == '.') {
//                for(int j = 0; j < node.children.length; j++) {
//                    //check if the node is null or not, if null just jump over it
//                    if(node.children[j] != null) {
//                        if(dfsMatch(chars, i + 1, node.children[j], word)) {
//                            return true;
//                        }
//                    }
//                }
//            } else {
//                //if the character is not .
//                if(node.children[chars[i] - 'a'] != null && dfsMatch(chars, i + 1, node.children[chars[i] - 'a'], word)) {
//                    return true;
//                }
//            }
//            return false;
//        }
    }
}
