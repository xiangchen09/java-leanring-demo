package com.tree.allProblem;

public class BalancedBinaryTree {
    public boolean isBalanced(TreeNode root) {
        maxDepth(root);
        return isBalanced;
    }
    boolean isBalanced = true;
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        int leftMaxDepth;
        int rightMaxDepth;
        leftMaxDepth = maxDepth(root.left);
        rightMaxDepth = maxDepth(root.right);

        if (Math.abs(rightMaxDepth - leftMaxDepth) > 1) {
            isBalanced = false;
        }
        return 1 + Math.max(leftMaxDepth, rightMaxDepth);
    }
}
