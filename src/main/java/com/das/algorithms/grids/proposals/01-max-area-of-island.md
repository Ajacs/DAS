# Max Area of Island

**Dificultad:** Media  
**Patrón:** DFS/BFS que mide componentes  
**Referencia:** [LeetCode 695](https://leetcode.com/problems/max-area-of-island/)

## Descripción

Dada una grilla binaria, encuentra la mayor cantidad de celdas de tierra conectadas horizontal o verticalmente. Si no hay tierra, devuelve `0`.

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

## Restricciones

- `1 <= grid.length <= 50`
- `1 <= grid[i].length <= 50`
- `grid[i][j]` es `0` o `1`.
- Solo cuentan conexiones arriba, abajo, izquierda y derecha.

