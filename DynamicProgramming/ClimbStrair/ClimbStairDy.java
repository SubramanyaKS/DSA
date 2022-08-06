package ClimbStrair;
/**
 * Dynamic Program Approach for Climbing Stair Problem.
 * 
 */
import java.util.*;
public class ClimbStairDy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        System.out.println(ways(n));
    }
    public static int ways(int n){
        int[] dp= new int[n+1];
        for(int i=0;i<n+1;i++){
            dp[i]=-1;
        }
        return climb(n,dp);
    }
    public static int climb(int n,int[] dp){
        if(n<=1){
            return dp[n]=1;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        dp[n]=climb(n-1,dp)+climb(n-2,dp);
        return dp[n];

    }
    
}