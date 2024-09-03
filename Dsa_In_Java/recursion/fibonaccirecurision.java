public class fibonaccirecurision {
    static int fib(int n){
        //base no
        if(n==0 || n==1){
            return n;
        }
        //subProblem recursive

        int prev = fib(n-1);
        int prevPrev = fib(n-2);

        //self work
        return prev+prevPrev;
//        return prev+prevPrev;

    }
    public static void main(String[] args) {
        for(int i=0; i<=10; i++){
            System.out.println(fib(10));
        }

    }
}
