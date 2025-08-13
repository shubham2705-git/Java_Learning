package ArrayList;

import java.util.*;

public class ArrayListPractice {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);
        Collections.sort(list);
        System.out.println(list);

    }
}
