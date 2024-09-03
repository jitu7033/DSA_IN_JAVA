import java.util.*;
public class binaryDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans = 0;
        int pw = 1;

        while(n>0){
            int unitdigit = n%10;
            ans += unitdigit*pw;
            n = n/10;
            pw *= 2;
        }
        System.out.println("Binary to decimal "+ans);

        //decimal to binary

        System.out.println("decimal to binary");

        int decimal_Number = sc.nextInt();

        int answer = 0;

        int pwq = 1;

        while(decimal_Number>0){
            int parity = decimal_Number%2;
            answer += parity*pwq;
            pwq = pwq*10;
            decimal_Number = decimal_Number/2;


        }
        System.out.println(answer);


    }

    static class input {
       public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
           //sum of two number
           int number_1 = sc.nextInt();
           int number_2 = sc.nextInt();
           int sum = number_1+number_2;

           System.out.println("sum of two number is :-"+sum);



           float p = sc.nextFloat();
           float r = sc.nextFloat();
           float t = sc.nextFloat();

           float si = p*r*t;

           System.out.println("si is :- " + si);
       }
   }
}