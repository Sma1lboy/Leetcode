import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.Spliterator;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/5
 */
public class Sum_of_total_Strength_of_Wizard {


    public static void main(String[] args) {

    }

    public static int totalStrength(int[] strength) {
        int mod = 1000000007;
        int n = strength.length;
        int[] right = new int[n];
        Arrays.fill(right, n);
        Deque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            while (!stack.isEmpty() && strength[stack.peek()] > strength[i]) {
                right[stack.pop()] = i;
            }
            stack.push(i);
        }
        int[] left = new int[n];
        Arrays.fill(left, -1);
        stack = new ArrayDeque<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!stack.isEmpty() && strength[stack.peek()] >= strength[i]) {
                left[stack.pop()] = i;
            }
            stack.push(i);
        }
        long res = 0;
        long[] preSum = new long[n];
        for (int i = 0; i < n; i++) {
            preSum[i] = strength[i];
            if (i > 0) {
                preSum[i] = (preSum[i] + preSum[i - 1]) % mod;
            }
        }
        long[] preSumPreSum = new long[n + 1];
        for (int i = 1; i < n + 1; i++) {
            preSumPreSum[i] = (preSumPreSum[i - 1] + preSum[i - 1]) % mod;
        }
        for (int i = 0; i < n; i++) {
            int l = left[i];
            int r = right[i];
            long lSum = preSumPreSum[i] - preSumPreSum[Math.max(l, 0)];
            long rSum = preSumPreSum[r] - preSumPreSum[i];
            res = (res + strength[i] * (rSum * (i - l) % mod - lSum * (r - i) % mod)) % mod;
        }
        return (int) (res + mod) % mod;
    }

}
