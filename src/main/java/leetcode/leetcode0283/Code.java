package leetcode.leetcode0283;

/**
 * @author wangjinxin
 * @date 2023/12/18 17:15
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public void moveZeroes(int[] nums) {
        int fast = 0;
        int slow = 0;
        while (fast != nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                slow++;
            }
            fast++;
        }

        while(slow != nums.length){
            nums[slow++]=0;
        }
    }
}
