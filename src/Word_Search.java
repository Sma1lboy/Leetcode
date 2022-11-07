import java.util.HashSet;
import java.util.Set;

public class Word_Search {


    public static void main(String[] args) {
        // [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]]
        // "ABCCED";
        boolean exist = exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}, "ABCB");
        System.out.println(exist);
    }
    public static boolean exist(char[][] board, String word) {
        for(int i = 0; i < board.length; i++) {
            for(int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0)) {
                    if(dfs(board, word, 0, new HashSet<>(), i, j)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
    //store visited rc as new int[]{r,c}
    private static boolean dfs(char[][] board, String word, int idx, Set<int[]> visited, int r, int c) {
        int rows = board.length, cols = board[0].length;
        //base case
        if(idx == word.length()) {
            return true;
        }
        //out of bountry and prevent loop
        if(r < 0 || c < 0 || r >= rows || c >= cols || visited.contains(new int[]{r, c}) || board[r][c] != word.charAt(idx)){
            return false;
        }

        visited.add(new int[]{r, c});
        //if it is equals curr character
        // go through 4 dir
        if( dfs(board, word, idx + 1, visited, r + 1, c) ||
                dfs(board, word, idx + 1, visited, r - 1, c) ||
                dfs(board, word, idx + 1, visited, r, c + 1) ||
                dfs(board, word, idx + 1, visited, r, c - 1)) {
            return true;
        }
        visited.remove(new int[]{r, c});
        return false;
    }
    // public boolean exist(char[][] board, String word) {
    //     int rows = board.length, cols = board[0].length;
    //     for(int i = 0; i < rows; i++) {
    //         for(int j = 0; j < cols; j++){
    //             //check if the character in board met first character in word
    //             if(board[i][j] == word.charAt(0) && dfsSearch(i,j,0,board,word)) {
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    //
    //
    // }
    //
    // //right, left, bottom, top four directions
    // int[][] dirs = {{0,1}, {0,-1}, {1,0}, {-1, 0 }};
    // public boolean dfsSearch(int r, int c, int i, char[][] board, String word) {
    //     int rows = board.length, cols = board[0].length;
    //     //base case when i equal word.length, which is means we find the word, return true
    //     if(i == word.length()) {
    //         return true;
    //     }
    //     //check if out of bound or the character now checking is not equal to word's char at
    //     if(r < 0 || r >= rows || c < 0 || c >= cols || board[r][c] != word.charAt(i)){
    //         return false;
    //     }
    //     //mark visit by change it to empty
    //     char temp = board[r][c];
    //     board[r][c] = ' ';
    //     boolean found = false;
    //     for(int[] dir : dirs) {
    //         if(dfsSearch(r+dir[0], c+dir[1], i + 1, board, word)) {
    //             found = true;
    //             break;
    //         }
    //     }
    //     //change the enmpty back
    //     board[r][c] = temp;
    //     return found;
    //
    // }
}
