# Word Search I vs Word Search II

## La relación en una frase

Ambos recorren caminos simples sobre la misma clase de grilla; Word Search I valida un solo objetivo con un índice, mientras Word Search II valida simultáneamente un diccionario usando un Trie como estado y mecanismo de poda.

## Similitudes

Los dos algoritmos:

- prueban cada celda como posible inicio;
- se mueven en cuatro direcciones;
- no permiten reutilizar una celda en la misma ruta;
- marcan la celda antes de explorar;
- restauran la celda al regresar;
- usan DFS/backtracking;
- tienen profundidad limitada por la longitud de palabra;
- pueden ser exponenciales en el peor caso.

## Diferencias esenciales

| Aspecto | Word Search I | Word Search II |
|---|---|---|
| Objetivo | Una palabra | Muchas palabras |
| Estado de búsqueda | Índice `index` | Nodo `TrieNode` |
| Pregunta en cada paso | “¿Coincide con `word[index]`?” | “¿Existe esta letra como continuación de algún prefijo?” |
| Resultado | Booleano | Lista de palabras |
| Caso de éxito | `index == word.length()` | `node.word != null` |
| Después de encontrar | Puede terminar | Debe continuar por palabras más largas |
| Deduplicación | No necesaria | `node.word = null` o `Set` |
| Preprocesamiento | Ninguno | Construir Trie |
| Poda | Letra de la palabra | Todos los prefijos del diccionario |
| Memoria adicional | Pila `O(L)` | Trie `O(S)` + pila `O(L)` |

## La transformación mental de I a II

### Word Search I

```text
camino actual ↔ word[0..index]
```

La siguiente letra válida está fijada:

```java
board[row][col] == word.charAt(index)
```

### Word Search II

```text
camino actual ↔ prefijo representado por trieNode
```

Puede haber varias continuaciones válidas:

```java
trieNode.children[board[row][col] - 'a']
```

El Trie generaliza el índice: en lugar de una sola siguiente letra, representa el conjunto de siguientes letras que todavía podrían completar alguna palabra.

## Por qué no ejecutar Word Search I W veces

Supón:

```text
["app", "apple", "application", "apply"]
```

La estrategia ingenua vuelve a explorar el prefijo `"app"` para cada palabra. El Trie lo recorre una vez y después bifurca según las terminaciones posibles.

Coste conceptual:

```text
Repetir Word Search I: W búsquedas independientes
Word Search II con Trie: una familia de búsquedas que comparte prefijos
```

## Restauración: la regla que comparten

En ambos:

```java
char original = board[row][col];
board[row][col] = '#';

// explorar

board[row][col] = original;
```

La marca pertenece a la ruta actual, no a toda la ejecución. Una celda usada por una ruta debe estar disponible para otra.

## Cuándo usar cada enfoque

- **Una palabra:** Word Search I. Construir un Trie sería complejidad innecesaria.
- **Pocas palabras sin prefijos comunes:** repetir I puede ser aceptable.
- **Muchas palabras o prefijos compartidos:** Word Search II con Trie.
- **Muchas consultas sobre el mismo diccionario:** reutiliza el Trie.
- **Muchas consultas sobre el mismo tablero y palabras aisladas:** considera preprocesamientos adicionales según restricciones.

## Preguntas para comprobar dominio

1. ¿Qué variable de Word Search I se convierte en el nodo del Trie?
2. ¿Por qué Word Search II no termina al encontrar una palabra?
3. ¿Por qué `visited` no puede ser global?
4. ¿Qué prefijos evita explorar el Trie?
5. ¿Qué coste añade el Trie y qué trabajo evita?

