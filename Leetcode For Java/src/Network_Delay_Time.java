import java.util.*;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/8/30
 */
public class Network_Delay_Time {

    public static void main(String[] args) {
        networkDelayTime(new int[][]{{2,1,1}, {2,3,1}, {3,4,1}}, 4, 2 );
    }
        public static int networkDelayTime(int[][] times, int n, int k) {
            Map<Integer, List<int[]>> map = new HashMap<>();
            for(int[] time : times) {
                map.putIfAbsent(time[0], new ArrayList<>());
                map.get(time[0]).add(new int[]{time[1], time[2]});
            }

            //store q[node, currTimeCost]
            Integer[] cost = new Integer[n + 1];
            PriorityQueue<int[]> q = new PriorityQueue<>((a, b) -> a[1] - b[1]);
            q.offer(new int[]{k, 0});

            while(!q.isEmpty()) {
                int[] c = q.poll();

                int currNode = c[0];
                int currTimeCost = c[1];
                if(cost[currNode] != null) continue;
                cost[currNode] = currTimeCost;
                for(int[] adjNode : map.get(currNode)) {

                    q.offer(new int[]{adjNode[0], adjNode[1] + currTimeCost});
                }


            }

            int max = Integer.MIN_VALUE;
            for(int i = 0; i < cost.length; i++) {
                if(cost[i] == null) continue;
                max = Math.max(max, cost[i]);
            }
            return max;
        }

}
