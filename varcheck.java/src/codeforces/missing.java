package codeforces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class missing {

    static void missingNo(ArrayList<Integer> arr){
        while(arr.size()>1){
            int ans = Collections.max(arr);
            int ans1 = Collections.min(arr);
            int diff = ans-ans1;
            arr.add(diff);
            arr.remove(Integer.valueOf(ans));
            arr.remove(Integer.valueOf(ans1));

        }
        System.out.println(arr);

    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int t = sc.nextInt();
        for(int j=0; j<t; j++) {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<Integer>();
            for (int i = 1; i <= n; i++) {
                arr.add(i);
            }
            missingNo(arr);
        }


    }
}
