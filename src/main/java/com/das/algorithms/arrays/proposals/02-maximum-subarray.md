# Maximum Subarray

**Dificultad:** Media  
**Patrón:** Kadane, acumulación  
**Referencia:** [LeetCode 53](https://leetcode.com/problems/maximum-subarray/)

## Description

Given an integer array, find the largest possible sum of a non-empty contiguous subarray.

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

The sum comes from the subarray `[4, -1, 2, 1]`.

## Constraints

- `1 <= nums.length <= 100,000`
- `-10,000 <= nums[i] <= 10,000`
- The subarray must contain at least one element.
- Recommended target: `O(n)` time.
