import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Find_Closest_Node_to_Given_Two_Nodes {
    class Solution {
        //find individual distance from both node by using bfs
        public int closestMeetingNode(int[] edges, int node1, int node2) {
            int n = edges.length;
            int[] A = new int[n];
            int[] B = new int[n];

            Arrays.fill(A, -1);
            Arrays.fill(B, -1);

            //bfs node1 and node2
            bfs(edges, A, node1);
            bfs(edges, B, node2);

            int minDis = Integer.MAX_VALUE, node = -1;
            for(int i = 0; i < n; i++) {
                if(A[i] == -1 || B[i] == -1) continue;
                if(minDis > Math.max(A[i], B[i])) {
                    minDis = Math.max(A[i], B[i]);
                    node = i;
                }
            }
            return node;


        }
        public void bfs(int[] edges, int[] dis, int node) {
            Queue<Integer> q = new LinkedList<>();
            q.offer(node);
            dis[node] = 0;
            while(!q.isEmpty()) {
                //bc it only contains at most one outgoing, so we dont have to do a for loop
                Integer curr = q.poll();
                //check if curr has outgoing or not

                //why we using bfs, after first met same node, the first time met always shorter,
                //so if we met any node distance != -1, continue loop.
                if(edges[curr] == -1 || dis[edges[curr]] != -1) continue;
                //if yes
                dis[edges[curr]] = dis[curr] + 1;
                q.offer(edges[curr]);

            }
        }

    }
}
