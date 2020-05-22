package com.example.leetcode;

/**
 * @author wangpeil
 * 整数翻转
 * 带符号
 */
public class ReverseInteger {

    public static void main(String[] args) {
        System.out.println(reverseInteger(-94351));
    }

    static int reverseInteger(int integer) {
        if (integer == 0) {
            return 0;
        }
        int sign = Math.abs(integer) / integer;
        String string = String.valueOf(integer * sign);
        StringBuilder stringBuilder = new StringBuilder(string);
        int result;
        try {
            result = Integer.parseInt(stringBuilder.reverse().toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return result * sign;
    }
}
