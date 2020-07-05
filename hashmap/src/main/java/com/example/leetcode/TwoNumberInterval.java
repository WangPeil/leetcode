package com.example.leetcode;

import java.util.prefs.PreferencesFactory;

/**
 * 数组中差值最大的两个数
 *
 * @author wangpeil
 */
public class TwoNumberInterval {
    public static void main(String[] args) {
        int i = maxProfit(new int[]{2, 4,1});
        System.out.println(i);
    }

    static int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE;
        int profit = 0;
        for (int price : prices) {
            // 计算最低价格
            if (price < minPrice) {
                minPrice = price;
            }
            if (price - minPrice > profit) {
                profit = price - minPrice;
            }
        }
        return profit;
    }
}
