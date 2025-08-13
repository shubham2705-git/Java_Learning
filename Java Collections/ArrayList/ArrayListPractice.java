package ArrayList;

import java.util.*;

class StringLengthComparator implements Comparator<String>
{
    @Override
    public int compare(String o1, String o2) {
       return o1.length() - o2.length();
    }
}
//  o1   o2
// "Ok" "bye"
class Student{
    String name;
    int gpa;
    public Student(String name,int gpa)
    {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() {
        return name;
    }
    public int getGpa() {
        return gpa;
    }
}


class MyComparator implements Comparator<Integer>{
    @Override
    public int compare(Integer o1, Integer o2) {
       return o1 - o2 ;
    }
}


public class ArrayListPractice {
    public static void main(String[] args) {

        List<Student> students = new ArrayList<>();

        students.add(new Student("Slice",5));
        students.add(new Student("Shubham",4));
        students.add(new Student("Aagar",5));
        students.add(new Student("Sona",7));

        Comparator<Student> comparator = Comparator.comparing(Student::getGpa).reversed().thenComparing(Student::getName);
        students.sort(comparator);
        for(Student s: students)
        {
            System.out.println(s.getName() + ":" + s.getGpa());
        }


















        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(1);
        list.add(4);
        list.add(3);

        list.sort((a,b)->b-a);
//        System.out.println(list);

        List<String> words = Arrays.asList("banana", "apple", "date");
        words.sort((a,b) ->a.length()-b.length());
//        System.out.println(words);

        Collections.sort(list);

        list.sort(new MyComparator());
//        System.out.println(list);



    }
}
