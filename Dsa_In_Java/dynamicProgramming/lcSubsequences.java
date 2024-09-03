package dynamicProgramming;

public class lcSubsequences {

    static int  longestCommonSubsequenceOfTwoString(String x, String y, int n, int m){
        // base case
        if(n==0||m==0)return 0;
        //choice diagram
        if(x.charAt(n-1)==y.charAt(m-1)){
            return 1+longestCommonSubsequenceOfTwoString(x,y,n-1,m-1);
        }
        return Math.max(longestCommonSubsequenceOfTwoString(x,y,n-1,m),longestCommonSubsequenceOfTwoString(x,y,n,m-1));
    }
    //using memorization method
    static int longestCommonSubsequenceOfTwoStringMemorization(String x,String y, int n, int m, int  dp[][]){
        if(n==0 || m==0){
            return 0;
        }
        if(dp[m][n]!=-1)return dp[m][n];

        if(x.charAt(n-1)==y.charAt(m-1)){
            return dp[m][n] = 1+longestCommonSubsequenceOfTwoStringMemorization(x,y,n-1,m-1,dp);
        }
        return dp[m][n] = Math.max(longestCommonSubsequenceOfTwoStringMemorization(x,y,n-1,m,dp)
                                    ,longestCommonSubsequenceOfTwoStringMemorization(x,y,n,m-1,dp));
    }
    // proper dp
    static void lCSOfTwoStringDp(String x,String y){
        int n = x.length();
        int m = y.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                if(i==0 || j==0)dp[i][j] = 0;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i][j-1],dp[i-1][j]);
                }
            }
        }
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(dp[n][m]);

    }
    public static void main(String[] args) {
        String x = "aaa";
        String y = "ab";
        int n = x.length();
        int m = y.length();
        System.out.println(longestCommonSubsequenceOfTwoString(x,y,n,m));
        int dp[][] = new int[m+1][n+1];
        for(int i=0; i<=m; i++){
            for(int j=0; j<=n; j++){
                dp[i][j] = -1;
            }
        }
        System.out.println(longestCommonSubsequenceOfTwoStringMemorization(x,y,n,m,dp));
        lCSOfTwoStringDp(x,y);
    }
}
