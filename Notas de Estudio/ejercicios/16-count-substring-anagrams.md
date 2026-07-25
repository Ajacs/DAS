# Count Substring Anagrams

**Categoría:** Sliding window, hashing y strings  
**Patrón:** Ventana fija + conteo  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/CountSubstringAnagrams.java`

## Ficha de 60 segundos

- **Qué pide:** contar cuántos substrings son anagramas del patrón.
- **Señal:** misma longitud, frecuencias y todas las coincidencias.
- **Idea:** reutilizar la ventana fija y aumentar un contador por coincidencia.
- **Invariante:** antes de comparar, el mapa contiene exactamente la ventana actual.
- **Tiempo:** lineal para alfabeto fijo.
- **Espacio:** `O(a)`.

## Problema en palabras simples

En lugar de detenerte al hallar una permutación del patrón, cuenta todas las ventanas que tengan las mismas frecuencias.

## Cómo reconocer el patrón

Es la variante acumulativa de Has Substring Anagram: la mecánica es idéntica, pero el resultado es un contador.

## Idea paso a paso

1. Construye las frecuencias del patrón.
2. Llena la primera ventana.
3. Si coincide, incrementa `count`.
4. Desliza agregando y quitando un carácter.
5. Incrementa por cada nueva coincidencia.

## Ejemplo de bolsillo

Para texto `"catact"` y patrón `"cat"`, `"cat"` y `"act"` son anagramas; la respuesta es `2`.

## Por qué funciona

Toda respuesta debe ocupar exactamente `k` caracteres. El algoritmo visita cada ventana posible una vez y la igualdad de frecuencias prueba que es un anagrama.

## Complejidad

- **Tiempo:** `O(n · a)` con `Map.equals`; `O(n)` si el alfabeto está acotado.
- **Espacio:** `O(a)`.

## Casos límite

- Patrón más largo que el texto: `0`.
- Coincidencias superpuestas.
- Ninguna coincidencia.

## Errores frecuentes

- Detenerse en la primera coincidencia.
- No evaluar la primera ventana.
- No remover una clave al llegar a frecuencia cero.

## Cómo explicarlo en entrevista

> Recorro todas las ventanas del tamaño del patrón y mantengo sus frecuencias incrementalmente. Cada vez que coinciden con el mapa objetivo incremento la respuesta. Así evito reconstruir cada substring desde cero.

## Preguntas de entrevista

1. ¿Las coincidencias superpuestas deben contarse?
2. ¿Cómo lograr comparación `O(1)` por desplazamiento?
3. ¿Cómo devolver los índices en vez del total?

## Variaciones para practicar

- Find All Anagrams in a String.
- Permutation in String.

