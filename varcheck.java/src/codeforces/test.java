package codeforces;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = "X++";
        String sb = "++X";
        String st1 = "X--";
        String sb1 = "--X";
        int n = sc.nextInt();
        String s = sc.next();
        if(Objects.equals(s, st) || Objects.equals(s, sb)){
            n = n+1;
        }
        else{
            n = n-1;
        }
        System.out.println(n);


    }
}
