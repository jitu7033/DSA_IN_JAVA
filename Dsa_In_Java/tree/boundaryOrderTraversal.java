package tree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class boundaryOrderTraversal {

    public static class Node {
        int val;
        Node left;
        Node right;

        public Node(int val) {// constructor
            this.val = val;
        }

        public Node() {// constructor
        }

    }

    public static int level(Node root) {
        if (root == null) return 0;
        int level = Math.max(level(root.left), level(root.right)) + 1;
        return level;
    }

    public static void levelOrderDisplay(Node root, int n) {
        if (root == null) {
//            System.out.print("null"+" ");
            return;
        }
        if (n == 1) {
            System.out.print(root.val + " ");
            return;
        }
        levelOrderDisplay(root.right, n - 1);
        levelOrderDisplay(root.left, n - 1);
    }

    public static Node bfsConstructor(String arr[]) {
        int n = arr.length;
        int x = Integer.parseInt(arr[0]);
        Node root = new Node(x);
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        int i = 1;
        while (i < n - 1) {
            Node temp = q.remove();
            Node left = new Node();
            Node right = new Node();
            if (arr[i].equals("")) {
                left = null;
            } else {
                int l = Integer.parseInt(arr[i]);
                left.val = l;
                q.add(left);
            }
            if (arr[i + 1].equals("")) right = null;
            else {
                int r = Integer.parseInt(arr[i + 1]);
                right.val = r;
                q.add(right);
            }
            temp.left = left;
            temp.right = right;
            i += 2;
        }
        return root;
//
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
        String arr[] = {"1","2","3","4","5","6","8","7","","8"};
//        String arr[]  = new String[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextLine();
//        }
        Node root = bfsConstructor(arr);
//        boundaryDisplay(root);
    }

    private static void boundaryDisplay(Node root) {
        leftBoundary(root);
        leafBoundary(root);
        rightBoundary(root.right);
    }

    private static void leafBoundary(Node root) {
        if(root==null)return;
        if(root.left==null && root.right==null) {System.out.print(root.val+" ");return;}
//        if(root.right==null) {System.out.println(root.val);return;}
        leafBoundary(root.left);
        leafBoundary(root.right);

    }

    private static void rightBoundary(Node root) {
        if(root==null) return;
        if(root.left==null && root.right==null) return;

        if(root.right!=null)rightBoundary(root.right);
        else rightBoundary(root.left);
        System.out.print(root.val+" ");
    }

    private static void leftBoundary(Node root) {
        if(root==null)return;
        if(root.left==null && root.right==null) return;
        System.out.print(root.val+" ");
        if(root.left!=null)leftBoundary(root.left);
        else leftBoundary(root.right);
    }
}

