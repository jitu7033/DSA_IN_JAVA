import java.util.Scanner;

public class spiral {

    static void printMatrix(int[][]matrix){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[i].length; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void spiralMatrix(int[][]matrix,int r,int c){
        int topRow = 0;
        int bottomRow = r-1;
        int leftColumn = 0;
        int rightColumn = c-1;
        int totalElement = 0;
        while(totalElement<r*c){
            //top = right to left
            for(int j = leftColumn; j<=rightColumn && totalElement<r*c; j++){
                System.out.print(matrix[topRow][j]+" ");
                totalElement++;
            }
            topRow++;
            //rightColumn = top to bottom

            for(int i = topRow; i<=bottomRow && totalElement<r*c; i++){
                System.out.print(matrix[i][rightColumn]+" ");
                totalElement++;
            }
            rightColumn--;

            //bottomRow = rightColumn to leftColumn

            for(int j=rightColumn; j>=leftColumn && totalElement<r*c; j--){
                System.out.print(matrix[bottomRow][j]+" ");
                totalElement++;
            }
            bottomRow--;

            //leftColumn = bottom to top;

            for(int i = bottomRow; i>=topRow && totalElement<r*c; i--){
                System.out.print(matrix[i][leftColumn]+" ");
                totalElement++;
            }
            leftColumn++;
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

        spiralMatrix(matrix,r,c);
//        printMatrix(matrix);
    }
}

