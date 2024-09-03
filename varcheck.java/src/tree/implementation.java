package tree;

import java.util.*;

public class implementation {
    public static class Node{
        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
        }
        Node(){

        }
    }
    public static void display(Node root){
        if(root==null)return;
        System.out.print(root.val+" --> ");
        if(root.left!=null)System.out.print(root.left.val+" ");
        else System.out.print("Null"+" ");
        if(root.right!=null)System.out.println(root.right.val);
        else System.out.println("Null"+" ");
        display(root.left);
        display(root.right);
    }
    public static void preorder(Node root){
        if(root==null)return;
        System.out.print(root.val+" ");
        preorder(root.left);
        preorder(root.right);
//        System.out.println();
    }
    public static void postorder(Node root){
        if(root==null)return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.val+" ");
//        System.out.println();
    }
    public static void inorder(Node root){
        if(root==null)return;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);

//        System.out.println();
    }
    public static void levelOrderDisplay(Node root,int n){
        if(root==null)return;
        if(n==1){ System.out.print(root.val+" ");return;}
        levelOrderDisplay(root.left,n-1);
        levelOrderDisplay(root.right,n-1);
    }
    public static void zigzagDisplay(Node root, int n){
        if(root==null)return;
        if(n==1){
            System.out.print(root.val+" ");
            return;
        }
        zigzagDisplay(root.right,n-1);
        zigzagDisplay(root.left,n-1);
    }
    public static void bfs(Node root){
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        while(q.size()!=0){
           Node temp = q.peek();
           if(temp.left!=null) q.add(temp.left);
           if(temp.right!=null) q.add(temp.right);
           System.out.print(temp.val+" ");
           q.remove();
        }
    }
    public static void dfs(Node root){
        Stack<Node> st = new Stack<>();
        st.add(root);
        while(st.size()!=0){
            Node temp = st.peek();
            if(temp.left!=null){ st.add(temp.left);temp.left = null;}
            else {
                System.out.print(temp.val + " ");
                Node del = st.pop();
                if (del.right != null) st.add(del.right);
            }
        }
    }
    public static int size(Node root){
        if(root==null)return 0;
        int size = size(root.left)+size(root.right)+1;
        return size;
    }
    public static int sum(Node root){
        if(root==null) return 0;
        int sum = sum(root.left)+sum(root.right)+root.val;
        return sum;
    }
    public static int max(Node root){
        if(root==null) return Integer.MIN_VALUE;
        int max = Math.max(Math.max(max(root.right),max(root.left)),root.val);
        return max;
    }
    public static int level(Node root){
        if(root==null)return 0;
        int level = Math.max(level(root.left),level(root.right))+1;
        return level;
    }
    public static int height(Node root){
        if(root==null)return 0;
        if(root.left==null && root.right==null) return 0;
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static int product(Node root){
        if(root==null)return 1;
        return product(root.left)*product(root.right)*root.val;
    }
    public static int min(Node root) {
        if (root == null) return Integer.MAX_VALUE;
        return Math.min(Math.min(min(root.left), min(root.right)), root.val);
    }
    public static int leftMost(Node root){
        Queue<Integer>q = new LinkedList<>();
        q.add(root.val);
        while(q.size()!=0){
            q.remove();
            if(root.right!=null)q.add(root.val);
            if(root.left!=null) q.add(root.val);
        }
        return root.val;

    }
    public static void main(String[] args) {
        Node root = new Node(1);
        Node a = new Node(2);
        Node b = new Node(3);
        Node c = new Node(4);
        Node d = new Node(5);
        Node e = new Node(6);
        Node f = new Node(7);
//        Node g = new Node(8);
        root.left = a;
        root.right = b;
        a.left = c;
        a.right = d;
        b.left = e;
        b.right = f;
//        System.out.println(height(root));
        // zig zag order traversal
        List<List<Integer>> ans = new ArrayList<>();
            levelOrderDisplay(root,level(root));
    }
}
