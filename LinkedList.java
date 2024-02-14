public class LinkedList {
    static Node head;
    static class Node
    {
        int data;
        Node next;
        Node(int val)
        {
            data=val;
            next=null;

        }
    }
    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        a.next=b;
        b.next=c;
        head=a;
        Node ptr=head;
        while (ptr!=null) {
            System.out.println(ptr.data);
            ptr=ptr.next;
            
        }

    }
}
