package com.example.leetcode.array;

import java.util.Arrays;

/**
 * @author wangpeil
 * 数组加1
 */
public class PlusOne {
    public static void main(String[] args) {
        int[] nums = new int[]{9, 9, 9};
        int[] result = plusOne(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] plusOne(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        int isAdd = 1;
        int[] tmpArray = new int[nums.length + 1];
        for (int i = nums.length - 1; i >= 0; i--) {
            tmpArray[i + 1] = (isAdd + nums[i]) % 10;
            isAdd = (isAdd + nums[i]) / 10;
        }
        tmpArray[0] += isAdd;
        int[] resultArray;
        if (isAdd == 0) {
            resultArray = new int[nums.length];
            System.arraycopy(tmpArray, 1, resultArray, 0, tmpArray.length - 1);
        } else {
            resultArray = new int[nums.length + 1];
            System.arraycopy(tmpArray, 0, resultArray, 0, tmpArray.length);
        }
        return resultArray;
    }
}
