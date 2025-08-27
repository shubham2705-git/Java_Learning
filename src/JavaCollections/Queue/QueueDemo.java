package Queue;

import java.util.*;
import java.util.concurrent.ArrayBlockingQueue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        System.out.println(queue.size());
        System.out.println(queue.remove()); // throws exception if empty
        System.out.println(queue.poll());  // better version if remove

//        System.out.println(queue.element()); // (head) throws exception if empty
        System.out.println(queue.peek()); // better version

        Queue<Integer> queue2 = new ArrayBlockingQueue<>(2);
        System.out.println(queue2.add(1)); // true
        System.out.println(queue2.offer(2)); // true
//        System.out.println(queue2.add(3)); // throws exception



















//        LINKEDLIST WORKING LIKE QUEUE
//          ================================
//        LinkedList<Integer> listQueue = new LinkedList<>();
//        listQueue.addLast(1);  // adding is called enqueue
//        listQueue.addLast(2);  // adding is called enqueue
//        listQueue.addLast(3);  // adding is called enqueue
//        System.out.println("LinkedList Working like Queue: "+listQueue);
//        Integer i = listQueue.removeFirst();   // adding is called dequeue
//        System.out.println(listQueue);
//        listQueue.getFirst(); // peek

//      LINKEDLIST WORKING LIKE STACK
//        ==============================
//        LinkedList<Integer> listStack = new LinkedList<>();
//        listStack.addFirst(3);
//        listStack.addFirst(6);
//        listStack.addFirst(8);
//        listStack.addFirst(5);
//        System.out.println("LinkedList Working Like Stack: " +listStack);


    }
}
