import java.util.ArrayList;
import java.util.Scanner;

public class recursiveString {

    static String occurrence(String s , int idx) {
        String ans = " ";
        if(idx==s.length()) return ans;

        String small = occurrence(s,idx+1);

        char ch = s.charAt(idx);

        if(ch!='a'){
            return ch+small;
        }

        else{
            return small;
        }

    }

    static String remove2(String s){
        if(s.length()==0) return "";

        String small = remove2(s.substring(1));

        char curr = s.charAt(0);

        if(curr!='a'){
            return curr+small;

        }
        else{
            return small;
        }


    }

    // subsequent string 2nd method

    static void printSsq(String s, String currAns){

        if(s.length()==0){
            System.out.println(currAns);
            return;
        }

        char curr = s.charAt(0);
        String remString = s.substring(1);
        printSsq(remString,currAns+curr);
       printSsq(remString,currAns);

       return;

    }

    // subsequence string;
    static ArrayList<String> ssq(String s){
        ArrayList<String>ans = new ArrayList<>();

        // base case
        if(s.length()==0){
            ans.add("");
            return ans;
        }
        char curr = s.charAt(0);

        // recursive case;
        ArrayList<String>smallAns = ssq(s.substring(1));

        //self work;
        for(String ss: smallAns){
            ans.add(ss);
            ans.add(curr+ss);
        }
        return ans;
    }

    //reverse of string

    static String reverse(String s,int idx){
        if(s.length()==idx) return "";
        //self work
        return reverse(s,idx+1)+s.charAt(idx);
    }

    // check string ii palindrome or not
    static String palindrome(String s, int idx){
        // base case
        if(idx==s.length()) return "";
        // recursive work
        return palindrome(s,idx+1)+s.charAt(idx);
    }

    static boolean isPalindrome(String s, int l, int r){
        if(l>=r) return true;

        if(s.charAt(l)==s.charAt(r) && isPalindrome(s,l+1,r-1)) return true;
        else return false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

//        System.out.println(occurrence(s,0));
//        System.out.println(remove2(s));
//
//        //reverse of string
//        System.out.println("reverse of string");
//        System.out.println(reverse(s,0));
//
//        //palindrome
//        System.out.println("check palindrome");
//        String r = palindrome(s,0);
//        if(r.equals(s)){
//            System.out.printf("%s is palindrome" ,s);
//        }
//        else {
//            System.out.printf("%s Not a palindrome\n",s);
//        }


//        System.out.println("\nis palindrome");
//        System.out.println(isPalindrome(s,0,s.length()-1));

        // subsequence string
//        System.out.println(ssq(s));

        //subsequence second method

        printSsq(s,"");
    }
}
