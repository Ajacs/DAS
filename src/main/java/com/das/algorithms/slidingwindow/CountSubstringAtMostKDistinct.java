/*

count substring at most k distinct

Write a method that takes in a string and a number k. The method should return the number of substrings that consist of at most k distinct characters.

*/
package com.das.algorithms.slidingwindow;

import java.util.HashMap;

public class CountSubstringAtMostKDistinct {
  public static int countSubstringAtMostKDistinct(String s, int k) {
    if (k < 0) {
      return 0;
    }

    var map = new HashMap<Character, Integer>();
    var start = 0;
    var count = 0;

    for (var end = 0; end < s.length(); end++) {
      var currentChar = s.charAt(end);
      map.put(currentChar, map.getOrDefault(currentChar, 0) + 1);

      while (map.size() > k && start <= end) {
        var trailingChar = s.charAt(start);
        map.put(trailingChar, map.get(trailingChar) - 1);
        start++;
        if (map.get(trailingChar) == 0) {
          map.remove(trailingChar);
        }
      }

      count += end - start + 1;
    }

    return count;
  }

  public static void main(String[] args) {
    System.out.println("Substrings with at most 2 distinct: "
        + countSubstringAtMostKDistinct("pqpqs", 2));
  }
}
