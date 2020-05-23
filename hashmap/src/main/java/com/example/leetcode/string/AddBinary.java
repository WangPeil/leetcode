package com.example.leetcode.string;

/**
 * @author wangpeil
 * 二进制求和
 */
public class AddBinary {
    public static void main(String[] args) {
        String a = "1010", b = "1011";
        String result = addBinary(a, b);
        System.out.println(result);
    }

    static String addBinary(String a, String b) {
        if (a == null && b == null) {
            throw new NullPointerException("输入字符串不能为空");
        }
        if (a == null) {
            return b;
        }
        if (b == null) {
            return a;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int l1 = a.length() - 1;
        int l2 = b.length() - 1;
        int sum;
        int add = 0;
        while (l1 >= 0 || l2 >= 0) {
            int tmp1, tmp2;
            tmp1 = l1 >= 0 ? a.charAt(l1) - '0' : 0;
            tmp2 = l2 >= 0 ? b.charAt(l2) - '0' : 0;
            sum = tmp1 ^ tmp2 ^ add;
            add = (tmp1 & tmp2) | (add & (tmp1 | tmp2));
            stringBuilder.append(sum);
            l1--;
            l2--;
        }
        if (add > 0) {
            stringBuilder.append(add);
        }
        return stringBuilder.reverse().toString();
    }
}
