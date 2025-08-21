package ComparableAndComparator;
public class Animal implements Comparable<Animal>{
    int age;
    String name;
    int weight;

    public Animal(int age, String name, int weight) {
        this.age = age;
        this.name = name;
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    @Override
    public int compareTo(Animal that) {
        if(this.age == that.age) //agr age equal h to name ke hisab se sort krdo ::
        {
            return this.name.compareTo(that.name);
            /* String already implemented compareTo
             method thats why we can write this.name compareTo */
        }
        return this.age-that.age; //sort basis on age
    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}' +"\n";
    }
}
