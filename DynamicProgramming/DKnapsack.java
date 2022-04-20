/**
 * KnapSack using top down Approach Dynamic Programming
 */
import java.util.*;
public class DKnapsack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int val[]=new int[n];
        int w[]=new int[n];
        for(int i=0;i<n;i++){
            val[i]=in.nextInt();
        }
        for(int j=0;j<n;j++){
            w[j]=in.nextInt();
        }
        int W=in.nextInt();
        in.close();
        System.out.println(knapsack1(W,val,w,n));
    }
    public static int knapsack1(int W,int[] val,int[] w,int n){
        //Base Condition
        int dp[][]=new int[n+1][W+1];
        for(int i=0;i<n+1;i++){
            for(int j=0;j<W+1;j++){
                dp[i][j]=-1;
            }
        }
        return dyknapsack(W,val,w,n,dp);


    }
    public static int dyknapsack(int W,int[] val, int[] w,int n,int[][] dp){
        //Base Condition
        if(n==0||W==0){
            return 0;
        }
        if(dp[n][W]!=-1){
            return dp[n][W];
        }
        if(w[n-1]>W){
            return dp[n][W]=dyknapsack(W, val, w, n-1, dp);
        }
        return dp[n][W]=Math.max(val[n-1]+dyknapsack(W-w[n-1], val, w, n-1, dp),dyknapsack(W, val, w, n-1, dp));
    }
}
