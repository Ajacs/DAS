# Move Zeroes

**Dificultad:** Fácil  
**Patrón:** Dos punteros, escritura in-place  
**Referencia:** [LeetCode 283](https://leetcode.com/problems/move-zeroes/)

## Descripción

Dado un arreglo de enteros, mueve todos los ceros al final mientras conservas el orden relativo de los elementos distintos de cero. Debes modificar el arreglo recibido y no crear una copia completa.

## Input

```text
nums: int[]
```

Ejemplo:

```text
nums = [0, 1, 0, 3, 12]
```

## Output

El método no retorna un arreglo nuevo. Al terminar:

```text
nums = [1, 3, 12, 0, 0]
```

## Restricciones

- `1 <= nums.length <= 10,000`
- `-2^31 <= nums[i] <= 2^31 - 1`
- Debes modificar `nums` in-place.
- Intenta minimizar la cantidad de escrituras.

