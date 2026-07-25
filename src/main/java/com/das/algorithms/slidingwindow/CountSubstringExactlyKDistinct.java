/*

count substring exactly k distinct

Write a method that takes in a string and a number k. The method should return the number of substrings that consist of exactly k distinct characters.
*/
package com.das.algorithms.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringExactlyKDistinct {
  public static int atMostKDistinct(String s, int k) {
    if (k < 0) {
      return 0;
    }

    int start = 0;
    int numSubstrings = 0;
    Map<Character, Integer> windowCounter = new HashMap<>();
    for (int end = 0; end < s.length(); end += 1) {
      char leadingChar = s.charAt(end);
      if (!windowCounter.containsKey(leadingChar)) {
        windowCounter.put(leadingChar, 0);
      }
      windowCounter.put(leadingChar, windowCounter.get(leadingChar) + 1);
      while (windowCounter.size() > k) {
        char trailingChar = s.charAt(start);
        windowCounter.put(trailingChar, windowCounter.get(trailingChar) - 1);
        start += 1;
        if (windowCounter.get(trailingChar) == 0) {
          windowCounter.remove(trailingChar);
        }
      }
      numSubstrings += end - start + 1;
    }
    return numSubstrings;
  }

  public static int countSubstringExactlyKDistinct(String s, int k) {
    if (k <= 0) {
      return 0;
    }
    return atMostKDistinct(s, k) - atMostKDistinct(s, k - 1);
  }

  public static void main(String[] args) {
    System.out.println("Substrings with exactly 2 distinct: "
        + countSubstringExactlyKDistinct("pqpqs", 2));
  }
}
