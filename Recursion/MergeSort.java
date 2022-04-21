import java.util.*;
public class MergeSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        Merge(arr,0,n);
    }
    public static void Merge(int arr[],int l,int n){
        if(n>0){
             int m=n/2;
            Merge(arr,l, m-1);
            Merge(arr,m, n);
            SortMerge(arr,m,n);
        }
    }
    public static void SortMerge(int[] arr,int m, int n){
        int i=0;
        int j=m;
        for(int k=0;k<n;k++){
            if(j>n){
                
            }
        }

    }
}
