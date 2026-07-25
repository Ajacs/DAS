# Shortest Path in Binary Matrix

**Dificultad:** Media  
**Patrón:** BFS y camino más corto  
**Referencia:** [LeetCode 1091](https://leetcode.com/problems/shortest-path-in-binary-matrix/)

## Description

Given a square binary matrix, return the length of the shortest clear path from the top-left corner to the bottom-right corner. You may move in eight directions. Cells containing `1` are blocked.

## Input

```text
grid: int[][]
```

Ejemplo:

```text
grid = [
  [0, 1],
  [1, 0]
]
```

## Output

```text
2
```

Return `-1` if no path exists.

## Constraints

- `1 <= grid.length <= 100`
- `grid` is a square matrix.
- `grid[i][j]` is either `0` or `1`.
- You may only move through cells containing `0`.
- Horizontal, vertical, and diagonal moves are allowed.
- Path length counts visited cells, including the start and destination.
