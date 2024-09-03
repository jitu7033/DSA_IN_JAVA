package codeforces;
import java.util.*;

public class multiply2 {

    static void multiply2Divide6(int n){
        int count = 0;
        int count1 = 0;
        while(n%2==0){
            n /= 2;
            count++;
        }
        while(n%3==0){
            n/=3;
            count1++;
        }
        if(n==1 && count<=count1){
            int ans = 2*count1-count;
            System.out.println(ans);
        }
        else{
            System.out.println("-1");
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            int n = sc.nextInt();

            multiply2Divide6(n);
        }



    }
}
