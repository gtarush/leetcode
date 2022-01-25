package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

import java.util.Arrays;

/**
 * Balanced Binary Tree, see <a
 * href="https://leetcode.com/problems/balanced-binary-tree/">problem</a>
 *
 * <p>Given a binary tree, determine if it is height-balanced.
 *
 * <p>For this problem, a height-balanced binary tree is defined as:
 *
 * <p>a binary tree in which the left and right subtrees of every node differ in height by no more
 * than 1.
 */
public class BalancedBinaryTree {

  public boolean isBalanced(TreeNode root) {
    if (root == null) {
      return true;
    }

    return height(root) != -1;
  }

  private int height(TreeNode node) {
    if (node == null) {
      return 0;
    }

    int l = height(node.left);
    int r = height(node.right);

    if (l == -1 || r == -1 || Math.abs(l - r) > 1) {
      return -1;
    }

    Arrays.stream(new int[]{}, 1, 3).sum();

    return Math.max(l, r) + 1;
  }
}
