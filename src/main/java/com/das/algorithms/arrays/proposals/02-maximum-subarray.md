# Maximum Subarray

**Dificultad:** Media  
**Patrón:** Kadane, acumulación  
**Referencia:** [LeetCode 53](https://leetcode.com/problems/maximum-subarray/)

## Descripción

Dado un arreglo de enteros, encuentra la mayor suma posible de un subarreglo contiguo no vacío.

## Input

```text
nums: int[]
```

Ejemplo:

```text
nums = [-2, 1, -3, 4, -1, 2, 1, -5, 4]
```

## Output

```text
6
```

La suma corresponde al subarreglo `[4, -1, 2, 1]`.

## Restricciones

- `1 <= nums.length <= 100,000`
- `-10,000 <= nums[i] <= 10,000`
- El subarreglo debe contener al menos un elemento.
- Objetivo recomendado: `O(n)` tiempo.

