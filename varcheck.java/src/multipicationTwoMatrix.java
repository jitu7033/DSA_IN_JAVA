import java.util.Scanner;

public class multipicationTwoMatrix {
    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }


    static void multiply(int[][]matrix1,int r1,int c1,int[][] matrix2,int r2,int c2){
        int [][]result = new int[r1][c2];
        if(c1!=r2){
            System.out.println("Invalid Matrix input, please input valid matrix ");
            return;
        }
        for(int i=0; i<r1; i++){
            for(int j=0; j<c2; j++){
                for(int k=0; k<c1; k++){
                    result[i][j] += matrix1[i][k]*matrix2[k][j];
                }

            }
        }
        System.out.println("Multipication of Two Matrix ");
        printMatrix(result);
    }

    static int[][] findTranspose(int[][] matrix1,int r1, int c1){
        int [][]ans = new int[c1][r1];
        for(int i=-0; i<c1;i++){
            for(int j=0; j<r1; j++){
                ans[i][j] = matrix1[j][i];
            }
        }
        return ans;
    }

    //reverse of two d arrays
    static void reverseTwoDArrays(int[][]matrix1,int r1,int c1){
        for(int i=0; i<r1; i++){
            int start = 0;
            int end = c1-1;
            while(start<end){
                int temp = matrix1[i][start];
                matrix1[i][start] = matrix1[i][end];
                matrix1[i][end] = temp;
                start++;
                end--;
            }
        }
        printMatrix(matrix1);
    }

    //rotate ninety degree
    static void RotateMatrix(int[][] matrix1,int r1, int c1){
        transposeInplace(matrix1 , r1,c1);
        reverseTwoDArrays(matrix1,r1,c1);

    }

    static int [][] pascal(int n){
        int [][] ans = new int[n][];
        for(int i=0; i<n; i++){
            ans[i] = new int[i+1];
            ans[i][0] = ans[i][i] = 1;

            for(int j=1; j<i; j++){
                ans[i][j] = ans[i-1][j]+ans[i-1][j-1];
            }
        }
        return ans;
    }

    //transpose of matrix
    static void transposeInplace(int [][]matrix1,int r1,int c1){
        for(int i=0; i<r1; i++){
            for(int j=i; j<c1; j++){
                int temp = matrix1[i][j];
                matrix1[i][j] = matrix1[j][i];
                matrix1[j][i] = temp;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("inter your row in matrix 1");
        int r1 = sc.nextInt();
        System.out.println("Enter your column matrix 1");
        int c1 = sc.nextInt();
        System.out.println("enter "+ r1*c1 + " element");
        int[][]matrix1 = new int[r1][c1];
        for(int i=0; i<r1; i++){
            for(int j=0; j<c1; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
//        System.out.println("inter your row in matrix 2");
//        int r2 = sc.nextInt();
//        System.out.println("Enter your column matrix 2");
//        int c2 = sc.nextInt();
//        System.out.println("enter "+ r2*c2 + " element");
//        int[][]matrix2 = new int[r2][c2];
//        for(int i=0; i<r2; i++){
//            for(int j=0; j<c2; j++){
//                matrix2[i][j] = sc.nextInt();
//            }
//        }

        //input of pascalTriangle;
        System.out.println("Enter your number");
        int n = sc.nextInt();


        System.out.println("matrix 1");
        printMatrix(matrix1);
        System.out.println("matrix 2");
//        printMatrix(matrix2);

//
//        multiply(matrix1,r1,c1,matrix2,r2,c2);

//
//        System.out.println("transpose of matrix");
//        int ans[][] = findTranspose(matrix1,r1,c1);
//        printMatrix(ans);

//        reverseTwoDArrays(matrix1,r1,c1);
//          transposeInplace(matrix1,r1,c1);
//         printMatrix(matrix1);


        System.out.println("rotate ninety degree ");
        RotateMatrix(matrix1,r1,c1);
//        printMatrix(matrix1);

        System.out.println("print pascal Triangle");
        int ans[][] = pascal(n);
        printMatrix(ans);

    }
}
