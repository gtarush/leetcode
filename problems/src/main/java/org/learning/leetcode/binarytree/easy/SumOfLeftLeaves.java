package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

/**
 * Given the root of a binary tree, return the sum of all left leaves.
 * see <a href="https://leetcode.com/problems/sum-of-left-leaves/">problem</a>
 */
public class SumOfLeftLeaves {

  private int sum = 0;

  public int calculate(TreeNode root) {
    sum = 0;
    sumOfLeftLeavesHelper(root);
    return sum;
  }

  private void sumOfLeftLeavesHelper(TreeNode node) {
    if (node == null) {
      return;
    }

    if (node.left != null && isLeaf(node.left)) {
      sum += node.left.val;
    }

    sumOfLeftLeavesHelper(node.left);
    sumOfLeftLeavesHelper(node.right);
  }

  private boolean isLeaf(TreeNode node) {
    return node.left == null && node.right == null;
  }
}
