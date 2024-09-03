package dynamicProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class tabulation {
    private static void  fibonacci(int n, int[]dp){
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for(int i=3; i<=n; i++){
            dp[i] = dp[i-1]+dp[i-2];
        }
        System.out.println(dp[n]);
        for(int x:dp){
            System.out.print(x+" ");
        }
    }

    static  int coinChange(List<Integer>coin, int ind, int sum, int dp[][]){
        if(dp[ind][sum]!=-1)return dp[ind][sum];
        if(ind==0){
            if(sum%coin.get(ind)==0){
                return 1;
            }
            else{
                return 0;
            }
        }
        int pick = 0;
        if(sum>=coin.get(ind))
            pick = coinChange(coin,ind,sum-coin.get(ind),dp);
        int notPick = coinChange(coin,ind-1,sum,dp);

        return pick+notPick;

    }
    public static void usingDp(List<Integer>coin,int dp[][], int totalSum, int len){
        for(int i=0; i<=totalSum; i++){
            if(i%coin.get(0)==0){
                dp[0][i] = 1;
            }
            else
                dp[0][i] = 0;
        }
        for(int idx = 1; idx<len; idx++){
            for(int sum=0; sum<=totalSum; sum++){
                int pick = 0;
                if(sum>=coin.get(idx)){
                    pick = dp[idx][sum-coin.get(idx)];
                }
                int notPick = dp[idx-1][sum];
                dp[idx][sum] = pick+notPick;
            }
        }
        System.out.println(dp[len-1][totalSum]);

    }
    public static void main(String[] args) {
//        int n = 10;
//        int []dp = new int[n+1];
//        Arrays.fill(dp,-1);

        // question coinChange:
        List<Integer> list = List.of(1,2,3);
        int sum = 4;
        int len = list.size();
        int dp[][] = new int[len+1][sum+1];
        for(int i=0; i<=len; i++){
            for(int j=0; j<=sum; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(coinChange(list,len-1,sum,dp));
        usingDp(list,dp,sum,len);

    }
}
