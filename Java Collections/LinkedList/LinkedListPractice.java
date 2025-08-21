package LinkedList;

import java.util.LinkedList;
import java.util.*;
public class LinkedListPractice{
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(4);
        linkedList.add(6);
        linkedList.add(9);
        linkedList.add(8);
        linkedList.add(7);
        linkedList.add(8);
//        linkedList.add(7);
        linkedList.addLast(5);  //O(1)
        linkedList.addFirst(42);   //O(1)

//        System.out.println(linkedList.get(4));  // O(n)
//
//        System.out.println(linkedList.getLast());
//
//        System.out.println(linkedList.getFirst());

        linkedList.removeFirst();
        linkedList.removeLast();

//        System.out.println(linkedList);

        linkedList.removeIf(x -> x % 2 == 0);

//        System.out.println(linkedList);

        LinkedList<String> animals = new LinkedList<>(Arrays.asList("cat","horse","dog"));
        LinkedList<String> animals2 = new LinkedList<>(Arrays.asList("cat","Lion","dog"));

        animals.removeAll(animals2);
        System.out.println(animals);



    }
    }



