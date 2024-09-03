import java.util.Scanner;

public class generatespiraql {

    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static int [][] antiClockWiseGenerateSpiral(int n) {

        int[][] matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftColumn = 0;
        int rightColumn = n - 1;
        int current = 1;
        while(current<=n*n){
            //left =  top to bottom
            for(int i=topRow; i<=bottomRow && current<=n*n; i++){
                matrix[i][leftColumn] = current++;
            }
            leftColumn++;
            // bottom = left to right
            for(int i=leftColumn; i<=rightColumn && current<=n*n; i++){
                matrix[bottomRow][i] = current++;
            }
            bottomRow--;
            //right = bottom to top
            for(int i=bottomRow; i>=topRow && current<=n*n; i--){
                matrix[i][rightColumn] = current++;
            }
            rightColumn--;

            //topROw = right to left
            for(int i=rightColumn; i>=leftColumn && current<=n*n; i--){
                matrix[topRow][i] = current++;
            }
            topRow++;

        }
        return matrix;
    }


    static int[][] generateSpiral(int n){
        int [][]matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n-1;
        int leftColumn = 0;
        int rightColumn = n-1;
        int current = 1;
        while(current<=n*n){
            //top = right to left
            for(int j = leftColumn; j<=rightColumn && current<=n*n; j++){
                matrix[topRow][j] = current++;
            }
            topRow++;
            //rightColumn = top to bottom

            for(int i = topRow; i<=bottomRow && current<=n*n; i++){
               matrix[i][rightColumn] = current++;
            }
            rightColumn--;

            //bottomRow = rightColumn to leftColumn

            for(int j=rightColumn; j>=leftColumn && current<=n*n; j--){
                matrix[bottomRow][j] =current++;
            }
            bottomRow--;

            //leftColumn = bottom to top;

            for(int i = bottomRow; i>=topRow && current<=n*n; i--){
                matrix[i][leftColumn] = current++;
            }
            leftColumn++;
        }
        return matrix;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//
//
//        int [][]ans = generateSpiral(n);
//        printMatrix(ans);


        int matrix[][] = antiClockWiseGenerateSpiral(n);
        printMatrix(matrix);

    }
}
