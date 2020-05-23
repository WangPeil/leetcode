package com.example.leetcode.array;


import java.awt.font.NumericShaper;

/**
 * @author wangpeil
 * 移除数组中给定的元素
 * 空间复杂度O(1)
 */
public class RemoveElement {
    public static void main(String[] args) {
        int[] nums = new int[]{0,1,2,2,3,0,4,2};
        int result = removeElement(nums, 2);
        System.out.println(result);
    }

    static int removeElement(int[] nums, int target) {
        if (nums == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        if (nums.length == 0) {
            return 0;
        }
        int slowIndex = 0;
        int length = nums.length;
        for (int fastIndex = slowIndex + 1; fastIndex < length; fastIndex++) {
            if (nums[slowIndex] != target) {
                slowIndex++;
            } else {
                if (nums[fastIndex] != target) {
                    int tmp = nums[slowIndex];
                    nums[slowIndex] = nums[fastIndex];
                    nums[fastIndex] = tmp;
                    slowIndex++;
                }
            }
        }
        return nums[slowIndex] == target ? slowIndex : slowIndex + 1;
    }
}
