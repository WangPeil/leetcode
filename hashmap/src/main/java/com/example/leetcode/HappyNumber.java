package com.example.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * @author wangpeil
 * 快乐树
 */
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappy(7));
    }

    static boolean isHappy(int num) {
        Set<Integer> set = new HashSet<>();

        while (num != 1) {
            if (set.contains(num)) {
                return false;
            }
            set.add(num);
            num = getSum(num);
        }
        return true;
    }

    private static int getSum(int num) {
        int sum = 0;

        while (num > 0) {
            sum += Math.pow(num % 10,2);
            num /= 10;
        }
        return sum;
    }

}
