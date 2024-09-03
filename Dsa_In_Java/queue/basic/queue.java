package queue.basic;
public class queue {


    public static class queueA{
        int f = -1;
        int r = -1;
        int size = 0;
        int arr[] = new int[100000000];
        public void add(int val){
            if(arr.length==r){
                System.out.println("array is full");
                return;
            }
            if(f==-1){r=  f = 0;arr[0] = val;size++;}
            else{
                arr[++r] = val;
                size++;
            }
        }
        public int  pop(){
            if(size==0){
                return -1;
            }
            int x = arr[f];
            f++;
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty(){
            if(size==0) return true;
            return false;
        }
        public void display(){
            if(size==0){
                System.out.println("queue is empty");
                return;
            }
            for(int i=f; i<=r; i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        queueA q = new queueA();
        q.add(10);
        q.add(2);
        q.add(3);
        q.display();
//        System.out.println(q.peek());
        q.pop();
        q.display();
        System.out.println(q.size);
    }
}
