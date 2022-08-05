import java.util.Arrays;
import java.util.PriorityQueue;

public class K_Closest_Points_to_Origin {

    //res[][] completely opimazation by using Arrays.copyOfRange


        public int[][] kClosest(int[][] points, int k) {
            //At first time I thought I nnee the largest distacen, then it's not
            //I only need shortest distance to origin, which is closest one
            Arrays.sort(points, (a, b) -> a[1] * a[1] + a[0] * a[0] - (b[1] * b[1] + b[0] * b[0]));

            return Arrays.copyOfRange(points, 0, k);
        }


}
