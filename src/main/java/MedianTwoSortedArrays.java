public class MedianTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2 = nums2.length;
        int totalLength = length1 + length2;
        double median1 = calculateMedian(nums1);
        double median2 = calculateMedian(nums2);

        // Find distance of median of first array from median of second array
        int index2 = findIndexOffset(nums2, median1);
        int indexDistance = index2+1 - length2/2;

        return 0;
    }

    private int findIndexOffset(int[] nums, double median) {
        int left = 0;
        int right = nums.length-1;
        int mid = 0;
        double epsilon = 1e-10;

        while (left <= right) {
            mid = left + (right-left)/2;
            if (Math.abs(nums[mid] - median) < epsilon) {
                break;
            } else if (nums[mid] < median) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return mid;
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
