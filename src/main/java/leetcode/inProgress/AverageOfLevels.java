package leetcode.inProgress;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import leetcode.TreeNode;

public class AverageOfLevels {
    List<Double> levelAverages = new ArrayList<>();
    Stack<Double> valueStack = new Stack<>();
    public List<Double> averageOfLevels(TreeNode root) {
        levelAverages.add((double) root.val);

        return levelAverages;
    }

    public void averageOfLevelsHelper(TreeNode root) {
        if (root == null) {
            return;
        }
    }
}
