import java.util.*;
public class CoinChangeProblem {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int total=in.nextInt();
        in.close();
        int dp[][]= new int[n+1][total+1];
        for(int[] row:dp)
            Arrays.fill(row,-1);
        System.out.println(coinChange(arr,total,n,dp));
    }
    public static int coinChange(int[] arr,int total,int n, int[][] dp){
        if(total==0){
            return dp[n][total]=1;
        }
        if(n==0){
            return 0;
        }
        if(dp[n][total]!=-1){
            return dp[n][total];
        }
        if(arr[n-1]<=total){
            return dp[n][total]=coinChange(arr, total-arr[n-1],n, dp)+coinChange(arr, total, n-1, dp);
        }
         return dp[n][total]=coinChange(arr, total, n-1, dp);

    }

    
}