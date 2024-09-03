package BackTracking;

import java.util.Scanner;

public class amazonPlacement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char[][]board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = '.';
            }
        }
        aPlacement(board,0,0,0);
        System.out.println(max);
    }

    static int max =0;

    public static void aPlacement(char[][]board,int row,int col ,int num){
        int n = board.length;
        if(row==n){
            if(num>=n) {
                 max++;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print(board[i][j] + " ");
                    }
                    System.out.println();
                }
                System.out.println();
            }
            return;
        }
        else if(isSafe1(board,row,col) && isSafe(board,row,col)){
            board[row][col] = 'A';
            if(col!=n-1){
                aPlacement(board,row,col+1,num+1);
            }
            else{
                aPlacement(board,row+1,0,num+1);
            }
            board[row][col] = '.';
        }
            if(col!=n-1){
                aPlacement(board,row,col+1,num);
            }
            else aPlacement(board,row+1,0,num);
    }

    public static boolean isSafe(char[][]board,int row, int col){
        int n = board.length;
        for(int i=0; i<n; i++){
            if(board[row][i]=='A')return false;
        }
        for(int i=0; i<n; i++){
            if(board[i][col]=='A') return false;
        }
        int i,j;
        // north and west  // north --> upper west --> right
        i = row;
        j = col;

        while(i>=0 && j<n){
            if(board[i][j]=='A')return false;
            i--;
            j++;
        }

        // south and west //  south --> lower and west --> right

        i = row;
        j = col;

        while(i<n && j<n){
            if(board[i][j]=='A') return false;
            i++;
            j++;
        }
        // north and east // east--> left
        i = row;
        j = col;

        while(i>=0 && j>=0){
            if(board[i][j]=='A') return false;
            i--;
            j--;
        }

        // south and east // south--> down and east--> left

        i = row;
        j = col;
        while(i<n && j>=0){
            if(board[i][j]=='A')return false;
            i++;
            j--;
        }
        return true;
    }
    private static boolean isSafe1(char[][]board,int row, int col){
        int n = board.length;
        int i, j;
        // up right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == 'A') return false;

        // up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == 'A') return false;

        // down right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == 'A') return false;

        //down left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == 'A') return false;

        // right up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == 'A') return false;

        // right down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == 'A') return false;

        // left up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == 'A') return false;

        // left  down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == 'A') return false;
        return true;
    }
}
