package StackAndQueue;

import java.util.LinkedList;
import java.util.Queue;

public class ImplementStackUsingQueue {

    static class MyStack {
        private Queue<Integer> q;

        public MyStack() {
            q = new LinkedList<>();
        }

        public void push(int x) {
            q.add(x);
            int size = q.size();

            // Rotate the queue so that the new element is at the front
            for (int i = 0; i < size - 1; i++) {
                q.add(q.remove());
            }
        }

        public int pop() {
            return q.remove();
        }

        public int top() {
            return q.peek();
        }

        public boolean empty() {
            return q.isEmpty();
        }
    }

    public static void main(String[] args) {
        MyStack stack = new MyStack();

        // Static input (no Scanner)
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Top element: " + stack.top());   // Expected: 30
        System.out.println("Popped element: " + stack.pop()); // Expected: 30
        System.out.println("New top after pop: " + stack.top()); // Expected: 20
        System.out.println("Is stack empty? " + stack.empty()); // Expected: false

        stack.pop();
        stack.pop();

        System.out.println("Is stack empty after popping all? " + stack.empty()); // Expected: true
    }
}
