package com.das.algorithms.slidingwindow;

import java.util.HashSet;

public class LongestUniqueSubstring {
  public static int longestUniqueSubstring(String s) {
    var start = 0;
    var longest = 0;
    var seen = new HashSet<Character>();

    for (var end = 0; end < s.length(); end++) {
      var leadingChar = s.charAt(end);

      while (seen.contains(leadingChar)) {
        var trailingChar = s.charAt(start);
        seen.remove(trailingChar);
        start++;
      }

      seen.add(leadingChar);
      longest = Math.max(longest, end - start + 1);
    }

    return longest;
  }

  public static void main(String[] args) {
    var str = "abcabcqbb";
    System.out.println("Longest unique substring length: " + longestUniqueSubstring(str));
  }
}
