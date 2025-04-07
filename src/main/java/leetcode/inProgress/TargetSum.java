package leetcode.inProgress;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TargetSum {
    public int findTargetSumWays(int[] nums, int target) {
        List<Integer> numsList = new ArrayList<>();
        for (int num : nums) {
            numsList.add(num);
        }
        HashMap<Integer, Integer> permutations = addSubArray(numsList);
        return permutations.getOrDefault(target, 0);
    }

    public HashMap<Integer, Integer> addSubArray(List<Integer> nums) {
        if (nums.size() == 1) {
            HashMap<Integer, Integer> baseMap = new HashMap<>();
            if (nums.get(0) == 0) {
                baseMap.put(0, 2);
            } else {
                baseMap.put(nums.get(0), 1);
                baseMap.put(-nums.get(0), 1);
            }
            return baseMap;
        }
        List<Integer> newList = new ArrayList<>();
        for (int j=1; j < nums.size(); j++) {
            newList.add(nums.get(j));
        }
        HashMap<Integer, Integer> subArrayPermutations = addSubArray(newList);
        HashMap<Integer, Integer> permutations = new HashMap<>();
        for (Integer permutation : subArrayPermutations.keySet()) {
            Integer addPermutation = permutation + nums.get(0);
            permutations.merge(addPermutation, subArrayPermutations.get(permutation), Integer::sum);

            Integer subtractPermutation = permutation - nums.get(0);
            permutations.merge(subtractPermutation, subArrayPermutations.get(permutation), Integer::sum);
        }
        return permutations;
    }
}
