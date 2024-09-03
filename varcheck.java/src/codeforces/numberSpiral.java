package codeforces;

public class numberSpiral {

    static void spiralNumber(int row, int column){
        int ans = 0;
        if(column>row){
            if(column%2!=0){
                ans = (column*column)-row+1;
            }
            else{
                ans = ((column-1)*(column-1)+row);
            }
            System.out.println(ans);
        }
        else{
            if (row % 2 != 0){
                ans = ((row-1)*(row-1))+column;
            }
            else{
                ans = ((row*row)-column+1);
            }
            System.out.println(ans);
        }
    }
    public static void main(String[] args) {

        int row = 2;
        int column = 1;

        spiralNumber(row,column);

    }
}
