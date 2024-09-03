package codeforces;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class codeforces {

    public static void inequality(int  arr[],int n){
        Arrays.sort(arr);
        for(int i=1; i<=n/2; i++){
            System.out.println(arr[i]+" "+arr[0]);
        }
    }
    public static  void ValidBuilding(long arr[]){
        Arrays.sort(arr);
        if(arr[0]%2==1){
            System.out.println("Yes");
            return;
        }
        for(long i=0; i*i<arr.length; i++){
            if(arr[(int)i]%2==1){
                System.out.println("No");
                return;
            }
        }
        System.out.println("yes");
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        for(int m=0; m<t; m++){
            int n = sc.nextInt();
//            int k = sc.nextInt();
            boolean flag  = false;
            for(int i=1; i<=n*2; i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
            System.out.println();
        }

    }
}

