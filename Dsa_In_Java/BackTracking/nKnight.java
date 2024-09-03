package BackTracking;

import java.util.Scanner;

public class nKnight {
    static int max = -1;
    static int number = 3;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char board[][] = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        knight(board,0,0,0);
        System.out.println(max);
    }

    private static void knight(char[][] board, int row, int col, int num) {
        int n = board.length;
        if(row==n){
            if(num>=n*2){
                for(int i=0; i<n; i++){
                    for(int j=0; j<n; j++){
                        System.out.print(board[i][j]+" ");
                    }
                    System.out.println();
                }
                System.out.println();

            }
            max = Math.max(max,num);
            return;
        }
        else if(isSafe(board,row,col)){
            board[row][col] = 'K';
            if(col!=n-1){
//                board[row][col] = 'K';
                knight(board,row,col+1,num+1);
            }
            else
                knight(board,row+1,0,num+1);
            board[row][col] = '.';
        }
        if(col!=n-1)
            knight(board,row,col+1,num);
        else knight(board,row+1,0,num);
    }

    private static boolean isSafe(char[][]board,int row, int col){
        int n = board.length;
        int i, j;
        // up right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        // up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // down right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'K') return false;

        //down left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;

        // right up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'K') return false;

        // right down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'K') return false;

        // left up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'K') return false;

        // left  down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'K') return false;
        return true;
    }
}
