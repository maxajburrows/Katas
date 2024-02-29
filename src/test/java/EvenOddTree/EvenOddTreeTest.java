package EvenOddTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EvenOddTreeTest {

    @Test
    void test1() {
        TreeNode level3Node1 = new TreeNode(12);
        TreeNode level3Node2 = new TreeNode(8);
        TreeNode level3Node3 = new TreeNode(6);
        TreeNode level3Node4 = new TreeNode(2);

        TreeNode level2Node1 = new TreeNode(3, level3Node1, level3Node2);
        TreeNode level2Node2 = new TreeNode(7, level3Node3, null);
        TreeNode level2Node3 = new TreeNode(9, null, level3Node4);

        TreeNode level1Node1 = new TreeNode(10, level2Node1, null);
        TreeNode level1Node2 = new TreeNode(4, level2Node2, level2Node3);

        TreeNode root = new TreeNode(1, level1Node1, level1Node2);

        EvenOddTree evenOddTree = new EvenOddTree();
        boolean expectedResult = true;
        boolean actualResult = evenOddTree.isEvenOddTree(root);
        assertEquals(expectedResult, actualResult);

    }

}