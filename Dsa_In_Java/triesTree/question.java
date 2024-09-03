package triesTree;

import java.util.*;

public class question {
    static class Node{
        Node[]child;
        boolean eow;
        Node(){
            child = new Node[26];
            for(int i=0; i<26; i++){
                child[i] = null;
            }
            eow = false;
        }

    }
    static Node root = new Node();
    public static void insert(String word){

        Node curr = root;
        for(int i=0; i<word.length(); i++){
            int idx = word.charAt(i)-'a';
            if(curr.child[idx]==null){
                curr.child[idx] = new Node();
            }
            if(i==word.length()-1) curr.child[idx].eow = true;
            curr = curr.child[idx];
        }
    }
    public static List<String> suffix(String s){
        List<String> ans = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            ans.add(s.substring(i));
        }
        return ans;
    }
    public static int count(Node root){
        List<String>ans = new ArrayList<>();
        Node curr = root;
        if(curr==null)return 0;
        int count = 0;
        for(int i=0; i<26; i++){
            Node node = curr.child[i];
            if(node!=null){
                count+=count(node);
                int ind = i+'a';
                ans.add(String.valueOf(ind));
            }
        }
        return count+1;
    }
    public static Map<String,Integer> mp = new HashMap<>();
    public static List<String>prefix(String s){// find the unique substring of string
        ArrayList<String>ans = new ArrayList<>();
        for(int i=0; i<=s.length(); i++){
            String a = "";
            a+=s.substring(0,i);
            if(!mp.containsKey(a)){
                    ans.add(a);
                    mp.put(a, i);
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        Map<String,Integer> mp = new HashMap<>();
//        List<List<String>>list = new ArrayList<>();
        int n = fs.nextInt();
        String s = fs.next();
        List<String>ans = suffix(s);
        // insert the value in tries
        for(int i=0; i<ans.size(); i++){
            insert(ans.get(i));
            System.out.println(ans.get(i));
        }
        // print the count of unique substring in string;
        System.out.println(count(root));

        // print all prefix of one suffix;
        for(int i=0; i<ans.size(); i++){
            System.out.println(prefix(ans.get(i)));
        }
    }
}
