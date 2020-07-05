package com.example.leetcode.binarytree;

import java.util.LinkedList;
import java.util.List;
import java.util.TooManyListenersException;

/**
 * @author wangpeil
 */
public class PathSum {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(4);
        TreeNode l = new TreeNode(9);
        TreeNode r = new TreeNode(0);
        root.left = l;
        root.right = r;
        TreeNode ll = new TreeNode(5);
        TreeNode lr = new TreeNode(1);
        l.left = ll;
        l.right = lr;
        int i = new PathSum().sumNumbers(root);
        System.out.println(i);

    }

    private int sum;

    public int sumNumbers(TreeNode root) {
        if (root == null) {
            return 0;
        }
        sumNumbers(root, root.val);
        return sum;
    }

    public void sumNumbers(TreeNode root, int curSum) {
        if (root.left == null && root.right == null) {
            sum += curSum;
            return;
        }
        if (root.left != null) {
            sumNumbers(root.left, curSum * 10 + root.left.val);
        }
        if (root.right != null) {
            sumNumbers(root.right, curSum * 10 + root.right.val);
        }
    }
}
