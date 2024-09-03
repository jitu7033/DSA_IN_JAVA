package codeforces;

import java.util.Scanner;

public class binaryremoval {

    static void binaryRemoval(String s){
        int n = s.length();
        long  one=0 , ze=0 ,j=0;
        for(int i=1; i<n; i++){
            if(s.charAt(i)==s.charAt(i-1) && s.charAt(i)=='1' && j==0){
                one =1;
                j = 1;
            }
            if(j== 1 && s.charAt(i)==s.charAt(i-1)&& s.charAt(i)=='0'){
                ze = 1;
            }
        }
        if(one== 1 && ze == 1) System.out.println("No");
        else{
            System.out.println("Yes");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s = sc.next();

            binaryRemoval(s);
        }
    }
}
