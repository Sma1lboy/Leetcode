public class Number_of_Enclaves {
    class Solution {
        public int numEnclaves(int[][] grid) {
            int rows = grid.length, cols = grid[0].length;
            //go through top bottom left right clean the boarder
            //top
            for(int i = 0; i < cols; i++) {
                if(grid[0][i] == 1) {
                    dfsNumber(grid, 0, i);
                }
            }
            //bottom
            for(int i = 0; i < cols; i++) {
                if(grid[rows - 1][i] == 1) {
                    dfsNumber(grid, rows - 1, i);
                }
            }
            //left
            for(int i = 0; i < rows; i++) {
                if(grid[i][0] == 1) {
                    dfsNumber(grid, i, 0);
                }
            }
            //right
            for(int i = 0; i < rows; i++) {
                if(grid[i][cols - 1] == 1) {
                    dfsNumber(grid, i, cols - 1);
                }
            }
            //count the cannot walk iland
            int count = 0;
            for(int i = 0; i < rows; i++){
                for(int j = 0; j < cols; j++) {
                    //check if it is 1
                    if(grid[i][j] == 1) {
                        count++;
                    }
                }
            }
            return count;

        }
        public void dfsNumber(int[][] grid, int r, int c) {
            int rows = grid.length, cols = grid[0].length;
            //base case if see out of boundry or not equal to  1
            if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != 1) {
                return;
            }
            //marked the visited
            grid[r][c] = -1;
            //go through every direction
            dfsNumber(grid, r + 1, c);
            dfsNumber(grid, r - 1, c);
            dfsNumber(grid, r, c + 1);
            dfsNumber(grid, r, c - 1);

        }
    }
}
