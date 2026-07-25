# Spiral Matrix

**Dificultad:** Media  
**Patrón:** Simulación por límites  
**Referencia:** [LeetCode 54](https://leetcode.com/problems/spiral-matrix/)

## Description

Given a rectangular matrix, return all elements in spiral order: top row, right column, bottom row in reverse, and left column upward, repeating toward the center.

## Input

```text
matrix: int[][]
```

Ejemplo:

```text
matrix = [
  [1, 2, 3],
  [4, 5, 6],
  [7, 8, 9]
]
```

## Output

```text
[1, 2, 3, 6, 9, 8, 7, 4, 5]
```

## Constraints

- `1 <= matrix.length <= 10`
- `1 <= matrix[i].length <= 10`
- `-100 <= matrix[i][j] <= 100`
- The matrix may be rectangular.
- Every cell must appear exactly once.
