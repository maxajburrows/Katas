package DiameterOfBinaryTree;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            return 1;
        }
        int leftTreePathLength = 0;
        int rightTreePathLength = 0;
        if (root.left != null) {
            leftTreePathLength = diameterOfBinaryTree(root.left);
        }
        if (root.right != null) {
            rightTreePathLength = diameterOfBinaryTree(root.right);
        }
        return leftTreePathLength+rightTreePathLength;
    }
}
