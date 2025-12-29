package SinglyLinkedList;

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
        int[] arr = {4,3,6,5,0,8};
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
        Node temp = head;
        int count=0;
        while(temp!=null){
            count++;
            temp = temp.next;
        }
        count = count/2+1;
        Node temp2 = head;
        int con = 0;
        while(con!=count)
        {
            con++;
            temp2=temp2.next;
        }
        return temp2.data;
    }


    public static void main(String[] args) {
        Node head1 = createList();
        print(head1);
        System.out.println("----------------------------------");

        System.out.println("Middle element");
        Node head2 = createList();
        int result = middleEle(head2);
        System.out.println(result);


    }
}
