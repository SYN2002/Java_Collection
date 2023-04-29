import java.util.LinkedList;
import java.util.Queue;

public class LinkedList_Queue {
    public static void main(String[] args) {
        Queue<Integer> sid=new LinkedList<>();
        sid.offer(10);
        sid.offer(20);
        sid.offer(30);
        System.out.println(sid);
        System.out.println(sid.peek());
        sid.poll();
        System.out.println(sid);

    }
}
