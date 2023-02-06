import java.util.*;
public class SubSetSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
		int n=in.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++){
		    arr[i]=in.nextInt();
		}
		int sum=0;
        in.close();
		ArrayList<Integer> subset =new ArrayList<>();
		subsetSum(0,arr,sum,subset);
		Collections.sort(subset);
		System.out.println(subset);
    }
    public static void subsetSum(int i, int[] arr, int sum, ArrayList<Integer> subset){
	    if(i==arr.length){
	        subset.add(sum);
	        return;
	    }
	    
	    subsetSum(i+1,arr,sum+arr[i],subset);
	    subsetSum(i+1,arr,sum,subset);
	}
}
