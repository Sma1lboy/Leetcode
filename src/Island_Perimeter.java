public class Island_Perimeter {
    public int islandPerimeter(int[][] grid) {
        boolean[][] visited = new boolean[grid.length][grid[0].length];
        for(int rows = 0; rows < grid.length; rows++){
            for(int cols = 0; cols < grid[0].length; cols++) {
                if(grid[rows][cols] == 1) {
                    return dfsPerimeterHelper(grid, visited, rows, cols);
                }
            }
        }
        return 0;
    }

    public int dfsPerimeterHelper(int[][] grid, boolean[][] visited, int row, int col) {
        //check boundry
        if(!isValid(grid, row, col)) {
            return 1;
        }
        //check if it is water
        if(grid[row][col] == 0) {
            return 1;
        }
        //check if it visited
        if(visited[row][col]) {
            return 0;
        }
        visited[row][col] = true;
        int count = dfsPerimeterHelper(grid, visited, row, col + 1) +dfsPerimeterHelper(grid, visited, row, col - 1) + dfsPerimeterHelper(grid, visited, row + 1, col) + dfsPerimeterHelper(grid, visited, row - 1, col);
        return count;

    }
    public boolean isValid(int[][] grid, int row, int col) {
        if(row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return false;
        }

        return true;
    }
}
