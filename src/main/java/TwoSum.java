import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        for (int i=0; i < nums.length; i++) {
            int subtract = target - nums[i];
            if (indexMap.containsKey(subtract)) {
                return new int[] {indexMap.get(subtract), i};
            }
            indexMap.put(nums[i], i);
        }
        return new int[0];
    }
}
