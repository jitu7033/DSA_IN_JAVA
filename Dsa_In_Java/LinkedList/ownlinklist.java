package arraylist;

public class ownlinklist {

    public static  class Node{
        int data;
        Node next;
        Node(){

        }
        Node(int data){
            this.data = data;
        }
    }
    public static class linkelist{
        Node head = null;
        Node tail = null;
        void insertionAEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head = temp;
            }
            else{
                tail.next = temp;
            }
            tail = temp;
        }
        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx==0){
                insertAtBegin(val);
                return;
            }
            if(idx==size()){
                insertionAEnd(val);
                return;
            }
            else if(idx<0 || idx>size()){
                System.out.println("wrong input");
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
        }
        void insertAtBegin(int val){
            Node temp1 = new Node(val);
            if(head==null){
                head = temp1;
                tail = temp1;
            }
            else{
                temp1.next = head;
                head = temp1;
            }
        }
        void deleteAtIndex(int idx){
            Node temp = head;
            if(idx==0){
                head = head.next;
            }
            if(idx<0 || idx>size()){
                System.out.println("wrong input");
                return;
            }
            for(int i=1; i<=idx-1; i++){
                temp = temp.next;
            }
            tail = temp;
            temp.next = temp.next.next;

        }
        void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        void getElement(int idx){
            Node temp = head;
            if(idx<0 || idx>size()){
                System.out.println("Wrong input");
                return;
            }
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            System.out.println(temp.data);
        }
        int  size(){
            Node temp = head;
            int count= 0;
            while(temp!=null){
                count++;
                temp = temp.next;
            }
           return count;
        }
    }

    public static void main(String[] args) {
        linkelist ll = new linkelist();
        linkelist ll1 = new linkelist();
        ll.insertionAEnd(9);
        ll.insertionAEnd(5);
        ll.insertionAEnd(6);
//        ll.display();
//        ll.size();
        ll.insertAtBegin(23);
        ll.insertAt(2,10);
        ll.insertAt(5,21);
        ll.insertAt(0,100);
        ll.display();
        ll.getElement(2);
//        System.out.println(ll.tail.data);
        ll.deleteAtIndex(6);
        ll.display();
        System.out.println(ll.tail.data);
        ll.deleteAtIndex(0);
        ll.display();

    }
}
