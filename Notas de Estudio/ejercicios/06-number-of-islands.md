# Number of Islands

**Categoría:** Grafos implícitos / grillas  
**Patrón:** Componentes conectados con DFS (flood fill)  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/grids/NumberOfIslands.java`

## Ficha de 60 segundos

- **Qué pide:** contar grupos de tierra conectados en cuatro direcciones.
- **Señal:** contar regiones o componentes de una grilla.
- **Idea:** al hallar tierra no visitada, contar una isla y hundirla completa con DFS.
- **Invariante:** toda tierra convertida en agua pertenece a una isla ya contada.
- **Tiempo:** `O(R·C)`.
- **Espacio:** `O(R·C)` en el peor caso por la pila recursiva; sin conjunto adicional.

## Problema en palabras simples

Cada celda de tierra es un nodo y se conecta con tierra arriba, abajo, izquierda o derecha. Hay que contar cuántos componentes separados existen.

## Cómo reconocer el patrón

“Regiones”, “áreas conectadas”, “islas” o propagación entre vecinos indican flood fill. El barrido exterior encuentra componentes; el DFS consume cada uno.

## Idea paso a paso

1. Recorre todas las celdas.
2. Si encuentras `'1'`, incrementa el contador.
3. DFS cambia esa celda y toda tierra conectada a `'0'`.
4. Continúa el barrido; esa isla ya no volverá a contarse.

## Ejemplo de bolsillo

```text
1 1 0
0 1 0
0 0 1
```

El primer DFS elimina las tres celdas conectadas. Más tarde aparece otra tierra: total `2`.

## Por qué funciona

La primera celda encontrada de cada componente aumenta el contador una vez. El DFS marca todo ese componente, de modo que ninguna de sus otras celdas puede volver a aumentarlo.

## Complejidad

- **Tiempo:** `O(R·C)`, cada celda se procesa como máximo una vez.
- **Espacio:** `O(R·C)` en el peor caso por la pila recursiva.

## Casos límite

- Todo agua: `0`.
- Todo tierra: `1`.
- Conexión diagonal no cuenta.
- Modifica la entrada; si debe conservarse, usa `visited`.

## Errores frecuentes

- Marcar después de explorar vecinos, provocando ciclos.
- Olvidar límites antes de acceder a la matriz.
- Contar diagonales sin que el enunciado lo permita.

## Cómo explicarlo en entrevista

> Interpreto la grilla como un grafo implícito. Cada vez que el barrido encuentra tierra, descubrió un componente nuevo; incremento la respuesta y hago flood fill para marcar toda la isla. Cada celda se procesa a lo sumo una vez.

## Preguntas de entrevista

1. ¿Cómo evitarías un stack overflow?
2. ¿Qué cambia si cuentan diagonales?
3. ¿Cómo conservarías la entrada?

## Variaciones para practicar

- Max Area of Island.
- Surrounded Regions.
