package dynamicProgramming;

public class basic {

    public static int calls = 0;
    private static int fibonacci(int n){
        calls++;
        if(n<=1){
            return n;
        }
        return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        int n = 30;
        System.out.println(fibonacci(n));
        System.out.println(calls);
    }
}
