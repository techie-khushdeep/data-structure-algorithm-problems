package tree;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    public TreeNode(){
    }

    public TreeNode(int value){
        this.data = value;
        this.left = null;
        this.right = null;
    }
}

public class TreeTraversal {
    public static void displayInOrderTree(TreeNode root){
        if(root == null){
            return;
        }
        displayInOrderTree(root.left);
        System.out.print("->"+root.data);
        displayInOrderTree(root.right);
    }

    public static void displayPreOrderTree(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print("->"+root.data);
        displayPreOrderTree(root.left);
        displayPreOrderTree(root.right);
    }

    public static void displayPostOrderTree(TreeNode root){
        if(root == null){
            return;
        }
        displayPostOrderTree(root.left);
        displayPostOrderTree(root.right);
        System.out.print("->"+root.data);
    }
    public static void main(String args[]){
        TreeNode root = new TreeNode();
        root.data = 1;
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);

        System.out.println("---PreOrder Traversal");
        displayPreOrderTree(root);

        System.out.println("\n--- InOrder Traversal");
        displayInOrderTree(root);

        System.out.println("\n--- PostOrder Traversal");
        displayPostOrderTree(root);
    }
}
