//package dynamicProgramming;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class problemBasedOnKNapSack {
//
//    static void subset(int arr[], int n, int sum){
//        boolean dp[][] = new boolean[n+1][sum+1];
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                if(i==0)dp[i][j] = false;
//                if(j==0)dp[i][j] = true;
//            }
//        }
//        for(int i=1; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                if(arr[i-1]<=j){
//                    dp[i][j] = dp[i-1][j-arr[i-1]]||dp[i-1][j];
//                }
//                else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        System.out.println(dp[n][sum]);
//    }
//    static boolean partitionRecursive(int arr[], int n, int sum,boolean dp[][]){
//        if(sum==0)return true;
//        if(n==0)return false;
//        if(dp[n][sum]) return dp[n][sum];
//        if(arr[n-1]<=sum){
//            return dp[n][sum] = partitionRecursive(arr,n-1,sum-arr[n-1],dp)||partitionRecursive(arr,n-1,sum,dp);
//        }
//        else
//            return dp[n][sum] = partitionRecursive(arr,n-1,sum,dp);
//    }
//
//    static boolean partition(int arr[], int n){
//        int sum = 0;
//        for(int i=0; i<n; i++){
//            sum+=arr[i];
//        }
//        boolean flag = true;
//        if(sum%2!=0)flag = false;
//        if(!flag)return false;
//        boolean dp[][] = new boolean[n+1][(sum/2)+1];
//
//        for(int i=0; i<n+1; i++){
//            for(int j=0; j<(sum/2)+1; j++){
//                if(i==0)dp[i][j] = false;
//                if(j==0)dp[i][j] = true;
//            }
//        }
//        for(int  i=1; i<=n; i++){
//            for(int j=0; j<(sum/2)+1; j++){
//                if(j>=arr[i-1]){
//                    dp[i][j] = dp[i-1][j-arr[i-1]]||dp[i-1][j];
//                }
//                else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        return dp[n][sum/2];
//    }
//
//    // count of subset of sum
//
//    static void countSubSet(int arr[], int sum, int n){
//        int dp[][] = new int[n+1][sum+1];
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                if(i==0)dp[i][j] = 0;
//                if(j==0)dp[i][j] = 1;
//            }
//        }
//        for(int i=1; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                if(arr[i-1]<=j){
//                    dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
//                }
//                else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//        System.out.println(dp[n][sum]);
//    }
//
//     //   Q. minimum subset difference of two partition
//
//    static ArrayList<Integer>all = new ArrayList<>();
//    static boolean checkSum(int arr[], int sum, int n){
//        boolean dp[][] = new boolean[n+1][sum+1];
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                if(i==0)dp[i][j] = false;
//                if(j==0)dp[i][j] = true;
//            }
//        }
//        for(int i=1; i<=n; i++){
//            for(int j=0; j<=sum; j++){
//                if(j>=arr[i-1]){
//                    dp[i][j] = dp[i-1][j-arr[i-1]] || dp[i-1][j];
//                }
//                else{
//                    dp[i][j] = dp[i-1][j];
//                }
//            }
//        }
//
//        // to add arrayList where sum is true;
//        for(int i=n; i<=n; i++){
//            for(int j=0; j<=sum/2; j++) {
//                if (dp[i][j]) {
//                    all.add(j);
//                }
//            }
//        }
//        return dp[n][sum];
//    }
//
//    static void  miniMumSubsetSumDifference(int sum){
//        int min = Integer.MAX_VALUE;
//        for(int i=0; i<all.size(); i++){
//            min = Math.min(sum-2*(all.get(i)),min);
//        }
//        System.out.println(min);
//    }
//    // Q2. how many subset are present in array whose minimum difference is equal to x:
//    static int minDifferenceCount(int arr[], int MnDiff, int n){
//        int dp[][] = new int[n+1][MnDiff+1];
//        for(int i=0; i<=n; i++){
//            for(int j=0; j<=MnDiff; j++){
//                if(i==0)dp[i][j] = 0;
//                if(j==0)dp[i][j] = 1;
//            }
//        }
//        for(int i=1; i<=n; i++){
//            for(int j=0; j<=MnDiff; j++){
//                if(j>=arr[i-1]){
//                    dp[i][j] = dp[i-1][j-arr[i-1]]+dp[i-1][j];
//                }
//                else dp[i][j] = dp[i-1][j];
//            }
//        }
//        return dp[n][MnDiff];
//    }
//
//    static void miniDiffSubsetCountMain(int arr[], int diff,int n){
//        int count = 0;
//        int sum = 0;
//        for(int i=0; i<n; i++){
//            sum+=arr[i];
//        }
////        System.out.println(sum+"  sum");
//        int def = (sum+diff)/2;
////        System.out.println(def);
//        if((sum-def)==(def-diff)) count = minDifferenceCount(arr,sum,n);
//        System.out.println(count);
//    }
//    static void miniSubDiff(int arr[], int n){
//        int sum = 0;
//        for(int i=0; i<n; i++){
//            sum+=arr[i];
//        }
//        int halfSum = (sum+1)/2;
//        while(!checkSum(arr,halfSum,n))halfSum++;
//        int s1 = halfSum;
//        int s2 = sum-s1;
//        System.out.println(Math.abs(s1-s2));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        long sum = 0;
//        long arr[] = new long[n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextInt();
//            sum+=arr[i];
//        }
//       long half =
//
////
//    }
//}
