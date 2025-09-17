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
public class LLCreation{
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
    public static int lengthOfLL(Node head){
        int cnt = 0;
        Node temp = head;
        while(temp!=null){
            System.out.println(temp.data+" ");
            temp = temp.next;
            cnt++;
        }
        return cnt;
    }
    public static void main(String[] args) {
        int[] arr = {2,5,6,8};
        Node head = convertArr2LL(arr);
//        Node temp = head;
//        while(temp!=null){
//            System.out.println(temp.data+" ");
//            temp = temp.next;
//        }
        System.out.println("length of LL is: "+ lengthOfLL(head));
    }
}
