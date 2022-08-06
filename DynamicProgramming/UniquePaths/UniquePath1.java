package UniquePaths;

import java.util.Scanner;

public class UniquePath1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        in.close();
        int dp[][]= new int [m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=0;
            }
        }
        System.out.println(path(m,n,dp));

    }
    public static int path(int m, int n, int[][] dp){
        for(int i=m-1;i>=0;i--){
            dp[i][n-1]=1;
        }
        for(int i=n-1;i>=0;i--){
            dp[m-1][i]=1;  
        }
        for(int cr=m-2;cr>=0;cr--){
            for(int cc=n-2;cc>=0;cc--){
                dp[cr][cc]=dp[cr+1][cc]+dp[cr][cc+1];
            }
        }
        return dp[0][0];

    }
}
