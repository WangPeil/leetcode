package com.example.leetcode.string;

/**
 * @author wangpeil
 * 最后一个单词的长度
 */
public class LengthOfLastWord {
    public static void main(String[] args) {
        int result = lengthOfLastWord("world  a ");
        System.out.println(result);
    }

    static int lengthOfLastWord(String string) {
        if (string == null || "".equals(string)) {
            return 0;
        }
        String str = string.trim();
        int lastIndex = str.lastIndexOf(" ");
        return lastIndex == -1 ? str.length() : str.length() - 1 - lastIndex;
    }
}
