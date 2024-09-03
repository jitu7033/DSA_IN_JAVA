package twoDArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class diagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
//        int ans[] = new int[n*m];
        ArrayList<Integer> ans = new ArrayList<>();
        if (mat.length == 0) System.out.println(0);
        int i = 0;
        int j = 0;
       m = mat.length;
       n = mat[0].length;
        int[] result = new int[m * n];

        for (int k = 0; k < result.length; k++) {
            result[k] = mat[i][j];
            if ((i + j) % 2 == 0) {
                if (j == (n - 1)) i++;
                else if (i == 0) j++;
                else {
                    i--;
                    j++;
                }
            } else {
                if (i == (m - 1)) j++;
                else if (j == 0) i++;
                else {
                    i++;
                    j--;
                }
            }
        }
        for(int x:result){
            System.out.println(x);
        }
    }
}
