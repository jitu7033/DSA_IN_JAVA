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

        //input of pascalTriangle;
        System.out.println("Enter your number");
        int n = sc.nextInt();
        System.out.println("matrix 1");
        printMatrix(matrix1);
        System.out.println("matrix 2");

    }
}
