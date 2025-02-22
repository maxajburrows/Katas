package leetcode.inProgress;

public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length;
        int mid = nums.length / 2;
        while (start <= end) {
            if (nums[mid] == target) {
                return mid;
            }
            if (mid == 0) {
                return nums[0] >= target ? 0 : 1;
            }
            if (mid == nums.length - 1) {
                return nums[nums.length-1] >= target ? mid : mid+1;
            }
            if (nums[mid] < target && nums[mid+1] > target) {
                return mid + 1;
            }
            if (nums[mid-1] < target && nums[mid] > target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid+1;
            } else {
                end = mid-1;
            }
            mid = (start+end)/2;
        }
        return -1;
    }
}
