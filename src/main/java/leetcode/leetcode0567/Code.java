package leetcode.leetcode0567;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangjinxin
 * @date 2023/12/26 16:28
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char ch : s1.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int valid = 0;

        while (right < s2.length()) {
            char ch = s2.charAt(right);

            right++;
            window.put(ch, window.getOrDefault(ch, 0) + 1);

            if (need.containsKey(ch)) {
                if (need.get(ch).equals(window.get(ch))) {
                    valid++;
                }
            }

            while (right - left >= s1.length()) {
                if (valid == need.size()) {
                    return true;
                }

                char d = s2.charAt(left);
                left++;

                if (need.containsKey(d)) {
                    if (need.get(ch).equals(window.get(ch))) {
                        valid--;
                    }
                    window.put(d, window.get(d) - 1);
                }
            }
        }
        return false;
    }
}
