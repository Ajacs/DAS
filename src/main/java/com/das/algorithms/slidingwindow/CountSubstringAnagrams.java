package com.das.algorithms.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class CountSubstringAnagrams {
  public static int countSubstringAnagrams(String s, String anagram) {
    int n = s.length();
    int k = anagram.length();

    if (k > n)
      return 0;

    int count = 0;
    Map<Character, Integer> targetMap = buildStringMap(anagram);
    Map<Character, Integer> windowMap = new HashMap<>();

    // 1. Llenamos la primera ventana de tamaño 'k'
    for (int i = 0; i < k; i++) {
      char ch = s.charAt(i);
      windowMap.put(ch, windowMap.getOrDefault(ch, 0) + 1);
    }

    // Evaluamos la primera ventana
    if (windowMap.equals(targetMap)) {
      count++;
    }

    // 2. Deslizamos la ventana carácter por carácter a través de la cadena
    for (int i = k; i < n; i++) {
      char charEntra = s.charAt(i);
      char charSale = s.charAt(i - k);

      // Agregar el carácter que entra por la derecha
      windowMap.put(charEntra, windowMap.getOrDefault(charEntra, 0) + 1);

      // Decrementar o remover el carácter que sale por la izquierda
      if (windowMap.get(charSale) == 1) {
        windowMap.remove(charSale);
      } else {
        windowMap.put(charSale, windowMap.get(charSale) - 1);
      }

      // Map.equals() en Java compara claves y valores exactos de forma nativa
      if (windowMap.equals(targetMap)) {
        count++;
      }
    }

    return count;
  }

  public static Map<Character, Integer> buildStringMap(String s) {
    var map = new HashMap<Character, Integer>();
    var charr = s.toCharArray();

    for (var ch : charr) {
      map.put(ch, map.getOrDefault(ch, 0) + 1);
    }

    return map;
  }

  public static void main(String[] args) {
    var s = "tacoctacabcatt";
    var anagram = "cat";
    System.out.println("Anagram substrings: " + countSubstringAnagrams(s, anagram));
  }
}
