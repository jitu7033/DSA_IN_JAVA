package BackTracking;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.locks.AbstractOwnableSynchronizer;

public class geeksforgeeks {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int n = fs.nextInt();
        boolean visited[][] = new boolean[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                visited[i][j] = false;
            }
        }
        int board[][] = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = fs.nextInt();
            }
        }
        ArrayList<String>ans=  new ArrayList<>();
        solve(board,n,0,0,visited,ans,"");
        System.out.println(ans);

    }
    public static void solve(int board[][], int n,int i, int j, boolean visited[][], ArrayList<String >ans,String temp) {

        if(i<0 || j<0)return;
        if(i>n-1 || j>n-1)return;
        if(i==n-1 && j==n-1){
            ans.add(temp);
            return;
        }
        if(board[i][j]==1)return;
        if(visited[i][j]==true)return;

            visited[i][j] = true;
            if (i > 0) solve(board,n, i - 1, j, visited, ans, temp+ "U");
            if (j > 0) solve(board,n, i, j - 1, visited, ans, temp + "L");
            if (i < n-1) solve(board,n, i + 1, j, visited, ans, temp + "D");
            if (j < n-1) solve(board,n, i, j + 1, visited, ans, temp + "R");
            visited[i][j] = false;

    }
}
