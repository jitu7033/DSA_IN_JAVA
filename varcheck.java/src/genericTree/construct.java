package genericTree;

import java.awt.datatransfer.FlavorEvent;
import java.util.*;

import static java.util.Collections.min;
import static java.util.Collections.reverse;

public class construct {
    public static class Node{
        Node root;
        List<Node>child = new ArrayList<>();
        int val;
        Node(int val){
            this.val = val;
        }
        Node(){

        }
    }
    public static Node constructTree(int arr[]){//using dfs
        Stack<Node>st = new Stack<>();
        Node root = new Node();
        for(int i=0; i<arr.length; i++){
            if(arr[i]==-1)st.pop();
            else{
                Node t = new Node();
                t.val = arr[i];
                if(st.size()>0){
                    st.peek().child.add(t);
                }
                else{
                    root = t;
                }
                st.push(t);
            }

        }
        return root ;
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
    public static  void zigzagOrder(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        boolean flag = false;
        while(!q.isEmpty()) {
            int levelSize = q.size();
            List<Node>currentLevel = new ArrayList<>();
            while(levelSize-->0){
                Node curr = q.peek();
                currentLevel.add(curr);
//                System.out.print(curr.val+" ");
                q.remove();
                int n = curr.child.size();
                for (int i = 0; i < n; i++) {
                    q.add(curr.child.get(i));
                }
            }
            if(flag==false){
                printListNode(currentLevel);
            }
            else{
//                printListNode(currentLevel);
//                Collections.reverse(printListNode(currentLevel));
                reverse(currentLevel);
                printListNode(currentLevel);
            }
            flag = !flag;
//            System.out.println(currentLevel);


        }
    }
    public static void printListNode(List<Node>list){
        int n = list.size();
        for(int i=0; i<n; i++){
            System.out.print(list.get(i).val+" ");
        }
        System.out.println();

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
    public static void postorder(Node root){

        if(root.child.isEmpty()){
            System.out.print(root.val+" ");
            return;
        }
        int n = root.child.size();

        for(int i=0; i<n; i++){
            postorder(root.child.get(i));
//            System.out.print(root.val+" ");
        }
        System.out.print(root.val+" ");

    }
    public static int findMax(Node root){
        int n = root.child.size();
        if(root.child.isEmpty()){
            return root.val;
        }
        int maxi = root.val;
        for(int i=0; i<n; i++){
           int max = findMax(root.child.get(i));
//           if(max>maxi){
//               maxi = max;
//           }
            maxi = Math.max(maxi,max);
        }
        return maxi;
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
    public static void mirror(Node root){
        Queue<Node>q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            int levelSIze = q.size();
            List<Node>currLevel = new ArrayList<>();
            while(levelSIze-->0){
                Node curr = q.peek();
                currLevel.add(curr);
                q.remove();
                int n = curr.child.size();
                for(int i=0; i<n; i++){
                    q.add(curr.child.get(i));
                }
            }
            reverse(currLevel);
            printListNode(currLevel);
        }
    }
    public static void mirrorTree(Node root){
        if(root.child.isEmpty())return;
        int n = root.child.size();
        if(n==1)return;
        for(int i=0; i<n; i++){
            mirrorTree(root.child.get(i));
            reverse(root.child);
        }
        System.out.print(root.val+" ");
    }
    public static void main(String[] args) {
        int arr[] = {10,20,50,-1,60,-1,-1,30,70,-1,80,110,-1,120,-1,-1,90,-1,-1,40,100,-1,-1,-1};
        Node root = (constructTree(arr));
        preorder(root);
        System.out.println();
        postorder(root);
        System.out.println();
        inorder(root);
        System.out.println();
        System.out.println("LevelOrder");
        levelOrderDisplay(root);
        System.out.println();
        System.out.println("ZigZag");
        zigzagOrder(root);
        System.out.println();
        System.out.println("MAX");
        System.out.println(findMax(root));
        System.out.println();
        System.out.println("Mirror");
        mirror(root);
        System.out.println("mirror Tree");
        System.out.println();
        levelOrderDisplay(root);
        System.out.println();
        mirrorTree(root);
        System.out.println();
        levelOrderDisplay(root);
    }
}
