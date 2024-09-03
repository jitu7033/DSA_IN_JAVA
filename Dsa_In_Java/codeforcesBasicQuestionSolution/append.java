package codeforces;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class append {

    public static void inequality(String s){
        boolean f = false;
        for(int i=1; i<=s.length()/2-1; i++){
            if(s.charAt(i)!=s.charAt(i-1)){
                f = true;
            }
        }
        if(f==true) System.out.println("Yes");
        else System.out.println("no");


    }
    static void printArray(int[] arr){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i]);
        }
    }

    static void reverseSort(String s){
        int n = s.length();
        int l = -1;
        int r = -1;
        int count = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                l = i;
                break;
            }
        }
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='0'){
                r = i;
                break;
            }
        }
        if(l==-1 || r==-1){
            System.out.println("0");
            return;
        }
        else {
            while (l <= r) {
                if (s.charAt(l) == '1' && s.charAt(r) == '0') {
                    arr.add(l+1);
                    arr.add(r+1);
                    l++;
                    r--;
                    count = 1;
                }
                else if (s.charAt(l) == '0') l++;
                else if (s.charAt(r) == '1') r--;
            }
            Collections.sort(arr);
            if(count==1){
                System.out.println(count);
            }
            System.out.print(arr.size()+" ");
            for(int i=0; i<arr.size(); i++){
                System.out.print(arr.get(i)+" ");
            }
            System.out.println();
        }
    }

    static void palindrome(StringBuilder sb){
        int n = sb.length();
        int freq = 0;
        int count = 0;
        StringBuilder sb1 = new StringBuilder();
        for(int i=97; i<123; i++){
            for(int j=97; j<123; j++){
                if(i==j){
                    sb1.append(i);
                    count++;
                }
            }
        }
        if (n % 2 == 0){
            for(int i=1; i<sb.length(); i++){


            }
        }
    }
    static void minSubstring(StringBuilder sb){

        for(int i=1; i<sb.length();i++){
            if(sb.charAt(i)==sb.charAt(i-1)){
                System.out.println("2");
                return;
            }
        }
        int ans = 0;
        int st = 0;
        int rt = 1;
        int count = -1;
        int count1 = -1;
        while(rt<sb.length()){
            if(sb.charAt(st)=='a'){
                count = st;
                rt = st;
                rt++;
                if(sb.charAt(rt)=='a'){
                    count1 = rt;
                    ans = count1-count;
                    if(ans>2){
                        st = rt;
                        rt++;
                        st++;
                    }

                }
            }
            else{
                System.out.println("-1");
            }
            rt++;
        }
        if(ans<2){
            System.out.println("3");
        }
        else{
            System.out.println("-1");
        }
    }

    static void printSsq(String s, String currAns){
        StringBuilder sb = new StringBuilder();
        if(s.length()==0){
            System.out.println(currAns);
//            sb.append(currAns);
            return;
        }
        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSsq(remString,currAns+curr);
        printSsq(remString,currAns);
        return;
    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        long t = sc.nextInt();
////        for(int i=0; i<t; i++){
////            int n = sc.nextInt();
////            String s = sc.next();
////            StringBuilder sb = new StringBuilder(s);
////            minSubstring(sb);
////        }
        String s = sc.next();
        printSsq(s," ");

    }
}
