package com.example.leetcode.listnode;

/**
 * @author wangpeil
 * 判断链表是否有环
 */
public class CycleList {
    public static void main(String[] args) {

    }

    static boolean hasCycle(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode slowNode = head;
        ListNode fastNode = head.next;
        while (slowNode != fastNode) {
            if (fastNode == null || fastNode.next == null) {
                return false;
            }
            slowNode = slowNode.next;
            fastNode = fastNode.next.next;
        }
        return true;
    }
}
