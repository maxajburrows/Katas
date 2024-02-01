import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivideArrayTest {

    @Test
    void test1() {
        DivideArray divideArray = new DivideArray();
        int[] nums = new int[]{1,3,4,8,7,9,3,5,1};
        int k = 2;
        int[][] expectedResult = new int[][]{new int[]{1,1,3}, new int[]{3,4,5}, new int[]{7,8,9}};
        int[][] actualResult = divideArray.divideArray(nums, k);
        assertEquals(expectedResult, actualResult);
    }

}