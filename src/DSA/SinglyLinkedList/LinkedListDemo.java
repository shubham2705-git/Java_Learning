package SinglyLinkedList;

class Node{
    int data;
    Node next;

    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}

public class LinkedListDemo{

        private static Node convertArr2LL(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head;
        for(int i=1; i<arr.length; i++){
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    public static Node reverseList(Node head) {
        Node prev = null;
        Node temp = head;
        while (temp != null) {
            Node front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
             return prev;
    }
    public static void main(String[] args) {
        int[] arr = {2,4,5,6,8};
        Node head = convertArr2LL(arr);
        Node newHead = reverseList(head);
        System.out.println(newHead.data);
    }
}


// ==============     CONVERTING ARRAY TO LL   =========================================================================
//    private static Node convertArr2LL(int[] arr){
//        Node head = new Node(arr[0]);
//        Node mover = head;
//        for(int i=1; i<arr.length; i++){
//            Node temp = new Node(arr[i]);
//            mover.next = temp;
//            mover = temp;
//        }
//        return head;
//    }
// ==================    FINDING LENGTH OF LL    ====================================================================
//    public static int lengthOfLL(Node head){
//        int cnt = 0;
//        Node temp = head;
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp = temp.next;
//            cnt++;
//        }
//        return cnt;
//    }
// ===================     CHECK IF PRESENT    =====================================================================
//    public static boolean checkIfPresent(Node head, int val){
//        Node temp = head;
//        while(temp!=null){
//            if(temp.data == val) return true;
//            temp = temp.next;
//        }
//        return  false;
//    }
// ==================== FIND MIDDLE ELEMENT ============================
//public static Node findMiddle(Node head){
//    Node slow = head;
//    Node fast = head;
//    while(fast!=null && fast.next!=null){
//        slow = slow.next;
//        fast = fast.next.next;
//    }
//    return slow;
//}