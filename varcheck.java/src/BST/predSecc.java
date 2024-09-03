package BST;

import tree.implementation;

import java.util.*;

import static tree.implementation.preorder;

public class predSecc{
    static int pred = -1;static int sec = -1; static boolean flag = false;static Node temp = null;

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
        int val = 20;
        inorder(root,val);
        System.out.println(pred);
        System.out.println(sec);
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~many function~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


    public static void inorder(Node root, int val){
        if(root==null) return;
        inorder(root.left,val);
        if(temp==null) temp = root;
        if(root.val==val){
            sec = temp.val;
            flag = true;
        }
        else if(root.val>val && flag){
            pred = root.val;
            flag = false;
        }
        else temp = root;
        inorder(root.right,val);
    }
}
