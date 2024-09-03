package arraylist;

public class linkedlist {

    public static void insertAtEnd(Node head, int val){
        Node temp = new Node(val);
        Node t = head;
        while(t.next!=null){
            t = t.next;
        }
        t.next = temp;
    }

    // print linked list
    static void printLinkedList(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    static void printRecursively(Node head){
        Node temp = head;
        if(temp==null) return;

        System.out.print(temp.data+" ");
        printRecursively(temp.next);
    }

    public static  class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(4);
        Node c = new Node(6);
        Node d = new Node(7);
//        System.out.println(a);
        a.next = b;
        b.next = c;
        c.next = d;
        printLinkedList(a);
//        printRecursively(a);
        insertAtEnd(a,56);
        printLinkedList(a);

    }

}
