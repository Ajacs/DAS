# Undirected Path

**Categoría:** Grafos  
**Patrón:** Lista de adyacencia + DFS  
**Dificultad aproximada:** Fácil  
**Fuente:** `src/main/java/com/das/algorithms/graphs/UndirectedPath.java`

## Ficha de 60 segundos

- **Qué pide:** decidir si existe un camino entre dos nodos.
- **Señal:** pares de conexiones no dirigidas.
- **Idea:** construir vecinos en ambos sentidos y explorar desde el origen.
- **Invariante:** todo nodo en `visited` ya fue explorado o está siendo explorado.
- **Tiempo:** `O(V+E)`.
- **Espacio:** `O(V+E)`, incluyendo el grafo.

## Problema en palabras simples

Recibes aristas como pares. Como el grafo es no dirigido, cada conexión permite viajar en ambos sentidos. Debes responder si el destino es alcanzable.

## Cómo reconocer el patrón

“Existe un camino”, “conectado” o “alcanzable” sugieren recorrido de grafo. Una lista de aristas suele convertirse primero en lista de adyacencia.

## Idea paso a paso

1. Por cada arista `(a,b)`, agrega `b` a vecinos de `a` y `a` a vecinos de `b`.
2. Desde `src`, si es `dst`, devuelve `true`.
3. Si ya fue visitado, detén esa rama.
4. Marca y explora vecinos hasta encontrar el destino.

## Ejemplo de bolsillo

Aristas: `(a,b), (b,c), (x,y)`. De `a` a `c`: `a → b → c`, sí. De `a` a `x`: no.

## Por qué funciona

DFS visita exactamente los nodos alcanzables desde el origen. Si encuentra el destino existe un camino; si agota ese componente, no existe.

## Complejidad

- **Tiempo:** `O(V+E)`.
- **Espacio:** `O(V+E)` incluyendo la lista de adyacencia y la recursión.

## Casos límite

- Origen igual a destino.
- Ciclos: requieren `visited`.
- Nodos aislados o ausentes en las aristas: el contrato debe aclarar cómo representarlos.

## Errores frecuentes

- Agregar la arista en un solo sentido.
- No marcar visitados y caer en recursión infinita.
- En Java, comparar strings con `==`; el código fuente usa `src == dst`, pero debe usar `src.equals(dst)`.

## Cómo explicarlo en entrevista

> Convierto las aristas en una lista de adyacencia bidireccional. Ejecuto DFS desde el origen, marcando cada nodo para manejar ciclos. Si alcanzo el destino devuelvo verdadero; si se agota el componente, falso.

## Preguntas de entrevista

1. ¿BFS cambiaría la complejidad?
2. ¿Cómo devolverías el camino, no solo un booleano?
3. ¿Qué estructura usarías para muchas consultas de conectividad?

## Variaciones para practicar

- Find if Path Exists in Graph.
- Number of Connected Components.
