import java.util.*;

public class TwoSumBST {
    public boolean util(Node root,int sum,Set<Integer> set){
        if(root==null){
            return false;
        }
        if(util(root.left,sum,set)==true){
            return true;
        }
        if(set.contains(sum-root.key)){
            return true;
        }
        set.add(root.key);
        return util(root.right,sum,set);
    }
    public int isPairPresent(Node root, int t){
        Set<Integer> set = new HashSet<>();
        boolean ans= util(root, t, set);
        return ans?1:0;
    }
}
