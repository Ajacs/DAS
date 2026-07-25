# Count Subarray Product

**Categoría:** Sliding window  
**Patrón:** Ventana variable con producto y conteo  
**Fuente:** `src/main/java/com/das/algorithms/slidingwindow/CountSubarrayProduct.java`

## Ficha de 60 segundos

- **Qué pide:** contar subarreglos cuyo producto sea estrictamente menor que el objetivo.
- **Señal:** valores positivos, subarreglos contiguos y producto.
- **Idea:** expandir, dividir desde la izquierda si el producto es demasiado grande y sumar el número de ventanas válidas que terminan en `end`.
- **Invariante:** después de reducir, el producto de la ventana es menor que el objetivo.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

Cuenta todas las secciones continuas de números positivos cuyo producto sea menor que `targetProduct`.

## Cómo reconocer el patrón

Los valores positivos hacen que multiplicar al expandir no reduzca el producto. Esa monotonicidad permite reparar la ventana moviendo únicamente `start`.

## Idea paso a paso

1. Multiplica el nuevo valor.
2. Mientras el producto sea `>= target`, divide por el valor izquierdo.
3. Suma `end - start + 1`: es la cantidad de subarreglos válidos que terminan en `end`.

## Ejemplo de bolsillo

Para `[10,5,2,6]` y `100`, al terminar en `6` son válidos `[6]`, `[2,6]` y `[5,2,6]`.

## Por qué funciona

Si la ventana `[start..end]` es válida y todos los valores son positivos, también lo son todos sus sufijos. Existen exactamente `end-start+1`.

## Complejidad

- **Tiempo:** `O(n)`, cada elemento entra y sale una vez.
- **Espacio:** `O(1)`.

## Casos límite

- `target <= 1`: no hay productos positivos menores.
- Un solo valor válido.
- Todos los valores fuerzan reducir la ventana.

## Errores frecuentes

- Sumar solo una coincidencia en lugar de todas las ventanas que terminan en `end`.
- Usar la técnica con cero o negativos sin revisar el razonamiento.
- Confundir `< target` con `<= target`.

## Cómo explicarlo en entrevista

> Mantengo una ventana con producto menor que el objetivo. Después de repararla, cada sufijo que termina en `end` también es válido, así que agrego el tamaño de la ventana al contador.

## Preguntas de entrevista

1. ¿Por qué se suma el tamaño completo de la ventana?
2. ¿Qué cambia con ceros?
3. ¿Puede desbordarse el producto?

## Variaciones para practicar

- Subarray Product Less Than K.
- Minimum Size Subarray Sum.

