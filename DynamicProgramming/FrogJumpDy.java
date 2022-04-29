import java.util.*;
public class FrogJumpDy {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        int dp[]= new int[n];
        Arrays.fill(dp, -1);
        int p=jump(n-1,arr,dp);
        System.out.println(p);

    }
    public static int jump(int i,int[] arr,int[] dp){
        if(i==0){
            return 0;
        }
        if(dp[i]!=-1){
            return dp[i];
        }
        int two=Integer.MAX_VALUE;
        int one=jump(i-1,arr,dp)+Math.abs(arr[i]-arr[i-1]);
        if(i>1){
            two=jump(i-2,arr,dp)+Math.abs(arr[i]-arr[i-2]);

        }
        return dp[i]=Math.min(one,two);

    }
}
