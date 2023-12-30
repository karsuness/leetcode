package leetcode.leetcode0034;

/**
 * @author wangjinxin
 * @date 2023/12/25 21:44
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int[] searchRange(int[] nums, int target) {
        return new int[]{getLeft(nums, target), getRight(nums, target)};
    }

    public int getLeft(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                right = mid - 1;
            } else {
                right = mid - 1;
            }
        }

        if (left >= nums.length) {
            return -1;
        }

        return nums[left] == target ? left : -1;
    }

    public int getRight(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] < target) {
                left = mid + 1;
            } else if (nums[mid] == target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        if (right < 0) {
            return -1;
        }

        return nums[right] == target ? right : -1;
    }
}
