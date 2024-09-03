package BackTracking;

import java.util.*;

public class permutation {
    public static void permutationString(String str, String t){
        if(str.equals("")){
            int n = Integer.parseInt(t);
            if(n%3==0){
                System.out.print(n+" ");
            }
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            permutationString(rem,t+ch);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        permutationString(str,"");
//        System.out.println(permutation(3,3));
    }
    public static void permutationString1(String str, String t, HashMap<Integer, String>ans){
        int index = 1;
        if(str.equals("")){
            ans.put(index,t);
            index++;
            System.out.println(ans.size());
            return;
        }
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0,i);
            String right = str.substring(i+1);
            String rem = left+right;
            permutationString(rem,t+ch);
        }


    }
    public static String permutation(int n, int k){
        String str = "";
        for(int i=1; i<=n; i++){
            str+=i;
        }
        HashMap<Integer,String>mp = new HashMap<>();
        permutationString1(str,"",mp);
        if(mp.containsKey(k)){
            return mp.get(k);
        }
        System.out.println(mp.size());
        return "ram";

    }
}
