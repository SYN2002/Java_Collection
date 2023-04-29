import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class LearnPriorityQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        queue.offer(1);
        queue.offer(3);
        queue.offer(5);
        queue.offer(2);
        queue.offer(4);
        System.out.println(queue);
    }
}
