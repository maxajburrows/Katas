package FindBottomLeftTreeValue;

import java.util.LinkedList;

public class FindBottomLeftTreeValue {

    // Use a right to left breadth first traversal
    public int findBottomLeftValueBFS(TreeNode root) {
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.addLast(root);
        int result = 0;

        while (!queue.isEmpty()) {
            TreeNode nextNode = queue.poll();
            // This should have a for loop as well with an if condition
            result = nextNode.val;
            if (nextNode.right != null) {
                queue.addLast(nextNode.right);
            }
            if (nextNode.left != null) {
                queue.addLast(nextNode.left);
            }
        }
        return result;
    }



    // Original solution using recursion to do a depth first traversal.
    int maxDepth = 0;
    int farLeft = 0;
    public int findBottomLeftValue(TreeNode root) {
        findBottomLeftValueHelper(root, 1);
        return farLeft;
    }

    private void findBottomLeftValueHelper(TreeNode root, int depth) {
        if (root == null) {
            return;
        }
        if (depth > maxDepth) {
            maxDepth = depth;
            farLeft = root.val;
        }
        findBottomLeftValueHelper(root.left, depth+1);
        findBottomLeftValueHelper(root.right, depth+1);
    }

    private void findBottomLeftValueHelper1(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
                farLeft = root.val;
            }
            return;
        }
        if (root.right == null) {
            findBottomLeftValueHelper1(root.left, depth+1);
            return;
        }
        if (root.left == null) {
            findBottomLeftValueHelper1(root.right, depth+1);
            return;
        }
        findBottomLeftValueHelper1(root.left, depth+1);
        findBottomLeftValueHelper1(root.right, depth+1);
    }

}
