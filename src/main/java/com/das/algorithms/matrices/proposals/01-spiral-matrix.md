# Spiral Matrix

**Dificultad:** Media  
**Patrón:** Simulación por límites  
**Referencia:** [LeetCode 54](https://leetcode.com/problems/spiral-matrix/)

## Descripción

Dada una matriz rectangular, devuelve todos sus elementos en orden espiral: fila superior, columna derecha, fila inferior en reversa y columna izquierda hacia arriba, repitiendo hacia el centro.

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

## Restricciones

- `1 <= matrix.length <= 10`
- `1 <= matrix[i].length <= 10`
- `-100 <= matrix[i][j] <= 100`
- La matriz puede ser rectangular.
- Cada celda debe aparecer exactamente una vez.

