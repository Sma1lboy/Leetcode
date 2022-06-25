import java.util.ArrayList;
import java.util.List;

public class Pacific_Atlantic_Water_Flow {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new ArrayList<>();
        //fill the rows and cols
        int rows = heights.length;
        int cols = heights[0].length;
        boolean[][] pacific = new boolean[rows][cols];
        boolean[][] atlantic = new boolean[rows][cols];
        for(int i = 0; i < rows; i++) {
            dfs(heights, pacific, Integer.MIN_VALUE, i, 0);
            dfs(heights, atlantic, Integer.MIN_VALUE, i, cols - 1);
        }
        for(int i = 0; i < cols; i++) {
            dfs(heights, pacific, Integer.MIN_VALUE, 0, i);
            dfs(heights, atlantic, Integer.MIN_VALUE, rows - 1, i);
        }

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    res.add(list);
                }

        return res;
    }
    //initialize the direction
    int[][]dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
    public void dfs(int[][] mat, boolean[][]visited, int prevHeight, int row, int col) {
        int n = mat.length, m = mat[0].length;
        if(row < 0 || row >= n || col < 0 || col >= m || visited[row][col] || mat[row][col] < prevHeight) {
            return;
        }
        //visited curr cell
        visited[row][col] = true;
        for(int[] d : dir) {
            dfs(mat, visited, mat[row][col], row + d[0], col + d[1]);
        }
    }
}
