package codeforces;

public class incresing {
    static boolean checkPrime(int n){
        if(n==1 || n==0) return false;
        for(int i=2; i<n; i++){
            if(n%i==0) return false;
        }
        return true;

    }
    public static void main(String[] args) {
        int n = 45;
        for(int i=1; i<=n; i++){
            if(checkPrime(i)){
                System.out.println(i+" ");
            }
        }

    }
}
