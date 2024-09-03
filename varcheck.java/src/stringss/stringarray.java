package stringss;

import java.util.Scanner;

public class stringarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[]  = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
