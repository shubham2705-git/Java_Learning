package Predicate;

import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String[] args) {

        Predicate<Integer> isEven = x-> x%2==0;
        System.out.println(isEven.test(10));

        Predicate<String> isStartWithA = x->x.toLowerCase().startsWith("a");
        System.out.println(isStartWithA.test("shubham"));

        Predicate<String> isEndWithA = x->x.toLowerCase().endsWith("a");
        System.out.println(isEndWithA.test("shubhama"));

        //======================================//
        Predicate<String> both = isStartWithA.and(isEndWithA);
        System.out.println(both.test("shubhama"));
        System.out.println(both.test("AMamaa"));

    }
}
