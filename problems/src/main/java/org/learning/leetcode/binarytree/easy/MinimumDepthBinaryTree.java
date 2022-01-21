package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

/**
 * Minimum Depth of Binary Tree, see <a
 * href="https://leetcode.com/problems/minimum-depth-of-binary-tree/">problem</a>
 *
 * <p>Given a binary tree, find its minimum depth.
 *
 * <p>The minimum depth is the number of nodes along the shortest path from the root node down to
 * the nearest leaf node.
 *
 * <p>Note: A leaf is a node with no children.
 */
public class MinimumDepthBinaryTree {

  private int min = Integer.MAX_VALUE;

  public int minDepth(TreeNode root) {
    if (root == null) {
      return 0;
    }
    minDepth(root, 0);
    return min;
  }

  private int minDepth(TreeNode node, int depth) {
    if (node == null) {
      return min;
    }

    if (node.left == null && node.right == null) {
      min = Math.min(depth + 1, min);
    }

    return Math.min(minDepth(node.left, depth + 1), minDepth(node.right, depth + 1));
  }
}
