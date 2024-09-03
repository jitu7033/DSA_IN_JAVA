package tree;

public class question {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node (int val){
            this.val = val;
        }
        Node(){

        }
    }
    public static int  height(Node root){
        if(root==null || (root.left==null && root.right==null)) return 0;
        return 1+(Math.max(height(root.left),height(root.right)));
    }
    public static boolean isBalance(Node root ){
        if(root==null) return true;
        int leftH = height(root.left);
        int rightH = height(root.right);
        int d = leftH-rightH;
        d = Math.abs(d);
        if(d>1) return false;
        return (isBalance(root.left) && isBalance(root.right));
    }
    public static int dia(Node root){
        if(root==null || (root.left==null && root.right==null))return 0;
        int left = dia(root.left);
        int ri = dia(root.right);
        int mid = height(root.left)+height(root.right);
        if(root.right!=null)mid++;
        if(root.left!=null)mid++;
        return Math.max(Math.max(mid,left),ri);
    }
    public static void main(String[] args) {
       Node root = new Node(1);
       Node b = new Node(2);
       Node c = new Node(3);
       Node d = new Node(4);
       Node e = new Node(5);
       root.left = b;
//       root.right = c;
       b.left = d;
       b.right = e;
       e.left = c;
//        System.out.println(dia(root));
        System.out.println(isBalance(root));
    }
}
