package cp;

public class modulo {

    static void modulus(int n, int m){
//        System.out.println((n+m)%(n+m));
//        System.out.println((2*3)%2);
        int rem = (n+m)%m;
        int mod = rem%m;
        System.out.println(rem);
        int res = (((n%m-m%n)%m)+m)%m;
        System.out.println(res);

    }
    public static void main(String[] args) {
        int n = -31;
        int m = 5;
        modulus(n,m);
    }

}
