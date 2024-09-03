package dynamicProgramming.cses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class dice {

    static int subsetSum(ArrayList<Integer>arr, int sum){
        int n = arr.size();
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(j>=arr.get(i-1)){
                    dp[i][j] = dp[i-1][j-arr.get(i-1)]+dp[i-1][j];
                }
                else{
                    dp[i][j] = dp[i-1][j];
                }
            }
        }
        return dp[n][sum];
    }
    static void atCode(int n,int sum){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        ArrayList<String>sb = new ArrayList<>();
        for(int i=0; i<=n; i++){
            sb.add(sc.nextLine());
        }
        for(int i=1; i<sb.size(); i++) {
            String s = sb.get(i);
            if (s.charAt(0) == '+') {
                int x = Integer.parseInt(s.substring(2));
                arr.add(x);
            } else {
                if (s.charAt(0) == '-') {
                    int x = Integer.parseInt((s.substring(2)));
                    arr.remove(Integer.valueOf(x));
                }
            }
            System.out.println(subsetSum(arr, sum));
        }
    }
    static void coinCombination2(int n, int arr[], int sum){
        long dp[] = new long[sum+1];
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(j-arr[i-1]>=0)
                    dp[j] = (dp[j-arr[i-1]]+dp[j])%1000000007;
            }
        }
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                System.out.print(dp[j]+" ");
            }
            System.out.println();
        }
        System.out.println(dp[sum]);
    }

    static void setII(int n){
        long sum = n*(n+1)/2;
//        System.out.println(sum);
        if(sum%2!=0){
            System.out.println(0);return;
        }
        long arr[] = new long[n];
        for(int i=0; i<n; i++){
            arr[i] = (i+1);
        }
        sum/=2;
        long dp[][] = new long[n+1][(int)sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=sum; j++){
                if(j-arr[i-1]>=0){
                    dp[i][j] = (dp[i-1][(int) (j-arr[i-1])]+dp[i-1][j]);
                }
                else dp[i][j] = (dp[i-1][j]);
                dp[i][j]%=1000000007;
            }
        }
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                System.out.print(dp[i][j]+" ");
//            }
//            System.out.println();
//        }
        System.out.println((dp[n][(int)sum]*500000004)%1000000007);
    }
    static void countSubSet(int arr[], int sum, int n){
        int dp[][] = new int[n+1][sum+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(i==0)dp[i][j] = 0;
                if(j==0)dp[i][j] = 1;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=0; j<=sum; j++){
                if(arr[i-1]<=j){
                    dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
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
        System.out.println(dp[n][sum]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int sum = sc.nextInt();
        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
//        countSubSet(arr,sum,n);
//        coinCombination2(n,arr,sum);
        ArrayList<Integer>ans = new ArrayList<>();
        for(int x:arr){
            ans.add(x);
        }
        System.out.println(subsetSum(ans,sum));

    }
}
