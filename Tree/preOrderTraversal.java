public class preOrderTraversal {
    Node root;
    preOrderTraversal(){
        root=null;
        
    }
    void preOrder(Node node){
        System.out.println(node.key);
        preOrder(node.left);
        preOrder(node.right);
        
    }
}
