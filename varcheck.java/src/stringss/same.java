package stringss;

import java.util.Scanner;

public class same{
    public static void mai(String s){
        for(int i=0; i<s.length()-1; i++){
            if( s.charAt(i)=='R' &&  s.charAt(i+1)=='L'){
                System.out.println(0);
                return;
            }
            else if( s.charAt(i)=='L' &&  s.charAt(i+1)=='R'){
                System.out.println(i+1);
                return;
            }
        }
        System.out.println("-1");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0; i<t; i++) {
            String s = sc.next();
            mai(s);
        }

    }
}



