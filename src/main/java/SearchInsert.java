public class SearchInsert {
    public int searchInsert(int[] nums, int target) {
        int index = nums.length/2;
        while (index > 0) {
            if ((nums[index] == target)
                || (nums[index] > target && nums[index - 1] < target)) {
                return index;
            }
            if ((index == nums.length - 1) && nums[index] < target) {
                return nums.length;
            }
            if (nums[index] < nums.length-1 && nums[index] < target && nums[index + 1] > target) {
                return index + 1;
            }
            index = (nums[index] < target) ? ((index + nums.length)/2) : index / 2;
        }
        return (nums[0] >= target) ? 0 : nums.length;
    }
}
