package stack.stack;

import java.nio.charset.CharacterCodingException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class stackQuestion {
    static void code(String str){
        int count = 0;
        Stack<Character>st1 = new Stack<>();
//        Stack<Character>st2 = new Stack<>();
        for(int i=0; i<str.length();i++) {
            char chr = str.charAt(i);
            if(chr=='('){
                st1.push(chr);
//                System.out.println(st1);
            }
            else{
                if(st1.size()>0){
                    if(st1.peek()=='('){
                        st1.pop();
                        count++;
                    }
                }
            }
        }
        System.out.println(count*2);
//        System.out.println(st1);
//        System.out.println(st2);
    }
    static void validBracket(String str){
        Stack<Character>st1 = new Stack<>();
        for(int i=0; i<str.length(); i++){
            char c = str.charAt(i);
            if(c=='(' || c=='{'|| c=='['){
                st1.push(c);
//                System.out.println(st1);
            }
            else{
                char dh = st1.peek();
                if(st1.size()==0){
                    System.out.println("No");
                    return;
                }
                if(c==')'){
                    if(dh=='('){
                        st1.pop();
                    }
                    else{
                        System.out.println("No");
                        return;
                    }
                }
                else if(c=='}'){
                    if(dh=='{'){
                        st1.pop();
                    }
                    else{
                        System.out.println("No");
                        return;
                    }
                }
               else if(c==']'){
                    if(dh=='['){
                        st1.pop();
                    }
                    else{
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        if(st1.size()==1){
            System.out.println("Yes");
            if(str.length()/2==0) {
                for (int i = 0; i < str.length(); i++) {
                    System.out.println('(' + ')');
                }
            }else{
                for (int i = 0; i < str.length()+1; i++) {
                    System.out.println('(' + ')');
                }
            }

        }
        else{
            System.out.println("No");
        }

    }

    static void removeConsecutive(long arr[]){
        Stack<Long> st = new Stack<>();
        for(int i=0; i<arr.length; i++){
            if(st.size()==0){
                st.push(arr[i]);
            }else{
                if(st.peek()==arr[i]){
                        if (arr[i] != arr[i + 1]) {
                            st.pop();
                    }
                        else{
                            if(arr.length-2==i){
                                st.pop();
                                break;
                            }
                        }
                }
                else{
                    st.push(arr[i]);
                }
            }
        }
       for(long X:st){
           System.out.print(X+" ");
       }
    }

    static void longestElement(long arr[]){
        int n = arr.length;
        Stack<Long>st = new Stack<>();
        long ans[] = new long[(int)n];
        st.push(arr[n-1]);
        ans[n-1] = -1;
//        System.out.println(st);
        for(int i=n-2; i>=0; i--){
            while(st.peek()<arr[i]){
                st.pop();
                if(st.size()==0){
                    break;
                }
            }
            if(st.size()==0){ans[i] = -1;}
            else {ans[i] = st.peek();}
            st.push(arr[i]);
        }
        for(long  X:ans){
            System.out.print(X+" ");
        }
//        System.out.println(st);

    }

    static void spanProblem(long arr[]){
        long n = arr.length;
        long ans[] = new long[(int)n];
        Stack<Long>st = new Stack<>();
        Stack<Long>st1 = new Stack<>();
        long count = 1;
        ans[0] = 1;
        st.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            while(st.size()>0){
                if(st.peek()<arr[i]){
                    count++;
                    st1.push(st.pop());
                }
                else{
                    st1.push(st.pop());
                }
                if (st.size() == 0){
                    st1.push(arr[i]);
                    break;
                }

            }
            ans[i] = count;
            count = 1;
            while(st1.size()>0){
                st.push(st1.pop());
            }

        }
        for(long x:ans){
            System.out.print(x+" ");
        }
        System.out.println();
//        System.out.println(st1);
    }

    static void previousSmallestElement(long arr[]){
        long n = arr.length;
        Stack<Long>st = new Stack<>();
        Stack<Long>st1 = new Stack<>();
        long ans[] = new long[(int)n];
        st.push(arr[0]);
        long count = 1;
        ans[0] = 1;
        for(int i=1; i<arr.length; i++){
            while(true){
                if(st.peek()>=arr[i]){
                    count++;
                    st1.push(st.pop());
                }
                else{st1.push(st.pop());
                st1.push(arr[i]);
                break;}
                if(st.size()==0){
                    st1.push(arr[i]);
                    break;
                }
            }
            ans[i] = count;
            count = 1;
            while(st1.size()>0){
                st.push(st1.pop());
            }
        }
        for(long x:ans){
            System.out.print(x+" ");
        }
        System.out.println();
    }

    static void nexSmallestElement(long arr[]){
        long n = arr.length;
        long count = 1;
        Stack<Long>st = new Stack<>();
        Stack<Long>st1 = new Stack<>();
        long ans[] = new long[(int)n];
        st.push(arr[(int) (n-1)]);
        ans[(int) (n-1)] = 1;
        for(int i = (int)n-2; i>=0; i--) {
            while(true){
                if(st.peek()>arr[i]){
                    count++;
                    st1.push(st.pop());
                }
                else {
                        st1.push(arr[i]);
                        break;
                }
                if(st.size()==0){
                    st1.push(arr[i]);
                    break;
                }
            }
            ans[i] = count;
            count = 1;
            while(st1.size()>0){
                st.push(st1.pop());
            }
        }
        for(long x:ans){
            System.out.print(x+" ");
        }
        System.out.println();

    }



    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        String s = sc.next();
//        long arr[] = new long[(int)n];
//        for(int i=0; i<n; i++){
//            arr[i] = sc.nextLong();
//        }
        validBracket(s);
//        removeConsecutive(arr);
//        longestElement(arr);
//        spanProblem(arr);
//        previousSmallestElement(arr);
//        nexSmallestElement(arr);
    }

}
