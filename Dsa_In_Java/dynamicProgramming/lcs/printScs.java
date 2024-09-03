package dynamicProgramming.lcs;

import java.util.ArrayList;
import java.util.Scanner;

public class printScs { // Print shortest common subsequence


    static void printShortestCommonSubsequence(String s, String s1){
        int n = s.length();
        int m = s1.length();

        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j] = 0;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(s.charAt(i-1)==s1.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        // print

        int i = n;
        int j = m;
        ArrayList<Character>ans = new ArrayList<>();
        String ans1 = "";

        while(i>0 && j>0){
            if(s.charAt(i-1)==s1.charAt(j-1)){
                ans.add(s.charAt(i-1));
                i--;
                j--;
            }
            else if(dp[i-1][j]>dp[i][j-1]){
                ans.add(s.charAt(i-1));
                i--;
            }
            else{
                ans.add(s1.charAt(j-1));
                j--;
            }
        }
        while(i>0){
            ans.add(s.charAt(i-1));
            i--;
        }
        while(j>0){
            ans.add(s1.charAt(j-1));
            j--;
        }
        for(i=ans.size()-1; i>=0; i--){
            ans1+=ans.get(i);
        }
        System.out.println(ans1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String s1 = sc.next();

        printShortestCommonSubsequence(s,s1);

    }
}
