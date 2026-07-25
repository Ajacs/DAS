package com.das.algorithms.slidingwindow;

import java.util.List;

public class LongestSubarraySum {
  public static int longestSubarraySum(List<Integer> nums, int targetSum) {
    var longest = -1;
    var start = 0;
    var currentSum = 0;

    for (var end = 0; end < nums.size(); end++) {
      currentSum += nums.get(end);

      // validamos que tengamos una suma menor
      while (currentSum > targetSum) {
        currentSum -= nums.get(start);
        start++;
      }

      if (currentSum == targetSum) {
        longest = Math.max(longest, (end - start) + 1);
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    var nums = List.of(1, 2, 1, 5, 2, 3, 10, 1, 9, 4, 3, 3, 7);
    var target = 10;
    System.out.println("Longest length: " + longestSubarraySum(nums, target));
  }
}
