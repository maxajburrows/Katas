package leetcode.inProgress;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TargetSumTest {

    @Test
    void testTargetSum() {
        TargetSum targetSum = new TargetSum();
        assertEquals(2, targetSum.findTargetSumWays(new int[]{1,0}, 1));
        assertEquals(5, targetSum.findTargetSumWays(new int[]{1, 1, 1, 1, 1}, 3));
        assertEquals(1, targetSum.findTargetSumWays(new int[]{1}, 1));
        assertEquals(0, targetSum.findTargetSumWays(new int[]{0}, 1));
    }

}
