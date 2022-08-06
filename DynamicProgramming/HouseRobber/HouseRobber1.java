/**
 * House Robber using tabulation
 * Maximum sum of Non adjacent element
 * 
 */
package HouseRobber;
import java.util.Arrays;
import java.util.Scanner;

public class HouseRobber1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        in.close();
        int dp[] = new int[n+1];
        Arrays.fill(dp,0);
        System.out.println(rob(arr,dp));
    }
    public static int rob(int arr[],int dp[]){
        int n=arr.length;
        dp[n-1]=arr[n-1];
        dp[n]=0;
        for(int i=n-2;i>=0;i--){
            int r=arr[i]+dp[i+2];
            int d=dp[i+1];
            dp[i]=Math.max(r,d);
        }
        return dp[0];

    }

    
}
