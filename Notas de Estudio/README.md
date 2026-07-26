# Guía de estudio para entrevistas de algoritmos

Estas notas convierten los ejercicios del repositorio en patrones reutilizables. No conviene memorizar soluciones línea por línea: el objetivo es reconocer las señales del problema, elegir una estrategia y poder justificarla.

## Cómo estudiar cada nota

1. Lee solo la **Ficha de 60 segundos** e intenta explicar la solución en voz alta.
2. Resuelve el ejemplo a mano antes de mirar el código original.
3. Escribe la solución desde cero y di su complejidad.
4. Revisa **Errores frecuentes** y prueba los casos límite.
5. Al día siguiente, responde las **Preguntas de entrevista** sin consultar la nota.

## Mapa de ejercicios

| Orden | Ejercicio | Dificultad aprox. | Patrón principal | Señal para reconocerlo |
|---:|---|---|---|---|
| 1 | [Running Sum of 1D Array](ejercicios/arrays/01-running-sum.md) | Fácil | Suma prefija | “Acumulado hasta el índice `i`” |
| 2 | [Merge Sorted Array](ejercicios/arrays/02-merge-sorted-array.md) | Fácil | Dos punteros | Dos colecciones ordenadas |
| 3 | [Group Anagrams](ejercicios/hashingstrings/03-group-anagrams.md) | Media | Hash map + clave canónica | Agrupar elementos equivalentes |
| 4 | [Rotate Image](ejercicios/matrices/04-rotate-image.md) | Media | Transformación de matriz | Rotar en el mismo espacio |
| 5 | [Undirected Path](ejercicios/graphs/05-undirected-path.md) | Fácil | DFS en grafo | Existencia de un camino |
| 6 | [Number of Islands](ejercicios/grids/06-number-of-islands.md) | Media | DFS / flood fill | Contar componentes en una grilla |
| 7 | [Minimum Island](ejercicios/grids/07-minimum-island.md) | Media | DFS + tamaño de componente | Medir componentes conectados |
| 8 | [Closest Carrot](ejercicios/grids/08-closest-carrot.md) | Media | BFS | Camino más corto sin pesos |
| 9 | [Prerequisites Possible](ejercicios/graphs/09-prerequisites-possible.md) | Media | DFS + detección de ciclo | Dependencias dirigidas |
| 10 | [Binary Tree Traversal](ejercicios/trees/10-binary-tree-traversal.md) | Base | DFS/BFS en árbol | Recorrer todos los nodos |
| 11 | [Trapping Rain Water](ejercicios/arrays/11-trapping-rain-water.md) | Difícil | Dos punteros | Límites izquierdo y derecho |
| 12 | [Find Subarray Sum](ejercicios/slidingwindow/12-find-subarray-sum.md) | Media | Sliding window variable | Suma objetivo con positivos |
| 13 | [Longest Subarray Sum](ejercicios/slidingwindow/13-longest-subarray-sum.md) | Media | Sliding window variable | Longitud máxima con suma objetivo |
| 14 | [Longest Unique Substring](ejercicios/slidingwindow/14-longest-unique-substring.md) | Media | Sliding window + set | Substring sin repetidos |
| 15 | [Has Substring Anagram](ejercicios/slidingwindow/15-has-substring-anagram.md) | Media | Ventana fija + frecuencias | Existencia de una permutación |
| 16 | [Count Substring Anagrams](ejercicios/slidingwindow/16-count-substring-anagrams.md) | Media | Ventana fija + frecuencias | Contar todas las permutaciones |
| 17 | [Count Subarray Product](ejercicios/slidingwindow/17-count-subarray-product.md) | Media | Ventana variable + producto | Contar ventanas válidas |
| 18 | [At Most K Distinct](ejercicios/slidingwindow/18-at-most-k-distinct.md) | Media | Ventana variable + frecuencias | Contar substrings válidos |
| 19 | [Exactly K Distinct](ejercicios/slidingwindow/19-exactly-k-distinct.md) | Media | Diferencia de conteos | Convertir “exactamente” en “a lo sumo” |
| 20 | [Longest Two Char Substring](ejercicios/slidingwindow/20-longest-two-char-substring.md) | Media | Ventana variable + mapa | Exactamente dos caracteres |
| 21 | [Max Ones With Single Flip](ejercicios/slidingwindow/21-max-ones-single-flip.md) | Media | Ventana con presupuesto | Permitir como máximo un cero |
| 22 | [Word Search](ejercicios/backtracking/22-word-search.md) | Media | Backtracking en grilla | Buscar una palabra |
| 23 | [Word Search II](ejercicios/backtracking/23-word-search-ii.md) | Difícil | Backtracking + Trie | Buscar un diccionario |

## Categorías y orden recomendado

### 1. Arreglos y hashing

`Running Sum` → `Merge Sorted Array` → `Group Anagrams`

Aprendes estado acumulado, dos punteros y cómo diseñar una clave para un mapa.

### 2. Matrices

`Rotate Image`

Aprendes a descomponer una transformación difícil en dos operaciones simples.

### 3. Grafos y grillas

`Undirected Path` → `Number of Islands` → `Minimum Island` → `Closest Carrot` → `Prerequisites Possible`

Una grilla también puede verse como un grafo: cada celda válida es un nodo y sus vecinas son aristas.

### 4. Árboles

`Binary Tree Traversal`

El archivo original solo define el nodo. La nota lo marca como tema pendiente y contiene los recorridos mínimos que deberías dominar.

### 5. Sliding window y dos punteros avanzados

`Find Subarray Sum` → `Longest Subarray Sum` → `Longest Unique Substring` → `Longest Two Char Substring` → `At Most K Distinct` → `Exactly K Distinct` → `Count Subarray Product` → `Max Ones With Single Flip` → `Has Substring Anagram` → `Count Substring Anagrams` → `Trapping Rain Water`

Aprendes ventanas variables, conteo de ventanas, presupuestos, ventanas fijas con frecuencias y el uso de invariantes desde ambos extremos.

### 6. Backtracking y Trie

`Word Search` → `Word Search II` → [Comparación detallada](ejercicios/backtracking/WORD-SEARCH-COMPARACION.md)

Aprendes a marcar y restaurar decisiones sobre una grilla y después a compartir prefijos de muchas palabras mediante un Trie.

## Regla rápida: DFS o BFS

| Necesidad | Elección habitual |
|---|---|
| Saber si existe un camino | DFS o BFS |
| Contar o medir componentes | DFS o BFS |
| Camino más corto en grafo sin pesos | BFS |
| Detectar ciclos en grafo dirigido | DFS con estados |
| Procesar por niveles | BFS |

## Checklist para comunicar una solución

- Reformulo entrada, salida y restricciones.
- Digo el patrón y la señal que me llevó a él.
- Explico el invariante: qué es siempre cierto durante el algoritmo.
- Recorro un ejemplo pequeño.
- Indico tiempo y espacio.
- Menciono al menos dos casos límite.
- Solo entonces escribo código.

## Recursos internos

- [Notas organizadas por categoría](ejercicios/README.md)
- [Plan final: domingo 26 de julio al examen](PLAN-FINAL-SEMANA.md)
- [Tablero diario de seguimiento](SEGUIMIENTO-CAPITAL-ONE.md)
- [Java y estrategia para el assessment](JAVA-Y-ESTRATEGIA.md)
- [Plantilla para ejercicios nuevos](PLANTILLA.md)
- [Patrones esenciales](PATRONES.md)
- Los ejercicios ejecutables están en `src/main/java/com/das/algorithms/` y las estructuras pendientes en `Data Structures/`.
