# Course Schedule II

**Dificultad:** Media  
**Patrón:** Ordenamiento topológico  
**Referencia:** [LeetCode 210](https://leetcode.com/problems/course-schedule-ii/)

## Description

You are given numbered courses and prerequisite pairs. Return an order in which all courses can be completed. If a cycle makes every ordering impossible, return an empty array.

A pair `[course, prerequisite]` means that `prerequisite` must be completed before `course`.

## Input

```text
numCourses: int
prerequisites: int[][]
```

Ejemplo:

```text
numCourses = 4
prerequisites = [[1, 0], [2, 0], [3, 1], [3, 2]]
```

## Output

One valid answer is:

```text
[0, 2, 1, 3]
```

More than one valid ordering may exist.

## Constraints

- `1 <= numCourses <= 2,000`
- `0 <= prerequisites.length <= numCourses * (numCourses - 1)`
- Each pair contains two identifiers between `0` and `numCourses - 1`.
- Prerequisite pairs are unique.
- Return an empty collection if all courses cannot be completed.
