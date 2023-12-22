package leetcode.leetcode0047;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/21 17:19
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {

    List<List<Integer>> result = new LinkedList<>();

    LinkedList<Integer> track = new LinkedList<>();

    boolean[] used;

    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        used = new boolean[nums.length + 1];
        backtrack(nums);

        return result;
    }

    public void backtrack(int[] nums) {
        if (track.size() == nums.length) {
            result.add(new LinkedList<>(track));
            return;
        }


        int preNum = -666;

        for (int i = 0; i < nums.length; i++) {
            if (used[i]) {
                continue;
            }

            if (nums[i] == preNum) {
                continue;
            }

            preNum = nums[i];
            track.addLast(nums[i]);
            used[i] = true;

            backtrack(nums);

            track.removeLast();
            used[i] = false;
        }
    }
}
