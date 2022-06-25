import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class test {


    public static void main(String[] args) {
        Queue<Double> max = new PriorityQueue<>(Comparator.reverseOrder());

        PriorityQueue<Integer> min = new PriorityQueue<>(Comparator.reverseOrder());
        max.offer(1.0);
        max.offer(3.9);
        max.offer(2.0);
        max.offer(3.9);
        System.out.println(max);
        while(!max.isEmpty()) {
            System.out.println(max.poll());
        }

    }
}
