package triesTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class questionTwo {

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
    public static String s = "";
    public static void longestWord(Node root,StringBuilder sb){
        Node curr = root;
        if(curr==null)return;
        for(int i=0; i<26; i++){
            Node node = curr.child[i];
            if(node!=null && node.eow){
                sb.append((char)(i+'a'));
                if(sb.length()> s.length()) s = sb.toString();
                longestWord(node,sb);
                sb.deleteCharAt(sb.length()-1);
            }
        }
//        System.out.println(s);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        s = " ";
        int n = sc.nextInt();
        String words[] = new String[n];
        for(int i=0; i<n; i++){
            words[i] = sc.next();
        }
        for(int i=0; i<words.length; i++) {
            insert(words[i]);
        }
        StringBuilder sb = new StringBuilder();
        longestWord(root,sb);
        System.out.println(s);
    }
}
