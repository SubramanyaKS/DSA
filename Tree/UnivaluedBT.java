public class UnivaluedBT {
    public boolean isUnivaluedTree(TreeNode root){
        return isSame(root,root.val);
    }
    public boolean isSame(TreeNode root, int val){
        if(root==null){
            return true;
        }
        if(root.val!=val){
            return false;
        }
        boolean left=isSame(root.left, val);
        boolean right=isSame(root.right, val);
        return left && right;
    }
}
