import java.util.HashSet;
import java.util.Set;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/2
 */
public class Min_Cost_to_Connect_All_Points {


    public static void main(String[] args) {
        minCostConnectPoints(new int[][]{{0,0},{2,2},{3,10},{5,2},{7,0}});
    }

    public static int minCostConnectPoints(int[][] points) {
        int n = points.length, res = 0;

        Set<Integer> set = new HashSet<>();
        // wecould start whatevery point we want
        set.add(0);
        // saveing the shortest dist
        int dist[] = new int[n];
        // initial the distance
        for (int i = 1; i < n; i++) {
            // find all points distance from 0 to the points
            // to help us find the first shortest point.
            dist[i] = findDist(points, 0, i);
        }
        while (set.size() != 0) {
            int next = -1;

            // go find the shortest node
            for (int i = 0; i < n; i++) {
                if (set.contains(i)) continue;
                if (next == -1 || dist[next] > dist[i]) next = i;
            }

            // mark into visited set
            set.add(next);
            res += dist[next];
            // update the distance

            for (int i = 0; i < n; i++) {
                if (set.contains(i)) continue;
                dist[i] = Math.min(dist[i], findDist(points, next, i));
            }

        }
        return res;
    }

    private static int findDist(int[][] points, int a, int b) {
        return Math.abs(points[a][0] - points[b][0]) + Math.abs(points[b][1] - points[a][1]);
    }

}
