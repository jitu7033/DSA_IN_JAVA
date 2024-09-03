package bitManupulation;

import java.util.Scanner;

public class bitOnOfCheckToggle {




    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        int i = fs.nextInt();
        int j = fs.nextInt();
        int k = fs.nextInt();
        int l = fs.nextInt();

        // on the bit
        int onMask = (1 << i);
        // off the bit
        int offMask = ~(1 << j);
        // toggle the bit
        int toggleMask = (1 << k);
        // check the bit
        int cMask = (1 << l);

        System.out.println(n | onMask);// on the bit
        System.out.println(n & offMask); // off the bit
        System.out.println(n ^ toggleMask); // toggle the bit
        System.out.println(n & cMask);  // check the bit
    }
}
