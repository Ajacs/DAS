# Longest Subarray Sum

**Categoría:** Sliding window  
**Patrón:** Ventana variable + máximo  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/LongestSubarraySum.java`

## Ficha de 60 segundos

- **Qué pide:** longitud máxima de un subarreglo que suma el objetivo.
- **Señal:** “longest”, subarreglo contiguo, suma y valores positivos.
- **Idea:** mantener la misma ventana válida y maximizar `end-start+1`.
- **Invariante:** al evaluar, `currentSum <= targetSum`.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

Entre todas las secciones continuas cuya suma es `targetSum`, devuelve la cantidad de elementos de la más larga. Si no existe, devuelve `-1`.

## Cómo reconocer el patrón

Es la misma mecánica que Find Subarray Sum, pero no se retorna al encontrar la primera coincidencia: se acumula el mejor tamaño.

## Idea paso a paso

1. Expande la ventana y suma el nuevo valor.
2. Reduce por la izquierda mientras la suma sea demasiado alta.
3. Si coincide, actualiza el máximo.

## Ejemplo de bolsillo

Con `[1,2,1,1,1]` y objetivo `3`, existen `[1,2]` y `[1,1,1]`; la respuesta es `3`.

## Por qué funciona

La positividad permite descartar prefijos cuando la suma es excesiva. Como no retroceden los punteros, todas las ventanas candidatas relevantes se consideran en tiempo lineal.

## Complejidad

- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Casos límite

- Ninguna ventana coincide: `-1`.
- Una coincidencia de un solo elemento.
- Varias ventanas con la misma longitud.

## Errores frecuentes

- Retornar al encontrar la primera coincidencia.
- Calcular la longitud como `end-start` y olvidar el `+1`.
- Aplicar esta solución directamente si existen negativos.

## Cómo explicarlo en entrevista

> Uso una ventana variable porque todos los valores son positivos. Expando, reduzco cuando excedo el objetivo y, cuando la suma coincide, guardo la mayor longitud. Cada índice avanza una sola dirección.

## Preguntas de entrevista

1. ¿Cómo cambia si buscas la longitud mínima?
2. ¿Qué técnica usarías con números negativos?
3. ¿Cómo devolverías los índices de la mejor ventana?

## Variaciones para practicar

- Minimum Size Subarray Sum.
- Maximum Erasure Value.

