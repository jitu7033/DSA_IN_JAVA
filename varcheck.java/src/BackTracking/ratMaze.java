package BackTracking;

import java.util.Scanner;

public class ratMaze {
    public static void main(String[] args) {
        Scanner fs = new Scanner(System.in);
        int row = fs.nextInt();
        int col = fs.nextInt();
        int maze[][] = new int[row][col];
        for(int i=0; i<row; i++){
            for(int j=0; j<col; j++){
                maze[i][j] = fs.nextInt();
            }
        }
        boolean isVisited[][] = new boolean[row][col];
//        int count = maze(1,1,row,col);
//        System.out.println(count);
//        printPath(1,1,row,col," ");
//        fourPath(0,0,row-1,col-1,"",isVisited);
        pathDeadMaze(0,0,row-1,col-1,"",maze,isVisited);
    }

    private static int maze(int sr, int sc, int er, int ec) {
        if(sr>er || sc>ec){
            return 0;
        }
        if(sr==er && sc==ec){
            return 1;
        }
        int rowWays = maze(sr+1,sc,er,ec);
        int colWays = maze(sr,sc+1,er,ec);
        return rowWays+colWays;
    }
    private static void  printPath(int sr,int sc, int er, int ec,String s){
        if(sr>er || sc>ec){
            return;
        }
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        printPath(sr+1,sc,er,ec,s+"R");
        printPath(sr,sc+1,er,ec,s+"D");
    }
    public static void fourPath(int sr,int sc, int er, int ec, String s, boolean[][]isVisited){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec)return;
        if(isVisited[sr][sc]==true)return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        isVisited[sr][sc] = true;
        // go right
        fourPath(sr,sc+1,er,ec,s+"R",isVisited);
        // go down
        fourPath(sr+1,sc,er,ec,s+"D",isVisited);
        //go left
        fourPath(sr,sc-1,er,ec,s+"L",isVisited);
        // go up
        fourPath(sr-1,sc,er,ec,s+"U",isVisited);
        isVisited[sr][sc] = false;

    }
    public static void pathDeadMaze(int sr,int sc, int er, int ec, String s, int [][]maze,boolean isVisited[][]){
        if(sr<0 || sc<0){
            return;
        }
        if(sr>er || sc>ec){
            return;
        }
        if(isVisited[sr][sc]==true)return;
        if(sr==er && sc==ec){
            System.out.println(s);
            return;
        }
        if(maze[sr][sc]==0)return;
        isVisited[sr][sc] = true;
        pathDeadMaze(sr,sc+1,er,ec,s+"R",maze,isVisited);
        pathDeadMaze(sr+1,sc,er,ec,s+"D",maze,isVisited);
        pathDeadMaze(sr,sc-1,er,ec,s+"L",maze,isVisited);
        pathDeadMaze(sr-1,sc,er,ec,s+"U",maze,isVisited);
        isVisited[sr][sc] = false;
    }
}
