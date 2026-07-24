# Search a 2D Matrix

**Dificultad:** Media  
**Patrón:** Búsqueda binaria sobre matriz ordenada  
**Referencia:** [LeetCode 74](https://leetcode.com/problems/search-a-2d-matrix/)

## Descripción

Dada una matriz donde cada fila está ordenada y el primer valor de una fila es mayor que el último de la fila anterior, determina si contiene un objetivo.

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

## Restricciones

- `1 <= matrix.length <= 100`
- `1 <= matrix[i].length <= 100`
- `-10,000 <= matrix[i][j], target <= 10,000`
- Cada fila está ordenada de forma creciente.
- El primer valor de cada fila es mayor que el último de la fila anterior.
- Objetivo recomendado: `O(log(m * n))`.

