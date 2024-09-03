import java.util.Scanner;

public class codeDrills {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if(((a+b+c)/3)<=30) System.out.println("PASS");
        else System.out.println("FAIL");
    }
}
