import java.util.*;
public class SubSequenceSolution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
	    List<Integer> l = new ArrayList<>();
	    int n=in.nextInt();
	    int arr[] = new int[n];
	    for(int i=0;i<n;i++){
	        arr[i]=in.nextInt();
	    }
	    subSequence(0,l,arr);
        in.close();
    }
    public static void subSequence(int i, List<Integer> l, int arr[]){
	    if(i>=arr.length){
	        System.out.println(l);
	        return;
	    }
	    l.add(arr[i]);
	    subSequence(i+1,l,arr);
	    l.remove(Integer.valueOf(arr[i]));
	    subSequence(i+1,l,arr);	    
	}
}
