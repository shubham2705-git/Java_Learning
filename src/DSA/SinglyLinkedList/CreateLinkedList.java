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
    static Node createList() {
        Node head = new Node(1);
        Node temp = head;

        for (int i = 2; i <= 7; i++) {
            temp.next = new Node(i);
            temp = temp.next;
        }
        return head;
    }

    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    static Node deleteHead(Node head) {
        if (head == null) return null;
        return head.next;
    }

    static Node deleteTail(Node head) {
        if (head == null || head.next==null) return null;
        Node temp = head;
        while(temp.next.next!=null){
            temp=temp.next;
        }
        temp.next=null;
        return head;
    }

    static Node deleteKthElement(Node head,int k){
        if(head==null) return head;
        if(k==1){
            return head.next;
        }
        Node temp = head;
        int count=0;
        Node prev = null;
        while(temp!=null){
            count++;
            if(count==k){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }



    public static void main(String[] args) {
        Node head = new Node(1);
        Node temp = head;

        for(int i=2; i<=7; i++){
            temp.next = new Node(i);
            temp = temp.next;
        }
        System.out.println("Before deleting head:");
        printList(head);
        System.out.println("------------------------------------");

        Node first = createList();
        System.out.println("After deleting head:");
        printList(deleteHead(first));
        System.out.println("------------------------------------");

        Node second=createList();
        System.out.println("After deleting tail");
        printList(deleteTail(second));
        System.out.println("------------------------------------");

        Node third = createList();
        System.out.println("After deleting kth Element");
        printList(deleteKthElement(third,1));
        System.out.println("------------------------------------");
    }

}
