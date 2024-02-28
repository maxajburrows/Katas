package FindBottomLeftTreeValue;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (root.right == null) {
            return findBottomLeftValue(root.left);
        }
        if (root.left == null) {
            return findBottomLeftValue(root.right);
        }
        // In case of neither is null how do you choose - need to count somehow: maybe make helper
        return findBottomLeftValue(root.left);
    }
}
