package com.example.leetcode;

/**
 * @author wangpeil
 * <p>
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 * <p>
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * <p>
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class TwoNumberAdder {
    public static void main(String[] args) {
        ListNode fl1 = new ListNode(2);
        ListNode fl2 = new ListNode(4);
        ListNode fl3 = new ListNode(3);
        fl1.next = fl2;
        fl2.next = fl3;
        ListNode sl1 = new ListNode(5);
        ListNode sl2 = new ListNode(6);
        ListNode sl3 = new ListNode(4);
        sl1.next = sl2;
        sl2.next = sl3;
        ListNode ss = add(fl1, sl1);
        System.out.println(ss);
    }

    /**
     * 两个链表节点相加
     *
     * @param firstListNode  第一个节点
     * @param secondListNode 第二个节点
     * @return 相加和的节点
     */
    public static ListNode add(ListNode firstListNode, ListNode secondListNode) {
        if (firstListNode == null && secondListNode == null) {
            throw new NullPointerException("args must not be null");
        }
        boolean isAdd;
        ListNode fl = firstListNode;
        ListNode sl = secondListNode;
        ListNode headListNode;
        ListNode resultListNode;
        int sum = getListNodeVal(fl) + getListNodeVal(sl);
        isAdd = sum >= 10;
        headListNode = isAdd ? new ListNode(sum - 10) : new ListNode(sum);
        resultListNode = headListNode;
        while (isAdd || fl.next != null || sl.next != null) {
            // 有计算的必要性
            fl = fl.next;
            sl = sl.next;
            sum = isAdd ? getListNodeVal(fl) + getListNodeVal(sl) + 1 : getListNodeVal(fl) + getListNodeVal(sl);
            isAdd = sum >= 10;
            headListNode.next = isAdd ? new ListNode(sum - 10) : new ListNode(sum);
            headListNode = headListNode.next;
        }
        return resultListNode;
    }

    static int getListNodeVal(ListNode node) {
        return node == null ? 0 : node.val;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}
