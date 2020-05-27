package com.example.leetcode.listnode;

/**
 * @author wangpeil
 * 删除链表元素
 */
public class RemoveListNode {
    public static void main(String[] args) {

    }

    static ListNode removeElement(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        // 构建哨兵节点 使列表永不为空 永不无头
        ListNode sentinel = new ListNode(0);
        sentinel.next = head;
        ListNode pre = sentinel, current = head;
        while (current != null) {
            if (current.val == val) {
                pre.next = current.next;
            } else {
                pre = current;
            }
            current = current.next;
        }
        return sentinel.next;
    }
}
