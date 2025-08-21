import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(10);
        deque.addFirst(5);
        deque.addLast(20);

        System.out.println(deque);  // [5, 10, 20]
        System.out.println(deque);  // [5, 10, 20]

    }
}
