package leetcode.leetcode0090;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/21 13:58
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {

    List<List<Integer>> result = new LinkedList<>();

    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        backtrack(nums, 0);
        return result;
    }

    public void backtrack(int[] nums, int n) {
        result.add(new LinkedList<>(track));

        for (int i = n; i < nums.length; i++) {
            if (i < nums.length - 1 && nums[i] == nums[i + 1]) {
                continue;
            }

            track.addLast(nums[i]);
            backtrack(nums, i + 1);
            track.removeLast();
        }
    }
}
