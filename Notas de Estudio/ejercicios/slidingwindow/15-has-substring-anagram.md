# Has Substring Anagram

**Categoría:** Sliding window, hashing y strings  
**Patrón:** Ventana fija + mapa de frecuencias  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/HasSubstringAnagram.java`

## Ficha de 60 segundos

- **Qué pide:** saber si algún substring es un anagrama del patrón.
- **Señal:** todas las ventanas candidatas tienen la longitud del patrón.
- **Idea:** comparar frecuencias al deslizar una ventana fija.
- **Invariante:** `windowMap` representa exactamente los `k` caracteres actuales.
- **Tiempo:** `O(n · a)` con comparación de mapas, donde `a` es el alfabeto; efectivamente `O(n)` para alfabeto fijo.
- **Espacio:** `O(a)`.

## Problema en palabras simples

Determina si dentro de un texto existe una sección continua que contenga exactamente los mismos caracteres y frecuencias que `anagram`, en cualquier orden.

## Cómo reconocer el patrón

Un anagrama debe tener la misma longitud que el patrón. Eso fija el tamaño de la ventana; solo cambian el carácter que entra y el que sale.

## Idea paso a paso

1. Construye el mapa de frecuencias del patrón.
2. Construye el mapa de la primera ventana de tamaño `k`.
3. Compara los mapas.
4. Por cada desplazamiento, agrega el carácter entrante y resta el saliente.
5. Elimina frecuencias que llegan a cero y vuelve a comparar.

## Ejemplo de bolsillo

En `"breakdowns"` con patrón `"snow"`, la ventana `"owns"` contiene las mismas letras, así que retorna `true`.

## Por qué funciona

Se consideran todas las ventanas cuya longitud podría formar un anagrama. La igualdad exacta de mapas equivale a tener los mismos caracteres con las mismas multiplicidades.

## Complejidad

- **Tiempo:** lineal para un alfabeto limitado.
- **Espacio:** proporcional al alfabeto.

## Casos límite

- Patrón más largo que el texto.
- Caracteres repetidos en el patrón.
- La primera o última ventana es la respuesta.

## Errores frecuentes

- Usar un `Set`, que pierde las frecuencias.
- No eliminar claves cuya frecuencia llega a cero.
- Recorrer hasta `n-k` con un límite incorrecto.

## Cómo explicarlo en entrevista

> Solo los substrings de longitud `k` pueden ser anagramas. Mantengo sus frecuencias en una ventana fija y actualizo un carácter al entrar y otro al salir. Si el mapa coincide con el patrón, encontré una permutación.

## Preguntas de entrevista

1. ¿Cómo evitarías comparar mapas completos en cada paso?
2. ¿Qué cambia si solo hay letras `a-z`?
3. ¿Cómo devolverías el índice inicial?

## Variaciones para practicar

- Permutation in String.
- Find All Anagrams in a String.

