import java.util.LinkedList;
import java.util.Queue;

public class Shortest_Bridge {
    class Solution {
        //doing a dfs to mark the islands and doing a bfs to find the shortest path
        public int shortestBridge(int[][] grid) {
            int rows = grid.length, cols = grid[0].length;
            //initial the visited set
            boolean[][] visited = new boolean[rows][cols];
            //queue for expand the island
            Queue<int[]> q = new LinkedList<>();
            //we only need to find one of two island
            boolean isFound = false;
            //go through every node mark the islands
            for(int r = 0; r < rows; r++) {
                if(isFound) {
                    break;
                }
                for(int c = 0; c < cols; c++) {
                    if(grid[r][c] == 1) {
                        dfs(grid, visited, q, r, c);
                        isFound=true;
                        break;
                    }
                }
            }

            int count = 0;
            //now go through the bfs to find the pass
            while(!q.isEmpty()) {
                //get the size for all same level node
                int size = q.size();
                //traversal all of them
                for(int i = 0; i < size; i++) {
                    int[] curr = q.poll();
                    for(int[] dir : DIRS) {
                        int newR = curr[0] + dir[0];
                        int newC = curr[1] + dir[1];
                        //check if new one in the boundry
                        if(newR < 0 || newC < 0 || newR >= rows || newC >= cols || visited[newR][newC]) {
                            continue;
                        }
                        if(grid[newR][newC] == 1) {
                            return count;
                        }
                        //marked visited
                        visited[newR][newC] = true;
                        //if not just add to the same level
                        q.offer(new int[]{newR, newC});
                    }
                }
                count++;
            }

            return count;
        }
        public void dfs(int[][] grid, boolean[][] visited, Queue<int[]> q, int r, int c) {
            int rows = grid.length, cols = grid[0].length;
            //base case check if it is out of boundry
            //it is visited
            // it is water
            if(r < 0 || c < 0 || r >= rows || c >= cols || visited[r][c] || grid[r][c] == 0) {
                return;
            }
            //case not water, not visited, in boundry
            //marked visited
            visited[r][c] = true;
            q.offer(new int[]{r, c});
            dfs(grid, visited, q, r + 1, c);
            dfs(grid, visited, q, r - 1, c);
            dfs(grid, visited, q, r, c + 1);
            dfs(grid, visited, q, r, c - 1);

        }
        int[][] DIRS = {{1,0},{-1, 0}, {0, 1}, {0, -1}};
    }
}
