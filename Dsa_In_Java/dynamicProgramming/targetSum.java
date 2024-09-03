package dynamicProgramming;

public class targetSum {
    static int countTarget(int arr[], int target){
        int n = arr.length;
        int dp[][] = new int[n+1][target+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=target; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=target; j++){
                if(j>=arr[i-1]){
                    dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
                }
                else dp[i][j] = dp[i-1][j];
            }
        }
        return dp[n][target];
    }
    public static void main(String[] args) {
        int arr[] = {1,1,2,3};
        int sum = 0;
        int diff = 0;
        int n = arr.length;
        int target = 1;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        diff = (sum-target)/2;
        System.out.println(countTarget(arr,diff));
    }
}
