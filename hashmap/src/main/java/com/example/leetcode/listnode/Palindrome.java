package com.example.leetcode.listnode;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @author wangpeil
 * 判断链表是否存在环
 */
public class Palindrome {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(1);
        ListNode l6 = new ListNode(1);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        System.out.println(isPalindrome(l1));
    }

    static boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        List<Integer> integers = Lists.newArrayList();
        ListNode current = head;
        while (current != null) {
            integers.add(current.val);
            current = current.next;
        }

        for (int i = 0, j = integers.size() - 1; i < j; i++, j--) {
            if (!integers.get(i).equals(integers.get(j))) {
                return false;
            }
        }
        return true;
    }
}
