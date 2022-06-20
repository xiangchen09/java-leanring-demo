package com.tree.allProblem;

public class PopulatingNextRightPointersInEachNode116 {
    public Node connect(Node root) {
        if (root == null) return null;
        connectTwoNode(root.left, root.right);
        return root;
    }

    void connectTwoNode(Node nodeLeft, Node nodeRight) {
        if (nodeLeft == null || nodeRight == null) {
            return;
        }
        nodeLeft.next = nodeRight;

        connectTwoNode(nodeLeft.left, nodeLeft.right);
        connectTwoNode(nodeRight.left, nodeRight.right);
        connectTwoNode(nodeLeft.right, nodeRight.left);
    }
}
