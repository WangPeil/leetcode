package com.example.leetcode.dynamicplan;

/**
 * 凑硬币
 * @author wangpeil
 */
public class Coin {
    static int collectCoins(int account, int[] coins) {
        if (account <= 0) {
            return -1;
        }
        int[] dp = new int[account + 1];
        for (int coin : coins) {
            dp[coin] = 1;
        }
        for (int i = 1; i <= account; i++) {
            int min = i;
            for (int coin : coins) {
                if (i - coin >= 0) {
                    min = Math.min(dp[i - coin] + 1, min);
                }
            }
            dp[i] = min;
        }
        return dp[account];
    }
}
