//count complete tree node
public class CountNode {
    public int countNodes(TreeNode root) {
        int count[] = new int[1];
        inOrder(root,count);
        return count[0];
        
    }
    public void inOrder(TreeNode root, int[] count){
        if(root==null){
            return;
        }
        count[0]++;
        inOrder(root.left,count);
        inOrder(root.right,count);
    }
    
}
