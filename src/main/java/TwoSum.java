import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            indexMap.put(nums[i], i);
        }

        for (int i=0; i < nums.length; i++) {
            int subtract = target - nums[i];
            if (indexMap.containsKey(subtract) && indexMap.get(subtract) != i) {
                    return new int[] {i, indexMap.get(subtract)};
                }
        }
        return new int[0];
    }
}
