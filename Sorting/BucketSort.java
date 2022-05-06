import java.util.*;
public class BucketSort {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Number of element in an Array");
        int n =in.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the element of the Array");
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        bucketsort(arr);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]);
        }
    }
    public static void bucketsort(int arr[]){
        int p=arr.length;
        int count[]=new int[p];
        for(int i=0;i<p;i++){
            count[i]=0;
        }
        for(int i=0;i<p;i++){
            (count[arr[i]])++;
        }
        for(int i=0,j=0;i<p;i++){
            for(;count[i]>0;(count[i])--){
                arr[j++]=i;
            }
            
        }
    }
}
