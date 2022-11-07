import java.util.Stack;

public class Maximum_Nesting_Depth_of_the_Parentheses {
    public int maxDepth(String s) {
        Stack<Character> stack = new Stack<>();
        int maxCount = 0;
        for(char c : s.toCharArray()) {
            if(c == '(') {
                stack.push(c);
                maxCount = Math.max(maxCount, stack.size());
            } else if (c == ')') {
                stack.pop();
            }
        }
        return maxCount;
    }
}
