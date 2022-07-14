/**
 * Frog Jump using tabulaion
 */
import java.util.Arrays;
import java.util.Scanner;
public class FrogJump1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=in.nextInt();
        }
        in.close();
        int dp[] = new int[n];
        Arrays.fill(dp, -1);
        System.out.println(frog(n,height,dp));


    }
    public static int frog(int n,int[] height,int[] dp){
        dp[n]=100000;
        dp[n-1]=0;
        for(int i=n-2;i>=0;i--){
            int one = Math.abs(height[i+1]-height[i]+dp[i+1]);
            int two = Math.abs(height[i+2]-height[i]+dp[i+2]);
            dp[i]=Math.min(one,two);

        }
        return dp[0];
    }
}
