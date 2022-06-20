package com.tree.allProblem;

import java.util.Stack;

public class BinarySearchTreeIterator {
    // 模拟递归栈
    private Stack<TreeNode> stack = new Stack<>();

    // 左侧树枝一撸到底
    private void pushLeftBranch(TreeNode node) {
        while (node != null) {
            stack.push(node);
            node = node.left;
        }
    }

    public void BSTIterator(TreeNode root) {
        pushLeftBranch(root);
    }

    public int next() {
        TreeNode node = stack.pop();
        pushLeftBranch(node.right);
        return node.val;
    }

    public boolean hasNext() {
        return !stack.isEmpty();
    }
}
