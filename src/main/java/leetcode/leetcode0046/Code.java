package leetcode.leetcode0046;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/20 18:52
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> permute(int[] nums) {

        LinkedList<Integer> track = new LinkedList<>();
        boolean[] used = new boolean[nums.length + 1];
        backtrack(track, used, nums);
        return result;
    }

    public void backtrack(LinkedList track, boolean[] used, int[] nums) {
        if (track.size() == nums.length) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            track.add(nums[i]);

            used[i] = true;
            backtrack(track, used, nums);

            track.removeLast();
            used[i] = false;
        }
    }
}
