package com.example.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * @author wangpeil
 * 罗马数字转阿拉伯数字
 */
public class RomeNumber {
    private static final Map<String, Integer> MAP = new HashMap<>(32);

    static {
        MAP.put("I", 1);
        MAP.put("IV", 4);
        MAP.put("V", 5);
        MAP.put("IX", 9);
        MAP.put("X", 10);
        MAP.put("XL", 40);
        MAP.put("L", 50);
        MAP.put("XC", 90);
        MAP.put("C", 100);
        MAP.put("CD", 400);
        MAP.put("D", 500);
        MAP.put("CM", 900);
        MAP.put("M", 1000);
    }

    public static void main(String[] args) {
        System.out.println(romeNumber("DCXXI"));
    }

    static int romeNumber(String romeNumberString) {
        if (romeNumberString == null || romeNumberString.length() == 0) {
            throw new NullPointerException("输入字符串不允许为空");
        }
        int sum = 0;
        String preString, nextString;
        for (int i = 0; i < romeNumberString.length(); i++) {
            preString = String.valueOf(romeNumberString.charAt(i));
            nextString = i != romeNumberString.length() - 1 ? String.valueOf(romeNumberString.charAt(i + 1)) : null;
            switch (preString) {
                case "M":
                case "D":
                case "L":
                case "V":
                    sum += MAP.get(preString);
                    break;
                case "C":
                    if ("D".equals(nextString) || "M".equals(nextString)) {
                        sum += MAP.get(preString + nextString);
                        i += 1;
                    } else {
                        sum += MAP.get(preString);
                    }
                    break;
                case "X":
                    if ("L".equals(nextString) || "C".equals(nextString)) {
                        sum += MAP.get(preString + nextString);
                        i += 1;
                    } else {
                        sum += MAP.get(preString);
                    }
                    break;
                case "I":
                    if ("V".equals(nextString) || "X".equals(nextString)) {
                        sum += MAP.get(preString + nextString);
                        i += 1;
                    } else {
                        sum += MAP.get(preString);
                    }
                    break;
                default:
            }
        }
        return sum;
    }
}
