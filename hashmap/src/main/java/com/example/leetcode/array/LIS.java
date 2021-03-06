package com.example.leetcode.array;

import java.util.Arrays;

/**
 * 最长递增子序列
 *
 * @author wangpeil
 */
public class LIS {
    public static void main(String[] args) {
        System.out.println(lis(new int[]{1, 3, 2, 5}));
    }

    static int lis(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }

        int max = 0;
        for (int d : dp) {
            if (d > max) {
                max = d;
            }
        }
        return max;
    }
}
