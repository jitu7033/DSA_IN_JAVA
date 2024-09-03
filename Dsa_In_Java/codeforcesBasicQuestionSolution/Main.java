package codeforces;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = scanner.nextInt();
        long b = n + 4;
        while (isPrime(b/2) || isPrime(b-2)) {
            b++;
        }
        long a = b + n;
        System.out.println(a + " " + b);
    }

    private static boolean isPrime(long n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}

