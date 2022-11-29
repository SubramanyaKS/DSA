public class BalancedBT {
   public boolean isBalancing(TreeNode root){
       return dfsHeight(root)!=-1;
   } 
   public int dfsHeight(TreeNode node){
       if(node==null){
           return -1;
       }
       int l= dfsHeight(node.left);
       if(l==-1){
           return -1;
       }
       int r= dfsHeight(node.right);
       if(r==-1){
           return -1;
       }
       if(Math.abs(l-r)>1){
           return -1;
       }
       return 1+Math.max(l,r)+1;
   }
}
