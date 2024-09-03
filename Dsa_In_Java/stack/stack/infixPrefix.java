package stack.stack;

import java.util.Stack;

public class infixPrefix {


//     infix expression:
    static void infixSum(String s){
        Stack<Long>val = new Stack<>();
        Stack<Character>opr = new Stack<>();
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            int ascii = (int)ch;
            if(ascii>=48 && ascii<=57){
                val.push((long) (ascii-48));
            }
           else if(opr.size()==0){
               opr.push(ch);
            }
           else{
               if(ch=='-' || ch=='+'){
                   // work;
                   long v2 = val.pop();
                   long v1 = val.pop();
                   if(opr.peek()=='-')val.push(v1-v2);
                   if(opr.peek()=='+')val.push(v1+v2);
                   if(opr.peek()=='*')val.push(v1*v2);
                   if(opr.peek()=='/')val.push(v1/v2);
                   opr.pop();
                   opr.push(ch);
               }
               if(ch=='/'|| ch=='*') {
                   if (opr.peek() == '*' || opr.peek() == '/') {
                       long v2 = val.pop();
                       long v1 = val.pop();
                       if (opr.peek()== '*') val.push(v1 * v2);
                       if (opr.peek() == '/') val.push(v1 / v2);
                       opr.pop();
                       opr.push(ch);
                   }
                   else{
                       opr.push(ch);
                   }
               }
            }
        }
        while(val.size()>1) {
                long v2 = val.pop();
                long v1 = val.pop();
                if (opr.peek() == '-') val.push(v1 - v2);
                if (opr.peek() == '+') val.push(v1 + v2);
                if (opr.peek() == '*') val.push(v1 * v2);
                if (opr.peek() == '/') val.push(v1 / v2);
                opr.pop();
        }
        System.out.println(val.peek());
    }
    public static void main(String[] args) {
        String s = "9-5+3*4/6";
        infixSum(s);

    }
}
