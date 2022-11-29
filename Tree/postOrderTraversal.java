public class postOrderTraversal {
    Node root;
    postOrderTraversal(){
        root=null;
    }
    void postOrder(Node node){
        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key);

    }
}
