package leetcode.leetcode0040;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/21 14:34
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates, target, 0);
        return result;
    }

    public void backtrack(int[] candidates, int target, int n) {
        if (target == 0) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = n; i < candidates.length; i++) {
            if (target - candidates[i] < 0) {
                continue;
            }

            if (i > n && candidates[i] == candidates[i + 1]) {
                continue;
            }
            track.addLast(candidates[i]);
            backtrack(candidates, target - candidates[i], i + 1);
            track.removeLast();
        }
    }
}
