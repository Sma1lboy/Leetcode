import java.util.HashSet;
import java.util.Stack;

public class Minimum_Remove_to_Make_Valid_Parentheses {
    public String minRemoveToMakeValid(String s) {
        char ch[] = s.toCharArray();
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < ch.length; i++) {
            if (ch[i] == '(') {
                stack.push(i);
            } else {
                if(!stack.isEmpty() && ch[stack.peek()] == ')') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        HashSet<Integer> set = new HashSet<>(stack);
        for(int i = 0; i < ch.length; i++ ){
            if(!set.contains(i)) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }
}
