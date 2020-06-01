package com.example.leetcode.backtrace;

import java.util.ArrayList;
import java.util.List;

/**
 * 生成有效的括号
 * 回溯法
 *
 * @author wangpeil
 */
public class Parenthesis {
    public static void main(String[] args) {
        System.out.println(generateParenthesis(10));
    }

    static List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        if (n < 0) {
            return list;
        }
        backtrace(list, new StringBuilder(), 0, 0, n);
        return list;
    }

    static void backtrace(List<String> list, StringBuilder stringBuilder, int open, int close, int max) {
        if (stringBuilder.length() == 2 * max) {
            list.add(stringBuilder.toString());
            return;
        }
        if (open < max) {
            stringBuilder.append('(');
            backtrace(list, stringBuilder, open + 1, close, max);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if (open > close) {
            // 判断括号有效性
            stringBuilder.append(')');
            backtrace(list, stringBuilder, open, close + 1, max);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
