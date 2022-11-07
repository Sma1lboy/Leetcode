import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Number_of_Students_Unable_to_Eat_Lunch {
    public int countStudents(int[] students, int[] sandwiches) {
        Queue<Integer> line = new LinkedList<>();
        Stack<Integer> menu = new Stack<>();
        for(int i : students) {
            line.add(i);
        }
        for(int i = sandwiches.length - 1; i >= 0; i--) {
            menu.push(sandwiches[i]);
        }
        while(line.size() > 0) {
            if(line.peek() == menu.peek()) {
                menu.pop();
                line.poll();
            } else {
                int num = line.poll();
                line.offer(num);
            }

            if(line.size() > 0 && !line.contains(menu.peek())) {
                break;
            }

        }
        return line.size();
    }
}
