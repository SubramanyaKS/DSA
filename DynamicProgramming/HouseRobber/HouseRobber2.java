/**
 * House Robber using Space Optimization in tabulation
 * Maximum sum of Non adjacent element
 * 
 */
package HouseRobber;
import java.util.Scanner;

public class HouseRobber2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();

        }
        in.close();
        System.out.println(hrob(arr));

    }
    public static int hrob(int [] arr){
        int n= arr.length;
        int next2=0;
        int next1=arr[n-1];
        for(int i=n-2;i>=0;i++){
            int r=arr[i]+next2;
            int d=next1;
            int c=Math.max(r,d);
            next2=next1;
            next1=c;
        }
        return next1;
    }
    
}
