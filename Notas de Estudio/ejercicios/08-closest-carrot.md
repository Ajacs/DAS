# Closest Carrot

**Categoría:** Grafos implícitos / grillas  
**Patrón:** BFS para camino más corto sin pesos  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/grids/ClosestCarrot.java`

## Ficha de 60 segundos

- **Qué pide:** distancia mínima desde un inicio hasta cualquier zanahoria.
- **Señal:** “camino más corto” y todos los movimientos cuestan uno.
- **Idea:** BFS explora primero distancia `0`, luego `1`, luego `2`, etc.
- **Invariante:** al sacar una celda de la cola, su distancia es la mínima posible.
- **Tiempo:** `O(R·C)`.
- **Espacio:** `O(R·C)`.

## Problema en palabras simples

Desde una celda puedes moverte en cuatro direcciones sin atravesar muros. Debes encontrar el menor número de movimientos hasta una `C`, o `-1` si ninguna es alcanzable.

## Cómo reconocer el patrón

Camino mínimo en un grafo donde cada arista tiene igual costo implica BFS. DFS puede encontrar un camino, pero no garantiza encontrar primero el más corto.

## Idea paso a paso

1. Encola `(fila, columna, 0)` y marca el inicio.
2. Saca el frente de la cola.
3. Si es `C`, devuelve su distancia.
4. Encola vecinos válidos no visitados con distancia `+1`.
5. Si se vacía la cola, devuelve `-1`.

## Ejemplo de bolsillo

Si hay zanahorias a 2 y 5 pasos, BFS visita todas las celdas a distancia 1 antes que las de distancia 2. La primera zanahoria retirada de la cola está a distancia 2.

## Por qué funciona

La cola FIFO conserva capas de distancia. Una celda se marca al encolarla, así que entra una sola vez y su primera ruta es mínima.

## Complejidad

- **Tiempo:** `O(R·C)`.
- **Espacio:** `O(R·C)` para cola y visitados.

## Casos límite

- El inicio ya es una zanahoria: devuelve `0`.
- No existe zanahoria alcanzable: `-1`.
- Inicio inválido o sobre muro: el contrato original parece asumir un inicio válido.

## Errores frecuentes

- Usar DFS y retornar el primer resultado.
- Marcar visitado al desencolar: permite encolar duplicados.
- Acceder a la grilla antes de comprobar límites.
- En el fuente, `visited.contains(key)` aparece antes de los límites; aquí no falla porque crear la clave es seguro, pero validar límites primero resulta más claro.

## Cómo explicarlo en entrevista

> Modelo cada celda abierta como un nodo y cada movimiento como una arista de costo uno. BFS recorre por distancia creciente, así que la primera zanahoria que retiro de la cola es la más cercana. Marco al encolar para procesar cada celda una sola vez.

## Preguntas de entrevista

1. ¿Qué usarías si los movimientos tuvieran costos diferentes?
2. ¿Cómo reconstruirías el camino?
3. ¿Cómo harías BFS con varias posiciones iniciales?

## Variaciones para practicar

- Rotting Oranges.
- Walls and Gates.
- Shortest Path in Binary Matrix.
