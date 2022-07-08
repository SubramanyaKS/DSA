/**
 * Fibonnaci series using Tabulation method
 */
import java.util.Arrays;
import java.util.Scanner;

public class fibonnaci1{
    public static void main(String[] main){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.close();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib1(n,dp));
    }
    public static int fib1(int n,int[] dp){
        dp[0]=0;
        dp[1]=1;
        for(int i=2;i<=n;i++){
            dp[i]=dp[i-1]+dp[i-2];
        }
        return dp[n];
    }
}