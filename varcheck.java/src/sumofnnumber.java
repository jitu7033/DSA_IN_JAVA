import java.util.Scanner;

public class sumofnnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sumOfDigit = 0;

        while(n>0){
            sumOfDigit += n%10;
            n = n/10;
        }
        System.out.println(sumOfDigit);



    }
}
