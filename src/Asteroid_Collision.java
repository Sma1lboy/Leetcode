import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/13
 */
public class Asteroid_Collision {
    public static void main(String[] args) {

        int[] ints = asteroidCollision(new int[]{5, 10 , -5});


        HashMap<String, Integer> map = new HashMap<>();

        Integer i = map.remove("sd");
        System.out.println(i);


        System.out.println(Arrays.toString(ints));

        System.out.println();

        System.out.println(Arrays.toString(ints));


    }

    public static int[] asteroidCollision(int[] A) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < A.length; i++) {
            if (A[i] < 0) {
                while (!stack.isEmpty() && stack.peek() > 0 && stack.peek() <= -A[i]) {
                    stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() >= A[i]) {
                    continue;
                } else if(!stack.isEmpty()){
                    stack.push(A[i]);
                }
            } else {
                stack.push(A[i]);
            }
        }
        // count the remain plannet
        int size = stack.size();
        int res[] = new int[size];
        for (int i = res.length - 1; i >= 0; i--) {
            res[i] = stack.pop();
        }
        return res;
    }
}
