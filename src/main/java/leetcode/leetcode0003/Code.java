package leetcode.leetcode0003;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjinxin
 * @date 2023/12/27 16:33
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> window = new HashMap<>();

        int left = 0;
        int right = 0;
        int len = Integer.MIN_VALUE;

        while (right < s.length()) {
            char ch = s.charAt(right);
            right++;

            window.put(ch, window.getOrDefault(ch, 0) + 1);

            while (window.get(ch) > 1) {
                char d = s.charAt(left);

                left++;

                window.put(d, window.get(d) - 1);
            }
            len = Math.max(len, right - left);
        }
        return len;
    }
}
