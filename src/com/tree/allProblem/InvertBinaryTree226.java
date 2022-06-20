package com.tree.allProblem;

public class InvertBinaryTree226 {
    public TreeNode invertTree(TreeNode root) {
        //base case
        if (root == null) {
            return null;
        }
        //root 节点需要交换它的左右节点
        TreeNode temp = root.left;
        root.left = root.right;
        root.right = temp;

        //让左右节点继续翻转他们的子节点
        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
