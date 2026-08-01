package SinglyLinkedList;

public class InsertionAtHead {
    static class Node {
        int data;
        CreateLinkedList.Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static CreateLinkedList.Node insrtAtFirst(CreateLinkedList.Node head){
        CreateLinkedList.Node newHead = new CreateLinkedList.Node(10);
        newHead.next = head;
        return newHead;
    }
    public static void printList(CreateLinkedList.Node head){
        CreateLinkedList.Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    public static void main(String[] args) {
        CreateLinkedList.Node head = new CreateLinkedList.Node(20);
        CreateLinkedList.Node second = new CreateLinkedList.Node(30);
        CreateLinkedList.Node third = new CreateLinkedList.Node(40);
        CreateLinkedList.Node fourth = new CreateLinkedList.Node(50);

        head.next = second;
        second.next  = third;
        third.next = fourth;

        printList(head);
        head = insrtAtFirst(head);
        System.out.println();
        System.out.println("After insertion");
        printList(head);
    }
}
