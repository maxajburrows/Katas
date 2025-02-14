import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        HashMap<Integer, Integer> duplicateMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                duplicateMap.put(nums[i], i);
                continue;
            }
            indexMap.put(nums[i], i);
        }
        Arrays.sort(nums);

        for (int i=0; i < nums.length; i++) {
            for (int j=i+1; j < nums.length; j++) {
                int sum = nums[i] + nums[j];
                if (sum == target) {
                    if (nums[i] == nums[j]) {
                        return new int[] {indexMap.get(nums[i]), duplicateMap.get(nums[i])};
                    }
                    return new int[] {indexMap.get(nums[i]), indexMap.get(nums[j])};
                }
                if (sum > target) {
                    break;
                }
            }
        }
        return new int[0];
    }
}
