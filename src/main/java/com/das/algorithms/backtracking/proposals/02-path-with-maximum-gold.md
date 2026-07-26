# Path With Maximum Gold

**Dificultad:** Media  
**Patrón:** Backtracking sobre grilla  
**Referencia:** [LeetCode 1219](https://leetcode.com/problems/path-with-maximum-gold/)

## Description

Given a grid where each positive cell contains an amount of gold, return the maximum amount that can be collected along a path. You may start and stop on any gold cell, move in four directions, and visit each cell at most once in a path. Cells containing zero cannot be visited.

## Input

```text
grid: int[][]
```

Example:

```text
grid = [
  [0, 6, 0],
  [5, 8, 7],
  [0, 9, 0]
]
```

## Output

```text
24
```

One optimal path collects `9 + 8 + 7`.

## Constraints

- `1 <= grid.length, grid[i].length <= 15`
- `0 <= grid[i][j] <= 100`
- At most `25` cells contain gold.
- A cell cannot be reused in the same path.
- Movement is limited to four directions.

## Qué debes aprender

- El ciclo elegir, marcar, explorar y restaurar.
- Iniciar backtracking desde múltiples posiciones.
- Retornar un valor agregado en vez de un booleano.

