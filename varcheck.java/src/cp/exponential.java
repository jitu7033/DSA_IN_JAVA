package cp;

public class exponential {
    static long power(long a, long b){
        if(b==0){
            return 1;
        }
        long  ans = power(a,b/2);
        if(b%2==0){
            long ank = ans*ans;
            return ank;
        }
        long ank = ans*ans*a;
        return ank;
    }

    static long powers(long a, long b){
        long MOD = (long) (10e9+7);
        if(b==0){
            return 1;
        }
        long  ans = powers(a,b/2);
        System.out.println(a+" "+b);
        System.out.println("ans "+ans);
        if(b%2==0){
            long ank = ((ans*ans)%MOD);
            System.out.println("b  "+b);
            System.out.println("ank1  "+ank);
            return ank;
        }
        long ank = ((ans*ans)%MOD)*a%MOD;
        System.out.println(" b  "+b);
        System.out.println("ank2  "+ank);
        return ank;
    }
    public static void main(String[] args) {
        long a = 3;
        long b = 3;
        System.out.println(powers(a,b));

    }
}
