package com.example.leetcode.dynamicplan;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author wangpeil
 */
public class YangHuiTriangle {
    public static void main(String[] args) {
        LinkedList<List<Integer>> list = new LinkedList<>();
        list.add(Arrays.asList(2));
        list.add(Arrays.asList(3, 4));
        list.add(Arrays.asList(6, 5, 7));
        list.add(Arrays.asList(4, 1, 8, 3));
        int i = minimumTotal(list);
        System.out.println(i);

    }

//    public static List<List<Integer>> generate(int numRows) {
//        // 动态规划
//        List<List<Integer>> resList = new LinkedList<>();
//        resList.add(Arrays.asList(1));
//        for (int i = 1; i < numRows; i++) {
//            List<Integer> tmp = new ArrayList<>();
//            tmp.add(1);
//            for (int j = 1; j <= i - 1; j++) {
//                tmp.add(resList.get(i - 1).get(j - 1) + resList.get(i - 1).get(j));
//            }
//            tmp.add(1);
//            resList.add(tmp);
//        }
//        return resList;
//    }

    public static int minimumTotal(List<List<Integer>> triangle) {
        int row = triangle.size();
        int col = triangle.get(row - 1).size();
        int[][] dp = new int[row][col];
        dp[0][0] = triangle.get(0).get(0);
        for (int i = 1; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + triangle.get(i).get(j);
                } else if (j == i) {
                    dp[i][j] = dp[i - 1][j - 1] + triangle.get(i).get(j);
                } else {
                    dp[i][j] = Math.min(dp[i - 1][j], dp[i - 1][j - 1]) + triangle.get(i).get(j);
                }
            }
        }
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < col; i++) {
            min = Math.min(min, dp[row - 1][i]);
        }
        return min;
    }


}
