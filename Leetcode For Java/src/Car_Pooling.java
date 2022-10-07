import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/10/4
 */
public class Car_Pooling {
    public static void main(String[] args) {
        carPooling(new int[][]{{2,1,5,},{3,3,7}}, 5);
    }
    public static boolean carPooling(int[][] trips, int capacity) {
        Map<Integer, Integer> m = new HashMap<>();
        for (int[] t : trips) {
            m.put(t[1], m.getOrDefault(t[1], 0) + t[0]);
            m.put(t[2], m.getOrDefault(t[2], 0) - t[0]);
        }
        for (int v : m.values()) {
            capacity -= v;
            if (capacity < 0) {
                return false;
            }
        }
        return true;
    }
}
