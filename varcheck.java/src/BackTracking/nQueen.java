package BackTracking;

import java.util.Arrays;
import java.util.Scanner;

public class nQueen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        queen(board,0);

    }
    private static void queen(char[][] board, int row) {
        int n = board.length;
        if(row==n){
            for(int i=0; i<n; i++){
                for(int j=0; j<n; j++){
                    System.out.print(board[i][j]+" ");
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j=0; j<n; j++){
            if(isSafe(board,row,j)) {
                board[row][j] = 'Q';
                queen(board, row + 1);
                board[row][j] = '.';
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;
       for(int j=0; j<n; j++){
           if(board[row][j]=='Q')return false;
       }
       for(int i=0; i<n; i++){
           if(board[i][col]=='Q')return false;
       }
       //check North west
        int i = row;
        int j = col;
        while(i>=0 &&j<n){
            if(board[i][j]=='Q') return false;
            i--;
            j++;
        }
        //south and west
        i = row;
        j = col;
        while(i<n && j<n){
            if(board[i][j]=='Q')return false;
            i++;
            j++;
        }
        //south and east
        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='Q')return false;
            i++;
            j--;
        }
        //north and east
        i = row;
        j = col;
        while(i>=0 && j>=0){
            if(board[i][j]=='Q')return false;
            i--;
            j--;
        }
        return true;
    }
}
