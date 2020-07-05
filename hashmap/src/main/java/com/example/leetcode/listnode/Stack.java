package com.example.leetcode.listnode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Stack {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        TreeNode rootL = new TreeNode(4);
        TreeNode rootR = new TreeNode(8);
        root.left = rootL;
        root.right = rootR;
        TreeNode rootLL = new TreeNode(11);
        rootL.left = rootLL;
        TreeNode rootLLL = new TreeNode(7);
        TreeNode rootLLR = new TreeNode(2);
        rootLL.left = rootLLL;
        rootLL.right = rootLLR;
        TreeNode rootRL = new TreeNode(13);
        TreeNode rootRR = new TreeNode(4);
        rootR.left = rootRL;
        rootR.right = rootRR;
        TreeNode rootRRL = new TreeNode(5);
        TreeNode rootRRR = new TreeNode(1);
        rootRR.left = rootRRL;
        rootRR.right = rootRRR;

        TreeNode connect = connect(root);
        System.out.println(connect);


    }


    static TreeNode connect(TreeNode root) {
        //
        if (root == null) {
            return null;
        }

        List<Integer> list = Collections.singletonList(1);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = queue.poll();
                if (i == size - 1) {
                    curNode.next = null;
                } else {
                    curNode.next = queue.peek();
                }
                // 最后一个节点的下一个节点需要设置为null
                if (curNode.left != null) {
                    queue.offer(curNode.left);
                }
                if (curNode.right != null) {
                    queue.offer((curNode.right));
                }
            }
        }
        return root;
    }

}

class TreeNode {
    int val;
    TreeNode left, right, next;

    TreeNode(int val) {
        this.val = val;
    }
}
