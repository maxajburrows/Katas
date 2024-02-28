package FindBottomLeftTreeValue;

public class FindBottomLeftTreeValue {
    int maxDepth = 0;
    int farLeft = 0;
    public int findBottomLeftValue(TreeNode root) {
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
