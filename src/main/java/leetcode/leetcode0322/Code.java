package leetcode.leetcode0322;

import java.util.Arrays;

/**
 * @author wangjinxin
 * @date 2023/12/20 16:21
 * @mail karsuness@gmail.com
 * @description
 */
public class Code {
    int[] memo;

    public int coinChange(int[] coins, int amount) {
        memo = new int[amount + 1];
        Arrays.fill(memo, Integer.MAX_VALUE);
        return dp(coins, amount);
    }

    public int dp(int[] coins, int amount) {
        if (amount == 0) {
            return 0;
        }

        if (amount < 0) {
            return -1;
        }

        if (memo[amount] != Integer.MAX_VALUE) {
            return memo[amount];
        }

        int result = Integer.MAX_VALUE;
        for (int coin : coins) {
            int subResult = coinChange(coins, amount - coin);

            if (subResult == -1) {
                continue;
            }

            result = Math.min(result, subResult + 1);
        }
        memo[amount] = result == Integer.MAX_VALUE ? -1 : result;
        return memo[amount];
    }
}
