package com.example.leetcode;

/**
 * @author wangpeil
 */
public class PowerOfTwo {
    public static void main(String[] args) {
        boolean result = isPowerOfTwo(128);
        System.out.println(result);
    }

    static boolean isPowerOfTwo(int n) {
        if (n <= 0) {
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
