package Queue;

import java.util.*;

public class DequeDemo {
    public static void main(String[] args) {
        Deque<Integer> deque1 = new ArrayDeque<>(); //faster iteration, low memory, no null allowed
        // ArrayDeque -> circular , head and tail
        Deque<Integer> deque2 = new LinkedList<>(); // slower than ArrayDeque

    }
}
