package BST;

import java.util.*;
import java.util.Queue;

public class morris {

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
    public static void morrisTraversal(Node root,List<Integer>ans){// space O(1);time O(n); 
        Node curr = root;
        while(curr!=null) {
            if (curr.left != null) {
                Node pred = curr.left;
                while (pred.right != null && pred.right != curr) {
                    pred = pred.right;
                }
                if (pred.right == null) {
                    pred.right = curr;
                    curr = curr.left;
                }
                if (pred.right == curr) {
                    pred.right = null;
                    ans.add(curr.val);
                    curr = curr.right;
                }
            }
            else{
                ans.add(curr.val);
                curr = curr.right;
            }
        }
    }
    public static void main(String[] args) {
        String arr[] = {"10", "5","15", "2", "8", "12", "17"};
        Node root = bfsConstructor(arr);
        List<Integer>ans = new ArrayList<>();
        morrisTraversal(root,ans);
        for(int x:ans){
            System.out.print(x+" ");
        }

    }
}
