package com.example.leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/**
 * 滑动窗口到通用框架
 *
 * @author wangpeil
 */
public class SlidingWindow {

    /**
     * 滑动窗口通用框架
     *
     * @param string 原始字符串
     * @param target 目标字符串
     */
    void slidingWindow(String string, String target) {
        int length = string.length();
        Map<Character, Integer> need = new HashMap<>(length), window = new HashMap<>(length);
        char[] chars = string.toCharArray();
        for (int i = 0; i < target.length(); i++) {
            need.put(chars[i], need.getOrDefault(chars[i], 0) + 1);
        }

        int left = 0, right = 0;
        int valid = 0;
        while (right < length) {
            char rightChar = string.charAt(right);
            // 右移窗口
            right++;
            // TODO 窗口数据到更新

            while (true) {
                char leftChar = string.charAt(left);
                left++;
                // window窗口的更新
            }
        }

    }
}
