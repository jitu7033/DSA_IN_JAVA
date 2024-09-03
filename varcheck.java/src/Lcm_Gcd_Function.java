import java.util.Scanner;

public class gcd {


    static int findLcm(int x, int y){
        int z = y;
        int p = x;
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return (z*p)/y;

    }

    static int  findGcd(int x,int y){
        int ans = 0;
        for(int i=1; i<x; i++){
            if(x%i==0 && y%i==0){
                 ans = i;
            }
        }
        return ans;
    }

    //second method find gcd
    static  int highestComaNFactor(int x,int y){
        int z = y;
        int p = x;
        while(x%y!=0){
            int rem = x%y;
            x = y;
            y = rem;
        }
        return y;

    }

    // find gcd through from recursion
    static int iGCD(int x, int y){
        if(y==0) return x;
        return iGCD(y,x%y);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println("LCm:-");
//        System.out.println(findLcm(x,y));

        System.out.println("gcd");

//        System.out.println(findGcd(x,y));

//        System.out.println(highestComaNFactor(x,y));

        System.out.println(iGCD(x,y));

    }
}
