package leetcode.leetcode0344;

/**
 * @author wangjinxin
 * @date 2023/12/18 18:51
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length-1;

        char temp;
        while (left < right) {
            if (s[left] != s[right]) {
                temp = s[left];
                s[left] = s[right];
                s[right] = temp;
            }
            left++;
            right--;
        }
    }
}
