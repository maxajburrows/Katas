package leetcode.inProgress;

import java.util.Stack;

import leetcode.TreeNode;

public class SymmetricTree {
    Stack<Integer> leftStack = new Stack();
    Stack<Integer> rightStack = new Stack();
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        leftSearch(root.left);
        rightSearch(root.right);

        while (!leftStack.empty()) {
            if (!leftStack.pop().equals(rightStack.pop())) {
                return false;
            }
        }
        return rightStack.empty();
    }

    public void leftSearch(TreeNode root) {
        if (root == null) {
            leftStack.push(101);
            return;
        }
        leftSearch(root.left);
        leftSearch(root.right);
        leftStack.push(root.val);
    }

    public void rightSearch(TreeNode root) {
        if (root == null) {
            rightStack.push(101);
            return;
        }
        rightSearch(root.right);
        rightSearch(root.left);
        rightStack.push(root.val);
    }
}
