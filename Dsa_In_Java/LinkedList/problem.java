package arraylist;

public class problem {
    public static class Node {
        int data;
        Node next;


        Node() {

        }
        Node(int x){
            data = x;
        }

    }

    public  static class linkList {
        Node head = null;
        Node tail = null;


        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;

        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void delete(Node node){
            node.data = node.next.data;
            node.next = node.next.next;
        }
    }
    public static void main(String[] args) {
        linkList ll = new linkList();
        ll.insertAtEnd(9);
        ll.insertAtEnd(10);
        ll.display();
//        ll.delete();

    }
}
