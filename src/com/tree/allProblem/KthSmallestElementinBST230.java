package com.tree.allProblem;


import com.tree.allProblem.TreeNode;

public class KthSmallestElementinBST230 {
    public int kthSmallest(TreeNode root, int k) {
        traverse(root, k);
        return res;
    }

    int res = 0;
    int rank = 0;
    private void traverse(TreeNode root, int k) {
        if (root == null) return;
        traverse(root.left, k);
        rank++;
        if (k == rank) {
            res = root.val;
            return;
        }
        traverse(root.right, k);
    }
}
