package jitu.stack;
import java.util.*;


public class ABBB {

    static void stack(String s){

        Stack<Character>st = new Stack<Character>();
        for(int i=0; i<s.length(); i++){
            if(st.empty() || s.charAt(i)=='A'){
                st.push(s.charAt(i));
            }
            else if(s.charAt(i) == 'B' && st.peek()=='A'){
                st.pop();
            }
            else if (s.charAt(i) == 'B' && st.peek() == 'B') {
                st.pop();
            }
        }
        System.out.println(st.size());

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0; i<t; i++){
            String s = sc.next();
            stack(s);
        }

    }
}
