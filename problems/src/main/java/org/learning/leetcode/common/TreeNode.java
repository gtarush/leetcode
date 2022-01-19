package org.learning.leetcode.common;

// just for the purpose of leetcode
// problem solve the treenode class attributes are kept as public
public class TreeNode {
  public int val;
  public TreeNode left, right;

  public TreeNode() {}

  public TreeNode(int val) {
    this.val = val;
  }

  public TreeNode(int val, TreeNode left, TreeNode right) {
    this.val = val;
    this.left = left;
    this.right = right;
  }
}
