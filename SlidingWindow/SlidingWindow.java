import java.util.Scanner;

public class SlidingWindow{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = in.nextInt();
        }
        int k=in.nextInt();
        in.close();
        System.out.println(maxSum(arr,n,k));
    }
    public static int maxSum(int arr[], int n, int k){
        if(n<k){
            return -1;
        }
        int max_sum=0;
        for(int i=0;i<k;i++){
            max_sum+=arr[i];
        }
        int cur_sum=max_sum;
        for(int i=k;i<n;i++){
            cur_sum+=arr[i]-arr[i-k];
            max_sum=Math.max(cur_sum,max_sum);
        }
        return max_sum;
    }
}