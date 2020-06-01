package com.example.leetcode.dynamicplan;

import java.util.jar.JarEntry;

/**
 * @author wangpeil
 * 最长回文字串
 */
public class LongestPalindrome {
    public static void main(String[] args) {
        System.out.println(longestPalindrome("cabbbbd"));
    }

    static String longestPalindrome(String s) {
        if (s == null) {
            return null;
        }
        int length = s.length();
        // 使用动态规划解决问题
        boolean[][] dp = new boolean[length][length];
        // dp[i][j]表示起始下标为i 结尾下标为j对字串是否满足回文
        // 起始条件
        String answer = "";
        for (int step = 0; step < length; step++) {
            for (int i = 0; step + i < length; i++) {
                boolean equal = s.charAt(i) == s.charAt(step + i);
                if (step == 0) {
                    dp[i][step + i] = true;
                } else if (step == 1) {
                    dp[i][step + i] = equal;
                } else {
                    dp[i][step + i] = dp[i + 1][step + i - 1] && equal;
                }
                if (dp[i][step + i] && step + 1 > answer.length()) {
                    answer = s.substring(i, step + +i+1);
                }
            }
        }
        return answer;
    }
}
