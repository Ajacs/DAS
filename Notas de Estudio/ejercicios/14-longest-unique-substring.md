# Longest Unique Substring

**Categoría:** Sliding window y strings  
**Patrón:** Ventana variable + `HashSet`  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/LongestUniqueSubstring.java`

## Ficha de 60 segundos

- **Qué pide:** longitud del substring más largo sin caracteres repetidos.
- **Señal:** substring contiguo, condición de unicidad y máximo.
- **Idea:** expandir hasta encontrar un duplicado; reducir hasta eliminarlo.
- **Invariante:** `seen` contiene exactamente los caracteres de la ventana y todos son únicos.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(min(n, alfabeto))`.

## Problema en palabras simples

Encuentra la sección continua más larga del string donde ningún carácter aparezca dos veces.

## Cómo reconocer el patrón

“Substring” implica continuidad. “Longest” más una condición que puede romperse y repararse moviendo la izquierda sugiere ventana variable.

## Idea paso a paso

1. Lee el carácter en `end`.
2. Mientras ya exista en `seen`, elimina el carácter de `start` y avanza.
3. Agrega el nuevo carácter.
4. Actualiza la mayor longitud.

## Ejemplo de bolsillo

En `"abca"`, la ventana `"abc"` mide `3`. Al llegar al segundo `a`, se elimina el primero antes de continuar.

## Por qué funciona

La ventana siempre es válida después del `while`. El puntero izquierdo elimina únicamente lo necesario para aceptar el nuevo carácter, conservando la ventana válida más larga que termina en `end`.

## Complejidad

- **Tiempo:** `O(n)`, cada carácter entra y sale una vez.
- **Espacio:** proporcional a los caracteres distintos de la ventana.

## Casos límite

- String vacío.
- Todos los caracteres iguales.
- Todos los caracteres distintos.

## Errores frecuentes

- Usar `if` en vez de `while` al reparar la ventana.
- Olvidar eliminar del set cuando avanza `start`.
- Confundir substring con subsequence.

## Cómo explicarlo en entrevista

> Mantengo una ventana cuyos caracteres son únicos y un set que representa exactamente esa ventana. Si el nuevo carácter está repetido, reduzco desde la izquierda hasta eliminar la repetición. Después actualizo el máximo.

## Preguntas de entrevista

1. ¿Cómo optimizarías `start` usando el último índice de cada carácter?
2. ¿Qué cambia con Unicode?
3. ¿Cómo devolverías el substring, no solo su longitud?

## Variaciones para practicar

- Longest Repeating Character Replacement.
- Fruit Into Baskets.

