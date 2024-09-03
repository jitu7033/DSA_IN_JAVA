package dynamicProgramming;

public class problemBasedUnbounded {
    public static long unboundedMaximumCountSubsetSum(long arr[], long sum){
        long n = arr.length;
        long dp[][] = new long[(int)n+1][(int)sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i][(int) (j-arr[i-1])]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        return dp[(int)n][(int)sum];

    }
    static void minCoinSum(int arr[], int sum,int n){
        int max = (int)10e6+2;
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(j==0)dp[i][j] = 0;
                if(i==0)dp[i][j] = max;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(j>=arr[i-1]){
                    dp[i][j] = Math.min(dp[i][(int) (j-arr[i-1])]+1,dp[i-1][j]);
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
//             for(int i=0; i<=n; i++){
//                 for(int j=0; j<=sum; j++){
//                     System.out.print(dp[i][j]+" ");
//                 }
//                 System.out.println();
//             }
        if(dp[n][sum]>=max) System.out.println(-1);
        else System.out.println(dp[n][sum]);
    }
    public static long zeroOneMaximumSubsetSum(long arr[], long sum){
        long n = arr.length;
        long dp[][] = new long[(int)n+1][(int)sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][(int) (j-arr[i-1])]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[(int)n][(int)sum];
    }
    public static void main(String[] args) {
        long arr[] = {2,3,5};
        long sum = 9;
        System.out.println(unboundedMaximumCountSubsetSum(arr,sum));
        System.out.println(zeroOneMaximumSubsetSum(arr,sum));

    }
}
