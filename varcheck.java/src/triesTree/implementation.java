package triesTree;

import java.util.Scanner;

public class implementation {
    static class Node{
        Node[] child;

        boolean eow;

        Node(){
            child = new Node[26];
            for(int i=0; i<26; i++){
                child[i] = null;
            }
            eow = false;
        }
    }
   public static Node root = new Node();
    public static void insert(String word){//O(L)--> level
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx] = new Node();
            }
            if(i==word.length()-1)curr.child[idx].eow= true;
            curr = curr.child[idx];
        }
    }
    public static boolean search(String word){// O(L) L--> level
        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            Node node = curr.child[idx];
            if(node==null) {
                return false;
            }
            if(i==word.length()-1 && node.eow==false){
                return false;
            }
            curr = node;
        }
      return true;

    }
    public static boolean wordBreak(String key){
        if(key.length()==0)return true;
        for(int i=1; i<=key.length(); i++){
            String firstPart = key.substring(0,i);
            String secPart = key.substring(i);
            if(search(firstPart) && wordBreak(secPart)){
                return true;
            }

        }
        return false;
    }
    public static boolean startWith(String prefix){
        Node curr = root;
        for(int i=0; i<prefix.length(); i++){
            int idx = prefix.charAt(i)-'a';
            Node node = curr.child[idx];
            if(node==null && i<=prefix.length()-1)return false;
            curr = curr.child[idx];
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i=0; i<n; i++){
            words[i] = sc.next();
        }
        int m = sc.nextInt();
        for(int i=0; i<m; i++) {
            for(int j=0; j<words.length; j++){
                insert(words[j]);
            }
            String key = sc.next();
            System.out.println(startWith(key));
        }

//        System.out.println(wordBreak(key));
//        System.out.println(search(key));
//        for(String s:words){
//            System.out.println(s);
//        }
//        System.out.println(key);

    }
}
