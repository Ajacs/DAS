# Longest Consecutive Sequence

**Dificultad:** Media  
**Patrón:** Hash set e inicio de secuencia  
**Referencia:** [LeetCode 128](https://leetcode.com/problems/longest-consecutive-sequence/)

## Descripción

Dado un arreglo desordenado, devuelve la longitud de la secuencia más larga de valores enteros consecutivos. Los elementos de la secuencia no necesitan estar juntos en el arreglo.

## Input

```text
nums: int[]
```

Ejemplo:

```text
nums = [100, 4, 200, 1, 3, 2]
```

## Output

```text
4
```

La secuencia es `[1, 2, 3, 4]`.

## Restricciones

- `0 <= nums.length <= 100,000`
- `-10^9 <= nums[i] <= 10^9`
- Puede haber valores repetidos.
- Debes diseñar una solución con tiempo esperado `O(n)`.

