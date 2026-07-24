# Rotate Image

**Categoría:** Matrices  
**Patrón:** Transponer + invertir filas  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/matrices/RotateImage.java`

## Ficha de 60 segundos

- **Qué pide:** rotar una matriz cuadrada 90° en sentido horario, in-place.
- **Señal:** matriz cuadrada, rotación y sin matriz auxiliar.
- **Idea:** transponer sobre la diagonal principal y luego invertir cada fila.
- **Invariante:** cada intercambio de la transposición procesa una pareja simétrica una sola vez.
- **Tiempo:** `O(n²)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

La columna izquierda debe convertirse en la fila superior, en orden inverso, y la transformación debe ocurrir sobre la matriz original.

## Cómo reconocer el patrón

Las rotaciones de matrices suelen descomponerse en reflexión/transposición. Para sentido horario: transposición seguida de inversión horizontal.

## Idea paso a paso

1. Intercambia `matrix[i][j]` con `matrix[j][i]` solo para `j > i`.
2. Para cada fila, intercambia extremos con dos punteros.

## Ejemplo de bolsillo

```text
1 2 3      1 4 7      7 4 1
4 5 6  ->  2 5 8  ->  8 5 2
7 8 9      3 6 9      9 6 3
             transpuesta  filas invertidas
```

## Por qué funciona

La transposición transforma `(r,c)` en `(c,r)`. Invertir columnas dentro de cada fila transforma después `(c,r)` en `(c,n-1-r)`, que es la coordenada de una rotación horaria.

## Casos límite

- Matriz `1×1`.
- Tamaño par o impar; el centro de una matriz impar no cambia.
- El enunciado garantiza que sea cuadrada.

## Errores frecuentes

- Recorrer toda la matriz al transponer: cada pareja se intercambia dos veces.
- Confundir rotación horaria con antihoraria.
- Crear otra matriz y violar la condición in-place.

## Cómo explicarlo en entrevista

> Descompongo la rotación en dos transformaciones in-place: primero reflejo sobre la diagonal principal y después invierto cada fila. Cada fase toca `n²` elementos como máximo y solo usa una variable temporal.

## Preguntas de entrevista

1. ¿Cómo rotarías 90° en sentido antihorario?
2. ¿Cómo rotarías 180°?
3. ¿Se puede hacer lo mismo con una matriz no cuadrada in-place?

## Variaciones para practicar

- Spiral Matrix.
- Set Matrix Zeroes.
