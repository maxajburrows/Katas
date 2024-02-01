import java.util.Arrays;

public class DivideArray {
    public int[][] divideArray(int[] nums, int k) {
        Arrays.sort(nums);
        int[][] answerArray = new int[nums.length/3][];

        for (int i=0; i < nums.length/3; i++) {
            if (nums[i*3]+k < nums[i*3+2]) {
                return new int[0][0];
            }
            int[] indexArray = new int[3];
            System.arraycopy(nums, i * 3, indexArray, 0, 3);
            answerArray[i] = indexArray;
        }
        return answerArray;
    }
}
