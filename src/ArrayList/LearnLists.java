package ArrayList;

import java.util.*;

public class LearnLists {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(1);
        list.add(1);
        list.add(1);
        list.add(1);

        list2.add(20);
        list2.add(10);
        list2.add(80);


        System.out.println(list);
        System.out.println(list.get(0));
        list.set(1,200);
        System.out.println(list);
        list.add(0,2002);
        System.out.println(list);
        System.out.println(list.lastIndexOf(1));




       // Object a[] = list.toArray();

        System.out.println(list);
        System.out.println(list2);
        list2.clear();
        list2.addAll(list);
        list2.retainAll(list);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.contains(20));
        list.remove(1);
        System.out.println(list);

    }
}
