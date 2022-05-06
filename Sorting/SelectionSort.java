import java.util.*;
public class SelectionSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        selectionsort(arr);
        for(int k=0;k<n;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void selectionsort(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
                
            }
            int temp =arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

        }
    }
}
