package leetcode.leetcode0483;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangjinxin
 * @date 2023/12/27 12:44
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> result = new ArrayList<>();

        Map<Character, Integer> need = new HashMap<>();
        Map<Character, Integer> window = new HashMap<>();

        for (char ch : p.toCharArray()) {
            need.put(ch, need.getOrDefault(ch, 0) + 1);
        }

        int left = 0;
        int right = 0;
        int valid = 0;

        while (right < s.length()) {
            char c = s.charAt(right);
            right++;

            window.put(c, window.getOrDefault(c, 0) + 1);

            if (need.containsKey(c)) {
                if (window.get(c).equals(need.get(c)) ) {
                    valid++;
                }
            }

            while (right - left >= p.length()) {
                if (valid == need.size()) {
                    result.add(left);
                }

                char ch = s.charAt(left);
                left++;

                if (need.containsKey(ch)) {
                    if (need.get(ch).equals(window.get(ch))) {
                        valid--;
                    }
                    window.put(ch, window.get(ch) - 1);
                }
            }
        }
        return result;
    }
}
