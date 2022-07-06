import java.util.LinkedList;
import java.util.Queue;

public class Nearest_Exit_from_Entrance_in_Maze {
    class Solution {
        //doing bfs for practice
        public int nearestExit(char[][] maze, int[] entrance) {
            int rows = maze.length, cols = maze[0].length;
            Queue<int[]> q = new LinkedList<>();
            q.offer(entrance);
            int step = 0;
            boolean[][] visited = new boolean[rows][cols];
            visited[entrance[0]][entrance[1]] = true;
            while(!q.isEmpty()) {
                int size = q.size();
                for(int i = 0; i < size; i++) {
                    //poll the curr node
                    int[] curr = q.poll();
                    //go thourgh 4 dirction
                    for(int[] dir : DIRS) {
                        int r = curr[0] + dir[0];
                        int c = curr[1] + dir[1];
                        //if out of boundry
                        if(r < 0 || c < 0 || r >= rows || c >= cols) {
                            continue;
                        }
                        //two base case if it is met the wall or already visited
                        if(maze[r][c] == '+' || visited[r][c]) {
                            continue;
                        }
                        //only if reach the boarder return the step
                        if(r == 0 || r == rows - 1 || c == 0 || c == cols - 1) {
                            return step + 1;
                        }
                        //mark visited
                        visited[r][c] = true;
                        //add in queue
                        q.offer(new int[]{r,c});
                    }
                }
                step++;
            }
            return -1;
        }
        int[][] DIRS = {{1,0}, {-1,0}, {0,1}, {0,-1}};
    }
}
