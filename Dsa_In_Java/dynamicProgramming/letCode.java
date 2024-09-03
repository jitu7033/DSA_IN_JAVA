package dynamicProgramming;

import javax.naming.InsufficientResourcesException;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class letCode {

    //LetCode  2035.  Partition arrays into two arrays to minimize sum difference

    static boolean check(int arr[], int sum, int eleLen, int n, boolean dp[][]){
        if(sum==0 && eleLen==0) return true;
        if(n==0) return  false;
        if(eleLen==0) return false;
        if(!dp[n][sum])return dp[n][sum];
        if(sum>=arr[n-1]){
            dp[n][sum] = check(arr,sum-arr[n-1],eleLen-1,n-1,dp)||check(arr,sum,eleLen,n-1,dp);
        }
        else{
            dp[n][sum] = check(arr,sum,eleLen,n-1,dp);
        }
        return dp[n][sum];
    }


    public static void main(String[] args) {
        int arr[] = {-68,55,-23,13,-20,-14};
    }

}
