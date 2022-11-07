import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_if_Path_Exists_in_Graph {
    boolean isFound = false;
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        if(source == destination) {
            return true;
        }
        HashMap<Integer, List<Integer>> map = new HashMap<>();
        //memoization
        boolean[]visited = new boolean[n];
        //default the map
        for(int i = 0; i < n; i++) {
            map.put(i, new ArrayList<>());
        }
        //construct the graph first
        for(int[] edge: edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        dfs(map, visited, source, destination);
        return isFound;

    }
    public void dfs(HashMap<Integer, List<Integer>> map, boolean[] visited, int start, int end) {
        //base case
        //if we already visited or already found the answer, return, otherwise keep repeatly.
        if(visited[start] || isFound) return;
        visited[start] = true;
        for(int temp : map.get(start)) {
            //
            if(temp == end) {
                isFound = true;
                break;
            }
            if(!visited[temp]) {
                dfs(map, visited, temp, end);
            }
        }

    }
}
