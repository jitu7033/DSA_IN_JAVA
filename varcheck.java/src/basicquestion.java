import java .util.*;
import java.util.concurrent.ScheduledExecutorService;

public class basicquestion {


    static void totalcost(int quantity){
        int discount = 0;
        if(quantity>1000){
            discount = quantity-quantity/10;
            System.out.println(discount);

        }
        else{
            System.out.println("no dicount");
        }
        return;
    }


    static void countNotes(int amount){
        int rem = 0;
        int count = 0;
        int note500, note100, note50, note20, note10, note5, note2, note1;
        if(amount >= 100)
        {
            note100 = amount/100;
            amount -= note100 * 100;
            System.out.println("100:--"+note100);
        }
        if(amount >= 50)
        {
            note50 = amount/50;
            amount -= note50 * 50;
            System.out.println("notes100:--"+note50);
        }
        if(amount >= 10)
        {
            note10 = amount/10;
            amount -= note10 * 10;
            System.out.println( "notes10:--"+note10);
        }
        if(amount >= 5)
        {
            note5 = amount/5;
            amount -= note5 * 5;
            System.out.println("notes:--"+note5);
        }
        if(amount >= 2)
        {
            note2 = amount /2;
            amount -= note2 * 2;
            System.out.println("notes2:--"+note2);
        }

        return;

    }

    //q1 reverse a integer:
    static int reverseNumber(int n){
     int rev = 0;
     for(int i=0; i<=n; i++){
         rev = (rev*10)+n%10;
         n = n/10;
     }

     return rev;


    }

    static int fibonacciSeries(int n){
        int a = 0;
        int b = 1;
        int c = 0;
        int sum=0;
        for(int i = 0; i<n; i++){
            a = b;
            b = c;
            c = a+b;
            sum = sum+b;
            System.out.println(b);


        }
        System.out.println(sum);

        return b;

    }

    static int cubeOfNumber(int x, int y){
        int ans = 1;
        for(int i=1; i<=y; i++){
            ans *= x;
        }
        return ans;
    }
    static void checkPrime(int n){
        int count = 0;
        for(int i=1; i<=n; i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("prime");
        }
        else{
            System.out.println("not prime");
        }
    }

    static long number(long m, long n){
        long ans = 0;
        for(long i=0; i<=n; i++){
            for(long j=0; j<=n; j++){
                ans = i*j;
                if(ans>=m){
                    return ans;
                }
            }
        }
        return -1;
    }






    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int amount = sc.nextInt();
//        int quantity = sc.nextInt();
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(reverseNumber(n));
//        System.out.println(cubeOfNumber(x,y));
//        System.out.println(armstrongNumber(n));
//          System.out.println(fibonacciSeries(n));
//
//        System.out.println(amount);
//        countNotes(amount);
//        System.out.println(quantity);
//        totalcost(quantity);

        // print prime

//        checkPrime(n);
        long m = sc.nextLong();
        long n = sc.nextLong();
        System.out.println(number(m,n));

    }
}
