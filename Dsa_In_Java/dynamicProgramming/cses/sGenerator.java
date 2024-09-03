package dynamicProgramming.cses;

import java.util.Scanner;

public class sGenerator {
    public static String rev(String s){
        String str = "";
        for(int i=s.length()-1; i>=0; i--){
            str+=s.charAt(i);
        }
        return str;
    }
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        String s = fs.next();
        String s1 = fs.next();

        if(solve(rev(s),s1,0,s1.length()-1,0)) System.out.println("Yes");
        else System.out.println("No");
    }
    private static boolean solve(String s, String s1, int i, int j, int k) {
        if (k == s.length()) return true;
        if(s.charAt(i)==s1.charAt(j) && s1.charAt(i)==s.charAt(k)){
            return solve(s,s1,i+1,j,k+1)||solve(s,s1,i,j-1,k+1);
        }
        if (s.charAt(k) == s1.charAt(i)) {
            return solve(s,s1,i+1,j,k+1);
        }
        else if(s.charAt(k)==s1.charAt(j)){
            return solve(s,s1,i,j-1,k+1);
        }
        return false;
    }
}
