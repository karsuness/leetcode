package leetcode.leetcode0015;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/18 20:42
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            List<List<Integer>> twoSum = getTwoSum(nums, i+1, 0-nums[i]);
            for (List<Integer> subResult : twoSum) {
                subResult.add(nums[i]);
                result.add(subResult);
            }

            while (i < nums.length-1 && nums[i] == nums[i + 1]) {
                i++;
            }
        }
        return result;
    }

    public List<List<Integer>> getTwoSum(int[] nums, int start, int target) {
        int left = start;
        int right = nums.length-1;
        List<List<Integer>> result = new ArrayList<>();
        while (left < right) {
            int sum = nums[left] + nums[right];
            int leftValue = nums[left];
            int rightValue = nums[right];

            if (sum > target) {
                while (left < right && nums[right] == rightValue) {
                    right--;
                }
            } else if (sum < target) {
                while (left < right && nums[left] == leftValue) {
                    left++;
                }
            } else {
                result.add(new ArrayList<>(Arrays.asList(leftValue, rightValue)));
                while (left < right && nums[left] == leftValue) {
                    left++;
                }

                while (left < right && nums[right] == rightValue) {
                    right--;
                }
            }
        }
        return result;
    }
}
