package Tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PreInPostOrderTraversal {

    static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
    }

    static class Pair{
        Node node;
        int num; // 1 = pre, 2 = In, 3 = Post

        Pair(Node node, int num){
            this.node = node;
            this.num = num;
        }
    }

    public static void preInPostTraversal(Node root){
        if(root == null) return;

        Stack<Pair> st = new Stack<>();
        st.push(new Pair(root,1));

        List<Integer> pre = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        List<Integer> post = new ArrayList<>();

        while(!st.isEmpty()){
            Pair it = st.pop();

            //Preorder
            if(it.num == 1){
                pre.add(it.node.val);
                it.num++;
                st.push(it);

                if(it.node.left != null){
                    st.push(new Pair(it.node.left, 1));
                }
            }

            // Inorder
            else if(it.num == 2){
                in.add(it.node.val);
                it.num++;
                st.push(it);

                if(it.node.right != null){
                    st.push(new Pair(it.node.right, 1));
                }
            }

            // Postorder
            else{
                post.add(it.node.val);
            }
        }

        System.out.println("preorder " + pre);
        System.out.println("inorder "+ in);
        System.out.println("postorder "+ post);
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(4);
        root.left.right = new Node(5);

        root.right.left = new Node(6);
        root.right.right = new Node(7);

        preInPostTraversal(root);
    }
}
