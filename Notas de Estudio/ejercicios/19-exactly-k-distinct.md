# Count Substrings With Exactly K Distinct

**Categoría:** Sliding window y hashing  
**Patrón:** `atMost(k) - atMost(k-1)`  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/CountSubstringExactlyKDistinct.java`

## Ficha de 60 segundos

- **Qué pide:** contar substrings con exactamente `k` caracteres distintos.
- **Señal:** contar “exactamente k”.
- **Idea:** restar los que tienen como máximo `k-1` de los que tienen como máximo `k`.
- **Invariante:** cada helper cuenta correctamente todas las ventanas “at most”.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(k)`.

## Problema en palabras simples

Queremos quedarnos con los substrings que entran en el conjunto “hasta `k`”, pero no en el conjunto “hasta `k-1`”.

## Cómo reconocer el patrón

Una ventana directa para “exactamente” es difícil de contar porque puede haber varios comienzos válidos. Transformar exactitud en diferencia de acumulados simplifica el problema.

## Idea paso a paso

1. Implementa `atMostKDistinct`.
2. Calcula `atMost(k)`.
3. Calcula `atMost(k-1)`.
4. Resta ambos resultados.

## Ejemplo de bolsillo

Si existen 10 substrings con hasta 2 distintos y 6 con hasta 1, entonces 4 tienen exactamente 2.

## Por qué funciona

Los substrings con hasta `k-1` son un subconjunto de los que tienen hasta `k`. La diferencia contiene exactamente aquellos que utilizan `k`.

## Complejidad

- **Tiempo:** `O(n)`; se hacen dos recorridos lineales.
- **Espacio:** proporcional al mapa.

## Casos límite

- `k<=0`: se devuelve `0` para substrings no vacíos.
- `k` mayor que la cantidad total de caracteres distintos.
- String vacío.

## Errores frecuentes

- Intentar contar directamente con una única frontera izquierda.
- No proteger `atMost(k-1)` cuando `k=0`.
- Restar en el orden contrario.

## Cómo explicarlo en entrevista

> “Exactamente k” es la diferencia entre dos conjuntos acumulativos: ventanas con hasta k distintos menos ventanas con hasta k-1. Reutilizo el helper lineal y mantengo el código simple.

## Preguntas de entrevista

1. ¿Por qué la resta no duplica ni omite substrings?
2. ¿Se puede resolver en un solo recorrido?
3. ¿Qué ocurre con `k=1`?

## Variaciones para practicar

- Subarrays With K Different Integers.
- Count Number of Nice Subarrays.

