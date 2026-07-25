# Maximum Average Subarray I

**Dificultad:** Fácil  
**Patrón:** Ventana fija y suma incremental  
**Referencia:** [LeetCode 643](https://leetcode.com/problems/maximum-average-subarray-i/)

## Description

Given an integer array `nums` and an integer `k`, find a contiguous subarray of exactly `k` elements with the maximum average value and return that average.

## Input

```text
nums: int[]
k: int
```

Example:

```text
nums = [1, 12, -5, -6, 50, 3]
k = 4
```

## Output

```text
12.75
```

The maximum average comes from `[12, -5, -6, 50]`.

## Constraints

- `1 <= k <= nums.length <= 100,000`
- `-10,000 <= nums[i] <= 10,000`
- Answers within `10^-5` of the correct result are accepted.
- The selected subarray must contain exactly `k` elements.

