package SinglyLinkedList;
// Find Middle of linkedList
// Reverse a linkedList
public class MediumLevelQuestions {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
        Node(int data,Node next){
            this.data = data;
            this.next = next;
        }
    }
    static Node createList(){
        int[] arr = {4,3,6,2,8};
        Node head = new Node(arr[0]);
        Node temp = head;
        for(int i=1; i<arr.length; i++){
            temp.next = new Node(arr[i]);
            temp = temp.next;
        }
        return head;
    }
    static void print(Node head){
        Node curr = head;
        while(curr!=null){
            System.out.print(curr.data+" -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
    static int middleEle(Node head){
        if(head==null) return -1;
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }
    static Node reverseLL(Node head){
        if(head==null || head.next==null) return head;

        Node newHead = reverseLL(head.next);
        Node front = head.next;
        front.next = head;
        head.next = null;
        return newHead;
    }


    public static void main(String[] args) {
        Node head1 = createList();
        print(head1);
        System.out.println("----------------------------------");

        System.out.println("Middle element");
        Node head2 = createList();
        int result = middleEle(head2);
        System.out.println(result);

        System.out.println("After reversing a linkedlist");
        Node head3 = createList();
        print(reverseLL(head3));

    }
}
