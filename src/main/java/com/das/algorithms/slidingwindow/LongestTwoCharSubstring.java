/*

longest two char substring

Write a method that takes in a string as an argument. The method should return the length of the longest substring that consists of 2 distinct characters

*/
package com.das.algorithms.slidingwindow;

import java.util.*;

public class LongestTwoCharSubstring {
  public static int longestTwoCharSubstring(String s) {
    var start = 0;
    var longest = 0;
    var counts = new HashMap<Character, Integer>();

    for (var end = 0; end < s.length(); end++) {
      var leadingChar = s.charAt(end);
      counts.put(leadingChar, counts.getOrDefault(leadingChar, 0) + 1);

      // Mientras la ventana tenga MÁS de 2 caracteres distintos, encogemos
      while (counts.size() > 2) {
        var trailingChar = s.charAt(start);
        counts.put(trailingChar, counts.get(trailingChar) - 1);

        if (counts.get(trailingChar) == 0) {
          counts.remove(trailingChar);
        }
        start++;
      }

      // SOLO actualizamos si la ventana actual tiene EXACTAMENTE 2 caracteres distintos
      if (counts.size() == 2) {
        longest = Math.max(longest, end - start + 1);
      }
    }

    return longest;
  }

  public static void main(String[] args) {
    System.out.println("Longest substring with exactly 2 distinct: "
        + longestTwoCharSubstring("ecebaaa"));
  }
}
