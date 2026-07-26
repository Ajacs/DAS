# Longest Two Char Substring

**Categoría:** Sliding window y strings  
**Patrón:** Ventana variable con exactamente dos distintos  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/LongestTwoCharSubstring.java`

## Ficha de 60 segundos

- **Qué pide:** longitud del substring más largo con exactamente dos caracteres distintos.
- **Señal:** “longest substring” y límite de distintos.
- **Idea:** permitir hasta dos en el mapa y actualizar solo cuando haya exactamente dos.
- **Invariante:** después del `while`, la ventana tiene como máximo dos distintos.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)` para alfabeto fijo.

## Problema en palabras simples

Encuentra la sección continua más larga que use dos tipos de caracteres, no uno ni tres.

## Cómo reconocer el patrón

Es una especialización de “longest substring with at most k distinct”, con `k=2` y una condición adicional para exigir exactamente dos.

## Idea paso a paso

1. Agrega el carácter derecho y su frecuencia.
2. Si aparecen más de dos distintos, reduce desde la izquierda.
3. Elimina frecuencias cero.
4. Actualiza el máximo solo si el mapa tiene tamaño `2`.

## Ejemplo de bolsillo

En `"ecebaaa"`, `"ece"` utiliza exactamente `e` y `c`, mientras `"baaa"` utiliza `b` y `a`; la respuesta es `4`.

## Por qué funciona

Para cada extremo derecho se conserva la ventana válida más larga con hasta dos distintos. Si contiene exactamente dos, es la mejor candidata que termina allí.

## Complejidad

- **Tiempo:** `O(n)`.
- **Espacio:** proporcional a los caracteres distintos de la ventana.

## Casos límite

- String con un solo tipo: devuelve `0` bajo la condición “exactamente dos”.
- String vacío.
- Alternancia de dos caracteres.

## Errores frecuentes

- Interpretar “two distinct” como “at most two”.
- No remover una clave al llegar a cero.
- Actualizar el máximo antes de reparar la ventana.

## Cómo explicarlo en entrevista

> Mantengo una ventana con como máximo dos caracteres distintos. Cuando tiene exactamente dos, actualizo la mejor longitud; cuando aparece un tercero, reduzco hasta recuperar la condición.

## Preguntas de entrevista

1. ¿Qué retornaría si se pidiera “at most two”?
2. ¿Cómo generalizarlo a `k`?
3. ¿Cómo devolverías el substring?

## Variaciones para practicar

- Longest Substring with At Most Two Distinct Characters.
- Fruit Into Baskets.

