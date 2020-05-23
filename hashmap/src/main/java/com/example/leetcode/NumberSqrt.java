package com.example.leetcode;

/**
 * @author wangpeil
 * 计算某个整数的平方根
 */
public class NumberSqrt {
    public static void main(String[] args) {

    }

    static int sqrt(int x) {
        if (x == 0) {
            return 0;
        }
        int sqrt = (int) Math.exp(0.5 * Math.log(x));
        return (long) (sqrt + 1) * (sqrt + 1) <= x ? sqrt + 1 : sqrt;
    }
}
