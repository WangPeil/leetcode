package com.example.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 全排列
 * 回溯法
 *
 * @author wangpeil
 */
public class Permutation {
    public static void main(String[] args) {
        System.out.println(getPermutation(4));
    }

    static List<List<Integer>> getPermutation(int n) {
        List<List<Integer>> list = new ArrayList<>();
        if (n < 1) {
            return list;
        }
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            integers.add(i);
        }
        backtrace(list, integers, n, 0);
        return list;
    }

    static void backtrace(List<List<Integer>> list, List<Integer> integers, int max, int cur) {
        if (cur == max) {
            list.add(new ArrayList<>(integers));
            return;
        }
        for (int i = cur; i < max; i++) {
            Collections.swap(integers, i, cur);
            backtrace(list, integers, max, cur + 1);
            Collections.swap(integers, i, cur);
        }
    }
}
