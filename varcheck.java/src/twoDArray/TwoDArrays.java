import java.util.Scanner;

public class TwoDArrays {

    static void printArray(int [][]arr){
        for(int i=0;i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void sumOfMatrix(int[][]arr1,int [][]arr2,int r,int c){
        int[][]sum = new int[r][c];
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                sum[i][j] = arr1[i][j]+arr2[i][j];

            }
        }
        System.out.println("print matrix sum");
        printArray(sum);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter row");
        int r = sc.nextInt();
        System.out.println("Enter columns");
        int c = sc.nextInt();
        int[][]arr1 = new int[r][c];
        System.out.println("Enter "+r*c+" element");
        for(int i=0; i<r; i++){
            for(int j=0; j<c; j++){
                arr1[i][j] = sc.nextInt();

            }
        }
        int[][]arr2 = new int[r][c];
        System.out.println("Enter "+r*c+" element");
        for(int i=0; i<r; i++) {
            for (int j = 0; j < c; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("matrix 1");
        printArray(arr1);
        System.out.println("matrix 2");
        printArray(arr2);

        sumOfMatrix(arr1,arr2,r,c);





    }
}
