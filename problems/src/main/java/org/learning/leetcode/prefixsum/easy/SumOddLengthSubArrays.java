package org.learning.leetcode.prefixsum.easy;

import java.util.Arrays;

/**
 * Sum of All Odd Length Subarrays, see <a
 * href="https://leetcode.com/problems/sum-of-all-odd-length-subarrays/">problem</a>
 *
 * <p>Given an array of positive integers arr, calculate the sum of all possible odd-length
 * subarrays.
 *
 * <p>A subarray is a contiguous subsequence of the array.
 *
 * <p>Return the sum of all odd-length subarrays of arr.
 */
public class SumOddLengthSubArrays {

  public int find(int[] arr) {
    int sum = 0;
    for (int i = 1; i <= arr.length; i = i + 2) {
      for (int j = 0; j < arr.length; j++) {
        if (j + i - 1 < arr.length) {
          sum += Arrays.stream(arr, j, i + j).sum();
        } else {
          break;
        }
      }
    }
    return sum;
  }

  // using number of contributions
  public int findUsingContributions(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      int contributions = (((i + 1) * (arr.length - i)) + 1) / 2;
      sum += (contributions * arr[i]);
    }
    return sum;
  }

  public static void main(String[] args) {
    int[] arr = new int[] {1, 4, 2, 5, 3};

    SumOddLengthSubArrays solution = new SumOddLengthSubArrays();

    System.out.println(solution.find(arr));
    System.out.println(solution.findUsingContributions(arr));
  }
}
