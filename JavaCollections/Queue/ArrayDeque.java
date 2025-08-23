package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class ArrayDeque {
    public static void main(String[] args) {

    Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(60);
        System.out.println(q);
        System.out.println(q.poll());

        while(!q.isEmpty()) {

            System.out.println(q.poll());
        }
    }
}
