package com.example.leetcode.dynamicplan;

/**
 * @author wangpeil
 * 动态规划
 */
public class Rob {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 9, 3, 1};
        int result = rob(nums);
        System.out.println(result);
    }

    static int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        // last 表示到当前位置的最多金额
        int pre = 0;
        int last = 0;
        for (int num : nums) {
            int tmp = Math.max(pre + num, last);
            pre = last;
            last = tmp;
        }
        return last;
    }
}
