package CopyOnWriteArrayList;

import java.util.*;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    public static void main(String[] args) {

        List<String> list = new CopyOnWriteArrayList<>();
        list.add("shubham");
        list.add("sagar");
        list.add("raj");
        list.add("jai");
        list.add("prakash");
        list.add("rahul");
        list.add("aryan");

        System.out.println("list:-"+list);

        for(String item: list)
        {
            if(item.equals("jai"))
            {
                list.add("Butter");
                // it will throw ConcurrentModificationException
                // qki for each loop me read only kr skte h
                // but we can do List<String> list = new CopyOnWriteArrayList<>();
                System.out.println("Added Butter While reading.");
            }
        }
        System.out.println("Updated list:-" +list);
    }


}
