package codeforces;

import java.util.Scanner;

public class dremoon {

    public static void stair(int n, int m) {
        int light = 2;
        if (n == 1 && m == 1) {
            light = 0;
            System.out.println(light);
        } else if (n == 1 || m == 1) {
            light = 1;
            System.out.println(light);
        } else {
            System.out.println(light);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            stair(n, m);
        }
    }
}
