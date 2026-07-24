# Product of Array Except Self

**Dificultad:** Media  
**Patrón:** Productos prefijos y sufijos  
**Referencia:** [LeetCode 238](https://leetcode.com/problems/product-of-array-except-self/)

## Descripción

Dado un arreglo, construye otro donde `answer[i]` sea el producto de todos los elementos excepto `nums[i]`. No puedes utilizar división.

## Input

```text
nums: int[]
```

Ejemplo:

```text
nums = [1, 2, 3, 4]
```

## Output

```text
[24, 12, 8, 6]
```

## Restricciones

- `2 <= nums.length <= 100,000`
- `-30 <= nums[i] <= 30`
- Los productos de cualquier prefijo o sufijo caben en un entero de 32 bits.
- No se permite división.
- Objetivo: `O(n)` tiempo y `O(1)` espacio adicional, sin contar el arreglo de salida.

