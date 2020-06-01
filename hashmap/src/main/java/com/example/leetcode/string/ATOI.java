package com.example.leetcode.string;

/**
 * 字符串转整数
 * 超过最大整数 返回Integer.MAX
 */
public class ATOI {
    public static void main(String[] args) {
        System.out.println(atoi("+"));
    }

    static int atoi(String s) {
        if (return0(s)) {
            return 0;
        }
        boolean isEnd = false;
        boolean positive = false, negative = false, hasNumber = false;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '+' || ch == '-' || Character.isDigit(s.charAt(i))) {
                stringBuilder.append(ch);
                isEnd = true;
                if (ch == '+') {
                    positive = true;
                } else if (ch == '-') {
                    negative = true;
                } else {
                    hasNumber = true;
                }
            } else if (isEnd) {
                break;
            }
        }
        if (!hasNumber || (positive && negative)) {
            return 0;
        }

        int result;
        try {
            result = Integer.parseInt(stringBuilder.toString());
        } catch (NumberFormatException e) {
            result = stringBuilder.toString().charAt(0) == '-' ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
        return result;
    }

    static boolean return0(String s) {
        if (s == null || s.trim().length() == 0) {
            return true;
        } else {
            String str = s.trim();
            return !str.startsWith("-") && !str.startsWith("+") && !Character.isDigit(str.charAt(0));
        }
    }
}
