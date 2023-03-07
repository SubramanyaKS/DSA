public class DeleteBST {
    public TreeNode delete(TreeNode root, int val){
        if(root==null){
            return root;
        }
        if(val<root.val){
            root.left= delete(root.left, val);
        }
        else if(val> root.val){
            root.right = delete(root.right, val);
        }
        else{
            if(root.left==null){
                return root.right;
            }
            else if (root.right == null){ 
                return root.left;
            }
            root.val = minValue(root.right);
            root.right = delete(root.right, root.val);
        }
        return root;
    }
    public static int minValue(TreeNode root)
    {
        int minv = root.val;
        while (root.left != null) {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
}
