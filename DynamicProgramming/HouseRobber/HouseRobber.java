/**
 * House Robber using Memorization 
 * Maximum sum of Non adjacent element
 * 
 */
import java.util.Arrays;
import java.util.Scanner;
public class HouseRobber {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
       System.out.println(house(0,n-1,arr,dp)) ;

    }
    public static int house(int i,int v,int[] arr, int [] dp){
        if(i==v){
            return arr[i];
        }
        if(i>v){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int r=arr[i]+house(i+2,v,arr,dp);
        int d=house(i+1, v, arr, dp);
        dp[i]=Math.max(r,d);
        return dp[i];
    }
}