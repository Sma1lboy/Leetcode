import java.util.Stack;

//unsolve it
public class Valid_Parentheses {

        public static boolean isValid(String s) {
            Stack<Character> stack = new Stack<>();

            for(int i = 0; i < s.length(); i++) {
                if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                    stack.push(s.charAt(i));
                } else if (s.charAt(i) == ')' || s.charAt(i) == ']' || s.charAt(i) == '}') {
                    // if(stack.isEmpty()) return false;
                    if(isMatching(s.charAt(i), stack.peek())) {
                        stack.pop();
                    } else  {
                        return false;
                    }
                }
            }
            return stack.isEmpty();

        }

        public static boolean isMatching(char c1, char c2) {
            return ((c2=='(' && c1==')') || (c2=='{' && c1=='}') || (c2=='[' && c1==']'));
        }


    public static void main(String[] args) {
        System.out.println(isValid("(){}"));
    }
}
