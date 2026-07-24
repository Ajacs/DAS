# Find if Path Exists in Graph

**Dificultad:** Fácil  
**Patrón:** Lista de adyacencia + DFS/BFS  
**Referencia:** [LeetCode 1971](https://leetcode.com/problems/find-if-path-exists-in-graph/)

## Descripción

Un grafo no dirigido tiene nodos numerados de `0` a `n-1`. Dadas sus aristas, un origen y un destino, determina si existe algún camino entre ambos.

## Input

```text
n: int
edges: int[][]
source: int
destination: int
```

Ejemplo:

```text
n = 3
edges = [[0, 1], [1, 2], [2, 0]]
source = 0
destination = 2
```

## Output

```text
true
```

## Restricciones

- `1 <= n <= 200,000`
- `0 <= edges.length <= 200,000`
- Cada arista tiene exactamente dos nodos válidos.
- No hay aristas de un nodo hacia sí mismo.
- No hay aristas duplicadas.
- El grafo es no dirigido.

