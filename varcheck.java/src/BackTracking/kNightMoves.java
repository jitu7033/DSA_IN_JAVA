package BackTracking;

import java.util.Scanner;

public class kNightMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int board[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = sc.nextInt();
            }
        }
        System.out.println(helper(board,0,0,0));

    }

    private static boolean  helper(int[][] board, int row, int col, int num) {
        int n = board.length;
        if (board[row][col] == (n*n)-1) {
            return true;
        }
        int i, j;
        // up right
        i = row - 2;
        j = col + 1;
        if (i >= 0 && j < n && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        // up left
        i = row - 2;
        j = col - 1;
        if (i >= 0 && j >= 0 && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        // down right
        i = row + 2;
        j = col + 1;
        if (i < n && j < n && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        //down left
        i = row + 2;
        j = col - 1;
        if (i < n && j >= 0 && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        // right up
        i = row - 1;
        j = col + 2;
        if (i >= 0 && j < n && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        // right down
        i = row + 1;
        j = col + 2;
        if (i < n && j < n && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        // left up
        i = row - 1;
        j = col - 2;
        if (i >= 0 && j >= 0 && board[i][j] == num + 1) return helper(board, i, j, num + 1);

        // left  down
        i = row + 1;
        j = col - 2;
        if (i < n && j >= 0 && board[i][j] == num + 1) return helper(board, i, j, num + 1);
        return false;
    }
}
