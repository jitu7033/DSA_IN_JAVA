package genericTree;

import javax.sound.midi.Soundbank;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import static java.util.Collections.reverse;

public class implementation {
    static class Node{
        Node root;
        List<Node> child;
        int val;
        Node(){

        }
        Node(int val){
            this.val = val;
            child = new ArrayList<>();
        }
    }
    public static void add(Node root){
        root.child.add(new Node(12));
        root.child.add(new Node(11));
        root.child.get(0).child.add(new Node(13));
        root.child.get(0).child.add(new Node(14));
        root.child.get(0).child.add(new Node(15));
        root.child.get(1).child.add(new Node(16));
        root.child.get(1).child.add(new Node(17));
        root.child.get(1).child.add(new Node(18));
        root.child.get(0).child.get(0).child.add(new Node(19));
    }
    public static void preorder(Node root){

        if(root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }
        int n = root.child.size();
        System.out.print(root.val+" ");
        for(int i=0; i<n; i++){
            preorder(root.child.get(i));
//            System.out.print(root.val+" ");
        }

    }
    public static void inorder(Node root){

        if(root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }
        int n = root.child.size();

        for(int i=0; i<n/2; i++){
            inorder(root.child.get(i));
//            System.out.print(root.val+" ");
        }
        System.out.print(root.val+" ");
        for(int i=n/2; i<n; i++){
            inorder(root.child.get(i));
//            System.out.print(root.val+" ");
        }

    }
    public static void postorder(Node root){
        if(root.child.isEmpty()){
            System.out.print(root.val+" ");return;
        }
        int n = root.child.size();
        for(int i=0; i<n; i++){
            postorder(root.child.get(i));
        }
        System.out.print(root.val+" ");
    }
    public static void mirrorTree(Node root){
        if(root.child.isEmpty())return;
        int n = root.child.size();
        if(n==1)return;
        for(int i=0; i<n; i++){
            mirrorTree(root.child.get(i));
            reverse(root.child);
        }
//        System.out.print(root.val+" ");
    }
    public static  void levelOrderDisplay(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()) {
            Node curr = q.peek();
            System.out.print(curr.val+" ");
            q.remove();
            int n = curr.child.size();
            for (int i = 0; i < n; i++) {
                q.add(curr.child.get(i));
            }
        }
    }
    public static void main(String[] args) {
        Node root = new Node(10);
        add(root);
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println("Level");
        levelOrderDisplay(root);
        System.out.println();
        System.out.println("Mirror");
        mirrorTree(root);
        levelOrderDisplay(root);
    }
}
