package SinglyLinkedList;

public class CreateAndDeletionOfLL {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static Node createList() {
        int[] values = {3, 2, 4, 6, 5};

        Node head = new Node(values[0]);
        Node temp = head;

        for (int i = 1; i < values.length; i++) {
            temp.next = new Node(values[i]);
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

    static Node deleteEle(Node head,int element){
        if(head==null) return null;
        if(head.data==element){
            return head.next;
        }
        Node temp = head;
        Node prev = null;
        while(temp!=null){
            if(temp.data==element){
                prev.next = prev.next.next;
                break;
            }
            prev = temp;
            temp = temp.next;
        }
        return head;
    }



    public static void main(String[] args) {

        System.out.println("Before deleting head:");
        printList(createList());
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

        Node fourth = createList();
        System.out.println("After deleting Element");
        printList(deleteEle(fourth,2));
        System.out.println("------------------------------------");
    }

}
