/**
 * Climb Stair using Memorization Technique
 * 
 * TC O(N) SC O(N)+O(N)
 */
package ClimbStrair;
import java.util.Arrays;
import java.util.Scanner;

public class ClimbStrair {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        int dp[]=new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(noOfWaysClimb(0,n,dp));
    }
    public static int noOfWaysClimb(int i,int n,int[] dp){
        if(i>n){
            return 0;
        }
        if(i==n){
            return 1;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        return dp[i]=noOfWaysClimb(i+1, n, dp)+noOfWaysClimb(i+2, n, dp);
    }
}