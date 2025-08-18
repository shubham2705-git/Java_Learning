package Map;

import java.util.HashMap;

public class HashCodeAndEqualsMethod {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<>();
        Person p1 = new Person("Alice",1);
        Person p2 = new Person("Bob",2);
        Person p3 = new Person("Alice",1);

        map.put(p1,"Engineer");
        map.put(p2,"Manager");
        map.put(p3,"Manager");
    }
}

class Person {
    private String name;
    private int id;

    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}