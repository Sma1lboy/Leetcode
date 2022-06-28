public class Surrounded_Regions {
    class Solution {
        //tips: reverse thinking capture everything except unsurround regions
        public void solve(char[][] board) {
            int rows = board.length, cols = board[0].length;
            //call goTrhoughBoard
            goThroughBoard(board);
            // capture everything except unsurround regions
            for (int r = 0; r < rows; r++) {
                for (int c = 0; c < cols; c++) {
                    if (board[r][c] == 'O') {
                        board[r][c] = 'X';
                    } else if (board[r][c] == 'T') {
                        board[r][c] = 'O';
                    }
                }
            }

        }

        //if any 'o' connect to the board, of course it's not going to be surrounded regions
        public void goThroughBoard(char[][] board) {
            int rows = board.length, cols = board[0].length;
            //TODO we can optimize this
            //go through every cell to check if any boarder line has 'O'
            // for(int r = 0; r < rows; r++) {
            //     for(int c = 0; c < cols; c++) {
            //         //if O and in the boarder line
            //         if(board[r][c] == 'O' && ((r == 0 || r == rows - 1) || (c == 0 || c == cols - 1))) {
            //             dfsCapture(board, r, c);
            //         }
            //     }
            // }
            //TODO after optimizedm
            // first row
            for (int i = 0; i < cols; i++) {
                if (board[0][i] == 'O') {
                    dfsCapture(board, 0, i);
                }
            }
            //las row
            for (int i = 0; i < cols; i++) {
                if (board[rows - 1][i] == 'O') {
                    dfsCapture(board, rows - 1, i);
                }
            }
            //right column
            for (int i = 0; i < rows; i++) {
                if (board[i][cols - 1] == 'O') {
                    dfsCapture(board, i, cols - 1);
                }
            }
            //left column
            for (int i = 0; i < rows; i++) {
                if (board[i][0] == 'O') {
                    dfsCapture(board, i, 0);
                }
            }

        }

        public void dfsCapture(char[][] board, int r, int c) {
            int rows = board.length, cols = board[0].length;
            //check if out of boundry and the cell is O or not
            if (r < 0 || c < 0 || r >= rows || c >= cols || board[r][c] != 'O') {
                return;
            }
            //if it is O change to temp "T"
            board[r][c] = 'T';
            //go through 4 adjacent cells by dfs
            dfsCapture(board, r + 1, c);
            dfsCapture(board, r - 1, c);
            dfsCapture(board, r, c + 1);
            dfsCapture(board, r, c - 1);
        }
        // public void bfs
    }
}
