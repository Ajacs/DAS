/*
count subarray product

Write a method that takes in a List of positive integers and a target product. The method should return the number of subarrays that have a total product strictly less than the target.

*/
package com.das.algorithms.slidingwindow;

import java.util.List;

public class CountSubarrayProduct {
  public static int countSubarrayProduct(List<Integer> nums, int targetProduct) {
    if (targetProduct <= 1) {
      return 0;
    }

    var start = 0;
    var count = 0;
    var product = 1;

    for (var end = 0; end < nums.size(); end++) {
      product *= nums.get(end);

      while (product >= targetProduct && start <= end) {
        product /= nums.get(start);
        start++;
      }

      count += end - start + 1;
    }

    return count;
  }

  public static void main(String[] args) {
    var nums = List.of(10, 5, 2, 6);
    System.out.println("Subarrays below target: " + countSubarrayProduct(nums, 100));
  }
}
