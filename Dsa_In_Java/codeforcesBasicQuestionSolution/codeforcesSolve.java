package codeforces;

import java.util.Arrays;
import java.util.Scanner;
import java.util.*;

public class codeforcesSolve {
    //                                               ~~|| ~~~~ I think When I become a specialist ~~~~~~||~~

    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~                      |||~~~~~~~~~~~~~~~~~~||||                                    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //                              ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~`
    //    ~~~~~~~~~~~~|~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //      ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~         |~~|
    //                  ~|~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //               |~~~~|~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //
    // many function are present here by Jitu7033
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    static void inputArray(long[] arr, long n) {Scanner sc = new Scanner(System.in);for (int i = 0; i < n; i++) {arr[i] = sc.nextLong();}}
    static void printArray(long arr[]) {for (int i = 0; i < arr.length; i++) {System.out.print(arr[i] + " ");}System.out.println();}

    static long findGcd(long x, long y) {int ans = -1;for (int i = 1; i < x; i++) {if (x % i == 0 && y % i == 0) {ans = i;}}return ans;}

    static boolean checkPrimes(int n) {for (int i = 2; i * i <= n; i++) {if (n % i == 0) {return false;}}if (n <= 1) {return false;}return true;}

    static long iGCD(long x, long y) {if (y == 0) return x;return iGCD(y, x % y);}

    static long findLcm(long a, long b) {long l = (a * b) / iGCD(a, b);return l;}

    static int[] prefixSumArray(int arr[]) {int n = arr.length;int[] prefix = new int[n];prefix[0] = arr[0];for (int i = 1; i < n; i++) {prefix[i] = prefix[i - 1] + arr[i];}return prefix;}

    static int[] suffixSumArray(int[] arr) {int n = arr.length;for (int i = n - 2; i >= 0; i--) {arr[i] = arr[i + 1] + arr[i];}return arr;}

    static boolean checkSorted(String s) {boolean flag = true;for (int i = 0; i < s.length() - 1; i++) {if (s.charAt(i) > s.charAt(i + 1)) {flag = false;break;}}if (flag) return true;return false;}

    static boolean checkSortedArray(long arr[]) {boolean flag = false;for (int i = 0; i < arr.length - 1; i++) {if (arr[i] > arr[i + 1]) {flag = true;}}if (flag) {return true;}return false;}

    static long findLength(long n) {long rem = 1;while (n > 9) {rem++;n /= 10;}return rem;}

    static long decimalSum(long a, long b) {long sum = 0;long rem = 0;long rem1 = 0;while (a > 0 || b > 0) {rem = a % 10;rem1 = b % 10;sum += rem + rem1;a /= 10;b /= 10;}return sum;}



    static long removeZero(long n) {long ten = 1;long rem = 0;long ans = 0;while (n > 0) {rem = n % 10;n /= 10;if (rem != 0) {ans += rem * ten;ten *= 10;}}return ans;}

    static long stringSum(String s) {long sum = 0;for (int i = 0; i < s.length(); i++) {long ans = Integer.parseInt(String.valueOf(s.charAt(i)));sum += ans;}return sum;}


    static long sumNNumber(long n) {return (n * (n + 1)) / 2;}

    static long decimalSubtract(long a, long b) {long temp = a;a = b;b = temp;String s = String.valueOf(a);String s1 = String.valueOf(b);long len = s.length() - s1.length();long rem;long rem1 = 0;long ans = 0;long ten = 1;while (a > 0) {rem = a % 10;rem1 = b % 10;if (rem < rem1) {rem = a % 100;long sub = rem - rem1;ans += sub * ten;ten *= 10;a /= 100;b /= 10;} else {long sub = rem - rem1;ans += sub * ten;a /= 10;b /= 10;ten *= 10;}}return ans;}

    static long decimalSum2(long a, long b) {String s = String.valueOf(a);String s1 = String.valueOf(b);long len = Math.min(s.length(), s1.length());String ans = "";for (int i = 0; i < len; i++) {ans += String.valueOf(Integer.parseInt(String.valueOf(s.charAt(i))) + Integer.parseInt(String.valueOf(s1.charAt(i))));}System.out.println(ans);return 0;}

    static void  swap(long arr[] ,long x, long y){long temp = arr[(int) x];arr[(int) x] = arr[(int) y];arr[(int) y] = temp;}
    static boolean checkPalindromes(long arr[], long val){int l = 0;int r = arr.length-1;while(l<r){if(arr[l]==val)l++;else if(arr[r]==val)r--;else if(arr[l]!=arr[r]){return false;} else {l++;r--;}}return true;}

    static boolean sort(long arr[]){
        for(int i=0; i<arr.length-1; i++){
            if(arr[i]>arr[i+1]){
                return false;
            }
        }
        return true;
    }
    static void binarySearch(long[]arr,long a, long b){
        long n = arr.length;
        long l=0;
            long r = n - 1;
            long ans = 0;
            while (l <= r) {
                long mid = (l + r) / 2;
                if (arr[(int) mid] < b) {
                    l = mid + 1;
                    ans = l;
                } else if (arr[(int) mid] > b) {
                    r = mid - 1;
                } else {
                    ans = mid+1;
                    l = mid + 1;
                }
            }
//                if(l==r){
//                    if(l!=b){
//                        ans = ans-1;
//                    }
//                }
            long l1 = 0;
            long r1 = n - 1;
            long ans1 = 0;
            while (l1 <= r1) {
                long mid = (l1 + r1) / 2;
                if (a < arr[(int) mid]) {
                    r1 = mid-1;
                } else if (a > arr[(int) mid]) {
//                        ans1 = mid;
                    l1 = mid + 1;
                    ans1 = l1;
                } else {
                    ans1 = mid;
                    r1 = mid-1;
                }
            }
            System.out.println((ans - ans1));
//
    }
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~|| Solution Part ||~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
    //~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    static  void solve( int arr[], int xi, int ki) {
        StringBuilder sb = new StringBuilder();
//        int max = 2010;
        int n = arr.length;
        int ans[][] = new int[n+1][n];
        for(int i=0; i<n; i++){
            ans[0][i] = (int) arr[i];
        }
        for(int i=1; i<=n; i++){
            int freq[] = new int[n+1];
            for(int j:ans[i-1]){
                freq[j]++;
            }
            for(int j=0; j<n; j++){
                ans[i][j] = freq[ans[i-1][j]];
            }
        }
        if(ki>n) ki = n;
        sb.append(ans[(int) ki][(int) (xi-1)]);
        System.out.println(sb);


    }

    // ~||~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~||   Main ||~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~||
// ~~~||~~~~~~~~~~~~~~~~~~~~~~~  ||    ||    ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~||
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long test = sc.nextLong();
        int arr[][] = {{1,2,3},{4,5,6},{7,8,9}};
        int row = 0; int col = 0; int row_end = 2; int col_end = 2;
        while(row<=row_end&&col<=col_end){
            for(int i=col+1; i<=col_end; i++){
                arr[row][i] = arr[row][i-1];
                row++;
            }
            for(int i=row+1; i<=row; i++){
                arr[i][col_end] = arr[i-1][col_end];
                col_end-=1;
            }
            for(int i=col_end-1; i>=col; i--){
                arr[row_end][i] = arr[i+1][row_end];
                row_end--;
            }
            for(int i=row_end-1; i>=row; i--){
                arr[i][col] = arr[col][i+1];
                col++;
            }
        }
        for(int i=0; i<3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}
//}
