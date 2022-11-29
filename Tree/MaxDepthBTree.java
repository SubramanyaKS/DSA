// Maximum Depth of Binary Tree 
public class MaxDepthBTree {
    public int maxDepth(TreeNode node){
        if(node==null){
            return 0;
        }
        int l= maxDepth(node.left);
        int r= maxDepth(node.right);
        return 1+Math.max(l, r);
    }
}
