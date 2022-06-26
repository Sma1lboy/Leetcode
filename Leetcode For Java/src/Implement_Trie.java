//Implement Trie (Prefix Tree)
public class Implement_Trie {
    //we need trienode class to create "prefix"
    class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public boolean isEnd = false;
        TrieNode(){

        }
    }

    class Trie {
        //the root should be empty
        TrieNode root;
        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word) {
            //get current node
            TrieNode curr = root;
            for(char c : word.toCharArray()) {
                //we are using character be the keyvalue in array to store which children we have
                if(curr.children[c - 'a'] == null) {
                    curr.children[c - 'a'] = new TrieNode();
                }
                // if already exist, we could skip it.
                curr = curr.children[c- 'a'];
            }
            curr.isEnd = true;
        }

        public boolean search(String word) {
            TrieNode curr = root;
            for(char c : word.toCharArray()){
                if(curr.children[c - 'a'] == null) {
                    return false;
                }
                curr = curr.children[c -'a'];
            }
            return curr.isEnd;

        }

        public boolean startsWith(String prefix) {
            TrieNode curr = root;
            for(char c : prefix.toCharArray()){
                if(curr.children[c - 'a'] == null) {
                    return false;
                }
                curr = curr.children[c-'a'];
            }
            return true;
        }
    }
}
