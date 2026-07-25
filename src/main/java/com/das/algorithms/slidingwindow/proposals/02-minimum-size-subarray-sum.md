# Minimum Size Subarray Sum

**Dificultad:** Media  
**Patrón:** Ventana variable y minimización  
**Referencia:** [LeetCode 209](https://leetcode.com/problems/minimum-size-subarray-sum/)

## Description

Given an array of positive integers and a positive target, return the minimum length of a contiguous subarray whose sum is greater than or equal to the target. Return `0` if no such subarray exists.

## Input

```text
target: int
nums: int[]
```

Example:

```text
target = 7
nums = [2, 3, 1, 2, 4, 3]
```

## Output

```text
2
```

The subarray `[4, 3]` satisfies the target with the minimum length.

## Constraints

- `1 <= target <= 10^9`
- `1 <= nums.length <= 100,000`
- `1 <= nums[i] <= 10,000`
- All values are positive.
- Recommended target: `O(n)` time.

