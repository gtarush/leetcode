package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

/**
 * Path Sum, see <a href="https://leetcode.com/problems/path-sum/">problem</a>
 *
 * <p>Given the root of a binary tree and an integer targetSum, return true if the tree has a
 * root-to-leaf path such that adding up all the values along the path equals targetSum.
 *
 * <p>A leaf is a node with no children.
 */
public class PathSum {

  public boolean hasPathSum(TreeNode root, int targetSum) {
    return hasPathSum(root, targetSum, 0);
  }

  private boolean hasPathSum(TreeNode node, int targetSum, int sum) {
    if (node == null) {
      return false;
    }

    if (node.left == null && node.right == null) {
      return targetSum == sum + node.val;
    }

    return hasPathSum(node.left, targetSum, sum + node.val)
        || hasPathSum(node.right, targetSum, sum + node.val);
  }
}
