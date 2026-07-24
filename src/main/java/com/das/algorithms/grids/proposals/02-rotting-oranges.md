# Rotting Oranges

**Dificultad:** Media  
**Patrón:** BFS de múltiples fuentes  
**Referencia:** [LeetCode 994](https://leetcode.com/problems/rotting-oranges/)

## Descripción

Una grilla contiene celdas vacías, naranjas frescas y naranjas podridas. Cada minuto, una naranja podrida contagia a sus vecinas frescas en cuatro direcciones. Devuelve el tiempo necesario para que no quede ninguna fresca, o `-1` si es imposible.

## Input

```text
grid: int[][]
```

Valores:

- `0`: celda vacía;
- `1`: naranja fresca;
- `2`: naranja podrida.

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

## Restricciones

- `1 <= grid.length <= 10`
- `1 <= grid[i].length <= 10`
- Cada celda contiene `0`, `1` o `2`.
- El contagio ocurre únicamente en cuatro direcciones.
- Todas las naranjas inicialmente podridas actúan al mismo tiempo.

