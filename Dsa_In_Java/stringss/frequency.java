package stringss;

import java.util.Scanner;

public class frequency {

    static String frequency(String s) {
        int x = 0;
        int y = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='L'){
                x = x-1;
            }
            if(s.charAt(i)=='R'){
                x = x+1;
            }
            if(s.charAt(i)=='U'){
                y = y+1;
            }
            if(s.charAt(i)=='D') {
                y = y-1;
            }
            if(x==1 && y==1){

                return "Yes";
            }
        }
           return "No";

    }
    static void stringFrequency(String s){

    }

    public static void main (String[]args){

            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            for (int i = 1; i <=t; i++) {
                String s = sc.next();
                System.out.println(frequency(s));
            }
        }
    }
