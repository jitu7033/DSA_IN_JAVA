package tree;

import java.util.*;

public class construct {
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
    public static int level(Node root){
        if(root==null)return 0;
        int level = Math.max(level(root.left),level(root.right))+1;
        return level;
    }
    public static void levelOrderDisplay(Node root,int n){
        if(root==null){
//            System.out.print("null"+" ");
            return;
        }
        if(n==1){ System.out.print(root.val+" ");return;}

        levelOrderDisplay(root.right,n-1);
        levelOrderDisplay(root.left,n-1);
    }
    public static Node bfsConstructor(String arr[]){
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
    public static void main(String[] args) {
        String arr[] = {"1", "2", "3", "4", "5", "", "6", "7", "", "8", "", "", "9", ""};
        Node root = bfsConstructor(arr);
//        for (int i = 0; i <= level(root); i++) {
//            levelOrderDisplay(root, i);
//        }
//        System.out.println(rightView(root));
//        System.out.println(leftView(root));

    }
    public static void postOrder(Node root,List<Integer>ans,int level){
        if(root==null) return;
        ans.set(level-1,root.val);
        postOrder(root.right,ans,level+1);
        postOrder(root.left,ans,level+1);
//        ans.set(level-1,root.val);
    }
    public static List<Integer> leftView(Node root){
        List<Integer>ans = new ArrayList<>();
        if(root==null)return ans;
        int level = level(root);
        for(int i=0; i<level; i++){
            ans.add(0);
        }
        postOrder(root,ans,1);
        return ans;
    }
    public static List<Integer> rightView(Node root){
        List<Integer>ans = new ArrayList<>();
        if(root==null)return ans;
        int level = level(root);
        for(int i=0; i<level; i++){
            ans.add(0);
        }
        preOrder(root,ans,1);
        return ans;
    }

    private static void preOrder(Node root, List<Integer> ans, int level) {
        if(root==null) return;
        ans.set(level-1,root.val);
        preOrder(root.left,ans,level+1);
        preOrder(root.right,ans,level+1);
    }
    // question find lowest common ancestor
    public static Node lowestCommonAncestor(Node root,Node p, Node q){
        if(root==null) return root;
        if(root==p)return root;
        if(p==q) return p;
        boolean left = contain(root.left,p);
        boolean right = contain(root.right,q);
        if(left && right)return root;
        if(!left&&right)lowestCommonAncestor(root.right,p,q);
        if(!right&&left)lowestCommonAncestor(root.left,p,q);
        return root;
    }

    private static boolean contain(Node root, Node node) {
        if(root==null)return false;
        if(node==root)return true;

        return contain(root.left,node) || contain(root.right,node);
    }
}
