import java.util.*;
public class RodCutting {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int[] price=new int[n];
      for(int i=0;i<n;i++){
          price[i]=in.nextInt();
      }
      in.close();
      getMax(price,n);
  }  
  public static int getMax(int price[], int n){
    int dp[][]=new int[n][price.length+1];
    
        for(int i=0;i<n+1;i++){
            for(int j=0;j<price.length+1;j++){
                if(j==0||i==0){
                    dp[i][j]= 0;
                }
                else if(j>=i){
                    dp[i][j] = Math.max(dp[i-1][j], price[i-1]+dp[i][j-i]);
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n-1][price.length]; 
  }
}
