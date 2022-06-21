import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class RecentCounter {

    Queue<Integer> counter;
    public RecentCounter() {
        counter = new LinkedList<>();
    }

    public int ping(int t) {
        counter.offer(t);
        while(counter.peek() < t - 3000) {counter.poll();}
        return counter.size();
    }
}
public class test {
    public static void main(String[] args) {
        RecentCounter rc = new RecentCounter();
        rc.ping(1);
        rc.ping(100);
        rc.ping(3001);
        rc.ping(3002);


    }
}
