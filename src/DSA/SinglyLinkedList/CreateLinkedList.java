package SinglyLinkedList;

public class CreateLinkedList {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " => ");
            temp = temp.next;
        }
        System.out.println("null");
    }


        public static void main(String[] args) {
            Node head = new Node(20);
            Node second = new Node(30);
            Node third = new Node(40);
            Node fourth = new Node(50);

            head.next = second;
            second.next  = third;
            third.next = fourth;

            printList(head);
        }
    }
