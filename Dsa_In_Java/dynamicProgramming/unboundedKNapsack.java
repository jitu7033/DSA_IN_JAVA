package dynamicProgramming;

import java.util.Arrays;

public class unboundedKNapsack {

    public static int maxProfit(int arr[], int val[], int n, int wt){
        if(n==0 || wt==0)return 0;
//        System.out.println(n);
        if(arr[n-1]<=wt){
            return Math.max(val[n-1]+maxProfit(arr,val,n,wt-arr[n-1]),maxProfit(arr,val,n-1,wt));
        }
            return maxProfit(arr,val,n-1,wt);
    }
    // using tabulation
    public static int usingTabulation(int arr[], int val[], int n, int wt, int dp[]){
        if(n==0 || wt==0)return 0;
        if(dp[n]!=-1)return dp[n];
        if(arr[n-1]<=wt){
            return dp[n] = Math.max(val[n-1]+usingTabulation(arr,val,n,wt-arr[n-1],dp),usingTabulation(arr,val,n-1,wt,dp));
        }
        return dp[n] = usingTabulation(arr,val,n-1,wt,dp);

    }
    // using proper dp
    static void properDp(int arr[], int val[], int n, int wt){
        int dp[][] = new int[n+1][wt+1];
        for(int i=0;i<=n; i++){
            for(int j=0; j<=wt; j++){
                if(i==0 || j==0)dp[i][j] = 0;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=wt; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = Math.max(val[i-1]+dp[i][j-arr[i-1]],dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=wt; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println(dp[n][wt]);
    }
    public static void main(String[] args) {

        int wt = 10;
        int arr[] = {1,2,3,4,5,6,7,8};
        int val[] = {1,2,3,5,7,8,10,20};
        int n = arr.length;
//        System.out.println(n);
        System.out.println(maxProfit(arr,val,arr.length,wt));
        // using tabulation
        int dp[] = new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(usingTabulation(arr,val,n,wt,dp));
        properDp(arr,val,n,wt);
    }
}
