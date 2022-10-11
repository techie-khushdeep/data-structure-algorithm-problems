package tree;

import java.util.*;

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

    public static void displayInOrderTreeIterative(TreeNode root){


        Stack<TreeNode> stack = new Stack<>();

        TreeNode node = root;
        while(node!=null || !stack.isEmpty()){

            while(Objects.nonNull(node)){
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();
            System.out.print("->"+node.data);

            node = node.right;

        }

    }

    public static void displayPreOrderTree(TreeNode root){
        if(root == null){
            return;
        }
        System.out.print("->"+root.data);
        displayPreOrderTree(root.left);
        displayPreOrderTree(root.right);
    }

    public static void displayPreOrderTreeIterative(TreeNode root){
        if(root == null){
            return;
        }
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.pop();
            System.out.println(node.data);
            if(Objects.nonNull(node.right)){
                stack.add(node.right);
            }
            if(Objects.nonNull(node.left)){
                stack.add(node.left);
            }
        }
    }

    public static void displayPostOrderTree(TreeNode root){
        if(root == null){
            return;
        }
        displayPostOrderTree(root.left);
        displayPostOrderTree(root.right);
        System.out.print("->"+root.data);
    }

    public static void displayLevelOrderTraversalWithIterative(TreeNode root){
        if(root==null){
            return;
        }
        List<List<Integer>> output = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int level = 0;
        while(!queue.isEmpty()){
            int size = queue.size();
            output.add(new ArrayList<>());
            for(int i=1;i<=size;i++){
                TreeNode node = queue.poll();
                output.get(level).add(node.data);
                if(node.left!=null){
                    queue.offer(node.left);
                }
                if(node.right!=null){
                    queue.offer(node.right);
                }
            }
            level++;
        }

    }

    public static void main(String args[]){
        TreeNode root = new TreeNode();
        root.data = 1;
        root.left = new TreeNode(2);
        root.left.left = new TreeNode(3);
        root.right = new TreeNode(4);
        root.right.left = new TreeNode(5);

        System.out.println("---PreOrder Traversal ---with recursion");
        displayPreOrderTree(root);

        System.out.println("\n---PreOrder Traversal ---with iterative");
        displayPreOrderTree(root);

        System.out.println("\n--- InOrder Traversal with recursion");
        displayInOrderTree(root);

        System.out.println("\n--- InOrder Traversal with iterative");
        displayInOrderTreeIterative(root);

        System.out.println("\n--- PostOrder Traversal");
        displayPostOrderTree(root);
    }
}
