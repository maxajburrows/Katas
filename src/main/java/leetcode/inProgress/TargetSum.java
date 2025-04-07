package leetcode.inProgress;

import java.util.ArrayList;
import java.util.List;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        int count = 0;
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        List<Integer> permutations = addSubArray(numsList);
        for (Integer permutation : permutations) {
            if (permutation == target) count++;
        }
        return count;
    }

    public List<Integer> addSubArray(List<Integer> nums) {
        if (nums.size() == 1) {
            return List.of(nums.get(0), -nums.get(0));
        }
        List<Integer> permutations = new ArrayList<>();
        List<Integer> newList = new ArrayList<>();
        for (int j=1; j < nums.size(); j++) {
            newList.add(nums.get(j));
        }
        List<Integer> subArrayPermutations = addSubArray(newList);
        for (Integer permutation : subArrayPermutations) {
            permutations.add(permutation + nums.get(0));
            permutations.add(permutation - nums.get(0));
        }
        return permutations;
    }
}
