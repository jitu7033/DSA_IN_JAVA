package bitManupulation;

import java.util.Scanner;

public class FindRSB {

    private static void countNoOfSetBitInInteger(int x){
        int count = 0;
        while(x>0){
            int rSBM = x & -x;
            x-=rSBM;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        
        // rsb  1st formula is
        System.out.println(x&(-x));
        // rsb 2nd formula
        System.out.println(x&(~x+1));
        System.out.println(10&1);

        countNoOfSetBitInInteger(x);
    }
}
