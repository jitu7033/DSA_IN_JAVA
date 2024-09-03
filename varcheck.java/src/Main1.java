import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        while (t-- > 0) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();
            if (n == 1) {
                System.out.println(-1);
            } else if (n % 2 == 0) {
                if (s % 2 == 0) {
                    if (s >= n) {
                        int p = s / n, pp = s % n;
                        for (int i = 0; i < n; i++) {
                            if (pp > 0) {
                                System.out.print((p + 1) + " ");
                                pp--;
                            } else {
                                System.out.print(p + " ");
                            }
                        }
                        System.out.println();
                    } else {
                        System.out.println(-1);
                    }
                } else {
                    System.out.println(-1);
                }
            } else {
                if (s % 2 == 1) {
                    System.out.println(-1);
                } else {
                    if (n > 3) {
                        if (s >= (n + 3)) {
                            System.out.print("1 2 3 ");
                            n -= 3;
                            s -= 6;
                            int p = s / n, pp = s % n;
                            for (int i = 0; i < n; i++) {
                                if (pp > 0) {
                                    System.out.print((p + 1) + " ");
                                    pp--;
                                } else {
                                    System.out.print(p + " ");
                                }
                            }
                            System.out.println();
                        } else {
                            System.out.println(-1);
                        }
                    } else {
                        if (s < 6 || s == (1 << ((int) (Math.log(s / 2) / Math.log(2))))){
                            System.out.println(-1);
                        }
                        else {
                            System.out.println(s / 2 + " " + (1 << ((int) (Math.log(s / 2) / Math.log(2)))) + " " +
                                    ((s / 2) - (1 << ((int) (Math.log(s / 2) / Math.log(2))))));
                        }
                    }
                }
            }
        }
        scanner.close();
    }
}
