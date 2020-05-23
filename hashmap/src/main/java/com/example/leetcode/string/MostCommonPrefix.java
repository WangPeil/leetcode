package com.example.leetcode.string;

/**
 * @author wangpeil
 * 最长公共字串
 * 依次比较所有字符串的前n个元素是否相等
 */
public class MostCommonPrefix {
    public static void main(String[] args) {
        System.out.println(mostCommonPrefix(new String[]{"flower", "flow", "flight"}));
    }

    static String mostCommonPrefix(String[] strings) {
        if (strings == null) {
            throw new NullPointerException("输入数组不能为空");
        }
        if (strings.length == 0) {
            return "";
        }
        String firstString = strings[0];
        int firstStringLength = firstString.length();
        int index = 0;
        outer:
        for (int i = 0; i < firstStringLength; i++) {
            for (int j = 1; j < strings.length; j++) {
                try {
                    if (firstString.charAt(i) != strings[j].charAt(i)) {
                        break outer;
                    }
                }  catch (StringIndexOutOfBoundsException e) {
                    break outer;
                }
            }
            index = i + 1;
        }
        return index == 0 ? "" : firstString.substring(0, index);
    }
}
