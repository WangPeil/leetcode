package com.example.leetcode.listnode;

/**
 * @author wangpeil
 * 删除排序链表中的重复节点
 */
public class DeleteDuplicates {
    public static void main(String[] args) {

    }

    static ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head, fast = head.next;
        while (fast != null) {
            if (slow.val != fast.val) {
                slow.next = fast;
                slow = slow.next;
            }
            fast = fast.next;
        }
        slow.next = null;
        return head;
    }
}
