package leetcode.leetcode0001;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjinxin
 * @date 2023/12/18 18:14
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                result[0] = map.get(nums[i]);
                result[1] = i;
            } else {
                map.put(target - nums[i], i);
            }
        }
        return result;
    }
}
