import java.util.Stack;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/5
 */
public class Next_Greater_Element {
    public static void main(String[] args) {
        nextGreaterElements(new int[]{1,2,1});
    }
    public static int[] nextGreaterElements(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[nums.length];
        for(int i = 0; i <= nums.length; i++) {
            while(!stack.isEmpty() && (i == nums.length || nums[stack.peek()] < nums[i])) {
                int cur = stack.pop();
                res[cur] = stack.isEmpty() ? -1 : nums[stack.peek()];
            }

            stack.push(i);
        }
        return res;
    }
}
