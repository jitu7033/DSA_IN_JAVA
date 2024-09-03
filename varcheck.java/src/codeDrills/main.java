package codeDrills;

import java.util.Scanner;

public class main {
    static int sum(String s){
        int count = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='1'){
                count+=1;
            }
            else if(s.charAt(i)=='3'){
                count+=4;
            }
            else if(s.charAt(i)=='5'){
                count+=6;
            }
            else if(s.charAt(i)=='7'){
                count+=9;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0) {
            String s1 = sc.next();
            String s2 = sc.next();
            int ans = sum(s1);
            int ans2 = sum(s2);
            System.out.println(ans - ans2);
        }
    }
}
