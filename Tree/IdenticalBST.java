public class IdenticalBST {
    public boolean isSameTree(TreeNode p, TreeNode q){
        if(p==null || q==null){
            return(p==q);
        }
        return (p==q)&& isSameTree(p.left, q.left) && isSameTree(p.right, q.right);

    }

}
