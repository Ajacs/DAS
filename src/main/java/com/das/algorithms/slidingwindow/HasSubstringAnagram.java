package com.das.algorithms.slidingwindow;

import java.util.*;

public class HasSubstringAnagram {
  public static boolean hasSubstringAnagram(String s, String anagram) {
    int n = s.length();
    int k = anagram.length();
    if (k > n) {
      return false;
    }

    Map<Character, Integer> targetMap = buildStringMap(anagram);
    Map<Character, Integer> windowMap = new HashMap<>();

    for (int i = 0; i < k; i++) {
      char ch = s.charAt(i);
      windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
    }

    if (windowMap.equals(targetMap)) {
      return true;
    }

    for (int i = k; i < n; i++) {
      char charEntra = s.charAt(i);
      char charSale = s.charAt(i - k);

      windowMap.put(charEntra, windowMap.getOrDefault(charEntra, 0) + 1);

      if (windowMap.get(charSale) == 1) {
        windowMap.remove(charSale);
      } else {
        windowMap.put(charSale, windowMap.get(charSale) - 1);
      }

      if (windowMap.equals(targetMap)) {
        return true;
      }
    }

    return false;
  }

  public static Map<Character, Integer> buildStringMap(String s) {
    var map = new HashMap<Character, Integer>();
    for (var ch : s.toCharArray()) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }
    return map;
  }

  public static void main(String[] args) {
    System.out.println("Contains anagram: " + hasSubstringAnagram("breakdowns", "snow"));
  }
}
