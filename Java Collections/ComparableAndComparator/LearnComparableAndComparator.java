package ComparableAndComparator;

import java.util.*;

class MyCustomDogComparator implements Comparator<Animal>{
    @Override
    public int compare(Animal o1, Animal o2) {
        return Integer.compare(o1.weight, o2.weight);
    }
}
public class LearnComparableAndComparator {
    public static void main(String[] args) {
        Animal a1 = new Animal(7, "Leo", 10);
        Animal a2 = new Animal(7, "Bruno", 4);
        Animal a3 = new Animal(7, "Maxo", 6);
        Animal a4 = new Animal(7, "Don", 3);

        List<Animal> dogs = new ArrayList<>();

        dogs.add(a1);
        dogs.add(a2);
        dogs.add(a3);
        dogs.add(a4);

        Collections.sort(dogs, new MyCustomDogComparator());
        //comparator aagya to ab uske basis pe sort hoga
        //comparator is versatile

        Collections.sort(dogs, (o1, o2) ->
                o1.name.compareTo(o2.name));

        Collections.sort(dogs, Comparator.comparing(Animal::getAge).thenComparing(Animal::getName));
        System.out.println(dogs);

    }
}
