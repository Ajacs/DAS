# Trapping Rain Water

**Categoría:** Arreglos  
**Patrón:** Dos punteros con máximos laterales  
**Dificultad aproximada:** Difícil  
**Fuente:** `src/main/java/com/das/algorithms/arrays/TrappingRainWater.java`

## Ficha de 60 segundos

- **Qué pide:** calcular cuánta agua queda atrapada entre barras.
- **Señal:** el agua sobre una posición depende de límites a izquierda y derecha.
- **Idea:** avanzar el lado con la barra menor y mantener su máximo conocido.
- **Invariante:** el lado menor ya tiene una frontera opuesta suficiente para calcular su agua.
- **Tiempo:** `O(n)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

Cada número representa la altura de una barra. El agua sobre una barra está limitada por la menor de las mayores paredes que existen a ambos lados.

## Cómo reconocer el patrón

Si la respuesta de cada posición depende de información de ambos extremos, considera prefijos/sufijos o dos punteros. La exigencia de espacio constante favorece dos punteros.

## Idea paso a paso

1. Coloca `left` y `right` en los extremos.
2. Conserva `leftMax` y `rightMax`.
3. Procesa el lado cuya altura actual sea menor.
4. Actualiza su máximo y suma `máximo - altura`.
5. Mueve ese puntero.

## Ejemplo de bolsillo

En `[2, 0, 2]`, el cero tiene una pared de altura `2` a cada lado, así que retiene `2` unidades.

## Por qué funciona

Si `height[left] < height[right]`, existe a la derecha una frontera al menos tan alta como la barra izquierda. El agua de `left` queda determinada por `leftMax`; el detalle de las barras más lejanas a la derecha ya no puede reducirla. El caso derecho es simétrico.

## Complejidad

- **Tiempo:** `O(n)`, cada puntero avanza como máximo `n` veces.
- **Espacio:** `O(1)`, solo mantiene índices, máximos y acumulador.

## Casos límite

- Menos de tres barras: no se atrapa agua.
- Alturas crecientes o decrecientes: resultado `0`.
- Todas las alturas iguales.

## Errores frecuentes

- Sumar agua negativa antes de actualizar el máximo.
- Mover el lado más alto en lugar del más bajo.
- Confundir este patrón con una ventana deslizante.

## Cómo explicarlo en entrevista

> El agua de una posición está limitada por los máximos de ambos lados. Mantengo dos punteros y proceso siempre el lado menor, porque ya existe una frontera suficiente en el extremo opuesto. Cada posición se procesa una vez y uso espacio constante.

## Preguntas de entrevista

1. ¿Cómo resolverlo con arreglos de prefijos y sufijos?
2. ¿Por qué es seguro procesar el lado menor?
3. ¿Qué cambia si cada barra tiene ancho diferente?

## Variaciones para practicar

- Container With Most Water.
- Largest Rectangle in Histogram.

