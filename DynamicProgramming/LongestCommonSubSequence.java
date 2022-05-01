import java.util.*;
public class LongestCommonSubSequence {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1=in.next();
        String s2=in.next();
        int m=s1.length();
        int n=s2.length();
        in.close();
        System.out.println(lcs(s1,s2,m,n));
    }
    public static int lcs(String a,String b,int m,int n){
        char X[] =a.toCharArray();
        char Y[]=b.toCharArray();
       int dp[][] = new int[m+1][n+1];
       for(int i=0;i<=m;i++){
           for(int j=0;j<=n;j++){
                if(i==0||j==0){
                    dp[i][j]=0;
                }
                else if(X[i-1]==Y[j-1]){
                    dp[i][j]=dp[i-1][j-1]+1;
                }
                else{
                    dp[i][j]=Math.max(dp[i-1][j],dp[i][j-1]);
                }


           }
       }
       return dp[m][n];
    }
}
