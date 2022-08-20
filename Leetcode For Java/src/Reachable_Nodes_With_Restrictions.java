import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/16
 */
public class Reachable_Nodes_With_Restrictions {
    public static void main(String[] args) {
        System.out.println();
        int i = reachableNodes(7, new int[][]{{0, 1}, {1, 2}, {3, 1}, {4, 0}, {0, 5}, {5, 6}}, new int[]{4, 5});
        System.out.println(i);
    }
    public static int reachableNodes(int n, int[][] edges, int[] restricted) {
        //initial
        ArrayList<ArrayList<Integer>> map = new ArrayList<>();
        HashSet<Integer> cutNodes = new HashSet<>();
        for (int node : restricted) cutNodes.add(node);

        //build graph
        for (int i = 0; i < n; i++) {
            map.add(new ArrayList<Integer>());
        }
        for (int[] edge : edges) {
            map.get(edge[0]).add(edge[1]);
            map.get(edge[1]).add(edge[0]);
        }
        HashSet<Integer> visited = new HashSet<>();

        return dfs(map, cutNodes, visited, 0);
    }

    public static int dfs(ArrayList<ArrayList<Integer>> map, HashSet<Integer> cutNodes, HashSet<Integer> visited, int curr) {

        //base case prevent cycle and look and restriction
        if (visited.contains(curr) || cutNodes.contains(curr)) {
            return 0;
        }
        //mark visited
        visited.add(curr);
        int reachbleNode = 1;

        for (Integer node : map.get(curr)) {

            reachbleNode += dfs(map, cutNodes, visited, node);
        }
        return reachbleNode;


    }


}
