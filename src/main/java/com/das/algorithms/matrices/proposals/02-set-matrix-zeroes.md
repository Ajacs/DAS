# Set Matrix Zeroes

**Dificultad:** Media  
**Patrón:** Marcadores in-place  
**Referencia:** [LeetCode 73](https://leetcode.com/problems/set-matrix-zeroes/)

## Description

If a matrix cell contains `0`, set its entire row and column to zero. The changes must be based on the original zeroes, not on zeroes introduced during the transformation.

## Input

```text
matrix: int[][]
```

Ejemplo:

```text
matrix = [
  [1, 1, 1],
  [1, 0, 1],
  [1, 1, 1]
]
```

## Output

The resulting matrix is:

```text
[
  [1, 0, 1],
  [0, 0, 0],
  [1, 0, 1]
]
```

## Constraints

- `1 <= matrix.length <= 200`
- `1 <= matrix[i].length <= 200`
- `-2^31 <= matrix[i][j] <= 2^31 - 1`
- You must modify the input matrix.
- Recommended follow-up: use `O(1)` additional space.
