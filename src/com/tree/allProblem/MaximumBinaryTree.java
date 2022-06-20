package com.tree.allProblem;

public class MaximumBinaryTree {
    public TreeNode constructMaxBinaryTree(int[] nums) {
        return build(nums, 0, nums.length - 1);
    }

    TreeNode build(int[] nums, int left, int right) {
        if (left > right) {
            return null;
        }

        int index = -1;
        int maxVal = Integer.MIN_VALUE;
        for (int i = left; i <= right; i++) {
            if (maxVal < nums[i]) {
                index = i;
                maxVal = nums[i];
            }
        }

        TreeNode root = new TreeNode(maxVal);
        root.left = build(nums, left, index - 1);
        root.right = build(nums, index + 1, right);

        return root;
    }
}
