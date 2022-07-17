import java.util.HashMap;
import java.util.Stack;

//unsolve it
public class Valid_Parentheses {

    public static boolean isValid(String s) {
        HashMap<Character, Character> m = new HashMap<>();
        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char temp = s.charAt(i);
            if(m.containsKey(temp)) {
                if(stack.isEmpty() || stack.pop() != m.get(temp) ) {
                    return false;
                }
            } else {
                stack.push(temp);
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }
}
