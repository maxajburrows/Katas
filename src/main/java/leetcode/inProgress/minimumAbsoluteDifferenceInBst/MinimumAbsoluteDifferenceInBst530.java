package leetcode.inProgress.minimumAbsoluteDifferenceInBst;

public class MinimumAbsoluteDifferenceInBst530 {
    int difference = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if (root.left != null) {
            int leftDifference = Math.abs(root.val - root.left.val);
            difference = Math.min(difference, leftDifference);
            getMinimumDifference(root.left);
        }
        if (root.right != null) {
            int rightDifference = Math.abs(root.val - root.right.val);
            difference = Math.min(difference, rightDifference);
            getMinimumDifference(root.right);
        }
        return difference;
    }
}
