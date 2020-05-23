package com.example.leetcode.array;

/**
 * @author wangpeil
 * 最大连续子序列和
 */
public class MaxSubArray {
    public static void main(String[] args) {
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int result = maxSubArray(nums);
        System.out.println(result);
    }

    static int maxSubArray(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            sum += num;
            if (maxSum < sum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
}
