# Max Consecutive Ones III

**Dificultad:** Media  
**Patrón:** Ventana variable con presupuesto  
**Referencia:** [LeetCode 1004](https://leetcode.com/problems/max-consecutive-ones-iii/)

## Description

Given a binary array `nums` and an integer `k`, return the maximum number of consecutive `1`s that can be obtained if at most `k` zeroes may be changed into `1`s.

## Input

```text
nums: int[]
k: int
```

Example:

```text
nums = [1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0]
k = 2
```

## Output

```text
6
```

## Constraints

- `1 <= nums.length <= 100,000`
- `nums[i]` is either `0` or `1`.
- `0 <= k <= nums.length`
- At most `k` zeroes may be changed.
- Recommended target: `O(n)` time.

