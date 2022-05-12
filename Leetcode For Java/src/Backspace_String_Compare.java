import java.util.Stack;

//844
public class Backspace_String_Compare {
    public static boolean backspaceCompare(String s, String t) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        for(char c : s.toCharArray()) {
            if(c != '#') {
                s1.push(c);
            } else {
                if(!s1.isEmpty()) {
                    s1.pop();
                }
            }
        }
        for(char c : t.toCharArray()) {
            if(c != '#') {
                s2.push(c);
            } else {
                if(!s2.isEmpty()) {
                    s2.pop();
                }
            }
        }
        while(!s1.isEmpty() && !s2.isEmpty() && s1.peek() == s2.peek()) {
            s1.pop();
            s2.pop();
        }
        return s1.isEmpty() && s2.isEmpty();
    }

    public static void main(String[] args) {
        String s = "ab##";
        String t = "c#d#";
        System.out.println(backspaceCompare(s,t));
    }

}
