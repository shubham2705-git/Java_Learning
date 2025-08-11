package ArrayList;

import java.util.*;
public class ListMore {
    public static void main(String[] args) {

        List<String> fruits = new ArrayList<>();

        fruits.add("kiwi");
        fruits.add("Papaya");
        fruits.add("mango");
        fruits.add("Apple");
        fruits.add("Banana");

        for(int i = 0; i < fruits.size(); i++)
        {
            System.out.println("fruit is " + fruits.get(i));
        }

        for(String fruit: fruits)
        {
            System.out.println("for each fruit "+ fruit);
        }

        Iterator<String> fe = fruits.listIterator(2);
        while(fe.hasNext())
        {
            System.out.println("Iterator " + fe.next());
        }
        System.out.println("Iterator " + fruits.subList(1,4));


        Queue<Integer> q = new LinkedList<>();
        q.offer(10);
        q.offer(20);
        q.offer(30);
        q.offer(40);
        q.offer(60);
        System.out.println(q);
        System.out.println(q.poll());
    }
}
