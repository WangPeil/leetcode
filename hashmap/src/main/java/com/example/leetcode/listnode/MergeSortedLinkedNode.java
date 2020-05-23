package com.example.leetcode.listnode;


/**
 * @author wangpeil
 * 合并两个有序链表
 */
public class MergeSortedLinkedNode {
    public static void main(String[] args) {
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(2);
        ListNode listNode3 = new ListNode(4);
        ListNode listNode4 = new ListNode(5);
        ListNode listNode5 = new ListNode(6);
        ListNode listNode6 = new ListNode(7);
        listNode1.next = listNode2;
        listNode2.next = listNode3;

        listNode4.next = listNode5;
        listNode5.next = listNode6;

        ListNode result = mergeTwoList(listNode1, listNode4);
        System.out.println(result);
    }

    /**
     * 合并两个有序链表
     *
     * @param l1 有序链表1
     * @param l2 有序链表2
     * @return 合并后的头节点
     */
    static ListNode mergeTwoList(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        ListNode curL1 = l1;
        ListNode curL2 = l2;
        ListNode head = new ListNode(0);
        ListNode currentNode = head;
        while (true) {
            if (curL1 != null && curL2 != null) {
                // 比较curL1和curL2的节点值大小
                if (curL1.val > curL2.val) {
                    currentNode.next = curL2;
                    curL2 = curL2.next;
                } else if (curL1.val < curL2.val) {
                    currentNode.next = curL1;
                    curL1 = curL1.next;
                } else {
                    currentNode.next = curL1;
                    curL1 = curL1.next;
                    currentNode.next.next = curL2;
                    curL2 = curL2.next;
                    currentNode = currentNode.next;
                }
            } else {
                break;
            }
            currentNode = currentNode.next;
        }
        if (curL2 != null) {
            // 链表1遍历结束 链表2还没有遍历完
            // head直接连接链表2的全部节点
            currentNode.next = curL2;
        } else if (curL1 != null) {
            currentNode.next = curL1;
        }
        return head.next;
    }
}
