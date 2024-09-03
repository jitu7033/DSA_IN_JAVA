package BST;

public class constructBst {
    public static class Node{
        int val;
        Node root;
        Node left;
        Node right;

        Node(){

        }
        Node(int val){
            this.val = val;
        }
    }
    public static Node construct(int arr[],int lo, int hi){
        if(lo>hi)return null;
        int mid = lo+(hi-lo)/2;
        Node root = new Node(arr[mid]);
        root.left = construct(arr,lo,mid-1);
        root.right = construct(arr,mid+1,hi);
        return root;
    }
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8,9};
        int n = arr.length;
        Node root = construct(arr,0,n-1);
        inorder(root);
    }
    public static void inorder(Node root){
        if(root==null) return ;
        inorder(root.left);
        System.out.print(root.val+" ");
        inorder(root.right);
    }
}
