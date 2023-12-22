package leetcode.leetcode0039;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/22 11:12
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    List<List<Integer>> result = new LinkedList<>();
    LinkedList<Integer> track = new LinkedList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        backtrack(candidates,target,0);
        return result;
    }

    public void backtrack(int[] candidates, int target,int n) {
        if (target == 0) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = n; i < candidates.length; i++) {
            if (target < candidates[i]) {
                return;
            }

            track.add(candidates[i]);
            backtrack(candidates,target-candidates[i],i);
            track.removeLast();
        }
    }
}
