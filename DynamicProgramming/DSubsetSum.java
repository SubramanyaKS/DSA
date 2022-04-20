import java.util.*;
public class DSubsetSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=in.nextInt();
        in.close();
        if(dysubsetSum(arr,sum,n)==true){
            System.out.println("Presence of sum");
        }
        else{
            System.out.println("No Presence of sum");
        }
    }
    public static boolean dysubsetSum(int[] arr,int sum,int n){
        boolean su[][] = new boolean[sum+1][n+1];
        for (int i = 0; i <= n; i++)
            su[0][i] = true;
 
        for (int i = 1; i <= sum; i++)
            su[i][0] = false;
 
        for (int i = 1; i <= sum; i++) {
            for (int j = 1; j <= n; j++) {
                su[i][j] = su[i][j - 1];
                if (i >= arr[j - 1])
                    su[i][j] = su[i][j]|| su[i - arr[j - 1]][j - 1];
            }
        }
        return su[sum][n];
    }
}
