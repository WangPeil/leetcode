package com.example.leetcode.binarytree;

/**
 * @author wangpeil
 * 抽取两个节点的最近祖先
 */
public class CommonAncestor {
    public static void main(String[] args) {

    }

    static TreeNode leastCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        if (isReturnRoot(root, p, q)) {
            return root;
        } else if (root.val > p.val && root.val > q.val) {
            return leastCommonAncestor(root.left, p, q);
        } else {
            return leastCommonAncestor(root.right, p, q);
        }
    }

    private static boolean isReturnRoot(TreeNode root, TreeNode p, TreeNode q) {
        return (root.val > p.val && root.val < q.val)
                || (root.val < p.val && root.val > q.val)
                || (root.val == p.val || root.val == q.val);
    }
}
