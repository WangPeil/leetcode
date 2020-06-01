package com.example.leetcode.dynamicplan;

/**
 * 动态规划 计算容器最多盛多少水
 *
 * @author wangpeil
 */
public class Area {
    public static void main(String[] args) {
        System.out.println(maxArea(new int[]{1, 8, 6, 2, 5, 4, 8, 3, 7}));
    }

    static int maxArea(int[] height) {
        if (height == null || height.length == 0) {
            return 0;
        }
        int length = height.length;
        int max = Integer.MIN_VALUE;
        // 双指针法
        int i = 0, j = length - 1;
        while (i != j) {
            // 计算面积
            max = Math.max(max, Math.min(height[i], height[j]) * (j - i));
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return max;
    }
}
