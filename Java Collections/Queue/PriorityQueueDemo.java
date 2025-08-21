package Queue;

import java.util.*;

public class PriorityQueueDemo {
    public static void main(String[] args) {
        // part of the Queue interface
        // orders elements based on their natural ordering (for primitives lowest first)
        // custom comparator for customised ordering
        // does not allow null elements

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
        pq.add(15);
        pq.add(10);
        pq.add(30);
        pq.add(5);
        System.out.println(pq); // output -> [5, 10, 30, 15]
//        while(!pq.isEmpty())
//        {
//            System.out.println(pq.poll());
//        }
//
//        System.out.println("maximum priority "+pq.peek()); // 5 is lowest have the greatest priority
//        pq.remove();
//        System.out.println("second maximum priority "+pq.peek()); // now 10 have the maximum priority

//   ==========================
//   internal working
//   PriorityQueue is implemented as a min-heap by default(for natural ordering)

    }
}
