# Two Sum — Unsorted Input

**Dificultad:** Fácil  
**Categoría principal:** Hashing  
**Patrón:** `HashMap` de valor → índice y búsqueda de complemento  
**Referencia:** [LeetCode 1](https://leetcode.com/problems/two-sum/)

## Por qué está en Hashing

El arreglo no está ordenado. Para cada valor `nums[i]`, calculamos `target - nums[i]` y consultamos en un `HashMap` si ese complemento apareció antes. Esto permite una solución `O(n)` sin ordenar la entrada.

No debe confundirse con **Two Sum II**: en esa variante el arreglo ya está ordenado y se utilizan dos punteros desde los extremos.

## Description

Given an integer array and a target value, return the indices of two distinct elements whose sum equals the target.

## Input

```text
nums: int[]
target: int
```

Ejemplo:

```text
nums = [2, 7, 11, 15]
target = 9
```

## Output

```text
[0, 1]
```

The two indices may be returned in any order.

## Constraints

- `2 <= nums.length <= 10,000`
- `-10^9 <= nums[i] <= 10^9`
- `-10^9 <= target <= 10^9`
- Exactly one valid answer exists.
- You may not use the same element twice.
