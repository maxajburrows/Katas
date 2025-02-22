package leetcode.inProgress;

import java.util.HashMap;

public class LongestConsecutiveSequence {
    HashMap<Integer, Integer> sequenceLengthMap = new HashMap<>();
    public int longestConsecutive(int[] nums) {
        for (int num : nums) {
            if (sequenceLengthMap.containsKey(num)) {
                continue;
            }
            if (sequenceLengthMap.containsKey(num-1) && sequenceLengthMap.containsKey(num+1)) {
                int lowStreak = sequenceLengthMap.get(num-1) + 1;
                int highStreak = sequenceLengthMap.get(num+1);
                int newStreak = lowStreak + highStreak;
                for (int j = 0; j < lowStreak; j++) {
                    sequenceLengthMap.put(num-j, newStreak);
                }
                for (int j = 1; j < lowStreak; j++) {
                    sequenceLengthMap.put(num+j, newStreak);
                }
                continue;
            }
            if (sequenceLengthMap.containsKey(num-1)) {
                int newStreak = sequenceLengthMap.get(num-1) + 1;
                for (int j = 0; j < newStreak; j++) {
                   sequenceLengthMap.put(num-j, newStreak);
                }
                continue;
            }
            if (sequenceLengthMap.containsKey(num+1)) {
                int newStreak = sequenceLengthMap.get(num+1) + 1;
                for (int j = 0; j < newStreak; j++) {
                    sequenceLengthMap.put(num+j, newStreak);
                }
                continue;
            }
            sequenceLengthMap.put(num, 1);
        }
        int maxStreak = 0;
        for (Integer streak : sequenceLengthMap.values()) {
            maxStreak = Math.max(maxStreak, streak);
        }
        return maxStreak;
    }
}
