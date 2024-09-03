import java.util.Scanner;

public class find_transpose {

  static int[][] findTranspose(int[][] matrix1,int r1, int c1){
    int [][]ans = new int[c1][r1];
    for(int i=-0; i<c1;i++){
        for(int j=0; j<r1; j++){
            ans[i][j] = matrix1[j][i];
        }
    }
    return ans;
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
