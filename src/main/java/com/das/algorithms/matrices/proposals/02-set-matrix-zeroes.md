# Set Matrix Zeroes

**Dificultad:** Media  
**Patrón:** Marcadores in-place  
**Referencia:** [LeetCode 73](https://leetcode.com/problems/set-matrix-zeroes/)

## Descripción

Si una celda de una matriz contiene `0`, convierte en cero toda su fila y toda su columna. Las decisiones deben basarse en la matriz original, no en ceros creados durante el proceso.

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

La matriz queda:

```text
[
  [1, 0, 1],
  [0, 0, 0],
  [1, 0, 1]
]
```

## Restricciones

- `1 <= matrix.length <= 200`
- `1 <= matrix[i].length <= 200`
- `-2^31 <= matrix[i][j] <= 2^31 - 1`
- Debes modificar la matriz recibida.
- Reto recomendado: utilizar `O(1)` espacio adicional.

