import java.util.*;
public class pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//square pattern

        //inner loop
        for (int i = 1; i <= n; i++) {
            //outer loop:
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //rectungular pattern
        System.out.println("print rectungular pattern");
        //inner loop
        for (int i = 1; i <= n / 2; i++) {
            //outerloop
            for (int j = 1; j <= n; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        // hollow rectungular pattern

        System.out.println("hollow rectungular pattern");

        //inner loop
        for (int i = 1; i <= n; i++) {
            //outerloop
            for (int j = 1; j <= n; j++) {
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*" + " ");
                } else {
                    System.out.print(" " + " ");
                }
            }
            System.out.println();


        }
        // tringle pattern:

        System.out.println("right angle triangle pattern");

        //inner loop
        for (int i = 1; i <= n; i++) {
            //outerloop
            for (int j = 1; j <= i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // reverse right angle triangle:

        System.out.println("reverse right angle triangle pattern:");
        //inner loop
        for (int i = 1; i <= n; i++) {
            //outerloop
            for (int j = 1; j <= n - i; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Triangle pattern:

        System.out.println("Triangle pattern");

        //outer loop:
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" " + " ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Numerical rectungular pattern:

        System.out.println("numrical rectungular pattern");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print(j+" ");
            }
            for (int j = 1; j <= i-1; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        // print a pattern this
//        121212;
//        212121;
//        121212;
//        212121;

        System.out.println("Try this");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("2"+" ");
                }
            }
            System.out.println();
        }

        //numerical tringular pattern:

        System.out.println("numerical tringular pattern");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //pyramidal pattern
        System.out.println("pyramidal pattern");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            for(int j=i-1; j>=1; j--){
                System.out.print(j+" ");
            }
            System.out.println();
        }

        //Hollow triangle;
        System.out.println("hollow triangle");

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=2*i-1; j++){
                if(i==1||j==1||i==n||j==2*i-1){
                    System.out.print(i+" ");
                }
                else{
                    System.out.print(" "+" ");
                }
            }
            System.out.println();
        }


    }
}