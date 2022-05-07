import java.util.*;
public class RadixSort {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        in.close();
        sortradix(arr,n);
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortradix(int[] arr,int n){
        int m=getMax(arr,n);
        for(int i=1;m/i>0;i++){
            sortcount(arr,n,i);
        }
    }
    public static int getMax(int arr[],int n){
        int max=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    public static void sortcount(int arr[],int n,int i){
        int out[]=new int[n];
        int j;
        int count[] = new int[10];
        Arrays.fill(count, 0);
        for(j=0;j<n;j++){
            count[(arr[j]/i)%10]++;
        }
        for(j=1;j<10;j++){
            count[j]+=count[j-1];
        }
        for(j=n-1;j>=0;j--){
            out[count[(arr[j]/i)%10]-1]=arr[j];
            count[(arr[j]/i)%10]--;
        }
        for(j=0;j<n;j++){
            arr[j]=out[j];
        }
    }

}
