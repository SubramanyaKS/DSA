public class InOrderTraversal {
    Node root;
    InOrderTraversal(){
        root=null;
    }
    void inOrder(Node node){
        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.key+" ");
        inOrder(node.right);

    }
    
}