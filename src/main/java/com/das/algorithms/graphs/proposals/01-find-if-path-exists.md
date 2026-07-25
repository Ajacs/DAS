# Find if Path Exists in Graph

**Dificultad:** Fácil  
**Patrón:** Lista de adyacencia + DFS/BFS  
**Referencia:** [LeetCode 1971](https://leetcode.com/problems/find-if-path-exists-in-graph/)

## Description

An undirected graph contains nodes numbered from `0` to `n-1`. Given its edges, a source, and a destination, determine whether any path exists between the two nodes.

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

## Constraints

- `1 <= n <= 200,000`
- `0 <= edges.length <= 200,000`
- Every edge contains exactly two valid node identifiers.
- There are no self-edges.
- There are no duplicate edges.
- The graph is undirected.
