import java.util.*;
public class ShellSort {
  public static void main(String[] args) {
      Scanner in = new Scanner(System.in);
      int n=in.nextInt();
      int arr[] = new int[n];
      for(int i=0;i<n;i++){
          arr[i]=in.nextInt();
      }
      in.close();
      sortshell(arr,n);
      for(int i=0;i<n;i++){
          System.out.print(arr[i]+" ");
      }

  }  
  public static void sortshell(int []arr,int n){

    for (int gap = n/2; gap > 0; gap /= 2)
    {
       
        for (int i = gap; i < n; i += 1)
        {
            
            int temp = arr[i];

            int j;
            for (j = i; j >= gap && arr[j - gap] > temp; j -= gap)
                arr[j] = arr[j - gap];

            arr[j] = temp;
        }
    }
  }
}
