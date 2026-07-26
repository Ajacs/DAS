# Max Ones With Single Flip

**Categoría:** Sliding window  
**Patrón:** Ventana variable con presupuesto de un error  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/MaxOnesWithSingleFlip.java`

## Ficha de 60 segundos

- **Qué pide:** mayor racha de unos si puedes cambiar como máximo un cero.
- **Señal:** máximo segmento con hasta `k` elementos inválidos.
- **Idea:** una ventana válida contiene como máximo un cero.
- **Invariante:** después del `while`, `zeros <= 1`.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

Encuentra la sección continua más larga que ya sea toda de unos o pueda convertirse en unos cambiando un solo cero.

## Cómo reconocer el patrón

“Puedes cambiar/eliminar como máximo k elementos” suele convertirse en una ventana cuyo presupuesto de elementos problemáticos es `k`.

## Idea paso a paso

1. Expande la derecha.
2. Si entra un cero, incrementa `zeros`.
3. Mientras haya más de uno, avanza la izquierda y descuenta los ceros que salgan.
4. Actualiza la longitud máxima.

## Ejemplo de bolsillo

En `"1011"`, cambiar el único cero produce una racha de longitud `4`.

## Por qué funciona

La ventana siempre representa un segmento transformable con una sola operación. Al conservar la ventana válida más larga para cada `end`, se consideran todas las mejores candidatas.

## Complejidad

- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Casos límite

- Todo unos: se permite usar cero cambios.
- Todo ceros: la respuesta es `1` si no está vacío.
- String vacío.

## Errores frecuentes

- Interpretar “at most one” como “exactly one”.
- Reiniciar la ventana en lugar de reducirla.
- No descontar el cero que sale.

## Cómo explicarlo en entrevista

> Trato los ceros como elementos que consumen presupuesto. Expando mientras haya como máximo uno y reduzco solo cuando el presupuesto se excede. Así cada ventana válida puede convertirse completamente en unos.

## Preguntas de entrevista

1. ¿Cómo generalizarlo a `k` flips?
2. ¿Qué cambia si debes usar exactamente un flip?
3. ¿Cómo devolverías los índices?

## Variaciones para practicar

- Max Consecutive Ones III.
- Longest Repeating Character Replacement.

