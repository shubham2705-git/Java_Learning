package SinglyLinkedList;

public class ArrayToLLConversion {
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
            while(temp != null){
                System.out.print(temp.data +" => ");
                temp = temp.next;
            }
            System.out.println("null");
        }
        public static Node createList(int[] arr){
            Node head = new Node(arr[0]);
            Node temp = head;

            for(int i=1; i<arr.length; i++){
                temp.next = new Node(arr[i]);
                temp = temp.next;
            }
            return head;
        }
    public static void main(String[] args) {
        int[] arr = {2,4,6,7,8,9};
        Node head = createList(arr);
        printList(head);
    }
}
