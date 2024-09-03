package codeforces;

import java.util.Scanner;

public class fibonacci {

//    static void fibonacci(int n){
//
//        System.out.println(0+ " "+0+" "+n);
//
//    }

    static void oddDivisor(long n) {

        if((n & (n - 1)) == 0){
            System.out.println("No");
        }
        else{
            System.out.println("yes");
        }

    }
    static void gregorAndCryptography(long n){
       long ans = n-1;
        System.out.println("2"+" "+ans);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            long  n = sc.nextLong();
            gregorAndCryptography(n);
        }
    }
}
