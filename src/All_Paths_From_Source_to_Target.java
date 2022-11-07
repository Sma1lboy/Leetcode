import java.util.ArrayList;
import java.util.List;

public class All_Paths_From_Source_to_Target {
    class Solution {
        //source node : last node in the graph
        public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
            List<List<Integer>> list = new ArrayList<>();
            List<Integer> sublist = new ArrayList<>();
            sublist.add(0);
            dfs(graph, list, sublist, 0, graph.length -1);

            return list;
        }
        public void dfs(int[][] grid, List<List<Integer>> list, List<Integer> sublist, int source, int target) {
            //base case is when we met the sorce node
            if(source == target) {
                list.add(new ArrayList<>(sublist));
                return;
            }
            //go through every possible answer
            for(int i = 0; i < grid[source].length; i++) {
                //add it into tempList
                sublist.add(grid[source][i]);
                dfs(grid, list, sublist, grid[source][i], target);
                sublist.remove(sublist.size() - 1);
            }
        }
    }
}
