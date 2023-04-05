import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {
    public List<List<Integer>> levelorder(TreeNode root){
        Queue <TreeNode> queue = new  LinkedList<TreeNode>();
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        if(root==null){
            queue.offer(root);
        }
        while(!queue.isEmpty()){
            int l= queue.size();
            List<Integer> sublist = new LinkedList<Integer>();
            for (int i = 0; i < l; i++) {
                if(queue.peek().left!=null){
                    queue.offer(queue.peek().left);
                }
                if(queue.peek().right!=null){
                    queue.offer(queue.peek().right);
                }
                sublist.add(queue.poll().val);
            }
            list.add(sublist);
        }
        return list;
    }
}
