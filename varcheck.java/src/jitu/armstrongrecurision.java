package jitu;

public class armstrongrecurision {
    static int armstrong(int n){
        //base
        if(n==0) return 0;
        //baseProblem
        int length = armstrong(n/10)+1;
        
        return length;

    }
    public static void main(String[] args) {
        int n = 153;
        System.out.println(armstrong(n));
    }
}