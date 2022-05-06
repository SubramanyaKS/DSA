import java.util.*;
public class MergeSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        mergesort(arr,0,arr.length-1);
        for(int j=0;j<n;j++){
            System.out.print(arr[j]);
        }
    }
    public static void mergesort(int arr[],int l,int r){
        if(l<r){
            int m=l+(r-1)/2;
            mergesort(arr, l, m);
            mergesort(arr, m+1, r);
            merge(arr,l,m,r);
        }
    }
    public static void merge(int arr[],int l,int m,int r){
        //find sizes of two subarrays to be merged
        int n1=m-l+1;
        int n2=r-m;
        int L[]=new int[n1];
        int R[] = new int[n2];
        for(int i=0;i<n1;i++){
            L[i]=arr[l+i];
        }
        for(int j=0;j<n2;j++){
            R[j]=arr[m+1+j];
        }
        //merge temp arrays
        int p=0,q=0;
        int k=l;
        while(p<n1 && q<n2){
            if(L[p]<=R[q]){
                arr[k]=L[p];
                p++;
            }
            else{
                arr[k]=R[q];
                q++;
            }
            k++;
        }
        while(p<n1){
            arr[k]=L[p];
            p++;
            k++;
        }
        while(q<n2){
            arr[k]=R[q];
            q++;
            k++;
        }

    }
}
