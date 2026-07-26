# Word Search

**Categoría:** Backtracking sobre grilla  
**Patrón:** DFS con marca temporal y restauración  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/backtracking/WordSearch.java`

## Problem description (English)

Given an `m x n` board of characters and a string `word`, return `true` if the word can be formed using sequentially adjacent cells. Cells may connect horizontally or vertically, and the same cell cannot be used more than once in a path.

## Ficha de 60 segundos

- **Qué pide:** comprobar si una única palabra puede trazarse en la grilla.
- **Señal:** camino, decisiones alternativas, no reutilizar celdas y necesidad de deshacer.
- **Idea:** iniciar DFS desde cada celda compatible y avanzar el índice de la palabra.
- **Estado:** `(row, col, index)`.
- **Invariante:** antes de cada llamada, las celdas marcadas forman exactamente el prefijo ya elegido.
- **Tiempo:** `O(R · C · 3^L)` aproximadamente.
- **Espacio:** `O(L)` por recursión.

## Problema en palabras simples

Debes “dibujar” la palabra sobre el tablero. Cada letra siguiente debe estar arriba, abajo, a la izquierda o a la derecha. Una ruta no puede pisar dos veces la misma celda.

## Cómo reconocer el patrón

Es backtracking porque:

1. hay varias decisiones posibles desde cada celda;
2. una decisión puede llevar a un callejón sin salida;
3. al regresar debes liberar la celda para probar otra ruta.

## Qué representa cada parámetro

| Parámetro | Significado |
|---|---|
| `row`, `col` | Celda que intentamos usar ahora |
| `board` | Tablero y marca temporal de visitados |
| `word` | Objetivo completo |
| `index` | Próxima letra que debe coincidir |

El índice es preferible a `word.substring(1)` porque evita crear un string nuevo en cada llamada.

## Idea paso a paso

1. Recorre todas las celdas como posibles comienzos.
2. Rechaza coordenadas fuera de límites.
3. Rechaza si la celda no coincide con `word[index]`.
4. Marca la celda con `'#'`.
5. Prueba recursivamente las cuatro direcciones con `index + 1`.
6. Restaura siempre la letra original.
7. Retorna si alguna rama completa la palabra.

## El ciclo de backtracking

```text
Elegir:     usar board[row][col]
Marcar:     board[row][col] = '#'
Explorar:   cuatro vecinos
Restaurar:  board[row][col] = original
```

La restauración debe ocurrir tanto si la rama falla como si tiene éxito. De lo contrario, el método deja el tablero alterado para llamadas posteriores.

## Ejemplo de bolsillo

```text
A B C
S F C
A D E
```

Para `"BCC"`:

1. empieza en `B`;
2. avanza a `C` derecha;
3. avanza a `C` abajo;
4. el índice llega al final: palabra encontrada.

## Por qué funciona

El barrido exterior considera todos los posibles comienzos. Desde cada comienzo, DFS enumera todos los caminos simples compatibles con el prefijo. Una rama solo continúa si coincide con la letra esperada y la marca evita reutilizar una celda. Por exhaustividad, si existe una ruta será explorada; si ninguna completa el índice, la palabra no existe.

## Complejidad

- **Tiempo:** `O(R · C · 3^L)` como cota práctica. La primera celda puede abrir cuatro direcciones; después normalmente quedan como máximo tres porque no puedes volver a la anterior.
- **Espacio:** `O(L)` para la pila recursiva.
- **Nota:** la poda por caracteres suele reducir mucho el tiempo real.

## Tips de entrevista

- Comprueba primero si `word.length() > R*C`.
- Puedes comparar frecuencias del tablero y la palabra antes de iniciar DFS.
- Empieza por el extremo menos frecuente de la palabra para reducir comienzos.
- Usa un carácter marcador que no pueda aparecer en el tablero.
- Restaura en una única ruta de salida para evitar olvidos.

## Casos límite

- Tablero `1×1`.
- Palabra de una letra.
- Palabra más larga que el número de celdas.
- Letras repetidas que obligan a no reutilizar una celda.
- La palabra aparece siguiendo una ruta que requiere retroceder.

## Errores frecuentes

- Permitir movimientos diagonales.
- Marcar una celda después de explorar.
- Retornar `true` antes de restaurar.
- Crear `substring` en cada llamada.
- Compartir un conjunto de visitados entre rutas independientes sin limpiarlo.

## Cómo explicarlo en entrevista

> Inicio una búsqueda desde cada celda que pueda ser la primera letra. El DFS lleva el índice de la próxima letra, marca temporalmente la celda para evitar reutilizarla y explora cuatro vecinos. Después restaura la celda, porque otras rutas deben poder usarla. El costo exponencial depende de la longitud de la palabra.

## Preguntas de entrevista

1. ¿Por qué no sirve un `visited` global?
2. ¿Por qué el factor de ramificación suele expresarse como `3^L`?
3. ¿Cómo podarías usando frecuencias?
4. ¿Qué ocurre si se permiten diagonales?

## Variaciones para practicar

- Path With Maximum Gold.
- Unique Paths III.
- Word Search II.

