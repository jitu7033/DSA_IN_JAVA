import java.util.Scanner;

public class rectanglesum {

    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void prefixRowPrefColumn(int[][]matrix) {
        int r = matrix.length;
        int c = matrix.length;
            for (int i = 0; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    matrix[i][j] += matrix[i][j - 1];
                }
            }
            for (int j = 0; j < c; j++) {
                for (int i = 1; i < r; i++) {
                    matrix[i][j] += matrix[i - 1][j];
            }

        }
    }

    static void prefixSum(int[][]matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        if (c > 1) {
            for (int i = 0; i < r; i++) {
                for (int j = 1; j < c; j++) {
                    matrix[i][j] += matrix[i][j - 1];
                }
            }
        }
    }


    static int rectangleSum(int[][]matrix, int l1, int l2, int r1, int r2){
        int sum = 0;
        for(int i=l1; i<=l2; i++){
            for(int j=r1; j<=r2; j++){
                sum += matrix[i][j];
            }
        }
        return sum;
    }


    static int rectangleSum2(int[][] matrix, int l1, int l2,int r1,int r2){
        int sum = 0;
        prefixSum(matrix);
        for(int i=l1; i<=l2; i++) {
            if (r1 >= 1)
                sum += matrix[i][r2] - matrix[i][r1 - 1];
            else
                sum += matrix[i][r2];

        }
        return sum;

    }
    static int rectangleSum3(int [][]matrix, int l1, int r1, int l2, int r2) {
        int ans = 0, som = 0, left = 0, up = 0, upLeft = 0;
        prefixRowPrefColumn(matrix);
        som = matrix[l2][r2];

        if(r1>=1) {
            left = matrix[l2][r1 - 1];
        }
        if (l1>=1) {
            up = matrix[l1 - 1][r2];
        }
        if(l1>=1 && r1>=1){
            upLeft = matrix[l1 - 1][r1 - 1];
        }
        ans = som-up-left+upLeft;
        return ans;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter your row in matrix 1");
        int r = sc.nextInt();
        System.out.println("Enter your column matrix 1");
        int c = sc.nextInt();
        System.out.println("enter " + r* c + " element");
        int[][] matrix = new int[r][c];
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter diagonal of rectangle");
        System.out.println("l1");
        int l1 = sc.nextInt();
        System.out.println("r1");
        int r1 = sc.nextInt();
        System.out.println("l2");
        int l2 = sc.nextInt();
        System.out.println("r2");
        int r2 = sc.nextInt();

        System.out.println("sum of rectangle");
        System.out.println(rectangleSum(matrix,l1,l2,r1,r2));

        System.out.println("sum of rectangle 2  "+rectangleSum2(matrix,l1,l2,r1,r2));

        System.out.println("sum of rectangle 3  " + rectangleSum3(matrix,l1,r1,l2,r2));

//        prefixSum(matrix);
//        printMatrix(matrix);
//
//        prefixRowPrefColumn(matrix,r,c);
//        printMatrix(matrix);
    }
}
