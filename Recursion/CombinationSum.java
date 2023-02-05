import java.util.*;
public class CombinationSum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int arr[] = new int[n];
    for(int i=0;i<n;i++){
        arr[i]=in.nextInt();
    }
    int t= in.nextInt();
    in.close();
    List<List<Integer>> list = combinationS(arr,t);
    System.out.println(list);
    }
    public static List<List<Integer>> combinationS(int[] arr, int target){
        List<List<Integer>> ans = new ArrayList<>();
        findCombination(0,arr,target,ans, new ArrayList<>());
        return ans;
    }
    public static void findCombination(int i, int[] arr, int target, List<List<Integer>>list,List<Integer> ds){
        if(i==arr.length){
            if(target==0){
                list.add(new ArrayList<>(ds));
            }
            return;
        }
        if(arr[i]<=target){
            ds.add(arr[i]);
            findCombination(i, arr, target-arr[i], list, ds);
            ds.remove(ds.size()-1);
        }
        findCombination(i+1, arr, target, list, ds);
    }
}
