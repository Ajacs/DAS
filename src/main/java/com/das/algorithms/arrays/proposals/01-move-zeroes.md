# Move Zeroes

**Dificultad:** Fácil  
**Patrón:** Dos punteros, escritura in-place  
**Referencia:** [LeetCode 283](https://leetcode.com/problems/move-zeroes/)

## Description

Given an integer array, move all zeroes to the end while preserving the relative order of the non-zero elements. You must modify the input array without creating a full copy.

## Input

```text
nums: int[]
```

Ejemplo:

```text
nums = [0, 1, 0, 3, 12]
```

## Output

The method does not return a new array. After execution:

```text
nums = [1, 3, 12, 0, 0]
```

## Constraints

- `1 <= nums.length <= 10,000`
- `-2^31 <= nums[i] <= 2^31 - 1`
- You must modify `nums` in-place.
- Try to minimize the total number of writes.
