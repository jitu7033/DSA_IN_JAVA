package dynamicProgramming;

public class problemBasedOnKNapSackBasic {
    static int countSubset(int arr[],int sum,int n, int dp[][]){
        if(sum==0){
            return 1;
        }
        if(n==0) return 0;
        if(dp[n][sum]!=-1)return dp[n][sum];
        if(arr[n-1]<=sum){
            return dp[n][sum] = countSubset(arr,sum-arr[n-1],n-1,dp)+countSubset(arr,sum,n-1,dp);
        }
        else{
            return dp[n][sum] = countSubset(arr,sum,n-1,dp);
        }

    }
    public static void main(String[] args) {
        int arr[] = {5,5,1,11,6,5,11};
        int sum = 11;
        int n = arr.length;
        int dp[][] = new int [n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(countSubset(arr,sum,n,dp));
    }
}
