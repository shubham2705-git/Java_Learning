package StackAndQueue;

import java.util.Stack;

public class ImplementQueueUsingStacks {
    private Stack<Integer> s1;
    private Stack<Integer> s2;

    // Constructor (must match class name)
    public ImplementQueueUsingStacks() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        // Move all elements from s1 to s2
        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        // Push the new element
        s1.push(x);

        // Move elements back to s1
        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
    }

    public int pop() {
        return s1.pop();
    }

    public int peek() {
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    // Main method with static input
    public static void main(String[] args) {
        ImplementQueueUsingStacks q = new ImplementQueueUsingStacks();

        // Static input (no Scanner)
        q.push(10);
        q.push(20);
        q.push(30);

        System.out.println("Front element: " + q.peek()); // Expected: 10
        System.out.println("Popped: " + q.pop());          // Expected: 10
        System.out.println("Front element after pop: " + q.peek()); // Expected: 20
        System.out.println("Is queue empty? " + q.empty()); // Expected: false

        q.pop();
        q.pop();

        System.out.println("Is queue empty after popping all? " + q.empty()); // Expected: true
    }
}
