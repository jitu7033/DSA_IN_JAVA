package dynamicProgramming;

import java.util.Scanner;

public class longestIncreasingSubsequence {

    public static class pair{
        int l; //length
        int i; //index
        int v;  // value
        String psf; // value which are already added

        pair(int l,int i, int v, String psf){
            this.l = l;
            this.i = i;
            this.v = v;
            this.psf = psf;
        }
    }
    public static void maxLength(int  arr[]){
        int n = arr.length;

        int dp[] = new int[arr.length];
        int oMax = 0;


        for(int i=0; i<n; i++){
            int max = 0;
            for(int j = 0; j<i; j++){
               if(arr[j]<=arr[i]){
                   if(dp[j]>max){
                       max = dp[j];
                   }
               }
            }
            dp[i] = max+1;
            if(dp[i]>oMax){
                oMax = dp[i];
            }
        }
//        for(int x:dp){
//            System.out.print(x+" ");
//        }
        System.out.println();
        System.out.println(dp[n-1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        maxLength(arr);

    }
}
