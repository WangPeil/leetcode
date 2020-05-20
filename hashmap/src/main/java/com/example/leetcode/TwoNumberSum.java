package com.example.leetcode;

import java.util.Arrays;
import java.util.HashMap;

import java.util.Map;
import java.util.Objects;

/**
 * @author wangpeil
 * @function 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 * <p>
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * <p>
 * 坑：数组中存在两个一样的元素 所有需要判重
 */
public class TwoNumberSum {
    public static void main(String[] args) {
        int[] nums = new int[]{2, 7, 15, 11};
        System.out.println(Arrays.toString(twoSum(nums, 9)));
    }

    public static int[] twoSum(int[] nums, int target) {
        Objects.requireNonNull(nums);
        Map<Integer, Integer> map = new HashMap<>(16);
        int length = nums.length;
        // 将所有元素放入map中
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
        }
        for (int i = 0; i < length; i++) {
            int secondValue = target - nums[i];
            if (map.containsKey(secondValue) && map.get(secondValue) != i) {
                return new int[]{i, map.get(secondValue)};
            }
        }
        throw new IllegalArgumentException("no such two numbers");
    }
}
