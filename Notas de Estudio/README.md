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
| 1 | [Running Sum of 1D Array](ejercicios/01-running-sum.md) | Fácil | Suma prefija | “Acumulado hasta el índice `i`” |
| 2 | [Merge Sorted Array](ejercicios/02-merge-sorted-array.md) | Fácil | Dos punteros | Dos colecciones ordenadas |
| 3 | [Group Anagrams](ejercicios/03-group-anagrams.md) | Media | Hash map + clave canónica | Agrupar elementos equivalentes |
| 4 | [Rotate Image](ejercicios/04-rotate-image.md) | Media | Transformación de matriz | Rotar en el mismo espacio |
| 5 | [Undirected Path](ejercicios/05-undirected-path.md) | Fácil | DFS en grafo | Existencia de un camino |
| 6 | [Number of Islands](ejercicios/06-number-of-islands.md) | Media | DFS / flood fill | Contar componentes en una grilla |
| 7 | [Minimum Island](ejercicios/07-minimum-island.md) | Media | DFS + tamaño de componente | Medir componentes conectados |
| 8 | [Closest Carrot](ejercicios/08-closest-carrot.md) | Media | BFS | Camino más corto sin pesos |
| 9 | [Prerequisites Possible](ejercicios/09-prerequisites-possible.md) | Media | DFS + detección de ciclo | Dependencias dirigidas |
| 10 | [Binary Tree Traversal](ejercicios/10-binary-tree-traversal.md) | Base | DFS/BFS en árbol | Recorrer todos los nodos |

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

- [Plan intensivo Capital One: 24 de julio–1 de agosto](PLAN-CAPITAL-ONE.md)
- [Plan Structy adaptado a tus horarios](PLAN-STRUCTY.md)
- [Tablero diario de seguimiento](SEGUIMIENTO-CAPITAL-ONE.md)
- [Java y estrategia para el assessment](JAVA-Y-ESTRATEGIA.md)
- [Plantilla para ejercicios nuevos](PLANTILLA.md)
- [Patrones esenciales](PATRONES.md)
- Los ejercicios ejecutables están en `src/main/java/com/das/algorithms/` y las estructuras pendientes en `Data Structures/`.
