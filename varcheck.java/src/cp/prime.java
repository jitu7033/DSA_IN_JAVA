package cp;

//import static codeforces.maximumSum.prime;
import java.util.ArrayList;
import java.util.Scanner;

import static java.util.Arrays.fill;

public class prime {

    // find prime no using sqrt method;

    static boolean primes(int n){
        for(int i=2; i*i<=n; i++){
            if(n%i==0){
                return false;
            }
        }
        if(n<=1){
            return false;
        }
        return true;
    }


    //find prime no through sieve method
    static void sieve(int n){
        boolean prime[] = new boolean[n + 1];
        fill(prime,true);

        prime[0] = prime[1]= false;

        for(int i=2; i*i<=n; i++){
            if(prime[i]){
                System.out.println(i);
                for(int j=i*i; j<=n; j+=i){
                    prime[j]=  false;
                }
            }
        }
    }

    // find prime factorization trial method;
    static int factorization(int n){
        int ans = 0;
        for(int i= 2; i*i<=n; i++){
            while(n%i==0){
                System.out.println(i);
                return i;
//                n = n/i;
            }
        }
        if(n!=1){
            System.out.println(n);
            ans  = n;
        }
        return ans;
    }

    static void factorizationK(int n, int k){
        int rem = n;
        ArrayList<Integer>arr = new ArrayList<>();
        int count = 0;
        for(int i=2; i<=n; i++){
            while(n%i==0){
                arr.add(i);
                count++;
                n = n/i;
            }
        }
        if(k==count){
            for(int i=0; i<arr.size(); i++){
                System.out.println(arr.get(i)+" ");
            }
        }
       else if(count>k){
           int sum = 1;
           for(int i=1; i<k; i++){
               sum*= arr.get(i);
               System.out.print(arr.get(i)+" ");
           }
//           System.out.println(sum);
           System.out.print(rem/sum);
       }
       else{
           System.out.println("-1");
       }

    }



    public static void main(String[] args) {
        Scanner jitu = new Scanner(System.in);
        int n = jitu.nextInt();
        int k = jitu.nextInt();
//        for(int i=1; i<n; i++){
//            if(primes(i)){
//                System.out.println(i);
//            }
//        }
//        sieve(n);
        factorization(n);
//        factorizationK(n,k);
    }

}
