package dynamicProgramming.lcs;

public class printLcs {

    static void shortestCommonSuperSequence(String x, String y) {
        int n = x.length();
        int m = y.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                if (i == 0 || j == 0) dp[i][j] = 0;
            }
        }
        String s = "";
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {

                if (x.charAt(i - 1) == y.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }

            }
        }
        int i = n;
        int j = m;
        while (i > 0 && j > 0) {
            if (x.charAt(i - 1) == y.charAt(j - 1)) {
                s += x.charAt(i - 1);
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                s += x.charAt(i - 1);
                i--;
            } else {
                s += y.charAt(j - 1);
                j--;
            }
        }
        StringBuilder sb = new StringBuilder(s);
        if (i > 0) {
            for (int k = i - 1; k >= 0; k--) {
                sb.append(x.charAt(k));
            }
        } else {
            for (int k = j - 1; k >= 0; k--) {
                sb.append(y.charAt(k));
            }
        }
        sb.reverse();
        System.out.println(sb);

    }
    static void longestCS(String x,String y){
        String ans = "";
        int n = x.length();
        int m = y.length();
        int dp[][] = new int[n+1][m+1];
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                dp[i][j] = 0;
            }
        }
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(x.charAt(i-1)==y.charAt(j-1)){
                    dp[i][j] = 1+dp[i-1][j-1];
                }
                else{
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n][m]);
        for(int i=0; i<=n; i++){
            for(int j=0; j<=m; j++){
                System.out.print(dp[i][j]+" ");
            }
            System.out.println();
        }
        int i = n;
        int j = m;
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                ans+=x.charAt(i-1);
                i--;
                j--;
            }
            else if(dp[i][j-1]>dp[i-1][j]){
                j--;
            }
            else{
                i--;
            }
        }
        System.out.println(ans);
    }

    static void printLcSequence(String x, String y){
        String ans = "";
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
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }
        System.out.println(dp[n][m]);
        int i =n;
        int j = m;
        while(i>0 && j>0){
            if(x.charAt(i-1)==y.charAt(j-1)){
                ans+=x.charAt(i-1);
                j--;
                i--;
            }
            else if(dp[i][j-1]>dp[i-1][j]){
                j--;
            }
            else{
                i--;
            }
        }
        for(i=ans.length()-1; i>=0; i--) {
            System.out.print(ans.charAt(i));
        }
        System.out.println();
    }
    public static void main(String[] args) {
//        String x = "TWXFUABGBNLTBFNSUVQW";
//        String y = "GPNJILFXJUIZPLTVUIB";
//        printLcSequence(x,y);
//        System.out.println(x.length()+" "+y.length());
//        shortestCommonSuperSequence(x,y);
        String x = "ahbgdc";
        String y = "axc";
        longestCS(x,y);
    }
}
