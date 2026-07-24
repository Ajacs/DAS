# Plan intensivo para el assessment de Capital One

**Fecha actual:** viernes 24 de julio de 2026  
**Examen:** sábado 1 de agosto de 2026  
**Formato informado:** 4 problemas en 70 minutos  
**Lenguaje de práctica:** Java

## Objetivo realista

En ocho días no conviene intentar dominar todos los problemas de la lista original, varios de los cuales son Hard y pertenecen a patrones avanzados. La prioridad es:

1. resolver rápido los problemas de implementación;
2. evitar errores de índices y casos límite;
3. dominar arreglos, strings, mapas, sets, stacks y matrices;
4. reconocer cuándo usar dos punteros, ventana deslizante o un recorrido de grafo;
5. practicar dos veces el formato completo de 70 minutos.

La guía oficial de ejemplos de CodeSignal muestra una progresión especialmente relevante: manipulación de arreglos, comparación de patrones en strings, simulación sobre matrices 2D y optimización mediante una tabla de consulta/hash map. Por eso este plan da prioridad a implementación correcta y lectura cuidadosa antes que a algoritmos exóticos.

Fuente: [Example CodeSignal questions](https://codesignal.com/blog/example-codesignal-questions/)

## Categorización de todos los problemas recibidos

### Cómo leer la prioridad

- **A — Esencial:** alineado directamente con los temas informados por Capital One.
- **B — Recomendado:** patrón frecuente que complementa los fundamentos.
- **C — Extra:** útil si ya puedes resolver los esenciales con tiempo.
- **D — Posponer:** demasiado especializado o costoso para los días disponibles.

La dificultad es la indicada por LeetCode. La categoría identifica el patrón que deberías intentar reconocer, no necesariamente la única técnica posible.

### Día 1 original — Arreglos e implementación

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Merge Sorted Array](https://leetcode.com/problems/merge-sorted-array/description/) | Fácil | Arreglos | Dos punteros desde el final, in-place | A |
| [Running Sum of 1D Array](https://leetcode.com/problems/running-sum-of-1d-array/description/) | Fácil | Arreglos | Suma prefija, acumulación | A |
| [Rotate Array](https://leetcode.com/problems/rotate-array/description/) | Media | Arreglos | Reversión, aritmética modular, in-place | A |
| [Reverse String II](https://leetcode.com/problems/reverse-string-ii/description/) | Fácil | Strings / arreglos | Simulación por bloques, dos punteros | A |

### Día 2 original — Strings

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Minimum Changes to Make K Semi-palindromes](https://leetcode.com/problems/minimum-changes-to-make-k-semi-palindromes/description/) | Hard | Strings + DP | Partición, precomputación, divisores | D |
| [Count Anagrams](https://leetcode.com/problems/count-anagrams/description/) | Hard | Strings + matemáticas | Frecuencias, combinatoria, módulo | D |
| [Longest Common Prefix of K Strings After Removal](https://leetcode.com/problems/longest-common-prefix-of-k-strings-after-removal/description/) | Hard | Strings / trie | Trie, mantenimiento de frecuencias | D |
| [Find Median from Data Stream](https://leetcode.com/problems/find-median-from-data-stream/description/) | Hard | Estructuras de datos | Dos heaps, diseño incremental | D |

Estos cuatro problemas no son buenos representantes de “manipulación básica de strings”. Para el objetivo inmediato se sustituyen por Reverse String II, Valid Anagram, Longest Common Prefix y el ejercicio de patrones de CodeSignal.

### Día 3 original — Dos punteros

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/) | Media | Dos punteros | Extremos sobre arreglo ordenado | A |
| [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/) | Media | Dos punteros | Lectura/escritura, in-place | A |
| [Move Zeroes](https://leetcode.com/problems/move-zeroes/description/) | Fácil | Dos punteros | Compactación estable | A |
| [Trapping Rain Water](https://leetcode.com/problems/trapping-rain-water/description/) | Hard | Dos punteros / stack | Máximos laterales, invariante | C |

### Día 4 original — Sliding window y arreglos

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Best Time to Buy and Sell Stock IV](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/description/) | Hard | Programación dinámica | Estados por transacción | D |
| [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/) | Media | Arreglos / DP | Kadane, mejor acumulado | B |
| [Minimum Window Substring](https://leetcode.com/problems/minimum-window-substring/description/) | Hard | Sliding window | Frecuencias y ventana mínima | C |
| [Substring with Concatenation of All Words](https://leetcode.com/problems/substring-with-concatenation-of-all-words/description/) | Hard | Sliding window + maps | Ventanas por offset, frecuencias | D |

`Maximum Subarray` no es realmente sliding window: su patrón principal es Kadane/programación dinámica comprimida. Conviene corregir esa asociación para no buscar una ventana cuando el problema pide el mejor subarreglo contiguo.

### Día 5 original — Matrices y grillas

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Rotate Image](https://leetcode.com/problems/rotate-image/description/) | Media | Matrices | Transponer + invertir filas, in-place | A |
| [Spiral Matrix III](https://leetcode.com/problems/spiral-matrix-iii/description/) | Media | Matrices / simulación | Direcciones, longitud creciente, límites | B |
| [Number of Enclaves](https://leetcode.com/problems/number-of-enclaves/description/) | Media | Grillas / grafos | Flood fill desde bordes | A |
| [Number of Islands](https://leetcode.com/problems/number-of-islands/description/) | Media | Grillas / grafos | Componentes conectados, DFS/BFS | A |

### Día 6 original — Hash maps y sets

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [4Sum](https://leetcode.com/problems/4sum/description/) | Media | Arreglos + dos punteros | Ordenar, fijar dos valores, deduplicar | C |
| [Group Anagrams](https://leetcode.com/problems/group-anagrams/description/) | Media | Hash map / strings | Clave canónica, agrupación | A |
| [Happy Number](https://leetcode.com/problems/happy-number/description/) | Fácil | Sets | Detección de ciclo | B |
| [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/) | Media | Hash set | Detectar inicio de secuencia | A |

### Día 7 original — Greedy e intervalos

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Jump Game II](https://leetcode.com/problems/jump-game-ii/description/) | Media | Greedy | Frontera alcanzable por niveles | B |
| [Gas Station](https://leetcode.com/problems/gas-station/description/) | Media | Greedy | Balance global y reinicio local | C |
| [Insert Interval](https://leetcode.com/problems/insert-interval/description/) | Media | Intervalos | Recorrer y fusionar | B |
| [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/description/) | Media | Greedy / intervalos | Ordenar por final | B |

### Día 8 original — Búsqueda, recursión y divide & conquer

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Binary Search](https://leetcode.com/problems/binary-search/description/) | Fácil | Búsqueda binaria | Intervalo de búsqueda e índices | B |
| [Search in Rotated Sorted Array II](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/) | Media | Búsqueda binaria | Mitad ordenada y duplicados | C |
| [Sort an Array](https://leetcode.com/problems/sort-an-array/description/) | Media | Divide & conquer | Merge sort o heap sort | C |
| [Online Majority Element in Subarray](https://leetcode.com/problems/online-majority-element-in-subarray/description/) | Hard | Diseño / estructuras avanzadas | Segment tree, muestreo o índices | D |

### Simulación Set A

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [Maximum Number of Non-overlapping Palindrome Substrings](https://leetcode.com/problems/maximum-number-of-non-overlapping-palindrome-substrings/description/) | Hard | Strings + DP | Palíndromos, selección greedy/DP | D |
| [Product of Array Except Self](https://leetcode.com/problems/product-of-array-except-self/description/) | Media | Arreglos | Prefijos y sufijos | A |
| [Word Search II](https://leetcode.com/problems/word-search-ii/description/) | Hard | Trie + backtracking | Búsqueda múltiple en grilla | D |
| [Text Justification](https://leetcode.com/problems/text-justification/description/) | Hard | Strings / simulación | Agrupar y distribuir espacios | C |

### Simulación Set B

| Problema | Dificultad | Categoría principal | Patrón o habilidad | Prioridad |
|---|---|---|---|:---:|
| [3Sum](https://leetcode.com/problems/3sum/description/) | Media | Arreglos + dos punteros | Ordenar, fijar uno, deduplicar | B |
| [Sudoku Solver](https://leetcode.com/problems/sudoku-solver/description/) | Hard | Backtracking | Restricciones y poda | D |
| [Dungeon Game](https://leetcode.com/problems/dungeon-game/description/) | Hard | Programación dinámica 2D | DP desde el destino | D |

El Set B recibido contiene solo tres problemas, no cuatro. Para una simulación de formato real añade un cuarto problema de implementación, por ejemplo [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/description/).

## Resumen por categoría

| Categoría | Problemas representativos | Peso recomendado |
|---|---|---:|
| Arreglos e implementación | Running Sum, Rotate Array, Product Except Self | Muy alto |
| Hash maps y sets | Group Anagrams, Longest Consecutive, Happy Number | Muy alto |
| Matrices y simulación 2D | Rotate Image, Spiral Matrix, Number of Enclaves | Muy alto |
| Dos punteros | Merge Sorted Array, Move Zeroes, Two Sum II | Alto |
| Strings | Reverse String II, Valid Anagram, patrones | Alto |
| Stacks | Valid Parentheses y drills con `ArrayDeque` | Alto |
| Grillas y grafos | Number of Islands, Number of Enclaves | Medio-alto |
| Sliding window | Longest Substring Without Repeating Characters | Medio |
| Greedy e intervalos | Jump Game, Insert Interval | Medio |
| Búsqueda binaria | Binary Search | Medio |
| DP, trie y backtracking avanzados | Dungeon Game, Word Search II, Stock IV | Bajo esta semana |

## Lista mínima de máxima prioridad

Si el tiempo se reduce, completa estos **14 problemas**:

1. Running Sum of 1D Array.
2. Merge Sorted Array.
3. Rotate Array.
4. Reverse String II.
5. Move Zeroes.
6. Two Sum II.
7. Valid Parentheses.
8. Rotate Image.
9. Spiral Matrix.
10. Number of Islands.
11. Number of Enclaves.
12. Group Anagrams.
13. Longest Consecutive Sequence.
14. Product of Array Except Self.

## Rutina diaria

Plan base de **2 horas 30 minutos**:

| Bloque | Tiempo | Actividad |
|---|---:|---|
| Recuperación | 15 min | Escribir de memoria una plantilla o explicar el patrón del día |
| Aprendizaje | 25 min | Repasar concepto y un ejemplo |
| Problema 1 | 25 min | Cronometrado, sin ayudas |
| Corrección | 15 min | Encontrar el fallo y registrar una regla |
| Problema 2 | 30 min | Cronometrado, sin ayudas |
| Implementación | 25 min | Drill corto o reescritura desde cero |
| Cierre | 15 min | Complejidad, casos límite y flashcards |

Si solo tienes 90 minutos, conserva recuperación, dos problemas cronometrados y corrección. Si tienes una hora adicional, úsala en los problemas marcados como **extra**, no en añadir teoría.

## Reglas durante toda la semana

- Usa Java y el editor más parecido posible al assessment.
- No uses autocompletado para las simulaciones.
- Antes de programar, escribe entrada, salida, restricciones y 2 casos límite.
- Después de cada problema registra solo tres cosas: señal, patrón y error cometido.
- Si pasan 20 minutos sin una solución implementable, consulta una pista, cierra la explicación y vuelve a escribirla desde cero.
- Repite un problema fallado 24 horas después.
- Nunca des por resuelto un problema que no hayas ejecutado con casos límite.

## Día 1 — Viernes 24: arreglos e implementación

**Meta:** recorrer arreglos con seguridad y modificar in-place.

### Obligatorio

1. Repasar [Running Sum](ejercicios/01-running-sum.md).
2. Repasar [Merge Sorted Array](ejercicios/02-merge-sorted-array.md).
3. Resolver [Rotate Array](https://leetcode.com/problems/rotate-array/description/).
4. Implementar el ejemplo CodeSignal de suma con vecinos:
   `b[i] = a[i-1] + a[i] + a[i+1]`, usando `0` fuera de límites.

### Drill de 15 minutos

Escribe funciones para:

- recorrer de izquierda a derecha;
- recorrer de derecha a izquierda;
- invertir in-place;
- desplazar `k` posiciones;
- calcular máximo y segundo máximo.

### Debes poder explicar

- Cuándo modificar la entrada.
- Cómo evitar `IndexOutOfBoundsException`.
- Por qué llenar Merge Sorted Array desde el final.

## Día 2 — Sábado 25: strings, maps y sets

**Meta:** transformar strings y diseñar claves de hash map.

### Obligatorio

1. Repasar [Group Anagrams](ejercicios/03-group-anagrams.md).
2. Resolver [Reverse String II](https://leetcode.com/problems/reverse-string-ii/description/).
3. Resolver [Valid Anagram](https://leetcode.com/problems/valid-anagram/description/).
4. Implementar el ejemplo CodeSignal de patrón vocal/consonante con todas las ventanas posibles.

### Extra

- [Longest Common Prefix](https://leetcode.com/problems/longest-common-prefix/description/).
- [Happy Number](https://leetcode.com/problems/happy-number/description/).

### No priorizar esta semana

`Minimum Changes to Make K Semi-palindromes`, `Count Anagrams`, `Longest Common Prefix of K Strings After Removal` y `Find Median from Data Stream` requieren DP, combinatoria, estructuras avanzadas o heaps. No son la mejor inversión antes de cubrir los fundamentos explícitos de Capital One.

## Día 3 — Domingo 26: dos punteros, stacks y listas

**Meta:** mover índices con una regla clara y dominar una pila básica.

### Obligatorio

1. Resolver [Move Zeroes](https://leetcode.com/problems/move-zeroes/description/).
2. Resolver [Two Sum II](https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/).
3. Resolver [Valid Parentheses](https://leetcode.com/problems/valid-parentheses/description/).
4. Resolver [Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/description/).

### Extra

- [Merge Two Sorted Lists](https://leetcode.com/problems/merge-two-sorted-lists/description/).
- `Trapping Rain Water`: estudia la idea solo si terminaste todo lo obligatorio.

### Debes poder escribir de memoria

```java
var stack = new ArrayDeque<Character>();
stack.push(value);
var top = stack.pop();
```

En Java, prefiere `ArrayDeque` sobre `Stack`.

## Día 4 — Lunes 27: matrices y recorridos no convencionales

**Meta:** controlar filas, columnas, límites y direcciones.

### Obligatorio

1. Repasar [Rotate Image](ejercicios/04-rotate-image.md).
2. Resolver [Spiral Matrix](https://leetcode.com/problems/spiral-matrix/description/).
3. Reescribir Rotate Image desde cero.
4. Completar los drills de recorrido de la siguiente sección.

### Drills de matriz

Para una matriz `R × C`, escribe y prueba:

- filas: izquierda → derecha;
- filas: derecha → izquierda;
- columnas: arriba → abajo;
- columnas: abajo → arriba;
- recorrido serpiente;
- diagonales principales;
- perímetro por capas;
- vecinos válidos en cuatro direcciones.

### Regla de índices

Para cada ciclo di en voz alta:

- qué representa el índice;
- dónde empieza;
- cuándo termina;
- si el límite es inclusivo o exclusivo.

## Día 5 — Martes 28: grillas, grafos y simulación 2D

**Meta:** modelar una grilla como grafo y separar movimiento, colisión y resultado.

### Obligatorio

1. Repasar [Number of Islands](ejercicios/06-number-of-islands.md).
2. Repasar [Closest Carrot](ejercicios/08-closest-carrot.md).
3. Resolver [Number of Enclaves](https://leetcode.com/problems/number-of-enclaves/description/).
4. Estudiar e implementar la pregunta 3 de la guía CodeSignal: caída de una figura `3×3`.

### Método para simulaciones

Divide el problema en helpers:

1. `isValidPosition(...)`;
2. `moveOrDrop(...)`;
3. `checkResult(...)`.

Evita mezclar validación de límites, movimiento y comprobación final en un solo ciclo.

### Extra

- Repasar [Minimum Island](ejercicios/07-minimum-island.md).
- Repasar [Undirected Path](ejercicios/05-undirected-path.md).

## Día 6 — Miércoles 29: hash maps, ventanas y acumulación

**Meta:** reemplazar búsquedas repetidas por consultas `O(1)` promedio.

### Obligatorio

1. Resolver [Two Sum](https://leetcode.com/problems/two-sum/description/).
2. Resolver [Longest Consecutive Sequence](https://leetcode.com/problems/longest-consecutive-sequence/description/).
3. Resolver [Maximum Subarray](https://leetcode.com/problems/maximum-subarray/description/).
4. Implementar la pregunta 4 de CodeSignal: contar pares cuya suma sea potencia de dos.

### Ventana deslizante mínima

Resuelve [Longest Substring Without Repeating Characters](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/).

Debes identificar:

- cuándo expandir `right`;
- qué invalida la ventana;
- cuándo mover `left`;
- qué información mantiene el mapa o set.

### No priorizar

`4Sum`, `Minimum Window Substring`, `Substring with Concatenation of All Words` y `Best Time to Buy and Sell Stock IV` son útiles, pero su costo de aprendizaje ahora es mayor que practicar implementaciones medium limpias.

## Día 7 — Jueves 30: greedy, intervalos, búsqueda y repaso

**Meta:** cubrir patrones secundarios sin sacrificar los fundamentos.

### Obligatorio

1. Resolver [Binary Search](https://leetcode.com/problems/binary-search/description/).
2. Resolver [Jump Game](https://leetcode.com/problems/jump-game/description/).
3. Resolver [Insert Interval](https://leetcode.com/problems/insert-interval/description/).
4. Repasar [Prerequisites Possible](ejercicios/09-prerequisites-possible.md), sin dedicar más de 25 minutos.

### Revisión acumulativa

Sin mirar notas, escribe estas seis plantillas:

1. dos punteros;
2. frecuencia con `HashMap`;
3. stack;
4. recorrido de matriz con deltas;
5. DFS;
6. BFS.

### Extra

- [Non-overlapping Intervals](https://leetcode.com/problems/non-overlapping-intervals/description/).
- [Search in Rotated Sorted Array](https://leetcode.com/problems/search-in-rotated-sorted-array/description/).

## Día 8 — Viernes 31: simulación completa y recuperación

**Meta:** ensayar exactamente la presión de 4 problemas en 70 minutos.

### Mañana o tarde: simulación de 70 minutos

Usa cuatro problemas que no hayas resuelto durante la semana:

1. implementación de arreglo fácil;
2. string o hash map fácil/media;
3. matriz/simulación media;
4. optimización con mapa, dos punteros o stack media.

Puedes usar como base las cuatro preguntas de la [guía de CodeSignal](https://codesignal.com/blog/example-codesignal-questions/), pero cambia los datos y no consultes las soluciones.

### Después de la simulación: 45 minutos

- Reproduce cada error.
- Clasifícalo: comprensión, índices, patrón, Java o tiempo.
- Corrige solo los dos errores de mayor impacto.
- Reescribe una solución fallida sin copiar.

### Noche

- Repasa fichas de 60 segundos.
- Prepara entorno, identificación, cargador y horario.
- No hagas problemas Hard.
- Termina temprano y duerme normalmente.

## Día del examen — Sábado 1 de agosto

### Antes

- Haz un calentamiento de 10 minutos: invertir un arreglo y contar frecuencias.
- No abras un problema nuevo.
- Ten papel para ejemplos e índices si está permitido.

### Estrategia de 70 minutos

| Minuto | Acción |
|---:|---|
| 0–5 | Leer rápidamente las cuatro preguntas y estimar dificultad |
| 5–17 | Resolver la más directa |
| 17–32 | Resolver la segunda más directa |
| 32–55 | Atacar la de mayor valor que parezca implementable |
| 55–65 | Mejorar la cuarta o conseguir una solución parcial correcta |
| 65–70 | Ejecutar casos límite y revisar retornos, índices y tipos |

El orden debe decidirlo la lectura inicial, no necesariamente el número de pregunta.

### Regla de abandono temporal

Si llevas 8–10 minutos sin convertir la idea en código:

1. deja comentarios con el enfoque;
2. guarda lo que compile;
3. cambia a otra pregunta;
4. vuelve al final.

Una solución completa y probada vale más que cuatro borradores.

## Checklist antes de enviar cada solución

- ¿Entendí exactamente qué hay que devolver?
- ¿El arreglo o matriz puede estar vacío?
- ¿Uso `< length` y no `<= length`?
- ¿Manejo primera/última posición?
- ¿Estoy modificando datos que necesitaré después?
- ¿Marqué visitado en el momento correcto?
- ¿Mis keys de mapa representan inequívocamente el estado?
- ¿Hay riesgo de `null`, overflow o comparación incorrecta de strings?
- ¿Probé mínimo, caso normal y un caso adverso?
- ¿La complejidad encaja con las restricciones?

## Métricas de preparación

Al terminar el viernes deberías lograr:

- problemas fáciles en 10–15 minutos;
- problemas medium de implementación en 20–25 minutos;
- explicar complejidad sin improvisar;
- escribir las seis plantillas principales sin consultar;
- completar al menos 3 de 4 problemas en una simulación;
- conservar 5 minutos para pruebas.

Si una métrica no se cumple, practica el patrón correspondiente con un problema fácil. No intentes compensarlo con un Hard.
