import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> indexMap = new HashMap<>();
        ArrayList<Integer> duplicates = new ArrayList<>();
        for (int i=0; i < nums.length; i++) {
            if (indexMap.containsKey(nums[i])) {
                duplicates.add(nums[i]);
            }
            indexMap.put(nums[i], i);
        }

        for (int i=0; i < nums.length; i++) {
            int subtract = target - nums[i];
            if (indexMap.containsKey(subtract)) {
                if (indexMap.get(subtract) == i && !duplicates.contains(subtract)) {
                    continue;
                }
                return new int[] {i, indexMap.get(subtract)};
            }
        }
        return new int[0];
    }
}
