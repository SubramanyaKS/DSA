/**
 * Fibonnaci Series ussing memorization Technique.
 */
/** 
 * TC o(N) SC O(N)+O(N)
 */
package fibonnaci;
import java.util.Arrays;
import java.util.*;
public class fibonnaci{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        int dp[] = new int[n+1];
        Arrays.fill(dp, -1);
        System.out.println(fib(n,dp));
    }
    public static int fib(int n,int[] dp){
        if(n==0||n==1){
            return n;
        }
        if(dp[n]!=-1){
            return dp[n];
        }
        return dp[n]=fib(n-1,dp)+fib(n-2,dp);
    }
}