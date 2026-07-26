# Plan final: domingo 26 de julio al sábado 1 de agosto

**Assessment:** sábado 1 de agosto  
**Formato:** 4 problemas en 70 minutos  
**Disponibilidad:**

- Domingo: desde las 14:00.
- Lunes a viernes: 19:00–22:00; extensión opcional hasta las 23:00.

## Estrategia general

Cada sesión seguirá esta secuencia:

1. **Lectura activa:** recordar el patrón antes de mirar la nota.
2. **Práctica:** resolver sin ayuda y con límite de tiempo.
3. **Simulación:** trabajar con presión y selección de preguntas.
4. **Corrección:** convertir errores en reglas reutilizables.

Structy será una fuente de ejercicios, no el objetivo. No necesitas terminar el curso antes del examen.

## Prioridades

### Prioridad alta

- Arrays y strings.
- HashMap y HashSet.
- Stack con `ArrayDeque`.
- Matrices y recorridos 2D.
- Dos punteros.
- Sliding window.
- Implementación y casos límite.

### Prioridad media

- Binary Search.
- Grafos y BFS/DFS.
- Backtracking básico: Word Search I.

### Posponer

- Dynamic Programming.
- Word Search II desde cero repetidas veces.
- Trie avanzado.
- Heap avanzado.
- Problemas Hard nuevos.

# Domingo 26 — Día largo

Si puedes comenzar a las 13:00, desplaza todo una hora antes. El siguiente horario supone comienzo a las 14:00.

## 14:00–14:30 — Lectura activa

Sin mirar código, escribe:

- plantilla de Binary Search;
- diferencia entre `left <= right` y `left < right`;
- dos punteros;
- ventana variable;
- mapa de frecuencias.

Después consulta únicamente lo que no recordaste.

## 14:30–15:45 — Structy: Binary Search

Completa entre dos y cuatro actividades.

Prioriza:

1. búsqueda exacta;
2. primera aparición;
3. última aparición;
4. primera posición que cumple una condición;
5. búsqueda en arreglo rotado.

No necesitas completar las 14 actividades.

## 15:45–16:00 — Descanso

## 16:00–17:00 — Práctica de Binary Search

Resuelve:

- Binary Search clásico desde cero.
- [Search a 2D Matrix](../src/main/java/com/das/algorithms/matrices/proposals/03-search-a-2d-matrix.md).

Límite: 25 minutos por problema.

## 17:00–18:00 — Comida y descanso

No estudiar durante este bloque.

## 18:00–18:45 — Lectura y práctica 2D

Repasa:

- [Rotate Image](ejercicios/matrices/04-rotate-image.md).
- [Word Search I](ejercicios/backtracking/22-word-search.md).

Implementa recorridos:

- izquierda a derecha;
- derecha a izquierda;
- columnas;
- perímetro;
- espiral;
- cuatro vecinos.

Word Search II solo debe poder explicarse conceptualmente.

## 18:45–19:00 — Descanso

## 19:00–20:10 — Simulación 1

### Set A — Diagnóstico

1. [Move Zeroes](../src/main/java/com/das/algorithms/arrays/proposals/01-move-zeroes.md).
2. [Valid Anagram](../src/main/java/com/das/algorithms/hashingstrings/proposals/01-valid-anagram.md).
3. [Spiral Matrix](../src/main/java/com/das/algorithms/matrices/proposals/01-spiral-matrix.md).
4. [Search a 2D Matrix](../src/main/java/com/das/algorithms/matrices/proposals/03-search-a-2d-matrix.md).

Distribución:

- Q1: implementación con arreglo.
- Q2: frecuencias y strings.
- Q3: simulación 2D.
- Q4: matriz + Binary Search.

Reglas:

- 70 minutos exactos.
- Leer las cuatro preguntas primero.
- Sin notas ni soluciones.
- Cambiar de pregunta tras 8–10 minutos sin código ejecutable.
- Guardar una solución correcta antes de optimizar.

## 20:10–20:30 — Descanso

## 20:30–21:20 — Corrección

Por cada error registra:

```text
Problema:
Patrón:
Error:
Regla para evitarlo:
```

Reescribe únicamente el problema con el error más importante.

## 21:20–22:00 — Cierre

- Actualiza el semáforo de patrones.
- Elige dos debilidades para el lunes.
- No abras un problema Hard.

# Lunes 27 — Arrays, strings y hashing

## 19:00–19:30 — Lectura activa

- Running Sum.
- Merge Sorted Array.
- Group Anagrams.
- Two Sum con HashMap.

## 19:30–20:45 — Práctica

Resuelve tres:

1. un array fácil;
2. un string;
3. un problema con HashMap.

Tiempo máximo:

- Fácil: 15 minutos.
- Media: 25 minutos.

## 20:45–21:00 — Descanso

## 21:00–21:40 — Mini simulación

Dos problemas en 40 minutos.

## 21:40–22:00 — Corrección

Si continúas hasta las 23:00, repite un problema fallado sin mirar. No agregues teoría nueva.

# Martes 28 — Stack y matrices

## 19:00–19:30 — Lectura activa

- Sintaxis de `ArrayDeque`.
- Valid Parentheses.
- Límites de matrices.
- Direcciones y coordenadas.

## 19:30–20:45 — Práctica

1. Un problema de stack.
2. Spiral Matrix.
3. Una simulación 2D corta.

## 20:45–21:00 — Descanso

## 21:00–21:40 — Mini simulación

Dos problemas: stack + matriz.

## 21:40–22:00 — Corrección

Extensión opcional: rehacer Spiral Matrix desde cero.

# Miércoles 29 — Dos punteros y sliding window

