package com.example.leetcode;

import java.util.*;

/**
 * @author wangpeil
 * 括号匹配
 */
public class Valid {
    public static void main(String[] args) {
        System.out.println(isValid("((((())))))"));
    }

    static boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return true;
        }
        // 创建一个队列
        Deque<String> deque = new ArrayDeque<>();
        // 队列的一端进一端出表示为栈
        // 最后栈的大小必须为0
        Map<String, String> map = new HashMap<>();
        map.put(")", "(");
        map.put("]", "[");
        map.put("}", "{");
        if (!map.containsValue(String.valueOf(s.charAt(0)))) {
            return false;
        }
        for (int i = 0; i < s.length(); i++) {
            String string = String.valueOf(s.charAt(i));
            if (map.containsValue(string)) {
                // 入栈
                deque.addFirst(string);
            } else if (map.containsKey(string)) {
                // 对应出栈 判断队列大小
                if (deque.isEmpty()) {
                    return false;
                }
                if (!deque.removeFirst().equals(map.get(string))) {
                    return false;
                }
            }
        }
        return deque.isEmpty();
    }
}
