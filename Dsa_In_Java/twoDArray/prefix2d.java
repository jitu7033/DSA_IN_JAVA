import java.util.Scanner;

public class prefix2d {

    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void  prefix(int [][] matrix) {
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


    static void prefixColumn(int [][] matrix){
        int r = matrix.length;
        int c = matrix[0].length;
        for(int j=0; j<c; j++){
            for(int i=1; i<r; i++){
                matrix[i][j] += matrix[i-1][j];
            }
        }
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


        prefix(matrix);
        printMatrix(matrix);

//        prefixColumn(matrix);
//        printMatrix(matrix);


    }
}
