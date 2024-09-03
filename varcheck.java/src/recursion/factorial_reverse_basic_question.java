import java.util.Scanner;

public class recurision {
    static void increasingPrint(int n){
        if(n==1) {
            System.out.println(n);
            return;
        }
        else{
            increasingPrint(n-1);
            System.out.println(n);
        }
    }
    static void decreasingPrint(int n){
        //base case
        if(n==1){
            System.out.println(1);
        }
        else{
            //self work
            System.out.println(n);
            //recursive work
            decreasingPrint(n-1);
        }
    }

    //factorial
    static int Factorial(int n){
        if(n==0) return 1;
        int smallest = Factorial(n-1);
        int ans = n*smallest;
        return ans;

    }

    // sum of n integer number;
    static int sum(int n){
        if(n==0){
            return 0;
        }
        int ans = n+sum(n-1);
        return ans;
    }

    //alternative sum
    static int alternativeSum(int n){
        int a = 0;
        int b = 0;
        if(n==1) return 1;
        if(n%2==0){
            b = alternativeSum(n-1)-n;
        }
        else {
            a = alternativeSum(n - 1)+n;
        }
        return a+b;
    }



    //sum of an integer;
    static int sumInteger(int n){
        if(n>=0 && n<=9){
            return n;
        }
        int ans = sumInteger(n/10);

        //self work
       return ans+n%10;

    }


    // find length of number using recursion
    static int length(int n){
        if(n>=0 && n<=9){
            return 1;
        }
        return length(n/10)+1;
    }

    //power of p^q;
    static int power(int p,int q){
        if(q<=1) return p;

        //subProblem;
        int ans = power(p,q-1);

        //self work
        return ans*p;
    }

    // find power second method
    static int powerSecond(int p, int q){
        if(q==0) return 1;
        if(q%2==0){
            return powerSecond(p,q/2)*powerSecond(p,q/2);
        }
        return powerSecond(p,q/2)* powerSecond(p,q/2)*p;
    }

    // multiple of k
    static void multiply(int n, int k){
        if(k==1) {
            System.out.println(n);
            return ;
        }

        //subProblem;
        multiply(n,k-1);

        //self work
        System.out.println(n*k);

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        int k = sc.nextInt();
//        increasingPrint(n);

//        decreasingPrint(n);
//        System.out.println(Factorial(n));

        //call sum of n number
//        System.out.println(sum(n));

        //
//        System.out.println(sumInteger(n));
//
//        System.out.println(length(n));
//
//        System.out.println(power(2,3));
//
//        System.out.println(powerSecond(2,5));

//        multiply(n,k);

//        System.out.println(alternativeSum(n));


    }
}
