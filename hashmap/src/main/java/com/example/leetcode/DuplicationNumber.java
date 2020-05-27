package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * 存在重复数字
 *
 * @author wangpeil
 */
public class DuplicationNumber {
    public static void main(String[] args) {

    }

    static boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }

        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }
}
