# Longest Consecutive Sequence

**Dificultad:** Media  
**Patrón:** Hash set e inicio de secuencia  
**Referencia:** [LeetCode 128](https://leetcode.com/problems/longest-consecutive-sequence/)

## Description

Given an unsorted integer array, return the length of the longest sequence of consecutive values. The values do not need to be adjacent in the input array.

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

The sequence is `[1, 2, 3, 4]`.

## Constraints

- `0 <= nums.length <= 100,000`
- `-10^9 <= nums[i] <= 10^9`
- Duplicate values may appear.
- Design a solution with expected `O(n)` time.
