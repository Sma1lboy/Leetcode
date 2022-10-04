import java.util.*;

/**
 * @author Jackson Chen
 * @version 1.0
 * @date 2022/9/13
 */
public class Reconstruct_Itinerary {
    public static void main(String[] args) {

    }

    public static List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> targets = new HashMap<>();
        for (List<String> ticket : tickets) {
            targets.computeIfAbsent(ticket.get(0), k -> new PriorityQueue<>()).offer(ticket.get(1));
        }
        List<String> route = new LinkedList();
        Stack<String> stack = new Stack<>();
        stack.push("JFK");
        while (!stack.empty()) {
            while (targets.containsKey(stack.peek()) && !targets.get(stack.peek()).isEmpty())
                stack.push(targets.get(stack.peek()).poll());
            route.add(0, stack.pop());
        }
        return route;
    }
}
