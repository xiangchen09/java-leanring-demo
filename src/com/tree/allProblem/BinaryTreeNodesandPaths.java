package com.tree.allProblem;

import java.util.List;

public class BinaryTreeNodesandPaths {
    public void findNodes(TreeNode node, List<TreeNode> nodes) {
        if (node == null) return;
        nodes.add(node);
        findNodes(node.left, nodes);
        findNodes(node.right, nodes);
    }

    public void findPaths(TreeNode node, String path, List<String> paths) {
        if (node == null) return;
        if (node.left == null && node.right == null) {
            paths.add(path);
            return;
        }
        if (node.left != null) {
            findPaths(node.left, path + "->" + node.left.val, paths);
        }
        if (node.right != null) {
            findPaths(node.right, path + "->" + node.right.val, paths);
        }
    }
}
