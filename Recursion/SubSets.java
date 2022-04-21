import java.util.ArrayList;
//import java.util.Scanner;
//import java.util.*;
public class SubSets {
    public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> nums) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        ArrayList<Integer> res = new ArrayList<>();
        generateSubset(nums,0,res,ans);
        return ans;
    }
    public static void generateSubset(ArrayList<Integer>nums,int c,ArrayList<Integer> res, ArrayList<ArrayList<Integer>> ans){
        if(c>=nums.size()){
            ans.add(res);
            return;
        }
        int cv = nums.get(c);
        
        res.add(cv);
        System.out.println("size  "+res.size());
        generateSubset(nums, c+1, res, ans);
        int a = res.size();

        res.remove(a-1);
        System.out.println("removed  "+res.size());
        generateSubset(nums, c+1, res, ans);

    }
    public static void main(String args[]){
        //Scanner in = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(4);
        nums.add(7);
        nums.add(9);
        nums.add(10);
        ArrayList<ArrayList<Integer>> ap= subsets(nums);
        for(int i=0;i<ap.size();i++){
            System.out.println(ap.get(i));
        }

    }
}
