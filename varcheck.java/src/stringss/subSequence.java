package stringss;

import java.util.Scanner;

public class subSequence {

    static void SSQ(String s, String curr){

        if(s.length() == 0){ System.out.println(curr);
        return;
        }

        char currAns = s.charAt(0);
        String  remString = s.substring(1);

        SSQ(remString,curr+currAns);
        SSQ(remString,curr);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        SSQ(s,"");
    }

}
