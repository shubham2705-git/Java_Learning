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
    }
}
