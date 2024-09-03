package dynamicProgramming.leetcode;

import java.util.Arrays;
import java.util.Scanner;

public class maximumPartitionSum {

    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int k = fs.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = fs.nextInt();
        }
        int K = k+1;
        int dp[] = new int[k+1];
        Arrays.fill(dp,0);
        for(int i=n-1; i>=0; i--){
            int curr = 0;
            int end = Math.min(i+k,n);

            for(int j=i; j<end; j++){
                curr = Math.max(arr[j],curr);
                dp[i%K] = Math.max(dp[i%K],dp[(j+1)%K]+curr*(j-i+1));
            }
        }
        for(int i=0; i<=k; i++){
            System.out.println(dp[i]);
        }
        System.out.println(dp[0]);

    }
}
