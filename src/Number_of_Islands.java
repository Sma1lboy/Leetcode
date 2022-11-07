public class Number_of_Islands {
    public int numIslands(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int counts = 0;
        //we can do after we check, we mark the known island disappear, which is means makes it all island become zero
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == '1') {

                    dfs(grid, i, j);
                    counts++;
                }
            }
        }
        return counts;
    }
    //create a dfs fill through current row and current column
    public void dfs(char[][] grid, int r, int c) {
        int rows = grid.length;
        int cols = grid[0].length;
        //check if the current row or current column out of boundry or now position is 1 or not
        if(r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] != '1') {
            return;
        }
        //make current island disappear
        grid[r][c] = '0';
        dfs(grid, r + 1, c);
        dfs(grid, r - 1, c);
        dfs(grid, r, c + 1);
        dfs(grid, r, c - 1);

    }
}
