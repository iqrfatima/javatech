package Queue;
import java.util.LinkedList;
import java.util.Queue;

public class rqueue {
     public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(23);
        q.add(45);
        q.add(56);
        q.add(67);
        q.remove();
        q.poll();
        System.out.println(q);
    }
}
