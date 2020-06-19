package com.example.leetcode.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author wangpeil
 */
public class Candies {
    public static void main(String[] args) {
        int[] ints = new int[]{2,3,5,1,3};
        System.out.println(kidWithCandies(ints,3));
    }

    static List<Boolean> kidWithCandies(int[] candies, int extraCandies) {
        List<Boolean> list = new ArrayList<>();
        if (candies == null || candies.length == 0) {
            return list;
        }
        int max = Arrays.stream(candies).reduce(0,Integer::max);
        for (int candy : candies) {
            list.add((candy + extraCandies >= max));
        }
        return list;
    }

}
