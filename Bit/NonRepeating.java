/**
 * Find the element that appears once in an array
 *  where every other element appears twice
 */
public class NonRepeating {
    public static void main(String[] args) {
        int arr[] ={6, 3, 5, 4, 5, 3, 4};
        System.out.println(findNon(arr,arr.length));
    }
    public static int findNon(int[] arr, int n){
        int res=arr[0];
        for(int i=1;i<n;i++){
            res=res^arr[i];
        }
        return res;
    }
    
}
