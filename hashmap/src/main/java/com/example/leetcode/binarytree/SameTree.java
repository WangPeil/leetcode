package com.example.leetcode.binarytree;

/**
 * @author wangpeil
 * 判断树是否相同
 * 中序遍历树否相同
 */
public class SameTree {
    public static void main(String[] args) {

    }

    static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null || q == null) {
            return false;
        }
        return p.val == q.val && isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}

class TreeNode {
    TreeNode left, right;
    int val;

    TreeNode(int val) {
        this.val = val;
    }
}
