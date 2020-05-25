package com.example.leetcode.listnode;

/**
 * @author wangpeil
 * 翻转链表
 */
public class ReverseListNode {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        ListNode l2 = new ListNode(2);
        ListNode l3 = new ListNode(3);
        ListNode l4 = new ListNode(4);
        ListNode l5 = new ListNode(5);
        ListNode l6 = new ListNode(6);
        l1.next = l2;
        l2.next = l3;
        l3.next = l4;
        l4.next = l5;
        l5.next = l6;
        ListNode listNode = reverseListNode(l1);
        System.out.println(listNode);
    }

    static ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }

        // 1. 先把head节点向后移动
        // 2. current设置next指针指向前一个节点pre
        // 3. pre节点向右更新成cur
        // 4. cur节点向右更新成head
        ListNode pre = null;
        ListNode current = head;
        while (head != null) {
            head = head.next;
            current.next = pre;

            pre = current;
            current = head;
        }
        return pre;
    }

    /**
     * 递归实现反向遍历数组
     * @param head 头节点
     */
    static void reversePrintVal(ListNode head) {
        if (head.next != null) {
            reversePrintVal(head.next);
        }
        System.out.println(head.val);
    }
}
