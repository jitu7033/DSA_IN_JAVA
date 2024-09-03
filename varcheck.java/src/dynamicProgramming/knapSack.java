package dynamicProgramming;

import java.util.Arrays;

public class knapSack {
    static int count = 0;
    static int count1 = 0;

//    static int maxNapSack(int wt[], int val[], int W, int n){
//        // base case:
//        if(n==0 || W==0)return 0;
//        //choice diagram
//        if(wt[n-1]<=W){
//            count1++;
//           return Math.max(val[n-1]+maxNapSack(wt,val,W-wt[n-1],n-1),maxNapSack(wt,val,W,n-1));
//        }
//        return maxNapSack(wt,val,W,n-1);
//    }
    public static void main(String[] args) {
        int wt[] = {1,3,4,5,2};
        int val[] = {1,4,5,7,10};
        int W = 7;
        int n = wt.length;
//        System.out.println(maxNapSack(wt,val,W,wt.length));
        int dp[][] = new int[n+1][W+1];
       for(int i=0; i<=n; i++){
           for(int j=0; j<=W; j++){
               dp[i][j] = -1;
           }
       }
        System.out.println(maxKNapSack(wt,val,W,n,dp));
        System.out.println(count);
        System.out.println(count1);
//        System.out.println(maxKNapSackDropDown(wt,val,W,n));
        maxKNapSackDropDown(wt,val,W,n);
    }
    //using dp of memorization
    static  int maxKNapSack(int[] wt, int[] val, int W, int n, int[][] dp){
        if(W==0 || n==0)return 0;
        if(dp[n][W]!=-1)return dp[n][W];
        if(wt[n-1]<=W){
            count++;
            return dp[n][W] = Math.max(val[n-1]+maxKNapSack(wt,val,W-wt[n-1],n-1,dp),maxKNapSack(wt,val,W,n-1,dp));
        }
        else{
            return dp[n][W] = maxKNapSack(wt,val,W,n-1,dp);
        }
    }
    // drop-Down method
    static void maxKNapSackDropDown(int wt[], int val[],int W, int n){
        int dp[][] = new int[n+1][W+1];
        int max = 0;
        for(int i=0; i<n+1; i++){
            for(int j=0; j<W+1; j++){
                if(i==0 || j==0){
                    dp[i][j] = 0;
                }
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=W; j++){
                if(wt[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        System.out.println(dp[n][W]);
    }
}
