# Rotting Oranges

**Dificultad:** Media  
**Patrón:** BFS de múltiples fuentes  
**Referencia:** [LeetCode 994](https://leetcode.com/problems/rotting-oranges/)

## Description

A grid contains empty cells, fresh oranges, and rotten oranges. Every minute, each rotten orange makes its fresh four-directional neighbors rotten. Return the time required until no fresh orange remains, or `-1` if this is impossible.

## Input

```text
grid: int[][]
```

Cell values:

- `0`: empty cell;
- `1`: fresh orange;
- `2`: rotten orange.

Ejemplo:

```text
grid = [
  [2, 1, 1],
  [1, 1, 0],
  [0, 1, 1]
]
```

## Output

```text
4
```

## Constraints

- `1 <= grid.length <= 10`
- `1 <= grid[i].length <= 10`
- Every cell contains `0`, `1`, or `2`.
- Rotting spreads only in four directions.
- All initially rotten oranges spread at the same time.
