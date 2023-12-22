package leetcode.leetcode0509;

/**
 * @author wangjinxin
 * @date 2023/12/20 14:43
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    public int fib(int n) {
        if (n == 0 || n == 1) {
            return n;
        }

        int first = 0;
        int second = 1;
        int current = 0;

        for (int i = 2; i < n; i++) {
            current = first + second;
            first = second;
            second = current;
        }
        return current;
    }
}
