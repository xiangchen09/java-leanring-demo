package com.tree.allProblem;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeLvlOrderTraversal102 {
    //单队列BFS 实现方法
    public List<List<Integer>> levelOrder_single(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            ArrayList<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode head = queue.poll();
                level.add(head.val);
                if (head.left != null) {
                    queue.offer(head.left);
                }
                if (head.right != null) {
                    queue.offer(head.right);
                }
            }
            result.add(level);
        }
        return result;
    }
    //双队列BFS 实现方法
    public List<List<Integer>> levelOrder_double(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        List<TreeNode> queue = new ArrayList<>();
        queue.add(root);

        while (!queue.isEmpty()) {
            List<TreeNode> next_queue = new ArrayList<>();
            result.add(toIntegerList(queue));

            for(TreeNode node: queue) {
                if (node.left != null) {
                    next_queue.add(node.left);
                }
                if (node.right != null) {
                    next_queue.add(node.right);
                }
            }
            queue = next_queue;
        }
        return result;
    }

    private List<Integer> toIntegerList(List<TreeNode> queue) {
        List<Integer> level = new ArrayList<>();
        for (TreeNode node: queue) {
            level.add(node.val);
        }
        return level;
    }

    //哨兵节点实现BFS
    public List<List<Integer>> levelOrder_DummyNode(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        queue.offer(null);

        List<Integer> level = new ArrayList<>();
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == null) {
                if (level.size() == 0) {
                    break;
                }
                result.add(level);
                level = new ArrayList<>();
                queue.offer(null);
                continue;
            }

            level.add(node.val);
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return result;
    }
}
