package codeforces;

public class countingDivisors {

    static void count(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        int n = 100000000;
        count(n);
    }
}
