package leetcode.done.minimumAbsoluteDifferenceInBst;

public class MinimumAbsoluteDifferenceInBst530 {
    int difference = Integer.MAX_VALUE;
    int lastValue = -100_001;
    public int getMinimumDifference(TreeNode root) {
        inOrderTraversal(root);
        return difference;
    }

    public void inOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderTraversal(root.left);

        int nextValue = root.val;
        difference = Math.min(nextValue - lastValue, difference);
        lastValue = nextValue;

        inOrderTraversal(root.right);
    }
}
