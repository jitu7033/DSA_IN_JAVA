package tree;

public class constructTreeUsingPreAndIno {
    public static class Node{
        int val;
        Node left;
        Node right;

        Node(int val){
            this.val = val;
        }
        Node(){

        }
    }
    public static void main(String[] args) {
        int pre[] = {1,2,3,4,5,6};
        int in[] = {4,2,5,1,3,6};
        BuildTree(pre,in);
    }
    public static Node BuildTree(int[]pre,int[]in){
//        int n = pre.length;
//       Node ans =  helper(pre,0,n-1,in,0,n-1);
//       return ans;
        int n = pre.length;
        Node ans =  helper(pre,0,n-1,in,0,n-1);
        return ans;
    }
//    public static Node helper(int pre[],int lo,int hi,int[]in,int inLo, int inHi) {
////        int n = pre.length;
//        if(lo>hi)return null;
//        Node root = new Node(pre[lo]);
//        int i = inLo;
//        while (in[i] != pre[lo]) i++;
//        int leftSize = i - inLo;
//        System.out.println(i);
//        root.left = helper(pre,lo+1,lo+leftSize,in,inLo,i-1);
//        root.right = helper(pre,lo+leftSize+1,hi,in,i+1,inHi);
//
////        root.left = helper(pre, lo, lo + leftSize,in, inLo, i - 1);
////        root.right = helper(pre, lo + leftSize + 1, hi, in, i+1,inHi);
//        return root;
//    }
    public static Node helper(int pre[],int lo,int hi,int[]in,int inLo, int inHi) {
        int n = pre.length;
        if(lo>hi)return null;
        Node root = new Node(pre[lo]);
        int i = inLo;
        while (in[i] != pre[lo]) i++;
        int left = i - inLo;
        root.left = helper(pre, lo+1, lo + left, in, inLo, i - 1);
        root.right = helper(pre, lo + left + 1, hi, in, i+1, inHi);
        return root;
    }
}
