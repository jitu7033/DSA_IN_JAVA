package dynamicProgramming.lcs;

import java.util.Scanner;

public class lcSubstring {

    static void  longestCommonSubstring(String x, String y){
        int n = x.length();
        int m = y.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0)dp[i][j] = 0;
            }
        }
        int max = 0;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = dp[i-1][j-1]+1;
                    max = Math.max(dp[i][j],max);
                }
                else{
                    dp[i][j] = 0;
                }
            }
        }
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=m; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
//        System.out.println(dp[n][m]);
        System.out.println(max);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.next();
        String y = sc.next();
        System.out.println(x.length());
        System.out.println(y.length());
        longestCommonSubstring(x,y);
    }
}
