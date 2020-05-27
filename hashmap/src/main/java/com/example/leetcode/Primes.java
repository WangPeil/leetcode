package com.example.leetcode;

import javax.swing.plaf.metal.*;
import java.util.Arrays;

/**
 * @author wangpeil
 * 质数
 */
public class Primes {
    public static void main(String[] args) {
        System.out.println(countPrimes(1000));
    }

    static int countPrimes(int num) {
        boolean[] isPrimes = new boolean[num];
        Arrays.fill(isPrimes, true);

        for (int i = 2; i < Math.sqrt(num); i++) {
            if (isPrimes[i]) {
                // i的倍数不是素数
                for (int j = i * i; j < num; j += i) {
                    isPrimes[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = 2; i < num; i++) {
            if(isPrimes[i]) {
                count++;
            }
        }
        return count;
    }


    static boolean isPrimes(int num) {
        if (num == 0 || num == 1) {
            return false;
        }
        if (num == 2) {
            return true;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
