# Network Delay Time

**Dificultad:** Media  
**Patrón:** Dijkstra y priority queue  
**Referencia:** [LeetCode 743](https://leetcode.com/problems/network-delay-time/)

## Descripción

Una red dirigida contiene tiempos de viaje entre nodos. Una señal parte del nodo `k`. Calcula cuánto tarda en alcanzar todos los nodos; si alguno es inalcanzable, devuelve `-1`.

## Input

```text
times: int[][]
n: int
k: int
```

Cada elemento de `times` tiene forma `[origen, destino, tiempo]`.

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

## Restricciones

- `1 <= k <= n <= 100`
- `1 <= times.length <= 6,000`
- `times[i]` contiene `[u, v, w]`.
- `1 <= u, v <= n`
- `u != v`
- `0 <= w <= 100`
- No hay múltiples aristas con el mismo origen y destino.

