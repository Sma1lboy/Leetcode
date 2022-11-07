import java.util.HashSet;
import java.util.Set;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/13
 */
public class Swim_in_Rising_Water {
    public static void main(String[] args) {

    }

    // dfs to solve this problem
    // I always have to start at [0,0] which is top left
    public int swimInWater(int[][] grid) {
        int time = 0;
        Set<Integer> visited = new HashSet<>();
        int n = grid.length;
        // makes sure the times under the n * n - 1
        // stop the loop when we reach botton right cell;
        // the way we count the which number of cell we are at we are using i * cols + j to repersent starting form top left to botton right
        while (!visited.contains(n * n - 1)) {
            // every time we have to restart the set
            visited.clear();
            dfs(grid, 0, 0, time, visited);
            time++;
        }
        return time - 1;
    }

    private void dfs(int[][] grid, int r, int c, int time, Set<Integer> visited) {
        int rows = grid.length, cols = grid[0].length;
        // check boundry and if curr sell is not availible for curr time
        // or already visited
        if (r < 0 || c < 0 || r >= rows || c >= cols || time < grid[r][c] || visited.contains(r * rows + c)) {
            return;
        }
        // mark visited
        visited.add(r * cols + c);

        // go through 4 dir
        dfs(grid, r + 1, c, time, visited);
        dfs(grid, r - 1, c, time, visited);
        dfs(grid, r, c + 1, time, visited);
        dfs(grid, r, c - 1, time, visited);
    }
}
