import java.util.*;
public class Permutations{
    public static List<List<Integer>>permutation(int[] nums){
	    List<List<Integer>> ans= new ArrayList();
	    List<Integer> ds = new ArrayList();
	    boolean f [] = new boolean[nums.length];
	    recursivePermutation(nums,ans,ds,f);
	    return ans;
	}
	public static void recursivePermutation(int[] nums, List<List<Integer>> ans, List<Integer> ds, boolean[] f){
	    if(ds.size()==nums.length){
	        ans.add(new ArrayList<>(ds));
	        return;
	    }
	    for(int i=0;i<nums.length;i++){
	        if(!f[i]){
	            f[i]=true;
	            ds.add(nums[i]);
	            recursivePermutation(nums,ans,ds,f);
	            ds.remove(ds.size()-1);
	            f[i]=false;
	            
	        }
	    }
	}
    public static void main(String[] args) {
        //	System.out.println("Hello World");
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            int nums[] = new int[n];
            for(int i=0;i<n;i++){
                nums[i]=in.nextInt();
            }
            in.close();
            List<List<Integer>> l = permutation(nums);
            System.out.println(l);
        }
}