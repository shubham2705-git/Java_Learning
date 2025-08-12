package Queue;

import java.util.*;

public class LearnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>((a,b)->b-a);
        pq.add(30);
        pq.add(70);
        pq.add(10);
        pq.add(80);
        pq.add(40);

        System.out.println(pq);
        System.out.println(pq.poll());
        System.out.println(pq.poll());
    }
}
