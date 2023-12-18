package leetcode.leetcode0167;

/**
 * @author wangjinxin
 * @date 2023/12/18 18:43
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            int sum = numbers[left] + numbers[right];
            if (target == sum) {
                return new int[]{left + 1, right + 1};
            } else if (sum > target) {
                right--;
            } else {
                left++;
            }
        }
        return new int[]{-1, -1};
    }
}
