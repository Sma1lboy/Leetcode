import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

//295 classic question
public class Find_Median_from_Data_Stream {
    public static void main(String[] args) {
        MedianFinder mf = new MedianFinder();
        mf.addNum(2);
        mf.addNum(10);
        mf.addNum(12);
        mf.addNum(1);
        mf.addNum(5);
        System.out.println(mf.findMedian());

    }

}

class MedianFinder {
    //create 2 heaps
    Queue<Integer> min = new PriorityQueue<>(Collections.reverseOrder());
    Queue<Integer> max = new PriorityQueue<>();

    public MedianFinder() {

    }

    public void addNum(int num) {
        min.offer(num);
        max.offer(min.poll());
        if (min.size() < max.size()) {
            min.offer(max.poll());
        }
    }

    public double findMedian() {
        if (min.size() == max.size()) {
            return (min.peek() + max.peek()) / 2.0;
        } else {
            return min.peek();
        }
    }
}

