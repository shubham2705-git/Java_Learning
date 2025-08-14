package StackDemo.java;

import java.util.*;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        System.out.println(stack);
 //       Integer removeElement = stack.pop();
        System.out.println(stack);
//        Integer peek = stack.peek();

        stack.push(45);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.size());
        stack.add(1,45);
        System.out.println(stack);

    //    <-------------------------->
    //   linkedlist As Stack :-----

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.addLast(1);
        linkedList.addLast(2);
        linkedList.addLast(3);

        linkedList.getLast();  //peek
        linkedList.removeLast();  //pop
        linkedList.size();
        linkedList.isEmpty();

    // <------------------------------->
    // ArrayList as Stack :-----  \
     ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        arrayList.get(arrayList.size()-1);   //peek
        arrayList.remove(arrayList.size()-1); //pop

    }
}
