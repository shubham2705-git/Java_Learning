package SetInterface;

import java.util.*;

class Student{
    int rollNo;
    String name;

    @Override
    public String toString() {
        return
               '{'+ "rollNo=" + rollNo +
                ", name=" + name  +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNo == student.rollNo;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(rollNo);
    }

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;


    }
}

public class LearnSets {

    public static void main(String[] args) {

          Set<Student> set = new HashSet<>();

          set.add(new Student(1,"shubham"));
        set.add(new Student(1,"shubham"));
        set.add(new Student(1,"shubham"));
        set.add(new Student(1,"shubham"));

        System.out.println(set);

//        Set<Integer> set = new LinkedHashSet<>();   O(n)
//        Set<Integer> set = new TreeSet<>();      // O(logn)
//
//        set.add(20);
//        set.add(80);
//        set.add(60);
//        set.add(90);
//        set.add(10);
//        set.add(70);
//        set.remove(10);
//        System.out.println(set);
    }
}
