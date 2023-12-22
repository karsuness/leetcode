package leetcode.leetcode0077;

import java.util.LinkedList;
import java.util.List;

/**
 * @author wangjinxin
 * @date 2023/12/21 12:33
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    List<List<Integer>> result = new LinkedList<>();

    public List<List<Integer>> combine(int n, int k) {
        LinkedList<Integer> track = new LinkedList<>();
        backtrack(n, k, track, 0);
        return result;
    }

    public void backtrack(int n, int k, LinkedList<Integer> track, int row) {
        if (track.size() == k) {
            result.add(new LinkedList<>(track));
            return;
        }

        for (int i = row + 1; i <= n; i++) {
            track.addLast(i);
            backtrack(n, k, track, i);
            track.removeLast();
        }
    }
}
