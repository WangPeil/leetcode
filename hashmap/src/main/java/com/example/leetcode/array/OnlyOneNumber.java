package com.example.leetcode.array;

/**
 * @author wangpeil
 * 只出现一次的数字 其他数字出现两次
 * 使用异或
 */
public class OnlyOneNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
    
    static int singleNumber(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        
        int onlyNumber = 0;
        for (int num : nums) {
            onlyNumber ^= num;
        }
        return onlyNumber;
    }
}
