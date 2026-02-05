package src.tree;

public class BST {
    static Node root;
    static class Node
    {
        int data;
        Node left,right;
        Node(int val)
        {
            data=val;
            left=right=null;
        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        root=a;
        a.left=b;
        a.right=c;
        System.out.println(a.data);
        System.out.println(a.left.data);
        System.out.println(a.right.data);

    }
}
