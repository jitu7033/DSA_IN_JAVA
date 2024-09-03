public class fibonacci {
    public static void main(String[] args) {
        int n = 6;
        int a = 0;
        int b = 1;
        int c = 0;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            sum = sum+b;
            System.out.println(b);

        }
        System.out.println(sum);

    }
}
