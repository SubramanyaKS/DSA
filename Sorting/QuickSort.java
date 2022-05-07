/** Quick Sort 
 * uses idea of divide and conqure
*/
import java.util.*;
public class QuickSort {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        sortquick(arr,0,n-1);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortquick(int[] arr,int low,int high){
        if(low<high){
            int p=partition(arr,low,high);
            sortquick(arr, low, p-1);
            sortquick(arr, p+1, high);
        }
    }
    public static int partition(int arr[],int low,int high){
        int p=arr[high];
        int i=(low-1);
        for(int j=low;j<=high;j++){
            if(arr[j]<p){
                i++;
                swap(arr, i, j);

            }
            
        }
        swap(arr, i+1, high);
        return (i+1);
    }
    /**Swap function */
    public static void swap(int arr[],int i,int j) {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
}
