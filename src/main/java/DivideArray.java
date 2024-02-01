import java.util.Arrays;

public class DivideArray {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] answerArray = new int[nums.length/k][3];

        for (int i=0; i < nums.length/k; i++) {
            int[] indexArray = new int[3];
            // Can replace with System.arraycopy later
            for (int j=0; j < 3; j++) {
                indexArray[j] = nums[i*3+j];
            }
            if (indexArray[0] + k < indexArray[2]) {
                return new int[0][0];
            }
            answerArray[i] = indexArray;
        }
        return answerArray;
    }
}
