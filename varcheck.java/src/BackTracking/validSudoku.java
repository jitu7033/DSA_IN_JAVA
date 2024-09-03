package BackTracking;

import java.util.Scanner;

public class validSudoku{
    public static boolean isValid(char[][]board,int row, int col){
        int n = board.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                char num = board[i][j];
                board[i][j] = '.';
                if(Valid(board,i,j,num)==false) return false;
                board[i][j] = num;
            }
        }
        return true;
    }

    private static boolean Valid(char[][] board, int row, int col, char num) {
        int n = board.length;

        // check row
        for(int i=0; i<n; i++){
            if(board[row][i]==num)return false;
        }
        // check col
        for(int i=0; i<n; i++){
            if(board[i][col]==num)return false;
        }
        int srow = row/3*3;
        int scol = col/3*3;
        for(int i=srow; i<srow+3; i++){
            for(int j=scol; j<scol+3; j++){
                if(board[i][j]==num)return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            String str = "";
            for(int j=0; j<n; j++){
                str+=sc.next();
            }
        }
        System.out.println(isValid(board,0,0));
    }
}
