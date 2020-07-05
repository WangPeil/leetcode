package com.example.leetcode.string;

/**
 * 计算两个字符串的相同字串的最大长度
 *
 * @author wangpeil
 */
public class MaxLength {
    public static void main(String[] args) {
        System.out.println(findMaxLength("123425","425666"));
    }

    static int findMaxLength(String x, String y) {
        return x.length() > y.length() ? maxLength(y, x) : maxLength(x, y);
    }

    static int maxLength(String s1, String s2) {
        int length1 = s1.length();
        int length2 = s2.length();
        int max = 0;
        // 滑动窗口从左向右滑
        for (int i = 1; i <= length1; i++) {
            // 到达s1的右侧
            max = Math.max(max, max(s1, 0, s2, length2 - i, i));
        }

        // 整个s1均在滑动窗口内部
        for (int i = length2 - length1; i >= 0; i--) {
            max = Math.max(max, max(s1, 0, s2, i, length1));
        }

        // 继续向右滑动
        for (int i = 1; i < length1; i++) {
            max = Math.max(max, max(s1, i, s2, 0, length1 - i));
        }
        return max;
    }

    static int max(String s1, int begin1, String s2, int begin2, int length) {
        int max = 0;
        int count = 0;
        for (int i = 0; i < length; i++) {
            if (s1.charAt(begin1 + i) == s2.charAt(begin2 + i)) {
                count++;
            } else {
                max = Math.max(count, max);
                count = 0;
            }
        }
        return count > 0 ? Math.max(max, count) : max;
    }
}
