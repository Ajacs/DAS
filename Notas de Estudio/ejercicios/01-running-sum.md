# Running Sum of 1D Array

**Categoría:** Arreglos  
**Patrón:** Suma prefija in-place  
**Dificultad aproximada:** Fácil  
**Fuente:** `src/main/java/com/das/algorithms/arrays/RunningSumOf1DArray.java`

## Ficha de 60 segundos

- **Qué pide:** reemplazar cada posición por la suma desde `0` hasta esa posición.
- **Señal:** “suma acumulada” o “hasta el índice `i`”.
- **Idea:** cada resultado es el valor actual más el acumulado anterior.
- **Invariante:** antes de procesar `i`, `nums[i - 1]` ya contiene la suma hasta `i - 1`.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)` extra.

## Problema en palabras simples

Dado un arreglo, devuelve otro donde cada casilla diga cuánto suman todos los valores vistos hasta allí. La solución del repositorio reutiliza el arreglo de entrada.

## Cómo reconocer el patrón

Busca expresiones como “acumulado”, “desde el inicio”, “suma hasta `i`” o muchas consultas sobre rangos.

## Idea paso a paso

1. La posición `0` ya es su propia suma acumulada.
2. Desde `i = 1`, suma `nums[i - 1]` a `nums[i]`.
3. Devuelve el mismo arreglo.

## Ejemplo de bolsillo

`[1, 2, 3, 4]`

- `i=1`: `[1, 3, 3, 4]`
- `i=2`: `[1, 3, 6, 4]`
- `i=3`: `[1, 3, 6, 10]`

## Por qué funciona

Si `nums[i - 1]` ya representa la suma de `0..i-1`, al agregarle el valor original de `nums[i]` obtenemos exactamente la suma de `0..i`.

## Casos límite

- Un solo elemento: no entra al ciclo.
- Números negativos: el razonamiento no cambia.
- Si no se permite modificar la entrada, se necesita un arreglo nuevo.

## Errores frecuentes

- Empezar en `i = 0` e intentar leer `i - 1`.
- Volver a sumar desde cero en cada posición: eso cuesta `O(n²)`.

## Cómo explicarlo en entrevista

> Mantengo en cada posición la suma acumulada. Al llegar a `i`, la posición anterior ya contiene la suma hasta `i-1`, así que solo agrego el valor actual. Recorro una vez y modifico in-place: `O(n)` tiempo y `O(1)` espacio extra.

## Preguntas de entrevista

1. ¿Cómo responderías sumas de rango `[left, right]`?
2. ¿Qué cambia si la entrada debe conservarse?
3. ¿Existe riesgo de overflow con las restricciones?

## Variaciones para practicar

- Product of Array Except Self.
- Range Sum Query - Immutable.
