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
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        house(0,n-1,arr,dp);

    }
    public static int house(int i,int v,int[] arr, int [] dp){

    }
}