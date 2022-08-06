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
        int dp[][]= new int [m][n];
        for(int i=0;i<n;i++){
            dp[m][i]=-1;
        }
        paths(0,0,m-1,n-1,dp);

    }
    public static int paths(int cr,int cc,int tr,int tc,int[][] dp){
        if()
    }
    
}
