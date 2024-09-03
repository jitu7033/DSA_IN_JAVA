package dynamicProgramming;

import java.util.Arrays;
import java.util.Scanner;

public class hello2024 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sizes of arrays
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input array A
        long[] arrayA = new long[n];
        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextLong();
        }

        // Input array B
        long[] arrayB = new long[m];
        for (int i = 0; i < m; i++) {
            arrayB[i] = scanner.nextLong();
        }

        // Sort arrays in descending order
        Arrays.sort(arrayA);
        reverse(arrayA);
        Arrays.sort(arrayB);
        reverse(arrayB);

        // Calculate the difference
        long difference = 0;

        for (int i = 0; i < Math.min(n, m); i++) {
            difference += arrayA[i] - arrayB[i];
        }

        // Add remaining elements from the longer array
        for (int i = Math.min(n, m); i < n; i++) {
            difference += arrayA[i];
        }

        for (int i = Math.min(n, m); i < m; i++) {
            difference -= arrayB[i];
        }

        // Output the result
        System.out.println(difference);

        scanner.close();
    }

    // Helper method to reverse an array
    private static void reverse(long[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            long temp = array[left];
            array[left] = array[right];
            array[right] = temp;

            left++;
            right--;
        }
    }
}
