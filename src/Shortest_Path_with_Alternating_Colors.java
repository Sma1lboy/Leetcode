import java.util.*;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/12
 */
public class Shortest_Path_with_Alternating_Colors {
    public static void main(String[] args) {
        shortestAlternatingPaths(3, new int[][]{{0,1},{1,2}}, new int[][]{});
    }
    public static int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges) {
        //#1 build graph
        //Map<currNode, List<towardNode, [BlueORRed]>>
        //BlueOrRed status 0 is red and 1 is blue;\
        Map<Integer, List<int[]>> map = new HashMap<>();
        //initial map
        for(int i = 0; i < n; i++) {
            map.put(i , new ArrayList<>());
        }
        //add red node
        for(int[] edge : redEdges) {
            map.get(edge[0]).add(new int[]{edge[1], 0});
        }
        //add blue edge node
        for(int[] edge : blueEdges) {
            map.get(edge[0]).add(new int[]{edge[1], 1});
        }
        int res[] = new int[n];
        Arrays.fill(res, -1);
        int distance = 0;
        //Queue store curr node what we we at
        Queue<int[]> q = new LinkedList<>();
        //start at zero
        q.offer(new int[]{0, 1});
        q.offer(new int[]{0, 0});

        while(!q.isEmpty()) {
            int size = q.size();
            // traversal to the same level order
            for(int i = 0; i < size; i++) {
                int[] curr = q.poll();
                int currNode = curr[0];
                int currColor = curr[1];
                res[currNode] = distance;
                //go through blue or red
                for(int[] nextNode : map.get(currNode)) {
                    //if it is red
                    if(currColor == 0 && nextNode[1] == 1) {
                        q.offer(nextNode);
                    } else if(currColor == 1 && nextNode[1] == 0){ // if it is blue
                        q.offer(nextNode);
                    }
                }
            }
            distance++;
        }

        return res;
    }
}
