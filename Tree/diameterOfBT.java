public class diameterOfBT {
    public int diameter(TreeNode node){
        int[] d = new int[1];
        height(node,d);
        return d[0];
    }
    public int height(TreeNode node, int[] d){
        if(node==null){
            return 0;
        }
        int l=height(node.left, d);
        int r=height(node.right, d);
        d[0]=Math.max(d[0], l+r);
        return 1 + Math.max(l, r);
    }
}