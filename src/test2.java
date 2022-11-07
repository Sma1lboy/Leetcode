import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class test2 {


     static int longest = -1;
    public static int longestCycle(int[] edges) {
        //store(Integer, index)
        HashMap<Integer, Integer> visited = new HashMap<>();
        for(int i = 0; i < edges.length; i++) {
            dfs(edges, i, visited);
        }
        return longest;
    }
    public static void dfs(int[] edges, int edge, HashMap<Integer, Integer> visited) {
        //base case if there is no cycle
        if(edges[edge] == -1) {
            return;
        }
        //if contains next edge
        if(visited.containsKey(edge)) {
            longest = Math.max(longest, visited.size() - visited.get(edge));
            return;
        }

        //mark visted
        visited.put(edge, visited.size());
        //if didn't go head check next
        dfs(edges, edges[edge], visited);
        visited.remove(edge);
    }
    public static void main(String[] args) {

        System.out.println(longestCycle(new int[]{3,3,4,2,3}));
    }

}
