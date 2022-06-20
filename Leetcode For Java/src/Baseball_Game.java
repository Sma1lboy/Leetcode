import java.util.Stack;

public class Baseball_Game {
    public int calPoints(String[] ops) {
        Stack<Integer> st = new Stack<>();
        for(String s : ops) {
            if(s.equals("C")) {
                st.pop();
            } else if (s.equals("D")) {
                st.push(st.peek() * 2);
            } else if (s.equals("+")) {
                int temp = st.pop();
                int ans = st.peek() + temp;
                st.push(temp);
                st.push(ans);
            } else{
                st.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!st.isEmpty()) {
            int temp = st.pop();
            sum += temp;
        }
        return sum;
    }
}
