import java.util.*;
public class BubbleSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        bubbleSort(arr);
        for(int j=0;j<n;j++){
           System.out.print(arr[j]+" ");
        }

    }
    public static void bubbleSort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    swap(arr,j);
                }
            }
        }
    }
    public static void swap(int arr[],int j){
        int temp=arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=temp;
    }
}