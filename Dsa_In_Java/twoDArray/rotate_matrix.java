import java.util.Scanner;


public class rotate_matrix {

  static void printMatrix(int[][]matrix){
    for(int i=0; i<matrix.length; i++){
        for(int j=0; j<matrix[i].length; j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
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

     //rotate ninety degree
     static void RotateMatrix(int[][] matrix1,int r1, int c1){
      transposeInplace(matrix1 , r1,c1);
      reverseTwoDArrays(matrix1,r1,c1);

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
  }
}
