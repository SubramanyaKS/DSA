/**
 * KnapSack Recursion by Brute-Force Algorithm
 */
import java.util.*;
public class KnapSack {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int val[]=new int[n];
        int w[]=new int[n];
        for(int i=0;i<n;i++){
            val[i]=in.nextInt();
        }
        for(int j=0;j<n;j++){
            w[j]=in.nextInt();
        }
        int W=in.nextInt();
        in.close();
        System.out.println(knapsack(W,val,w,n));
    }
    public static int knapsack(int W,int[] val,int[] w,int n){
        //Base Condition
        if(n==0||W==0){
            return 0;
        }
        if(w[n-1]>W){
            return knapsack(W, val, w, n-1);
        }
        return Math.max(val[n-1]+knapsack(W-w[n-1], val, w, n-1), knapsack(W, val, w, n-1));
    }
}
/**
 * Time complexity: O(2^n)
 * Auxiliary Space O(1)
 */