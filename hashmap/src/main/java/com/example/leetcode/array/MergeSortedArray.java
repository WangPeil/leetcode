package com.example.leetcode.array;

import java.util.Arrays;

/**
 * @author wangpeil
 * 合并有序数组
 */
public class MergeSortedArray {
    public static void main(String[] args) {
        int[] nums1 = new int[]{1, 2, 3, 3, 7, 8, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] nums2 = new int[]{5, 8, 9};
        merge(nums1, 7, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    static void merge(int[] nums1, int m, int[] nums2, int n) {
        if (nums1 == null && nums2 == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        assert nums1 != null;
        if (m == 0) {
            System.arraycopy(nums2, 0, nums1, 0, n);
            return;
        }
        if (n == 0) {
            return;
        }
        // m n 都不为0
        // 从后往前放置数字
        int i = m - 1;
        int j = n - 1;
        int index = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] < nums2[j]) {
                nums1[index] = nums2[j--];
            } else if (nums1[i] > nums2[j]) {
                nums1[index] = nums1[i--];
            } else {
                nums1[index--] = nums1[i--];
                nums1[index] = nums2[j--];
            }
            index--;
        }
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }
}
