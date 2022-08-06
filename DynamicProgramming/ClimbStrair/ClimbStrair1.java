/**
 * Climb Strair using tabulation method
 * 
 * TC O(N) SC  O(N)
 */
package ClimbStrair;
import java.util.Arrays;
import java.util.Scanner;

public class ClimbStrair1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        int dp[]=new int [n+2];
        Arrays.fill(dp,0);
        System.out.println(climb(n,dp));

    }
    public static int climb(int n,int[] dp){
        dp[n+1]=0;
        dp[n]=1;
        for(int i=n-1;i>=0;i--){
            dp[i]=dp[i+1]+dp[i+2];
        }
        return dp[0];

    }
}
