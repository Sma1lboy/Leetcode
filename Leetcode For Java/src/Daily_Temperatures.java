import java.util.Stack;

public class Daily_Temperatures {
    public static int[] dailyTemperatures(int[] temp) {
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[temp.length];
        for(int i = 0; i < res.length; i++) {
            int currTemp = temp[i];
            //when cureent temp is greater than what we have
            while(!stack.isEmpty() && currTemp > temp[stack.peek()]) {
                int idx = stack.pop();
                res[idx] = i - idx;
            }
            stack.add(i);
        }
        return res;
    }

    public static void main(String[] args) {
        dailyTemperatures(new int[] {72, 71, 74});
    }
}
