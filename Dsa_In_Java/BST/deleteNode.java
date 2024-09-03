package BST;

import tree.implementation;

import java.util.*;

import static tree.implementation.preorder;

public class deleteNode{

    public static class Node{
                int val;
        Node left;
        Node right;
        public Node(int val){// constructor
            this.val = val;
        }
        public Node(){// constructor
        }

    }
    public static  Node bfsConstructor(String arr[]){
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while(i<n-1){
            Node temp = q.remove();
            Node left = new Node();
            Node right = new Node();
            if(arr[i].equals("")){
                left = null;
            }
            else{
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if(arr[i+1].equals(""))right = null;
            else{
                int r = Integer.parseInt(arr[i+1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i+=2;
        }
        return root;
//
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Main File ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
//                                        `````j`````
//                                            ````i````
//                                     `````t```
//                                                ```u````
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~Main ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static void main(String[] args) {
        String  arr[] = {"50","20","60","17","34","55","89","10","","28","", "", "","70","","","14"};
        Node root = bfsConstructor(arr);
        preorder(root);
        System.out.println();
        int target = 89;
//        preorder(delete(root,target));
//        System.out.println();
        predecessorSuccessor(root,target);
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~many function~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    public static Node delete(Node root, int target){
        Node temp = new Node(Integer.MAX_VALUE);
        temp.left = root;
        deleteLeaf(temp,target);
        return temp.left;
    }
    private static void preorder(Node root){
        if(root==null) return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
    }
    private static void deleteLeaf(Node root,int target){
        if(root==null) return;
        if(root.val>target){
            if(root.left==null) return;
            if(root.left.val==target) {
                Node l = root.left;
                if(l.left==null && l.right==null) root.left = null;// leaf node
                else if(l.left==null || l.right==null){// root 1 child
                    if(l.left!=null) root.left = l.left;
                    else root.left = l.right;
                }
                else{// root two child
                        Node curr = l;
                        Node pred = curr.left;
                        while(pred.right!=null) pred = pred.right;
                        deleteLeaf(root,pred.val);
                        pred.left = curr.left;
                        pred.right = curr.right;
                        root.left = pred;
                }
            }
            else deleteLeaf(root.left,target);
        }
        else{
            if(root.right==null) return;
            if(root.right.val==target) {
                Node r = root.right;
                if(r.right==null && r.left==null) root.right=null;
                else if(r.right==null || r.left==null){
                    if(r.left!=null) root.right = r.left;
                    else root.right = r.right;
                }
                else{// root two child
                    Node curr = r;
                    Node pred = curr.left;
                    while(pred.right!=null) pred = pred.right;
                    deleteLeaf(root,pred.val);
                    pred.left = curr.left;
                    pred.right = curr.right;
                    root.right = pred;
                }
            }
            else deleteLeaf(root.right,target);
        }

    }
    public static void predecessorSuccessor(Node root,int p){
        List<Integer>a = new ArrayList<>();
        inorder(root,a);
        int pred = 0;
        int sec = 0;
        for(int i=0; i<a.size(); i++){
            if(a.get(i)==p){
                if(i>0)pred = a.get(i-1);
                if(i<a.size()-1)sec = a.get(i+1);
            }
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
        System.out.println("pred = "+pred+" "+"secc=" +sec);
    }

    public static void inorder(Node root, List<Integer>a){
        if(root==null) return;
        inorder(root.left,a);
        a.add(root.val);
        inorder(root.right,a);
    }
}
