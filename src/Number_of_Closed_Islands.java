public class Number_of_Closed_Islands {
    //if the land close to the boarder, which is means its not going to be closed island
    public int closedIsland(int[][] grid) {
        //intial the length
        int rows = grid.length, cols = grid[0].length;
        //go through the boarder
        //top
        for(int i = 0; i < cols; i++) {
            dfsBoarder(grid, 0, i);
        }
        //bottom
        for(int i = 0; i < cols; i++) {
            dfsBoarder(grid, rows - 1, i);
        }
        //go left
        for(int i = 0; i < rows; i++) {
            dfsBoarder(grid, i, 0);
        }
        //go right
        for(int i = 0; i < rows; i++) {
            dfsBoarder(grid, i, cols - 1);
        }
        int count = 0;
        //go through every node for check if there are island
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 0) {
                    count++;
                    dfsBoarder(grid, i, j);

                }
            }
        }
        return count;

    }
    public void dfsBoarder(int[][] grid, int r, int c) {
        int rows = grid.length, cols = grid[0].length;
        //base case if out of boundry or if it is 0
        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != 0) {
            return;
        }
        //mark visit
        grid[r][c] = 1;
        dfsBoarder(grid, r + 1, c);
        dfsBoarder(grid, r - 1, c);
        dfsBoarder(grid, r, c + 1);
        dfsBoarder(grid, r, c - 1);
    }

}
