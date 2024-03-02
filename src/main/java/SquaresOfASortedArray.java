import java.util.Arrays;

public class SquaresOfASortedArray {
    public int[] sortedSquares(int[] nums) {
        int length = nums.length;
        int[] squaresArray = new int[length];
        for (int i=0; i < length; i++) {
            squaresArray[i] = nums[i]*nums[i];
        }
        Arrays.sort(squaresArray);
        return squaresArray;
    }
}