## 19:00–19:30 — Lectura activa

Explica:

- cuándo usar dos punteros;
- cuándo usar ventana fija;
- cuándo usar ventana variable;
- qué hace válida o inválida una ventana.

## 19:30–20:45 — Práctica

1. Move Zeroes o Two Sum II.
2. Minimum Size Subarray Sum.
3. Longest Unique Substring.

## 20:45–21:00 — Descanso

## 21:00–22:10 — Simulación 2

### Set B — Ventanas y estado

1. [Two Sum](../src/main/java/com/das/algorithms/hashingstrings/proposals/02-two-sum.md).
2. [Maximum Average Subarray I](../src/main/java/com/das/algorithms/slidingwindow/proposals/01-maximum-average-subarray.md).
3. [Set Matrix Zeroes](../src/main/java/com/das/algorithms/matrices/proposals/02-set-matrix-zeroes.md).
4. [Max Consecutive Ones III](../src/main/java/com/das/algorithms/slidingwindow/proposals/03-max-consecutive-ones-iii.md).

Cuatro problemas en 70 minutos. El objetivo es comprobar que puedes cambiar entre HashMap, ventana fija, matriz in-place y ventana variable.

Si solo tienes hasta las 22:00, comienza la simulación a las 20:50.

## 22:10–22:40 — Corrección opcional

Clasifica los errores; no es necesario reescribir todo esa noche.

# Jueves 30 — Simulación final

## 19:00–19:20 — Calentamiento

Un ejercicio fácil conocido.

## 19:20–20:30 — Simulación 3

### Set C — Simulación final

1. [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/).
2. [Product of Array Except Self](../src/main/java/com/das/algorithms/arrays/proposals/03-product-except-self.md).
3. [Longest Consecutive Sequence](../src/main/java/com/das/algorithms/hashingstrings/proposals/03-longest-consecutive-sequence.md).
4. [Rotting Oranges](../src/main/java/com/das/algorithms/grids/proposals/02-rotting-oranges.md).

Cuatro problemas en 70 minutos, bajo condiciones de examen. Este set mezcla stack, arreglos, hashing y una simulación BFS sobre matriz.

## 20:30–20:45 — Descanso

## 20:45–21:45 — Corrección

- Reproduce los bugs.
- Revisa decisiones de tiempo.
- Reescribe una solución incompleta.

## 21:45–22:00 — Decisión final

Escoge como máximo dos temas para repasar el viernes.

No hagas otra simulación.

# Reglas para usar los sets

- No abras los archivos antes de iniciar el cronómetro.
- Los archivos contienen únicamente descripción, input, output y restricciones; no contienen solución.
- Puedes resolver en cualquier orden.
- Si ya resolviste uno de los problemas recientemente, sustitúyelo:
  - **Array:** [Maximum Subarray](../src/main/java/com/das/algorithms/arrays/proposals/02-maximum-subarray.md).
  - **Matriz:** [Number of Enclaves](https://leetcode.com/problems/number-of-enclaves/description/).
  - **Sliding Window:** [Minimum Size Subarray Sum](../src/main/java/com/das/algorithms/slidingwindow/proposals/02-minimum-size-subarray-sum.md).
  - **Grafo:** [Find if Path Exists](../src/main/java/com/das/algorithms/graphs/proposals/01-find-if-path-exists.md).
- No leas la solución después de cada pregunta; termina primero los 70 minutos.
- En la revisión clasifica cada problema como completo, parcial, sin intentar o incorrecto.

# Viernes 31 — Consolidación y descanso

## 19:00–19:30 — Lectura rápida

Revisa fichas de 60 segundos y diario de errores.

## 19:30–20:15 — Dos problemas conocidos

- Un fácil en 10–15 minutos.
- Un medium en 20–25 minutos.

El objetivo es fluidez, no dificultad.

## 20:15–20:30 — Descanso

## 20:30–21:15 — Plantillas desde memoria

Escribe:

1. HashMap de frecuencias.
2. Stack.
3. Dos punteros.
4. Sliding window.
5. Recorrido de matriz.
6. Binary Search.
7. BFS/DFS.

## 21:15–21:45 — Preparación

- Equipo y cargador.
- Conexión.
- Identificación.
- Entorno de examen.
- Agua y lugar silencioso.

## 21:45 — Terminar

No estudiar hasta las 23:00. Dormir aporta más que otro problema.

# Sábado 1 — Examen

## Antes

- Dormir 7.5–9 horas.
- Desayunar normalmente.
- Hacer un calentamiento de 10 minutos.
- No resolver problemas nuevos.

## Estrategia de 70 minutos

| Minutos | Acción |
|---:|---|
| 0–5 | Leer las cuatro preguntas y ordenarlas |
| 5–17 | Resolver la más directa |
| 17–32 | Resolver la segunda |
| 32–55 | Atacar la tercera implementable |
| 55–65 | Cuarta pregunta o solución parcial |
| 65–70 | Probar límites, retornos e índices |

# Regla de decisión para Structy

Mientras estés en Binary Search:

- completa entre 5 y 7 actividades representativas;
- detente cuando puedas escribir y explicar la plantilla;
- salta Dynamic Programming;
- continúa con Stack y Array and String;
- no sacrifiques simulaciones por aumentar el porcentaje del curso.

# Métrica de éxito

Antes del examen deberías poder:

- resolver fáciles en 10–15 minutos;
- resolver mediums de implementación en 20–25;
- terminar al menos tres problemas en simulación;
- usar Java collections sin buscar sintaxis;
- recorrer una matriz en varias direcciones;
- detectar y abandonar bloqueos a tiempo;
- reservar cinco minutos para pruebas.
