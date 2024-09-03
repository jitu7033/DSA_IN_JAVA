package codeforces;

import java.util.Scanner;

public class split {
    static void splitIt(String [] s,int k){
        int n = s.length;
        if(2*k>=n){
            System.out.println("No");
        }
        else{
            for(int i=0; i<k; i++){
                if(s[i]==s[n-1-i]) continue;

                else{
                    System.out.println("No");
                    return;
                }
            }
            System.out.println("yes");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s[] = new String[n];
        for(int i=0; i<n; i++){
            s[i] = sc.nextLine();
        }

        splitIt(s,k);



    }
}
