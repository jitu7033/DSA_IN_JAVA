package codeforces;

import java.util.Scanner;

public class quickSort {
    static void solve(int arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        for (int i = 0; i < t; i++) {
            long n = sc.nextLong();
//            long k = sc.nextInt();
            long arr[] = new long[(int) n];
            for(int j=0; j<n; j++){
                arr[j] = sc.nextLong();
            }

    }
}
