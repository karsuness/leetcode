package leetcode.leetcode0027;

/**
 * @author wangjinxin
 * @date 2023/12/15 15:11
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int removeElement(int[] nums, int val) {
        int fast, slow;
        fast = slow = 0;
        while (fast != nums.length) {
            if (nums[fast] != val) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }
        return slow+1;
    }
}
