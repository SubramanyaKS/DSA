package UniquePaths;

import java.util.Scanner;

public class UniquePaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //row
        int m=in.nextInt();
        //column
        int n=in.nextInt();
        in.close();
        int dp[][]= new int [m+1][n+1];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                dp[i][j]=-1;
            }
        }
        System.out.println(paths(0,0,m-1,n-1,dp));

    }
    public static int paths(int cr,int cc,int tr,int tc,int[][] dp){
        /**
         * cc= current column
         * cr= current row
         * tc= target column
         * tr = target row
         */
        if(cr==tr && cc==tc){
            return 1;
        }
        if(cr>tr || cc>tc){
            return 0;
        }
        if(dp[cr][cc]!=-1){
            return dp[cr][cc];
        }
        dp[cr][cc]=paths(cr+1, cc, tr, tc, dp)+paths(cr, cc+1, tr, tc, dp);
        return dp[cr][cc];
    }
    
}
