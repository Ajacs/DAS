# Count Substrings With At Most K Distinct

**Categoría:** Sliding window y hashing  
**Patrón:** Ventana variable + mapa de frecuencias + conteo  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/CountSubstringAtMostKDistinct.java`

## Ficha de 60 segundos

- **Qué pide:** contar substrings con como máximo `k` caracteres distintos.
- **Señal:** “at most k distinct”.
- **Idea:** el mapa representa la ventana; reducir mientras tenga más de `k` claves.
- **Invariante:** al contar, `map.size() <= k`.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(k)` normalmente.

## Problema en palabras simples

Cuenta todas las secciones continuas del string que utilizan como máximo `k` tipos de caracteres.

## Cómo reconocer el patrón

“At most” crea una condición reparable: si hay demasiados distintos, se eliminan caracteres por la izquierda hasta volver a ser válida.

## Idea paso a paso

1. Agrega el carácter derecho al mapa.
2. Mientras haya más de `k` claves, reduce su frecuencia desde la izquierda.
3. Elimina una clave cuando su frecuencia sea cero.
4. Suma `end-start+1`.

## Ejemplo de bolsillo

En `"abc"` con `k=2`, al terminar en `c` la ventana válida mínima empieza en `b`; son válidos `"c"` y `"bc"`.

## Por qué funciona

Después de reparar, todos los sufijos de la ventana también tienen como máximo `k` distintos. Por ello el tamaño de la ventana cuenta exactamente los substrings válidos que terminan en `end`.

## Complejidad

- **Tiempo:** `O(n)`.
- **Espacio:** proporcional a los caracteres de la ventana.

## Casos límite

- `k=0`: solo el string vacío tendría cero distintos; se cuentan cero substrings no vacíos.
- String vacío.
- `k` mayor que todos los caracteres distintos.

## Errores frecuentes

- No eliminar del mapa las frecuencias cero.
- Incrementar solo en uno por ventana.
- Usar `map.size()` sin que el mapa represente exactamente la ventana.

## Cómo explicarlo en entrevista

> Mantengo la ventana más larga válida que termina en cada posición. Todos sus sufijos también son válidos, por eso agrego su longitud al total.

## Preguntas de entrevista

1. ¿Cómo obtendrías exactamente `k` distintos?
2. ¿Cómo devolverías el substring más largo?
3. ¿Qué significa `k=0`?

## Variaciones para practicar

- Fruit Into Baskets.
- Subarrays With K Different Integers.

