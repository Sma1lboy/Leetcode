import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

public class Word_Search_two{



    //the thinking here is to buld the tries
    public List<String> findWords(char[][] board, String[] words) {
        //initial the rows and cols
        int rows = board.length, cols = board[0].length;
        // #3 initial the trie
        Trie trie = new Trie();
        // #4 insert every word into trie
        for(String word : words) {
            trie.insert(word);
        }
        // #5 initial the visited flag to prevent we visit same thing
        HashSet<String> res = new HashSet<>();
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                dfs(board, res, i,j, "", trie);
            }
        }
        return new LinkedList<String>(res);
    }
    public void dfs(char[][] board, HashSet<String> res, int r, int c, String s, Trie trie) {
        int rows = board.length, cols = board[0].length;
        //base case check if out of boundry or visited already, prevent self loop
        if(r < 0 || c < 0 || r >= rows || c >= cols) {
            return;
        }
        if(board[r][c] == ' ') return;

        s += board[r][c];
        if(!trie.startWith(s)) {
            return;
        }
        //now we are not out of boudry and not visited, start with
        //check if we find the word.
        if(trie.search(s)) {
            res.add(s);
        }
        //marked viisted by change it to empty
        char tmp = board[r][c];
        board[r][c] = ' ';

        dfs(board, res, r + 1, c, s, trie);
        dfs(board, res, r - 1, c, s, trie);
        dfs(board, res, r, c + 1, s, trie);
        dfs(board, res, r, c - 1, s, trie);
        board[r][c] = tmp;
    }





    // #1 build a trie node
    public class TrieNode {
        public TrieNode[] children = new TrieNode[26];
        public String word = "";
        public TrieNode(){
        }
    }
    // #2 buld a trie
    public class Trie {
        TrieNode root;
        public Trie() {
            root = new TrieNode();
        }
        public void insert(String word) {
            //do not modify the root
            TrieNode node = root;
            for(char c : word.toCharArray()) {
                //initialize before we check if it is null
                if(node.children[c - 'a'] == null) {
                    node.children[c - 'a'] = new TrieNode();
                }
                node = node.children[c-'a'];
            }
            //save the word into the last node
            node.word = word;
        }
        // search if the trie contain the word or not
        public boolean search(String word) {
            TrieNode node = root;
            for(char c : word.toCharArray()) {
                if(node.children[c - 'a'] == null) {
                    return false;
                }
                node = node.children[c - 'a'];
            }
            return node.word.equals(word);
        }
        //start with is very similar to search
        public boolean startWith(String word) {
            TrieNode node = root;
            for(char c : word.toCharArray()) {
                if(node.children[c - 'a'] == null) {
                    return false;
                }
                node = node.children[c - 'a'];
            }
            //we dont have to check if there word equal or not
            return true;
        }
    }

}
