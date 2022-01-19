package org.learning.leetcode.heaps.easy;

import java.util.*;

/**
 * Find Subsequence of Length K With the Largest Sum.
 * See <a href="https://leetcode.com/problems/find-subsequence-of-length-k-with-the-largest-sum/">problem</a>
 *
 * <p>You are given an integer array nums and an integer k. You want to find a subsequence of nums
 * of length k that has the largest sum.
 *
 * <p>Return any such subsequence as an integer array of length k.
 *
 * <p>A subsequence is an array that can be derived from another array by deleting some or no
 * elements without changing the order of the remaining elements.
 *
 * <p>Example 1:
 *
 * <p>Input: nums = [2,1,3,3], k = 2 Output: [3,3] Explanation: The subsequence has the largest sum
 * of 3 + 3 = 6.
 *
 * Example 2:
 * <p>Input: nums = [-1,-2,3,4], k = 3 Output: [-1,3,4] Explanation: The subsequence has the largest
 * sum of -1 + 3 + 4 = 6.
 *
 * Example 3:
 * <p>Input: nums = [3,4,3,3], k = 2 Output: [3,4] Explanation: The subsequence has the largest sum
 * of 3 + 4 = 7. Another possible subsequence is [4, 3].
 */
public class MaxSubsequence {

  public int[] findMaxSubsequence(int[] nums, int k) {
    PriorityQueue<Entry> pq = new PriorityQueue<>();

    for (int i = 0; i < nums.length; i++) {
      pq.offer(new Entry(nums[i], i));

      if (pq.size() > k) {
        pq.poll();
      }
    }

    List<Entry> entries = new ArrayList<>(pq);

    entries.sort(Comparator.comparingInt(e -> e.index));

    int[] subseq = new int[k];

    for (int i = 0; i < k; i++) {
      subseq[i] = entries.get(i).value;
    }

    return subseq;
  }

  private static class Entry implements Comparable<Entry> {
    int value;
    int index;

    public Entry(int value, int index) {
      this.value = value;
      this.index = index;
    }

    @Override
    public int compareTo(Entry e) {
      return Integer.compare(this.value, e.value);
    }
  }
}
