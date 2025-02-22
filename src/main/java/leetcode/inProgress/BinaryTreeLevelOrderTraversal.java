package leetcode.inProgress;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import leetcode.TreeNode;

public class BinaryTreeLevelOrderTraversal {
    List<List<Integer>> output = new ArrayList<>();
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return Collections.emptyList();
        }
        output.add(new ArrayList<>());
        output.get(0).add(root.val);
        return null;
    }

}
