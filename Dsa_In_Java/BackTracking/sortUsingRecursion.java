package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;



public class sortUsingRecursion {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer>arr = new ArrayList<>();
        for(int i=0; i<n; i++){
            arr.add(sc.nextInt());
        }
        Stack<Integer>st = new Stack<>();
        for(int x:arr){
            st.push(x);
        }
        int mid = (st.size()/2)+1;
       reverseStack(st);
        for(int x:st)
            System.out.print(x+" ");
        System.out.println();
    }

    // reverse the stack
    private static void reverseStack(Stack<Integer>st){

        if(st.size()==1)return;
        int ele = st.pop();
        reverseStack(st);
        insertStackReverse(st,ele);

    }
    private static void insertStackReverse(Stack<Integer>st,int ele) {
        if (st.size() == 0) {
            st.push(ele);
            return;
        }
        int temp = st.pop();
        insertStackReverse(st, ele);
        st.push(temp);
    }
    // delete middle element from the stack
    private static void deleteMiddle(Stack<Integer>st, int idx, int mid){

        if(mid==1){
            st.pop();
            return;
        }
        int val = st.pop();
        deleteMiddle(st,idx,mid-1);
        st.push(val);
        return;
    }

    private static void sortStack(Stack<Integer>st){
        if(st.size()==1){
            return;
        }
        int ele = st.peek();
        st.pop();
        sortStack(st);
        insertStack(st,ele);
    }

    private static void insertStack(Stack<Integer> st, int ele) {
        if(st.size()==0 || st.peek()<=ele){
            st.push(ele);
            return;
        }
        int val = st.peek();
        st.pop();
        insertStack(st,ele);
        st.push(val);

    }

    private static void sortArray(ArrayList<Integer>arr){
        // check base case
        if(arr.size()==1)return;

        int temp = arr.get(arr.size()-1);
        arr.remove(arr.get(arr.size()-1));
        sortArray(arr);
        // insert the element in right position
        insert(arr,temp);
    }

    private static void insert(ArrayList<Integer> arr, int temp) {
        if(arr.size()==0 || arr.get(arr.size()-1)<=temp){
            arr.add(temp);
            return;
        }
        int val = arr.get(arr.size()-1);
        arr.remove(arr.get(arr.size()-1));
        insert(arr,temp);
        arr.add(val);
    }
}
