package com.example.leetcode.backtrace;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author wangpeil
 */
public class PhoneNumber {
    public static void main(String[] args) {
        System.out.println(letterCombinations(""));
    }

    static List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<>();
        if (digits == null || digits.length() == 0) {
            return list;
        }
        Map<Character, String[]> maps = new HashMap<>(16);
        maps.put('2', new String[]{"a", "b", "c"});
        maps.put('3', new String[]{"d", "e", "f"});
        maps.put('4', new String[]{"g", "h", "i"});
        maps.put('5', new String[]{"j", "k", "l"});
        maps.put('6', new String[]{"m", "n", "o"});
        maps.put('7', new String[]{"p", "q", "r", "s"});
        maps.put('8', new String[]{"t", "u", "v"});
        maps.put('9', new String[]{"w", "x", "y", "z"});
        backtrace(list, new StringBuilder(), maps, digits, 0);
        return list;
    }

    static void backtrace(List<String> list, StringBuilder stringBuilder, Map<Character, String[]> map, String digits, int next) {
        if (stringBuilder.length() == digits.length()) {
            list.add(stringBuilder.toString());
        }
        for (int i = next; i < digits.length(); i++) {
            String[] strings = map.getOrDefault(digits.charAt(i), null);
            for (String string : strings) {
                stringBuilder.append(string);
                backtrace(list, stringBuilder, map, digits, i + 1);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
    }
}
