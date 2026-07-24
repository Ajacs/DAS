# Shortest Path in Binary Matrix

**Dificultad:** Media  
**Patrón:** BFS y camino más corto  
**Referencia:** [LeetCode 1091](https://leetcode.com/problems/shortest-path-in-binary-matrix/)

## Descripción

Dada una matriz cuadrada binaria, encuentra la longitud del camino libre más corto desde la esquina superior izquierda hasta la inferior derecha. Puedes moverte en ocho direcciones. Las celdas con `1` están bloqueadas.

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

Si no existe un camino, devuelve `-1`.

## Restricciones

- `1 <= grid.length <= 100`
- `grid` es una matriz cuadrada.
- `grid[i][j]` es `0` o `1`.
- Solo se puede avanzar por celdas con `0`.
- Se permiten movimientos horizontales, verticales y diagonales.
- La longitud cuenta la cantidad de celdas visitadas, incluyendo inicio y destino.

