package leetcode.leetcode0078;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/21 11:55
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> subsets(int[] nums) {
        LinkedList<Integer> track = new LinkedList<>();

        backtrack(nums, track, 0);
        return result;
    }

    public void backtrack(int[] nums, LinkedList track, int n) {
        result.add(new LinkedList<>(track));

        for (int i = n; i < nums.length; i++) {
            track.addLast(nums[i]);
            backtrack(nums, track, i + 1);
            track.removeLast();
        }
    }
}
