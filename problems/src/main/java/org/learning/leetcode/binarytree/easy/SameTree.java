package org.learning.leetcode.binarytree.easy;

import org.learning.leetcode.common.TreeNode;

/**
 * Same Tree, see <a href="https://leetcode.com/problems/same-tree/">problem</a>
 *
 * <p>Given the roots of two binary trees p and q, write a function to check if they are the same or
 * not.
 *
 * <p>Two binary trees are considered the same if they are structurally identical, and the nodes
 * have the same value.
 *
 * <p>Example 1:
 *
 * <p>Input: p = [1,2,3], q = [1,2,3] Output: true
 *
 * <p>Example 2:
 *
 * <p>Input: p = [1,2], q = [1,null,2] Output: false
 *
 * <p>Example 3:
 *
 * <p>Input: p = [1,2,1], q = [1,1,2] Output: false
 *
 * <p>Constraints:
 *
 * <p>The number of nodes in both trees is in the range [0, 100]. -104 <= Node.val <= 104
 */
public class SameTree {

  public boolean isSameTree(TreeNode p, TreeNode q) {

    if (p == null && q == null) {
      return true;
    }

    if (p != null && q != null && (p.val == q.val)) {
      return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    return false;
  }
}
