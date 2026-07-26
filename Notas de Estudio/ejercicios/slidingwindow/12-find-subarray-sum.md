# Find Subarray Sum

**Categoría:** Sliding window  
**Patrón:** Ventana variable con suma  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/FindSubarraySum.java`

## Ficha de 60 segundos

- **Qué pide:** encontrar los índices de un subarreglo contiguo cuya suma sea el objetivo.
- **Señal:** números positivos, subarreglo contiguo y suma.
- **Idea:** expandir con `end` y reducir con `start` cuando la suma sea demasiado grande.
- **Invariante:** después del `while`, la suma de la ventana es menor o igual al objetivo.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

Busca una sección continua del arreglo que sume exactamente `targetSum` y devuelve sus extremos.

## Cómo reconocer el patrón

La ventana funciona porque los valores son positivos: agregar aumenta la suma y quitar disminuye la suma. Con negativos esa monotonicidad desaparece.

## Idea paso a paso

1. Agrega `nums[end]` a `windowSum`.
2. Mientras supere el objetivo, quita `nums[start]` y avanza `start`.
3. Si la suma coincide, devuelve `[start, end]`.

## Ejemplo de bolsillo

Para `[1,2,3,7,5]` y objetivo `12`, la ventana termina encontrando `[7,5]`, índices `[3,4]`.

## Por qué funciona

Con números positivos, si la suma supera el objetivo ninguna expansión puede corregirla; es obligatorio quitar elementos desde la izquierda. Cada elemento entra y sale como máximo una vez.

## Complejidad

- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`, sin contar la respuesta.

## Casos límite

- Un elemento es igual al objetivo.
- No existe solución.
- Objetivo menor que todos los elementos.

## Errores frecuentes

- Usarlo con negativos sin adaptar el algoritmo.
- Devolver longitudes cuando se piden índices.
- Olvidar comprobar la ventana después de reducirla.

## Cómo explicarlo en entrevista

> Como los números son positivos, la suma cambia de forma monotónica. Expando a la derecha y, si supero el objetivo, reduzco por la izquierda hasta recuperar una ventana posible. Los dos punteros solo avanzan.

## Preguntas de entrevista

1. ¿Qué harías si hubiera números negativos?
2. ¿Cómo devolverías todas las ventanas?
3. ¿Qué respuesta debe usarse cuando no existe solución?

## Variaciones para practicar

- Minimum Size Subarray Sum.
- Subarray Sum Equals K.

