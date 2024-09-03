package dynamicProgramming;
import java.util.Arrays;
import java.util.Scanner;

public class rob {
    public static int calls = 0;
    private static int robber(int[] houses, int ind){
        calls++;
        if(ind==houses.length-1)return houses[ind];
        if(ind>=houses.length)return 0;
        int pick = houses[ind]+robber(houses,ind+2);
        int not_pick = robber(houses, ind+1);
        return Math.max(pick,not_pick);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        System.out.println(robber(arr,0));
        System.out.println(calls);
        calls = 0;
        System.out.println(robberDp(arr,0,dp));
        System.out.println(calls);
    }
    private static int robberDp(int[] houses, int ind, int dp[]){
        calls++;
        if(ind==houses.length-1)return houses[ind];
        if(ind>=houses.length)return 0;

        if(dp[ind]!=-1)return dp[ind];
        int pick = houses[ind]+robberDp(houses,ind+2,dp);
        int not_pick = robberDp(houses, ind+1,dp);
        dp[ind] = Math.max(pick,not_pick);
        return dp[ind];
    }
}
