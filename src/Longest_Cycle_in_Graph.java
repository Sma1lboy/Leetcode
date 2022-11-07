import java.util.HashMap;

public class Longest_Cycle_in_Graph {

        int longest = -1;
        public int longestCycle(int[] edges) {
            //globel visite
            boolean[] visited = new boolean[edges.length];
            //store(Integer, index)
            //local visited
            HashMap<Integer, Integer> map;
            for(int i = 0; i < edges.length; i++) {
                if(visited[i]) continue;
                map = new HashMap<>();
                dfs(edges, i, map, visited);
            }
            return longest;
        }
        public void dfs(int[] edges, int edge, HashMap<Integer, Integer> map, boolean[] visited) {
            //base case if there is no cycle
            if(edges[edge] == -1) {
                return;
            }
            //if contains next edge
            if(map.containsKey(edge)) {
                longest = Math.max(longest, map.size() - map.get(edge));
                return;
            }
            if(visited[edge]) return;

            visited[edge] = true;
            //mark visted
            map.put(edge, map.size());
            //if didn't go head check next
            dfs(edges, edges[edge], map, visited);
            map.remove(edge);
        }


}
