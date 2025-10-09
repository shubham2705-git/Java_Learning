package StackAndQueue;

public class Stack {
    private int[] arr;
    private int top;
    private int capacity;
    public Stack(int size){
        arr = new int[size];
        capacity = size;
        top = -1;
    }
    public void push(int item){
        if(isFull()){
            System.out.println("Stack overflow");
            return;
        }
        arr[++top] = item;
        System.out.println(item+" pushed to stack");
    }
    public int pop(){
        if(isEmpty()){
            System.out.println("Stack underflow");
            return -1;
        }
        return arr[top--];
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }
    public boolean isEmpty(){
        return top==-1;
    }
    public boolean isFull(){
        return top==capacity-1;
    }
    public int size(){
        return top+1;
    }
    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.peek();
        stack.pop();
        stack.size();
    }
}
