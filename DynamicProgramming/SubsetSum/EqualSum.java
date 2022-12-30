package SubsetSum;
import java.util.*;
public class EqualSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        if (canDivide(arr, n) == 1)
            System.out.println("Can be divided into two subsets of equal sum");
        else
            System.out.println("Can not be divided into two subsets of equal sum");

    }
    public static int canDivide(int[] arr,int n){
        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += arr[i];

        if (sum % 2 != 0)
            return 0;

        int dp[][] = new int[n + 1][sum + 1];
        for (int row[] : dp)
            Arrays.fill(row, -1);
 
        return isSubsetSum(arr, n, sum / 2, dp);
    }
    public static int isSubsetSum(int[] arr, int n, int sum, int[][] dp){
        
        if (sum == 0)
            return 1;
        if (n == 0 && sum != 0)
            return 0;

        if (dp[n][sum] != -1) {
            return dp[n][sum];
        }
 
        if (arr[n - 1] > sum)
            return isSubsetSum(arr, n - 1, sum, dp);

        if (isSubsetSum(arr, n - 1, sum, dp) != 0 || isSubsetSum(arr, n - 1, sum - arr[n - 1], dp)!= 0)
            return dp[n][sum] = 1;
        return dp[n][sum] = 0;
    }   
}
