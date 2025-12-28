package SinglyLinkedList;

public class InsertionInLL {
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
    static Node insertAtHead(Node head, int val){
        return new Node(val,head);
    }
    static Node insertAtTail(Node head,int val){
        if(head==null) return new Node(val);
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = new Node(val);
        return head;
    }
    static Node insertAtKthPlace(Node head,int k, int val){
        if(head==null) return head;
        if(k==1){
            return new Node(val,head);
        }
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            if(count==k-1){
                Node x = new Node(val);
                x.next = temp.next;
                temp.next = x;
                break;
            }
            temp = temp.next;
        }
        return head;
    }

    public static void main(String[] args) {
        Node head1 = createList();
        print(head1);
        System.out.println("----------------------------------");

        System.out.println("After inserting at head");
        Node head2 = createList();
        print(insertAtHead(head2,15));

        System.out.println("After insertingg at tail");
        Node head3 = createList();
        print(insertAtTail(head3,17));

        System.out.println("After inserting at Kth Place");
        Node head4 = createList();
        print(insertAtKthPlace(head4,5,88));
    }
}
