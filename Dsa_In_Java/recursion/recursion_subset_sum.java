import java.util.ArrayList;

public class recursionsubsesum {

    static  void subsetSum(int [] arr, int n, int idx,int sum){
        //bse cse;
        if(idx>=n){
            System.out.print(sum+" ");
            return;
        }

        //recursive work;
        subsetSum(arr,n,idx+1,sum+arr[idx]);
        subsetSum(arr,n,idx+1,sum);
    }

    public static void main(String[] args) {
        int [] arr = {1,2};
        subsetSum(arr,arr.length,0,0);

    }
}
