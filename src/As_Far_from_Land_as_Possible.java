import java.util.LinkedList;
import java.util.Queue;

public class As_Far_from_Land_as_Possible {
    public int[][] DIRS = {{1,0},{-1,0},{0,1},{0,-1}};
    //bfs for this question
    public int maxDistance(int[][] grid) {
        int rows = grid.length, cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int max = Integer.MIN_VALUE;
        //find all the zero and do bfs for every zero
        for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1) {
                    //mark the cell and change to zero for convinent count
                    grid[i][j] = 0;
                    queue.offer(new int[]{i,j});
                } else {
                    //change all land became samllest value
                    //water
                    grid[i][j] = Integer.MIN_VALUE;
                }
            }
        }
        //into the while loop
        while(!queue.isEmpty()) {
            int[] curr = queue.poll();
            for(int[] dir : DIRS) {
                int r = curr[0] + dir[0];
                int c = curr[1] + dir[1];
                //check if it is out of boundary or now, or find no visited
                if(r >= 0 && c>=0 && r < rows && c < rows && grid[r][c] < 0) {
                    queue.offer(new int[]{r,c});
                    grid[r][c] = grid[curr[0]][curr[1]] + 1;
                    max = Math.max(grid[r][c], max);
                }
            }
        }
        return max == Integer.MIN_VALUE ? -1 : max;
    }
}
