package com.example.leetcode.array;


/**
 * @author wangpeil
 * 寻找有序数组中 给定数字的插入位置
 */
public class SearchInsert {
    public static void main(String[] args) {
        int[] nums = new int[]{1, 3, 5, 6};
        int result = searchInsertPosition(nums, 5);
        System.out.println(result);
    }

    static int searchInsertPosition(int[] nums, int target) {
        // 二分查找法
        if (nums == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        if (nums.length == 0) {
            return 0;
        }
        int begin = 0;
        int end = nums.length - 1;
        int middle = (end - begin) / 2;
        while (begin <= end) {
            if (nums[begin] > target) {
                return begin;
            }
            if (nums[end] < target) {
                return end + 1;
            }
            if (nums[middle] == target) {
                return middle;
            }
            if (nums[middle] < target) {
                begin = middle + 1;
            } else {
                end = middle - 1;
            }
            middle = (begin + end) / 2;
        }
        return nums[middle] < target ? middle + 1 : middle;
    }
}
