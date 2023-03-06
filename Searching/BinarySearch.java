import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int ele = in.nextInt();
        in.close();
        Arrays.sort(arr);
        
        BinarySearch b = new BinarySearch();
        if(b.search(arr,ele)){
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
    public boolean search(int arr[], int ele){
        int i=0;
        int j= arr.length-1;
        while(i<=j){
            int mid = (i+j)/2;
            if(arr[mid]==ele){
                return true;
            }
            else if(arr[mid]<ele){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
        }
        return false;
    }

}