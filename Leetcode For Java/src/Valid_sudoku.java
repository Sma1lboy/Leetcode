import java.util.HashMap;
import java.util.HashSet;

public class Valid_sudoku {
        public static boolean isValidSudoku(char[][] board) {
            //check every rows and column contains dupilicate

            //cols
            for(int i = 0; i < board.length; i++){
                HashSet<Character> colSet = new HashSet<>();
                for(int j = 0; j < board[0].length; j++) {
                    if(board[i][j] == '.') {
                        continue;
                    }
                    if(!colSet.add(board[i][j])) {
                        return false;
                    }
                }
            }
            //rows
            for(int i = 0; i < board[0].length; i++){
                HashSet<Character> rowSet = new HashSet<>();
                for(int j = 0; j < board.length; j++) {
                    if(board[j][i] == '.') {
                        continue;
                    }
                    if(!rowSet.add(board[j][i])) {
                        return false;
                    }
                }
            }
            //hashmap store <(r/3,c/r), set>

            for(int i = 0; i < 9; i+=3) {
                for(int j = 0; j < 9; j+=3) {
                    if(!checkOnePart(board, i , j)) {
                        return false;
                    }
                }
            }
            return true;

        }
        public static boolean checkOnePart(char[][] board, int r, int c) {
            HashSet<Character> set = new HashSet<>();
            for(int i = r; i < r + 3; i++) {
                for(int j = c; j < c + 3; j++) {
                    if(board[i][j] == '.') continue;
                    if(!set.add(board[i][j])) {
                        return false;
                    }
                }
            }
            return true;
        }
    class Solution {
        public boolean isValidSudoku(char[][] board) {
            //rowMap store for<value in row #, count>
            HashMap<String, Integer> rowMap = new HashMap<>();
            //colMap same as above
            HashMap<String, Integer> colMap = new HashMap<>();
            //subboard 9 part
            HashMap<String, Integer> subboard = new HashMap<>();
            for(int r = 0; r < 9;r++) {
                for(int c = 0; c < 9; c++) {
                    //check if it is empty
                    if(board[r][c] == '.') continue;
                    String rowStr = board[r][c] + "row" + r;
                    String colStr = board[r][c] + "row" + c;
                    rowMap.put(rowStr, rowMap.getOrDefault(rowStr, 0) + 1);
                    colMap.put(colStr, colMap.getOrDefault(colStr, 0) + 1);
                    //now check which subboard this number in
                    int rInSubIndex = r / 3;
                    int cInSubIndex = c / 3;
                    String subboardStr = board[r][c] + "sub"+rInSubIndex+cInSubIndex;
                    subboard.put(subboardStr, subboard.getOrDefault(subboardStr, 0) + 1);
                    if(rowMap.get(rowStr) > 1 || colMap.get(colStr) > 1 || subboard.get(subboardStr) > 1) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

//    public static void main(String[] args) {
//        char[][] board =
//                {{'5','3','.','.','7','.','.','.','.'}
//                ,{'6','.','.','1','9','5','.','.','.'}
//                ,{'.','9','8','.','.','.','.','6','.'}
//,{'8','.','.','.','6','.','.','.','3'}
//,{'4','.','.','8','.','3','.','.','1'}
//,{'7','.','.','.','2','.','.','.','6'}
//,{'.','6','.','.','.','.','2','8','.'}
//,{'.','.','.','4','1','9','.','.','5'}
//,{'.','.','.','.','8','.','.','7','9'}};
//        System.out.println(isValidSudoku(board));
//    }

}


