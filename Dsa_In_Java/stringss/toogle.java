package stringss;
import java.util.*;

public class toogle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder str = new StringBuilder(sc.nextLine());

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch==' ')continue;
            int s = (int)ch;
            if(s>=48 && s<65) continue;

            if(s>=97 && s<=122){
                s -=32;
            }
            else{
                s+=32;
            }
            char cs = (char)s;
            str.setCharAt(i,cs);
        }
        System.out.println(str);



    }
}
