package com.das.algorithms.slidingwindow;

import java.util.List;

public class FindSubarraySum {
  public static List<Integer> findSubarraySum(List<Integer> nums, int targetSum) {
    var windowSum = 0;
    var start = 0;

    for (var end = 0; end < nums.size(); end++) {
      windowSum += nums.get(end);

      while(windowSum > targetSum) {
        windowSum -= nums.get(start);
        start++;
      }

      if (windowSum == targetSum) {
        return List.of(start, end);
      }
    }

    return null;
  }

  public static void main(String[] args) {
    var nums = List.of(1, 2, 3, 7, 5);
    var targetSum = 12;
    System.out.println("Subarray indices: " + findSubarraySum(nums, targetSum));
  }
}
