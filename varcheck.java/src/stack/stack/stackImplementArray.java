package stack.stack;

public class stackImplementArray {
    public static class Stack{
        private int arr[]   = new int[5];
        int idx = 0;
        void push(int x){
            if(isFull()){
                System.out.println("Stack is full");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx==0){
                System.out.println("stack is empty");
                return -1;
            }
            int top = arr[idx-1];
            idx--;
            return top;

        }
        boolean isEmpty(){
            if(idx==0) {return true;}
            else return false;
        }
        boolean isFull(){
            if(idx==arr.length) return true;
            else return false;
        }
        void display(){
            for(int i=0; i<idx; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
//        st.display();
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
//        System.out.println(st.pop());
//        st.pop();
//        st.peek();
        st.display();
    }
}
