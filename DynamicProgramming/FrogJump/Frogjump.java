/**
 * Frog Jump using Memorization
 */
import java.util.Arrays;
import java.util.Scanner;
public class Frogjump {

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
        jump(0,n-1,height,dp);


    }
    public static int jump(int c,int t,int[] height,int[] dp){
        if(c>t){
            return 1000000;

        }
        if(c==t){
            return 0;
        }
        if(dp[c]!=-1){
            return dp[c];
        }
        int one=Math.abs(height[c+1]-height[c])+jump(c+1, t, height, dp);
        int two=Math.abs(height[c+2]-height[c])+jump(c+2, t, height, dp);
        return dp[c]=Math.min(one, two);

    }
}