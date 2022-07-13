import java.util.*;

public class Shortest_Path_with_Alternating_Colors {
    //shortest bfs better
    public static int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        //build the graph first
        int[][] graph = new int[n][n];
        buildGraph(graph, redEdges, blueEdges);
        int[] res = new int[n];
        Arrays.fill(res, Integer.MAX_VALUE);
        //the first one always zero
        res[0] = 0;
        //we need the shortest length path
        int len = 0;

        //normal bfs
        Queue<int[]> queue = new LinkedList<>();
        //our queue store [node, color]
        //because we don't know first node connect to blue edge or red edge so we have to
        //try both of them with [0, 1] and [0, -1]
        queue.offer(new int[]{0, 1});
        queue.offer(new int[]{0, -1});
        //if the node visited we dont have to visited again
        Set<String> visited = new HashSet<>();


        while(!queue.isEmpty()) {
            int size = queue.size();
            len++;
            for(int i = 0; i < size; i++) {
                int[] curr = queue.poll();
                int node = curr[0];
                int currColor = curr[1];
                int oppoColor = -currColor;
                //now, we should go through every edge in curr node
                for(int j = 1; j < graph[0].length; j++) {
                    //if next edge is oppo color or it is both color edge,
                    //if we haven't visited ye
                    if(graph[node][j] == oppoColor || graph[node][j] == 0) {
                        //mark visited
                        if(!visited.add((j + "" + oppoColor))) {
                            continue;
                        }
                        queue.offer(new int[]{j, oppoColor});
                        res[j] = Math.min(res[j], len);
                    }
                }
            }
        }
        for(int i = 1; i < n; i++) {
            if(res[i] == Integer.MAX_VALUE) {
                res[i] = -1;
            }
        }
        return res;
    }
    //1 pepersent red, 0 repersent both, -1 repersent blue, maxValue repersent
    public static void buildGraph(int[][] graph, int[][] redEdges, int[][] blueEdges) {
        //initial node with non-edge
        for(int i = 0; i < graph.length; i++) {
            Arrays.fill(graph[i], Integer.MAX_VALUE);
        }
        //go through red edges
        for(int[] edge : redEdges) {
            int from = edge[0];
            int to = edge[1];
            graph[from][to] = 1;
        }
        //go through blue
        for(int[] edge : blueEdges) {
            int from = edge[0];
            int to = edge[1];
            if(graph[from][to] == 1) {
                graph[from][to] = 0;
            } else {
                graph[from][to] = -1;
            }
        }
    }





}
