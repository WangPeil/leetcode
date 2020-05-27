package com.example.leetcode.string;

import java.util.HashMap;
import java.util.Map;

/**
 * 同质字符串
 * 任意一个字符替换成另外一个字符 还成立
 *
 * @author wangpeil
 */
public class Isomorphic {
    public static void main(String[] args) {
        boolean result = isIsomorphic("aa", "ab");
        System.out.println(result);
    }

    static boolean isIsomorphic(String s, String t) {
        if (s == null && t == null) {
            return true;
        }
        if (s == null || t == null) {
            return false;
        }
        int length = s.length();
        int initialCapacity = length >= 26 ? 32 : length;
        Map<Character, Character> hashMap = new HashMap<>(initialCapacity);
        for (int i = 0; i < length; i++) {
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if (!hashMap.containsKey(chs)) {
                // 不包含该字符添加到hashMap中
                hashMap.put(chs, cht);
            } else if (hashMap.get(chs) != cht) {
                return false;
            }
        }
        return true;
    }
}
