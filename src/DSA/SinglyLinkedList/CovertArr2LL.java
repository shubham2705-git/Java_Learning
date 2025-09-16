
package SinglyLinkedList;
    public class CovertArr2LL extends LLCreation{
        private static SinglyLinkedList.Node converArr2LL(int[] arr){
            SinglyLinkedList.Node head = new SinglyLinkedList.Node(arr[0]);
            SinglyLinkedList.Node mover = head;
            for(int i=1; i<arr.length; i++){
                SinglyLinkedList.Node temp = new SinglyLinkedList.Node(arr[i]);
                mover.next = temp;
                mover = temp;
            }
            return head;
        }
        public static void main(String[] args) {
            int[] arr = {25,6,8};
            SinglyLinkedList.Node head = converArr2LL(arr);
            System.out.println(head.data);
        }
    }

