package FindBottomLeftTreeValue;

public class FindBottomLeftTreeValue {

    // Use a right to left breadth first traversal
    public int findBottomLeftValue(TreeNode root) {
        return 0;
    }



    // Original solution using recursion to do a depth first traversal.
    int maxDepth = 0;
    int farLeft = 0;
    public int findBottomLeftValueRecursiveDFS(TreeNode root) {
        findBottomLeftValueHelper(root, 1);
        return farLeft;
    }

    private void findBottomLeftValueHelper(TreeNode root, int depth) {
        if (root.left == null && root.right == null) {
            if (depth > maxDepth) {
                maxDepth = depth;
                farLeft = root.val;
            }
            return;
        }
        if (root.right == null) {
            findBottomLeftValueHelper(root.left, depth+1);
            return;
        }
        if (root.left == null) {
            findBottomLeftValueHelper(root.right, depth+1);
            return;
        }
        findBottomLeftValueHelper(root.left, depth+1);
        findBottomLeftValueHelper(root.right, depth+1);
    }
}
