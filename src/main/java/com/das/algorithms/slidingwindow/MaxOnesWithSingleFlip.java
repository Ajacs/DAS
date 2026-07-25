/*

max ones with single flip

Write a method that takes in a string containing only '0's and '1's. The method should return the length of the longest consecutive streak of '1's possible if you are allowed to change at most one '0' into a '1'.

*/

package com.das.algorithms.slidingwindow;

public class MaxOnesWithSingleFlip {
  public static int maxOnesWithSingleFlip(String s) {
    var start = 0;
    var zeros = 0;
    var longest = 0;

    for (var end = 0; end < s.length(); end++) {
      if (s.charAt(end) == '0') {
        zeros++;
      }

      while (zeros > 1) {
        if (s.charAt(start) == '0') {
          zeros--;
        }
        start++;
      }

      longest = Math.max(longest, end - start + 1);
    }
    return longest;
  }

  public static void main(String[] args) {
    System.out.println("Longest streak with one flip: "
        + maxOnesWithSingleFlip("10110110"));
  }
}
