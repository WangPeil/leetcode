package com.example.leetcode.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangpeil
 * 字符串的Z型变换
 * 按列遍历
 * 将每行的元素放置到对应的StringBuilder中
 * 最后把所有的StringBuilder对象连接起来
 */
public class ZConverter {
    public static void main(String[] args) {
        System.out.println(convert("PAYPALISHIRING",3));
    }

    static String convert(String s, int numRows) {
        if (s == null) {
            return null;
        }
        if (numRows == 1) {
            return s;
        }

        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < Math.min(numRows, s.length()); i++) {
            rows.add(new StringBuilder());
        }

        int curRow = 0;
        boolean goingDown = false;

        for (char c : s.toCharArray()) {
            rows.get(curRow).append(c);
            if (curRow == 0 || curRow == numRows - 1) {
                goingDown = !goingDown;
            }
            curRow += goingDown ? 1 : -1;
        }

        StringBuilder ret = new StringBuilder();
        for (StringBuilder row : rows) {
            ret.append(row);
        }
        return ret.toString();
    }
}
