import java.util.*;

public class Number_of_Operations_to_Make_Network_Connected {
    // so if the provided edges are less than that then return -1.
// if they are greater than n-1 then also there is no use of extra edges, as we only need n-1 edges to connect.
// cnt=stores the number of edges geniunely required to connect the nodes which are provided in given array.
    class Solution {

        public int makeConnected(int n, int[][] connections) {
            //it's means how many network line we have
            int pairs = connections.length;
            //we need at least n - 1 edges to make sure we got the spinning tree(which is the minimum networking line we need)
            if(pairs < n - 1) {
                return -1;
            }
            //build the graph first
            HashMap<Integer, List<Integer>> map = new HashMap<>();
            for(int[] connect : connections) {
                map.putIfAbsent(connect[0], new ArrayList<>());
                map.get(connect[0]).add(connect[1]);
                map.putIfAbsent(connect[1], new ArrayList<>());
                map.get(connect[1]).add(connect[0]);
            }
            //visited set
            Set<Integer> visited = new HashSet<>();
            int count = 0;
            //go through every eonnection
            for(int i = 0; i < n; i++) {
                if(visited.contains(i)) {
                    continue;
                }
                //if not visted, which it is means there is a part of computer
                dfs(i, map, visited);
                count++;
            }
            return count - 1;
        }
        public void dfs(int start, HashMap<Integer, List<Integer>> map, Set<Integer> visited) {
            //if already visited, which is means it already in one group computers network
            if(visited.contains(start)) {
                return;
            }
            //if not visited, we got a new group
            visited.add(start);
            for(Integer neigComp : map.getOrDefault(start, new ArrayList<Integer>())) {
                dfs(neigComp, map, visited);
            }
        }
    }
}
