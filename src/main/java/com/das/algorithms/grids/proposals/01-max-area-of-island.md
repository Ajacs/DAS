# Max Area of Island

**Dificultad:** Media  
**Patrón:** DFS/BFS que mide componentes  
**Referencia:** [LeetCode 695](https://leetcode.com/problems/max-area-of-island/)

## Description

Given a binary grid, return the largest number of land cells connected horizontally or vertically. Return `0` if the grid contains no land.

## Input

```text
grid: int[][]
```

Ejemplo:

```text
grid = [
  [0, 0, 1, 0],
  [1, 1, 1, 0],
  [0, 1, 0, 0]
]
```

## Output

```text
5
```

## Constraints

- `1 <= grid.length <= 50`
- `1 <= grid[i].length <= 50`
- `grid[i][j]` is either `0` or `1`.
- Only up, down, left, and right connections count.
