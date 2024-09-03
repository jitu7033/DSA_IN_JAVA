package codeforces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class composing {

    public static void inequality(ArrayList<Integer>arr){

        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        Collections.sort(arr);
        System.out.println(arr);



    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextInt();
        for(int i=0; i<t; i++){
            long n  = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>((int) n);
            inequality(arr);
        }

    }
}
