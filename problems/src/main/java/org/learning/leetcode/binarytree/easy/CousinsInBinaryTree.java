package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

import java.util.HashMap;
import java.util.Map;

/**
 * Cousins in Binary Tree. See <a
 * href="https://leetcode.com/problems/cousins-in-binary-tree/">problem</a>
 *
 * <p>Given the root of a binary tree with unique values and the values of two different nodes of
 * the tree x and y, return true if the nodes corresponding to the values x and y in the tree are
 * cousins, or false otherwise.
 *
 * <p>Two nodes of a binary tree are cousins if they have the same depth with different parents.
 *
 * <p>Note that in a binary tree, the root node is at the depth 0, and children of each depth k node
 * are at the depth k + 1.
 */
public class CousinsInBinaryTree {

  private Map<Integer, Pair> nodesMap = new HashMap<>();

  public boolean isCousins(TreeNode root, int x, int y) {
    nodesMap = new HashMap<>();
    traverse(root, null, 0);

    Pair px = nodesMap.get(x);
    Pair py = nodesMap.get(y);

    if (px == null || py == null) {
      return false;
    }

    if (px.depth == py.depth && px.node != py.node) {
      return true;
    }
    return false;
  }

  private void traverse(TreeNode node, TreeNode parent, int depth) {
    if (node != null) {

      nodesMap.put(node.val, new Pair(parent, depth));

      traverse(node.left, node, depth + 1);
      traverse(node.right, node, depth + 1);
    }
  }

  private static class Pair {
    TreeNode node;
    int depth;

    public Pair(TreeNode node, int depth) {
      this.node = node;
      this.depth = depth;
    }
  }
}
