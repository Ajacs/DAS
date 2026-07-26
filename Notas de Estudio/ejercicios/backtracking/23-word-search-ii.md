# Word Search II

**Categoría:** Backtracking + Trie  
**Patrón:** DFS sobre grilla guiado por prefijos compartidos  
**Dificultad aproximada:** Difícil  
**Fuente:** `src/main/java/com/das/algorithms/backtracking/WordSearchII.java`

## Problem description (English)

Given an `m x n` board of lowercase letters and a collection of unique words, return every word that can be formed using horizontally or vertically adjacent cells. A cell may not be reused within the same word.

## Ficha de 60 segundos

- **Qué pide:** encontrar muchas palabras en el mismo tablero.
- **Señal:** diccionario grande y gran cantidad de prefijos compartidos.
- **Idea:** construir un Trie y hacer un solo conjunto de recorridos guiados por prefijos posibles.
- **Estado:** `(row, col, trieNode)`.
- **Invariante:** el camino de celdas elegido forma exactamente el prefijo representado por el nodo actual.
- **Tiempo:** construcción `O(S)` más búsqueda exponencial podada por el Trie.
- **Espacio:** `O(S + L)` más resultados.

`S` es la suma de longitudes de las palabras y `L` la longitud máxima.

## Problema en palabras simples

Word Search I pregunta por una palabra. Aquí el diccionario puede contener miles. Ejecutar una búsqueda completa por cada palabra repetiría los mismos recorridos una y otra vez. El Trie comparte esos prefijos.

## Qué aporta el Trie

Para las palabras:

```text
oath
oak
oat
```

el prefijo `oa` se almacena y se recorre una sola vez. Desde ese nodo, el Trie indica qué letras pueden continuar. Si no existe el hijo correspondiente, toda la rama se descarta inmediatamente.

## Qué representa cada estado

| Elemento | Significado |
|---|---|
| `row`, `col` | Celda actual |
| `parent` / `currNode` | Prefijo compartido alcanzado |
| `currNode.children` | Letras que todavía podrían formar palabras |
| `currNode.word` | Palabra completa terminada en ese nodo |
| `'#'` | Celda ocupada por la ruta actual |

## Idea paso a paso

### Fase 1: construir el Trie

1. Inserta cada palabra carácter por carácter.
2. Cada arista representa una letra.
3. En el nodo final guarda la palabra completa.

### Fase 2: recorrer el tablero

1. Considera cada celda como posible comienzo.
2. Solo inicia DFS si esa letra existe desde la raíz.
3. Avanza al hijo del Trie correspondiente a la celda.
4. Si `currNode.word != null`, agrega esa palabra.
5. Asigna `null` para no agregarla dos veces.
6. Marca la celda y explora cuatro vecinos.
7. Restaura la celda al regresar.

## Por qué se continúa después de encontrar una palabra

Encontrar `"oat"` no significa que la rama termine: el mismo nodo puede ser prefijo de `"oath"`. Se agrega la palabra y se continúa explorando hijos.

## Por qué `currNode.word = null`

La misma palabra podría encontrarse mediante diferentes rutas del tablero. El resultado debe contenerla una sola vez. Guardarla en el nodo y borrarla después de agregarla deduplica sin necesitar un `Set<String>` adicional.

## Ejemplo de bolsillo

Tablero:

```text
o a
t h
```

Palabras: `["oat", "oath", "hat"]`.

El DFS `o → a → t` encuentra `"oat"` y continúa. Si luego puede llegar a `h`, también encuentra `"oath"`. La rama `h → a → t` puede encontrar `"hat"`.

## Por qué funciona

El Trie contiene todos y solo los prefijos de las palabras candidatas. El DFS enumera caminos simples del tablero, pero únicamente conserva aquellos cuyo string también es un prefijo del Trie. Cuando un nodo almacena una palabra, el camino actual demuestra que existe en el tablero. La restauración permite reutilizar las celdas en rutas posteriores, aunque nunca dentro de la misma ruta.

## Complejidad

- **Construcción del Trie:** `O(S)` tiempo y espacio.
- **Búsqueda:** peor caso exponencial, aproximadamente `O(R · C · 3^L)`, pero el Trie poda cualquier camino que no sea prefijo del diccionario.
- **Pila recursiva:** `O(L)`.
- **Resultado:** proporcional al total de palabras encontradas.

Comparado con ejecutar Word Search I para cada palabra, se evita un factor cercano a `W` cuando muchas palabras comparten prefijos.

## Tips de entrevista

- Guarda la palabra completa en el nodo final; evita reconstruir el path con `StringBuilder`.
- Inicia DFS solo si la letra existe como hijo de la raíz.
- Deduplica asignando `node.word = null`.
- Optimización avanzada: elimina del Trie nodos hoja ya agotados.
- Un arreglo de 26 hijos es rápido para `a-z`; un `Map<Character, TrieNode>` ahorra memoria con alfabetos dispersos.
- Separa claramente la construcción del Trie de la exploración del tablero.

## Casos límite

- Ninguna palabra empieza con letras del tablero.
- Una palabra es prefijo de otra.
- La misma palabra aparece por varias rutas.
- Palabras de una letra.
- Muchas palabras comparten un prefijo largo.

## Errores frecuentes

- Ejecutar Word Search I independientemente para cada palabra.
- Detener el DFS al encontrar una palabra corta.
- Agregar duplicados.
- Olvidar restaurar el tablero.
- Acceder a `children[ch-'a']` con `ch='#'`.
- Usar un Trie de 26 posiciones si el input permite mayúsculas o Unicode.

## Cómo explicarlo en entrevista

> Word Search I repetiría el mismo DFS para cada palabra. Construyo un Trie para compartir prefijos: el estado recursivo ya no lleva un índice, sino el nodo del Trie que representa el prefijo actual. Si la próxima letra no tiene hijo, podo; si el nodo guarda una palabra, la agrego y continúo porque puede ser prefijo de otra.

## Preguntas de entrevista

1. ¿Por qué Trie es mejor que un `HashSet` de palabras completas?
2. ¿Por qué hay que continuar tras encontrar una palabra?
3. ¿Cómo eliminarías ramas agotadas del Trie?
4. ¿Cuándo preferirías hijos en mapa frente a arreglo?

## Variaciones para practicar

- Implement Trie.
- Design Add and Search Words.
- Boggle Solver.

