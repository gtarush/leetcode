package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

import java.util.Set;
import java.util.TreeSet;

/**
 * Second Minimum Node In a Binary Tree, see <a
 * href="https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/">problem</a>
 *
 * <p>Given a non-empty special binary tree consisting of nodes with the non-negative value, where
 * each node in this tree has exactly two or zero sub-node. If the node has two sub-nodes, then this
 * node's value is the smaller value among its two sub-nodes. More formally, the property root.val =
 * min(root.left.val, root.right.val) always holds.
 *
 * <p>Given such a binary tree, you need to output the second minimum value in the set made of all
 * the nodes' value in the whole tree.
 *
 * <p>If no such second minimum value exists, output -1 instead.
 */
public class SecondMinimumNode {

  public int findSecondMinimumValue(TreeNode root) {
    TreeSet<Integer> order = new TreeSet<>();

    traverse(root, order);

    if (order.size() > 1) {
      order.pollFirst();
      return order.pollFirst();
    }
    return -1;
  }

  private void traverse(TreeNode node, Set<Integer> ordering) {
    if (node != null) {
      ordering.add(node.val);

      traverse(node.left, ordering);
      traverse(node.right, ordering);
    }
  }
}
