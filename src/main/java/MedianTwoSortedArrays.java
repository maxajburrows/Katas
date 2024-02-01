public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength = length1 + length2;
        double median1 = calculateMedian(nums1);
        double median2 = calculateMedian(nums2);

        // Find distance of median of first array from median of second array
        double indexDistance = findIndexOffset(nums2, median1);

        return 0;
    }

    private double findIndexOffset(int[] nums, double median) {

    }

    public double calculateMedian(int[] nums) {
        double median;
        if (nums.length % 2 == 0) {
            median = (double) (nums[nums.length / 2 - 1] + nums[nums.length / 2]) /2;
        } else {
            median = nums[nums.length/2];
        }
        return median;
    }
}
