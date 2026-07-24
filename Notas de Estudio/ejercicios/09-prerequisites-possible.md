# Prerequisites Possible

**Categoría:** Grafos dirigidos  
**Patrón:** Detección de ciclo con DFS  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/graphs/PrereqqsPossible.java`

## Ficha de 60 segundos

- **Qué pide:** decidir si todos los cursos pueden completarse.
- **Señal:** dependencias “A antes de B”.
- **Idea:** es posible si y solo si el grafo dirigido no tiene ciclos.
- **Invariante:** `visiting` contiene la ruta DFS activa; `visited`, nodos completamente verificados.
- **Tiempo:** `O(V+E)`.
- **Espacio:** `O(V+E)`, incluyendo el grafo.

## Problema en palabras simples

Cada prerequisito crea una flecha `A → B`. Si una cadena de dependencias vuelve a un curso de la misma cadena, ningún curso de ese ciclo puede empezar.

## Cómo reconocer el patrón

Requisitos, tareas, paquetes o compilaciones forman grafos dirigidos. “¿Es posible completar todo?” suele equivaler a “¿hay ciclo?” o a ordenamiento topológico.

## Idea paso a paso

1. Crea una lista de vecinos para todos los cursos, incluso los aislados.
2. Inicia DFS desde cada curso no procesado.
3. Si está en `visiting`, encontraste un ciclo.
4. Si está en `visited`, esa rama ya fue comprobada.
5. Agrega a `visiting`, explora vecinos, luego retira y agrega a `visited`.
6. Si algún DFS detecta ciclo, devuelve `false`.

## Ejemplo de bolsillo

`0→1, 1→2, 2→0` vuelve al `0` mientras sigue en la ruta activa: imposible.  
`0→1, 0→2` termina ambas ramas: posible.

## Por qué funciona

Un ciclo dirigido existe exactamente cuando DFS encuentra una arista hacia un ancestro de la ruta activa. Los nodos completamente procesados pueden reutilizarse sin repetir trabajo.

## Casos límite

- Cero prerequisitos: posible.
- Cursos aislados.
- Dependencia de un curso consigo mismo: ciclo inmediato.
- Componentes desconectados: hay que iniciar DFS en todos.

## Errores frecuentes

- Usar solo `visited`: no distingue un ciclo de volver a un nodo ya terminado.
- No retirar el curso de `visiting` al terminar.
- Construir solo nodos presentes en aristas y omitir cursos aislados.

## Cómo explicarlo en entrevista

> Convierto los prerequisitos en un grafo dirigido. Completar todos los cursos es posible exactamente cuando no existe un ciclo. Durante DFS separo nodos de la ruta activa de nodos ya terminados; volver a uno activo prueba un ciclo.

## Preguntas de entrevista

1. ¿Cómo resolverlo con grados de entrada y BFS de Kahn?
2. ¿Cómo devolver un orden válido de cursos?
3. ¿Cómo devolver uno de los ciclos?

## Variaciones para practicar

- Course Schedule.
- Course Schedule II.
- Alien Dictionary.
