package queue.basic;

public class circularArr {
    public static class circularQueue {
        int r = -1;
        int f = -1;
        int arr[] = new int[5];
        int size = 0;

        public void add(int val) {
            if (size == arr.length) {
                System.out.println("arr length is full");
                return;
            }
            if (f == -1) {
                r = f = 0;
                arr[0] = val;
                size++;
            } else if (r < size) {
                arr[++r] = val;
                size++;
            } else if (r == arr.length - 1) {
                r = 0;
                arr[0] = val;
                size++;
            }

        }

        public int remove() throws Exception {
            if (size == 0) {
                throw new Exception("queue is empty ");
            }
            else{
                int val = arr[f];
                if(arr.length-1==f) f = 0;
                else f++;
                size--;
                return val;
            }
        }

        public void peek() {
            System.out.println(arr[f]);
        }

        public void display() {
            if (f < r) {
                for (int i = f; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
            } else if (f > r) {//f>r
                for (int i = f; i < arr.length; i++) {
                    System.out.print(arr[i] + " ");
                }
            }
                for (int i = 0; i <= r; i++) {
                    System.out.print(arr[i] + " ");
                }
                System.out.println();
        }
    }
    public static void main(String[] args) throws Exception {
        circularQueue q = new circularQueue();
      q.add(1);
      q.add(2);
      q.add(3);
      q.add(4);
      q.add(5);
//      q.remove();
//      q.remove();
//      q.display();
      q.add(6);
      q.display();
      q.add(0);
      q.display();
      for(int i=0; i<q.arr.length; i++){
          System.out.print(q.arr[i]+" ");
      }
        System.out.println();
    }
}
