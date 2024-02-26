package SameTree;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p.val != q.val) {
            return false;
        }
        boolean leftTree = false;
        boolean rightTree = false;
        if (p.left == null && q.left == null) {
            leftTree = true;
        } else if (p.left != null && q.left != null) {
            leftTree = isSameTree(p.left, q.left);
        }
        if (p.right == null && q.right == null) {
            rightTree = true;
        } else if (p.right != null && q.right != null) {
            rightTree = isSameTree(p.right, q.right);
        }
        return leftTree && rightTree;
    }
}
