package Queue;

import java.util.*;

public class QueueDemo {
    public static void main(String[] args) {



















//        LINKEDLIST WORKING LIKE QUEUE
//          ================================
        LinkedList<Integer> listQueue = new LinkedList<>();
        listQueue.addLast(1);  // adding is called enqueue
        listQueue.addLast(2);  // adding is called enqueue
        listQueue.addLast(3);  // adding is called enqueue
        System.out.println("LinkedList Working like Queue: "+listQueue);
        Integer i = listQueue.removeFirst();   // adding is called dequeue
        System.out.println(listQueue);
        listQueue.getFirst(); // peek

//      LINKEDLIST WORKING LIKE STACK
//        ==============================
        LinkedList<Integer> listStack = new LinkedList<>();
        listStack.addFirst(3);
        listStack.addFirst(6);
        listStack.addFirst(8);
        listStack.addFirst(5);
        System.out.println("LinkedList Working Like Stack: " +listStack);


    }
}
