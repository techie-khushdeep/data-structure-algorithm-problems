package tree;

import java.util.*;

class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left;
    public BinaryTreeNode right;

    // below data members used only for some of the problems
    public BinaryTreeNode next;
    public BinaryTreeNode parent;
    public int count;

    public BinaryTreeNode(int d) {
        data = d;
        left = null;
        right = null;
        next = null;
        parent = null;
        count = 0;
    }
}
public class BinaryTree {
    public BinaryTreeNode root;

    // BinaryTree() is a constructor that initializes the data members of BinaryTree
    public BinaryTree() {
        this.root = null;
    }

    /* BinaryTree(Integer nodeData) initializes the data members
       of BinaryTree using the given data */
    public BinaryTree(Integer nodeData) {
        this.root = new BinaryTreeNode(nodeData);
    }

    /* BinaryTree(List<Integer> nodeDataList) initializes the data members
       of BinaryTree using the given data slice */
    public BinaryTree(List<Integer> nodeDataList) {
        this.root = null;
        for (Integer nodeData : nodeDataList) {
            insert(nodeData);
        }
    }

    /* insertBT inserts a given key into the binary tree
	   insertBT is used for normal binary tree level by level insertion */
    public void insertBT(int key) {
        Queue<BinaryTreeNode> tempQueue = new LinkedList<BinaryTreeNode>();
        BinaryTreeNode temp = this.root;
        tempQueue.add(temp);

        while (!tempQueue.isEmpty()) {
            temp = tempQueue.peek();
            tempQueue.remove();

            if (temp.left == null) {
                temp.left = new BinaryTreeNode(key);
                break;
            } else {
                tempQueue.add(temp.left);
            }

            if (temp.right == null) {
                temp.right = new BinaryTreeNode(key);
                break;
            } else {
                tempQueue.add(temp.right);
            }
        }
    }

    /* insert inserts an integer into the binary search tree */
    public void insert(int nodeData) {
        BinaryTreeNode newNode = new BinaryTreeNode(nodeData);
        if (this.root == null) {
            this.root = newNode;
        } else {
            BinaryTreeNode parent = null;
            BinaryTreeNode tempNode = this.root;
            while (tempNode != null) {
                parent = tempNode;
                if (nodeData <= tempNode.data) {
                    tempNode = tempNode.left;
                } else {
                    tempNode = tempNode.right;
                }
            }
            if (nodeData <= parent.data) {
                parent.left = newNode;
            } else {
                parent.right = newNode;
            }
        }
    }

    /* findInBSTRec is a helper function used by findInBST to
   	   find the given data in the binary search tree */
    private BinaryTreeNode findInBSTRec(BinaryTreeNode node, int nodeData) {
        if (node == null)
            return null;

        if (node.data == nodeData) {
            return node;
        } else if (node.data > nodeData) {
            return findInBSTRec(node.left, nodeData);
        } else {
            return findInBSTRec(node.right, nodeData);
        }
    }

    /* findInBST is used to find the given data in the binary search tree */
    public BinaryTreeNode findInBST(int nodeData) {
        return findInBSTRec(this.root, nodeData);
    }

    /* populateParentsRec is a helper function that is used by populateParents */
    private void populateParentsRec(BinaryTreeNode node, BinaryTreeNode parent) {
        if (node != null) {
            node.parent = parent;
            populateParentsRec(node.left, node);
            populateParentsRec(node.right, node);
        }
    }

    /* populateParents is used to populate the parent pointers
	   of the nodes in the BinaryTree */
    public void populateParents() {
        populateParentsRec(this.root, null);
    }

    /* getSubTreeNodeCount returns the count of the nodes in
	   the sub-tree rooted at the given node */
    public int getSubTreeNodeCount(BinaryTreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return 1 + getSubTreeNodeCount(node.left) + getSubTreeNodeCount(node.right);
        }
    }

    // populateCountRec is a helper function used by PopulateCount
    private void populateCountRec(BinaryTreeNode node) {
        if (node != null) {
            node.count = getSubTreeNodeCount(node);
            populateCountRec(node.left);
            populateCountRec(node.right);
        }
    }

    /* populateCount is used to calculate the number of
	   node present in the BinaryTree */
    public void populateCount() {
        populateCountRec(this.root);
    }

    // getTreeDeepCopyRec is a helper function used by getTreeDeepCopy
    private BinaryTreeNode getTreeDeepCopyRec(BinaryTreeNode node) {
        if (node != null) {
            BinaryTreeNode newNode = new BinaryTreeNode(node.data);
            newNode.left = getTreeDeepCopyRec(node.left);
            newNode.right = getTreeDeepCopyRec(node.right);
            return newNode;
        } else {
            return null;
        }
    }

    // getTreeDeepCopy is used to make a deep copy of the BinaryTree
    public BinaryTree getTreeDeepCopy() {
        if (this.root == null) {
            return null;
        } else {
            BinaryTree treeCopy = new BinaryTree();
            treeCopy.root = getTreeDeepCopyRec(root);
            return treeCopy;
        }
    }

    /* findInBTRec is a helper function used by findInBT to
	   find the given data in the binary tree */
    private BinaryTreeNode findInBTRec(BinaryTreeNode node, int nodeData) {
        if (node == null) {
            return null;
        }

        if (node.data == nodeData) {
            return node;
        }

        BinaryTreeNode leftNode = findInBTRec(node.left, nodeData);
        if (leftNode != null) {
            return leftNode;
        }

        BinaryTreeNode rightNode = findInBTRec(node.right, nodeData);
        return rightNode;
    }

    // findInBT is used to find the given data in the binary tree
    public BinaryTreeNode findInBT(int nodeData) {
        return findInBTRec(this.root, nodeData);
    }
}

