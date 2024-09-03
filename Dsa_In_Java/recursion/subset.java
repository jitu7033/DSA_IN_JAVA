package recursion;

import com.sun.jdi.ArrayReference;

import java.util.ArrayList;
import java.util.Scanner;

public class subset {

    public static void subsetPrint(ArrayList<Integer>arr, ArrayList<Integer> ans){
        if(arr.size()==0){
            System.out.println(ans);
            return;
        }
        ArrayList<Integer>op1 = ans;
        ArrayList<Integer>op2 = ans;

        op2.add(arr.get(0));
        arr.remove(0);
        subsetPrint(arr,op1);
        subsetPrint(arr,op2);
        return;
    }
    static void printSubset(StringBuilder sb, String temp){
        if(sb.length()==0){
            System.out.println(temp);
            return;
        }
        String op1 = temp;
        String op2 = temp;
        op2+=sb.charAt(0);
        sb.deleteCharAt(0);
        printSubset(sb,op1);
        printSubset(sb,op2);
        return;
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer>arr = new ArrayList<>();
//        for(int i=0;i<3; i++){
//            arr.add(sc.nextInt());
//        }
//        ArrayList<Integer>temp = new ArrayList<>();
//        subsetPrint(arr,temp);
        String s = "123";
        String temp = "";
        StringBuilder sb = new StringBuilder(s);
        printSubset(sb,temp);
    }
}
