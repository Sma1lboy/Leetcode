import java.util.*;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
public class Network_Delay_Time {
        //direction graph
        public int networkDelayTime(int[][] times, int n, int k) {

            //#1 build the graph

            //map store[currNode, List<int[towordNode, cost]>]
            Map<Integer, List<int[]>> map = new HashMap<>();
            for(int i = 1; i <= n; i++) {
                map.put(i, new ArrayList<>());
            }
            for(int[] edge : times) {
                map.get(edge[0]).add(new int[]{edge[1], edge[2]});
            }

            Integer[] timeCost = new Integer[n + 1];
            //queue store[currNode, currTimeCost]
            PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            q.offer(new int[]{k, 0});
            // int cost = 0;
            int nodeCnt = 0;
            while(!q.isEmpty()) {
                int[] cur = q.poll();
                int currNode = cur[0];
                int currDis = cur[1];
                //check if we already met net curr node
                if(timeCost[currNode] != null) continue;
                //if didnt give a time cost
                timeCost[currNode] = currDis;
                //check if we already visited all the node
                //because we are using PriorityQueue the node
                // I dont really know what's my end node
                //so I have make sure after I finish all the Node, I could stop here
                //because base on bfs, it's always shortest come first
                if(++nodeCnt == n) {
                    return currDis;
                }
                for(int[] adjNode : map.get(currNode)) {
                    q.offer(new int[]{adjNode[0], adjNode[1] + currDis});
                }
            }
            return -1;
        }
}
