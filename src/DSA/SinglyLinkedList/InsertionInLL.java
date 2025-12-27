package SinglyLinkedList;

public class InsertionInLL {
    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    static Node createList(){
        int[] arr = {4,3,6,5,2};
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

    public static void main(String[] args) {
        Node head1 = createList();
        System.out.println();
        print(head1);
    }
}
