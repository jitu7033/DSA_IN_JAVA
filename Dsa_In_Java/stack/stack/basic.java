package stack.stack;
import java.util.*;

public class basic {
    static void displayRecursive(Stack<Integer>st){
        if(st.size()==0){
            return;
        }
        System.out.println(st.peek());
        st.pop();
        displayRecursive(st);
//        return displayRecursive(st,index);
    }
    static void displayReverseRecursive(Stack<Integer>st){
        if(st.size()==0)
        {return;}
        int t = st.pop();
        displayReverseRecursive(st);
        System.out.println(t);
        st.push(t);

    }
    static  void printStack(Stack<Integer>st){
        for(int X:st){
            System.out.print(X+" ");
        }
        System.out.println();
    }
    static void copyStacks(Stack<Integer> st){
        Stack<Integer>st1 = new Stack<>();
        st1 = st;
//        System.out.println(st1);
        printStack(st1);
    }
    static void reverseStack(Stack<Integer>st){
        Stack<Integer>revSt = new Stack<>();
        while(st.size()>0){
//            st.peek();
            revSt.push(st.peek());
            st.pop();
        }
        System.out.println(revSt);
    }
    static void insertStack(Stack<Integer>st,int index,int element){
        Stack<Integer>st1 = new Stack<>();
        while(st.size()>=index){
            if(st.size()==index){
                st1.push(element);
            }
            st1.push(st.pop());
        }
        while(st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println(st);
    }
    static void printStackButtonToTop(Stack<Integer>st){
        Stack<Integer>st1 = new Stack<>();
        while(st.size()>0){
            System.out.println(st.peek()+" ");
            st1.push(st.pop());
        }
        while(st1.size()>0){
//            System.out.print(st1.peek()+" ");
            st.push(st1.pop());
        }
        System.out.println();
//        System.out.println(st);
    }
    static void copyArrToStack(Stack<Integer>st){
        int n = st.size();
        int arr[] = new int[st.size()];
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }
//        System.out.println(arr);
        for(int i=0;i<arr.length; i++){
            st.push(arr[i]);
        }
        for(int X:arr){
            System.out.println(X);
        }
        System.out.println(st);
    }
    static void removeAtIndex(Stack<Integer>st, int index){
        Stack<Integer>st1 = new Stack<>();
        while(st.size()>index){
            st1.push(st.pop());
        }
        st.remove(index);
        while(st1.size()>0){
            st.push(st1.pop());
        }
        System.out.println(st);

    }
    public static void main(String[] args) {
        Stack<Integer>st = new Stack<>();
        st.push(1);
        st.push(3);
        st.push(4);
        removeAtIndex(st,2);
    }
}
