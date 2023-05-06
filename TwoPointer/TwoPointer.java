/** Pair sum problem example */
import java.util.Scanner;

public class TwoPointer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int k=in.nextInt();
        in.close();
        TwoPointer tp = new TwoPointer();
        int s=tp.twopair(arr,n,k);
        if(s==1){
            System.out.println("Present");
        }else{
            System.out.println("Not Present");
        }

    }
    public int twopair(int arr[],int n, int k){
        //initialize two pointers to first and last index
        int i=0;
        int j=n-1;
        //go through loop untile the first index value is greater then second
        while(i<j){
            //if sum of array first index value and array second index value is equal to target
            if(arr[i]+arr[j]==k){
                return 1;
            }
            //if sum is less then target increase first pointer
            else if(arr[i]+arr[j]<k){
                i++;
            }
            //else decrease the last pointer
            else{
                j--;
            }
        }
        return 0;
    }
}