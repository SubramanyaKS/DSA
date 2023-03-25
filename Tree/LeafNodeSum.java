public class LeafNodeSum {
    public static int sumofLeafNode(Node root,int sum){
        if(root==null){
            return 0;
        }
        if(root.left==null && root.right==null){
            sum+=root.key;
        }
        sum+=sumofLeafNode(root.left, sum)+sumofLeafNode(root.right, sum);
        return sum;
    }

    public static void main(String[] args) {
        int sum=0;
        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);
        root.right.right = new Node(7);
        root.right.left = new Node(6);
        root.right.left.right = new Node(8);
        System.out.println(sumofLeafNode(root, sum));
    }
}