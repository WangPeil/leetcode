package com.example.leetcode;

/**
 * @author wangpeil
 * 删除有序数组中的重复数字
 * 空间复杂度O(1)
 * <p>
 * 思路：将重复的数字替换到后面
 */
public class RemoveDuplicatedNumber {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        int result = removeDuplicates(nums);
        System.out.println(result);
    }

    /**
     * 在数组上将不重复的数字放置到前n位
     * 需要两个索引表示
     *
     * @param nums 数组
     * @return 不重复数字个数
     */
    static int removeDuplicates(int[] nums) {
        if (nums == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        int slowIndex = 0;
        int length = nums.length;
        for (int fastIndex = slowIndex + 1; fastIndex < length;++fastIndex ) {
            // slowIndex的数字和fastIndex的数字不相同 fastIndex向右移位
            if (nums[slowIndex] < nums[fastIndex]) {
                slowIndex++;
                nums[slowIndex] = nums[fastIndex];
            }
            // slowIndex数字和fastIndex数字相等
            // fastIndex向➡️移动
        }
        return slowIndex + 1;
    }
}
