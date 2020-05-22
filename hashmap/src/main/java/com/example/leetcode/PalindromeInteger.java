package com.example.leetcode;

/**
 * @author wangpeil
 * 判断是否回文
 */
public class PalindromeInteger {
    public static void main(String[] args) {
        System.out.println(palindromeInteger(+111));
    }

    static boolean palindromeInteger(int integer) {
        if (integer < 0) {
            return false;
        }
        String string = String.valueOf(integer);
        String reverseString = new StringBuilder(string).reverse().toString();
        return string.equals(reverseString);
    }
}
