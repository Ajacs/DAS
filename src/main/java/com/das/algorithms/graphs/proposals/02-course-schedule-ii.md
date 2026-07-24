# Course Schedule II

**Dificultad:** Media  
**Patrón:** Ordenamiento topológico  
**Referencia:** [LeetCode 210](https://leetcode.com/problems/course-schedule-ii/)

## Descripción

Recibes cursos numerados y pares de prerequisitos. Devuelve un orden en el que sea posible completar todos los cursos. Si existe un ciclo y no hay ningún orden válido, devuelve un arreglo vacío.

Un par `[curso, requisito]` indica que `requisito` debe completarse antes que `curso`.

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

Una respuesta válida:

```text
[0, 2, 1, 3]
```

Puede haber más de un orden correcto.

## Restricciones

- `1 <= numCourses <= 2,000`
- `0 <= prerequisites.length <= numCourses * (numCourses - 1)`
- Cada par contiene dos ids entre `0` y `numCourses - 1`.
- Los pares de prerequisitos no están repetidos.
- Si no se pueden completar todos los cursos, devuelve una colección vacía.

