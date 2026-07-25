# Valid Anagram

**Dificultad:** Fácil  
**Patrón:** Conteo de frecuencias  
**Referencia:** [LeetCode 242](https://leetcode.com/problems/valid-anagram/)

## Description

Given two strings, determine whether the second can be formed by rearranging every character from the first string exactly once.

## Input

```text
s: String
t: String
```

Ejemplo:

```text
s = "anagram"
t = "nagaram"
```

## Output

```text
true
```

## Constraints

- `1 <= s.length, t.length <= 50,000`
- `s` and `t` contain lowercase English letters.
- Character frequencies matter; comparing only the set of characters is insufficient.
