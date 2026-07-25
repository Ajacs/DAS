# Network Delay Time

**Dificultad:** Media  
**Patrón:** Dijkstra y priority queue  
**Referencia:** [LeetCode 743](https://leetcode.com/problems/network-delay-time/)

## Description

A directed network contains travel times between nodes. A signal starts from node `k`. Return the time required for the signal to reach every node, or `-1` if any node is unreachable.

## Input

```text
times: int[][]
n: int
k: int
```

Each element of `times` has the form `[source, destination, travelTime]`.

Ejemplo:

```text
times = [[2, 1, 1], [2, 3, 1], [3, 4, 1]]
n = 4
k = 2
```

## Output

```text
2
```

## Constraints

- `1 <= k <= n <= 100`
- `1 <= times.length <= 6,000`
- `times[i]` contiene `[u, v, w]`.
- `1 <= u, v <= n`
- `u != v`
- `0 <= w <= 100`
- There are no multiple edges with the same source and destination.
