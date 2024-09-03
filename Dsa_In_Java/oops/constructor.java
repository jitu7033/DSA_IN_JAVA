package oops;


public class constructor {
    public int num;
    public int dem;
    public constructor(){

    }
    public constructor(int num, int dem){
        this.dem = dem;
        this.num = num;
        simplify();

    }
    public static long iGCD(long x, long y) {
        if (y == 0) return x;
        return iGCD(y, x % y);
    }

    public void  simplify() {
//        if(num<dem){
//            if(dem%num==0){
//                dem = dem/num;
//                num = 1;
//            }
//        }
        int s = (int) iGCD(num,dem);
        num/=s;
        dem/=s;
    }
    public static constructor add(constructor f1, constructor f2){
        int numerator = f1.num*f2.dem+f1.dem*f2.num;
        int denominator = f1.dem*f2.dem;
        constructor f3 = new constructor(numerator,denominator);
        return f3;
    }
}