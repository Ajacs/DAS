# Product of Array Except Self

**Dificultad:** Media  
**Patrón:** Productos prefijos y sufijos  
**Referencia:** [LeetCode 238](https://leetcode.com/problems/product-of-array-except-self/)

## Description

Given an integer array, build an output array where `answer[i]` is the product of every element except `nums[i]`. You may not use division.

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

## Constraints

- `2 <= nums.length <= 100,000`
- `-30 <= nums[i] <= 30`
- The product of every prefix or suffix fits in a 32-bit integer.
- Division is not allowed.
- Target: `O(n)` time and `O(1)` extra space, excluding the output array.
