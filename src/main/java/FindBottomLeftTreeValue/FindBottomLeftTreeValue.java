package FindBottomLeftTreeValue;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        if (root.left == null && root.right == null) {
            return root.val;
        }
        if (root.left == null) {
            return findBottomLeftValue(root.right);
        }
        return findBottomLeftValue(root.left);
    }
}
