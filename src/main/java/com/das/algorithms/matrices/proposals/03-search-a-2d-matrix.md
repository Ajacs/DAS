# Search a 2D Matrix

**Dificultad:** Media  
**Patrón:** Búsqueda binaria sobre matriz ordenada  
**Referencia:** [LeetCode 74](https://leetcode.com/problems/search-a-2d-matrix/)

## Description

Given a matrix where each row is sorted and the first value of each row is greater than the final value of the previous row, determine whether it contains a target value.

## Input

```text
matrix: int[][]
target: int
```

Ejemplo:

```text
matrix = [
  [1, 3, 5, 7],
  [10, 11, 16, 20],
  [23, 30, 34, 60]
]
target = 3
```

## Output

```text
true
```

## Constraints

- `1 <= matrix.length <= 100`
- `1 <= matrix[i].length <= 100`
- `-10,000 <= matrix[i][j], target <= 10,000`
- Each row is sorted in increasing order.
- The first value of each row is greater than the final value of the previous row.
- Recommended target: `O(log(m * n))`.
