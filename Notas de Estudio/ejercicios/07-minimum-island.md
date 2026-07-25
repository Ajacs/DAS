# Minimum Island

**Categoría:** Grafos implícitos / grillas  
**Patrón:** DFS que devuelve tamaño de componente  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/grids/MinimalIslands.java`

## Ficha de 60 segundos

- **Qué pide:** tamaño de la isla más pequeña.
- **Señal:** medir cada región conectada y tomar mínimo/máximo.
- **Idea:** DFS devuelve `1 +` tamaños de vecinos válidos.
- **Invariante:** una celda visitada pertenece a un componente cuyo conteo ya comenzó.
- **Tiempo:** `O(R·C)`.
- **Espacio:** `O(R·C)` para visitados y recursión.

## Problema en palabras simples

En una grilla de tierra `L` y agua `W`, calcula cuántas celdas tiene cada isla y conserva el menor tamaño.

## Cómo reconocer el patrón

Es Number of Islands con una agregación distinta: ya no basta contar componentes; cada recorrido debe producir una medida.

## Idea paso a paso

1. Mantén un conjunto global de coordenadas visitadas.
2. Para cada tierra, llama a DFS.
3. DFS retorna `0` para fuera de límites, agua o visitado.
4. Para tierra nueva, marca y retorna `1 +` los cuatro resultados vecinos.
5. Actualiza el mínimo solo si el tamaño es mayor que cero.

## Ejemplo de bolsillo

Si las islas tienen tamaños `4`, `2` y `5`, los DFS devuelven esos valores. Las llamadas posteriores sobre tierra ya visitada devuelven `0`, que no debe reemplazar el mínimo. Resultado: `2`.

## Por qué funciona

Cada celda de tierra nueva aporta exactamente `1`, y la recursión suma cada celda conectada una sola vez gracias a `visited`. Por tanto, la primera llamada sobre una isla devuelve su tamaño exacto.

## Complejidad

- **Tiempo:** `O(R·C)`.
- **Espacio:** `O(R·C)` para visitados y pila recursiva.

## Casos límite

- Sin tierra: la implementación devuelve `0`.
- Una isla de una celda.
- Grilla no rectangular: el fuente usa el ancho de la primera fila y asume forma rectangular.

## Errores frecuentes

- Incluir tamaños `0` al calcular el mínimo.
- Reiniciar `visited` para cada celda y repetir trabajo.
- Usar `double` para tamaños enteros; en el código sería más claro que `traverseDFS` retornara `int`.

## Cómo explicarlo en entrevista

> Recorro la grilla y uso un conjunto visitado compartido. El DFS de una celda nueva devuelve el tamaño de todo su componente sumando uno por celda; si retorna cero, esa posición no inicia una isla nueva. Mantengo el menor tamaño positivo.

## Preguntas de entrevista

1. ¿Cómo cambiarlo para obtener la isla más grande?
2. ¿Cómo devolver también sus coordenadas?
3. ¿Puedes modificar la grilla y eliminar el conjunto?

## Variaciones para practicar

- Max Area of Island.
- Count Sub Islands.
