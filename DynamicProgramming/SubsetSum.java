import java.util.Scanner;
public class SubsetSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int sum=in.nextInt();
        in.close();
        if(subsetSum(arr,sum,n)==true){
            System.out.println("Presence of sum");
        }
        else{
            System.out.println("No Presence of sum");
        }
    }
    public static boolean subsetSum(int[] arr,int sum, int n){
        if(sum==0){
            return true;
        }
        if(n==0){
            return false;
        }
        if(arr[n-1]>sum){
            return subsetSum(arr, sum, n-1);
        }
        return subsetSum(arr, sum, n-1)|| subsetSum(arr, sum-arr[n-1], n-1);

    }

    
}
