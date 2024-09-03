package BackTracking;

import java.util.Scanner;

public class sudokuSolver {
    static int check = 0;
    public static void solve(char[][] board, int row, int col){
        if(row==9){
            check = 1;
            return;
        }
        else if(board[row][col]!='.'){
            if(col!=8)solve(board,row,col+1);
            else solve(board,row+1,0);
        }
        else{
            for(char ch='1'; ch<='9';ch++){
                if(Valid(board,row,col,ch)){
                    board[row][col] = ch;
                    // grid[row][col] = ch;
                    if(col!=8)solve(board,row,col+1);
                    else solve(board,row+1,0);
                    if(check==1)return;
                    board[row][col] = '.';
                }
            }
        }
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
        solve(board,0,0);
        check = 0;
    }



}

