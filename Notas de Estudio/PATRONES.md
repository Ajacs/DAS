# Patrones esenciales para entrevistas

Esta guía sirve para reconocer qué técnica aplicar. No memorices código completo: memoriza la **señal**, el **estado que mantienes** y el **invariante**.

## Mapa rápido de decisión

| Si el problema menciona… | Considera… |
|---|---|
| “Acumulado hasta `i`” o suma de rangos | Suma prefija |
| Dos arreglos ordenados | Dos punteros |
| Mayor/menor substring o subarray contiguo | Sliding window |
| Ventanas de longitud exacta `k` | Ventana fija |
| “Como máximo `k`” | Ventana variable con presupuesto |
| “Exactamente `k`” y necesitas contar | `atMost(k) - atMost(k-1)` |
| Agrupar o buscar complementos | HashMap |
| Pertenencia, duplicados o visitados | HashSet |
| Elemento más reciente pendiente | Stack |
| Datos ordenados y búsqueda | Binary Search |
| Regiones conectadas | DFS/BFS |
| Camino más corto sin pesos | BFS |
| Dependencias dirigidas | Detección de ciclos / topological sort |
| Elegir, explorar y deshacer | Backtracking |
| Muchas palabras con prefijos comunes | Trie |

# Arrays

## Suma prefija

### Señal

- suma acumulada;
- suma desde el inicio;
- muchas consultas de rangos.

### Relación

```text
prefix[i] = prefix[i - 1] + nums[i]
```

Para una suma inclusiva `[left, right]`:

```text
prefix[right] - prefix[left - 1]
```

### Invariante

Antes de procesar `i`, `prefix[i-1]` contiene toda la información del segmento anterior.

### Ejemplo

[Running Sum](ejercicios/arrays/01-running-sum.md)

## Dos punteros

Dos índices recorren datos sin repetir trabajo.

### Variantes

| Variante | Señal |
|---|---|
| Extremos `left/right` | Arreglo ordenado o comparación de fronteras |
| Lectura/escritura | Compactar o modificar in-place |
| Dos colecciones | Fusionar datos ordenados |
| Desde el final | El destino tiene espacio libre al final |

### Invariante

Todo lo que quedó fuera del intervalo de punteros ya está resuelto.

### Ejemplos

- [Merge Sorted Array](ejercicios/arrays/02-merge-sorted-array.md)
- [Trapping Rain Water](ejercicios/arrays/11-trapping-rain-water.md)

### Error frecuente

Mover un puntero sin poder explicar qué información permite descartar.

# Sliding Window

Sliding window se usa con segmentos **contiguos**. Los punteros solo avanzan.

## Ventana fija

### Señal

- substring o subarray de longitud exacta `k`;
- comparar todas las ventanas del mismo tamaño.

### Mecánica

1. Construir la primera ventana.
2. Agregar el elemento entrante.
3. Eliminar el saliente.
4. Evaluar.

### Ejemplos

- [Has Substring Anagram](ejercicios/slidingwindow/15-has-substring-anagram.md)
- [Count Substring Anagrams](ejercicios/slidingwindow/16-count-substring-anagrams.md)

## Ventana variable

### Señal

- longest o shortest;
- “como máximo”;
- condición que puede repararse quitando elementos desde la izquierda.

### Plantilla mental

```text
expandir right
agregar elemento

mientras la ventana sea inválida:
    quitar elemento de left
    avanzar left

actualizar respuesta
```

### Invariante

Cuando se actualiza la respuesta, la ventana cumple la condición.

### Ejemplos

- [Longest Unique Substring](ejercicios/slidingwindow/14-longest-unique-substring.md)
- [Max Ones With Single Flip](ejercicios/slidingwindow/21-max-ones-single-flip.md)
- [Longest Two Char Substring](ejercicios/slidingwindow/20-longest-two-char-substring.md)

## Contar ventanas

Si `[start..end]` es válida y todos sus sufijos también lo son:

```text
count += end - start + 1
```

Esto cuenta todas las ventanas válidas que terminan en `end`.

Ejemplos:

- [Count Subarray Product](ejercicios/slidingwindow/17-count-subarray-product.md)
- [At Most K Distinct](ejercicios/slidingwindow/18-at-most-k-distinct.md)

## Exactamente K

Para contar elementos con exactamente `k`:

```text
exactly(k) = atMost(k) - atMost(k - 1)
```

Ejemplo: [Exactly K Distinct](ejercicios/slidingwindow/19-exactly-k-distinct.md)

## Cuándo no funciona

Una ventana basada en sumas normalmente requiere valores positivos. Con negativos, quitar desde la izquierda no cambia la suma de forma predecible; considera suma prefija + HashMap.

# Hashing

## HashMap

Úsalo para:

- frecuencias;
- valor → índice;
- agrupar;
- recordar información calculada.

## Clave canónica

Convierte objetos equivalentes a la misma representación.

Ejemplo:

```text
eat → aet
tea → aet
```

Ambos pertenecen al mismo grupo.

Nota: [Group Anagrams](ejercicios/hashingstrings/03-group-anagrams.md)

## HashSet

Úsalo cuando solo importa:

- si algo existe;
- si fue visitado;
- si está repetido.

### Error frecuente

Usar un `Set` cuando las frecuencias importan. Un set no distingue `"aab"` de `"ab"`.

# Stack

## Señales

- paréntesis o símbolos anidados;
- deshacer lo más reciente;
- siguiente elemento mayor/menor;
- expresión con operadores;
- historial LIFO.

En Java usa:

```java
Deque<Character> stack = new ArrayDeque<>();
stack.push(value);
stack.pop();
stack.peek();
```

Evita `java.util.Stack` en código nuevo.

# Binary Search

## Señales

- datos ordenados;
- condición monotónica;
- encontrar primera/última posición;
- minimizar o maximizar una respuesta posible.

## Plantilla exacta

```java
int left = 0;
int right = nums.length - 1;

while (left <= right) {
    int mid = left + (right - left) / 2;

    if (nums[mid] == target) return mid;
    if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
```

## Invariante

Si el objetivo existe, permanece dentro del intervalo de búsqueda.

## Errores frecuentes

- actualizar `left = mid` y crear un ciclo infinito;
- mezclar intervalos cerrados y semiabiertos;
- perder una respuesta posible al buscar el primer resultado válido.

# Matrices y grillas

## Coordenadas

```text
matrix[row][col]
```

Antes de acceder:

```text
0 <= row < rows
0 <= col < cols
```

## Direcciones

```java
int[][] directions = {
    {1, 0}, {-1, 0}, {0, 1}, {0, -1}
};
```

## Transformaciones

Para rotar 90° en sentido horario:

1. transponer;
2. invertir cada fila.

Nota: [Rotate Image](ejercicios/matrices/04-rotate-image.md)

## Grilla como grafo

Cada celda válida es un nodo y sus vecinas son aristas.

| Pregunta | Técnica |
|---|---|
| ¿Cuántas regiones? | DFS/BFS por componentes |
| ¿Cuánto mide una región? | DFS que retorna tamaño |
| ¿Distancia mínima? | BFS |
| ¿Existe una ruta con decisiones? | DFS/backtracking |

# Grafos

## Lista de adyacencia

Convierte aristas en:

```text
nodo → lista de vecinos
```

En grafos no dirigidos agrega ambos sentidos.

## DFS

Explora una rama hasta agotarla.

Necesita:

1. caso base;
2. marca de visitado;
3. recorrer vecinos.

Ejemplos:

- [Undirected Path](ejercicios/graphs/05-undirected-path.md)
- [Number of Islands](ejercicios/grids/06-number-of-islands.md)

## BFS

Explora por capas con una cola FIFO. La primera vez que alcanza un nodo representa la menor cantidad de aristas, siempre que todas tengan el mismo costo.

Ejemplo: [Closest Carrot](ejercicios/grids/08-closest-carrot.md)

## Componentes conectados

Cada nodo no visitado inicia una exploración nueva. Esa exploración cubre exactamente un componente.

## Ciclos dirigidos

Se necesitan tres estados:

- no visitado;
- en la ruta actual (`visiting`);
- procesado (`visited`).

Volver a un nodo `visiting` demuestra un ciclo. Volver a uno `visited` no.

Ejemplo: [Prerequisites Possible](ejercicios/graphs/09-prerequisites-possible.md)

# Backtracking

## Señales

- construir caminos o combinaciones;
- probar alternativas;
- una decisión puede deshacerse;
- una celda no puede reutilizarse en la misma ruta.

## Ciclo fundamental

```text
elegir
marcar
explorar
restaurar
```

## Invariante

El estado marcado representa exactamente las decisiones de la ruta actual, no de toda la ejecución.

## Error más peligroso

Retornar antes de restaurar el estado.

## Ejemplos

- [Word Search I](ejercicios/backtracking/22-word-search.md)
- [Word Search II](ejercicios/backtracking/23-word-search-ii.md)
- [Comparación I vs II](ejercicios/backtracking/WORD-SEARCH-COMPARACION.md)

# Trie

Un Trie almacena palabras por prefijos compartidos.

Cada nodo representa:

- un prefijo;
- posibles letras siguientes;
- opcionalmente el final de una palabra.

## Cuándo usarlo

- muchas palabras;
- consultas por prefijo;
- búsqueda donde los prefijos imposibles deben podarse.

## Word Search I vs II

```text
Word Search I:  estado = índice de una palabra
Word Search II: estado = nodo de Trie para muchas palabras
```

El Trie evita repetir la exploración de prefijos compartidos.

# Complejidades que debes reconocer

| Operación | Complejidad típica |
|---|---:|
| Recorrer arreglo | `O(n)` |
| Recorrer matriz | `O(R·C)` |
| Sort | `O(n log n)` |
| HashMap get/put | `O(1)` promedio |
| DFS/BFS | `O(V+E)` |
| Binary Search | `O(log n)` |
| Sliding window | `O(n)` |
| Backtracking | Exponencial |

# Checklist antes de programar

1. ¿La respuesta usa elementos contiguos?
2. ¿El input está ordenado?
3. ¿Necesito frecuencias o solo pertenencia?
4. ¿Todos los valores son positivos?
5. ¿Busco existencia, cantidad, mínimo o máximo?
6. ¿La ruta necesita restaurar decisiones?
7. ¿Las aristas tienen el mismo costo?
8. ¿Qué estado mantengo?
9. ¿Cuál es mi invariante?
10. ¿Qué caso límite puede romper mis índices?

# Patrones adicionales que debes dominar

Los siguientes patrones todavía no están representados completamente por los ejercicios del repositorio, pero aparecen con frecuencia en entrevistas.

# Sorting

Ordenar cuesta normalmente `O(n log n)`, pero puede convertir un problema difícil en un recorrido lineal.

## Señales

- agrupar duplicados;
- comparar vecinos;
- procesar eventos cronológicamente;
- usar dos punteros;
- fusionar intervalos;
- no importa conservar el orden original.

## Pregunta clave

> ¿Puedo pagar `O(n log n)` para obtener una estructura que después recorra en `O(n)`?

## Errores frecuentes

- ordenar cuando deben devolverse índices originales sin conservarlos;
- modificar la entrada sin autorización;
- asumir que `Arrays.sort()` conserva orden relativo;
- olvidar que ordenar puede simplificar la deduplicación.

# Kadane

Encuentra el mejor subarreglo contiguo en `O(n)`.

## Estado

```text
current = mejor suma que termina exactamente aquí
best    = mejor suma encontrada globalmente
```

## Relación

```text
current = max(nums[i], current + nums[i])
best = max(best, current)
```

## Señal

- maximum/minimum subarray sum;
- segmento contiguo;
- números negativos.

## Edge case principal

Inicializa con el primer elemento, no con cero, porque el arreglo puede contener únicamente negativos.

# Intervalos

## Señales

- reuniones;
- reservas;
- rangos de tiempo;
- segmentos que se superponen;
- insertar, fusionar o eliminar rangos.

## Estrategia habitual

1. Ordenar por inicio.
2. Comparar el intervalo actual con el último intervalo aceptado.
3. Fusionar si se superponen.

Dos intervalos `[a,b]` y `[c,d]` se superponen si:

```text
c <= b
```

si están ordenados por inicio.

## Variantes

| Problema | Técnica |
|---|---|
| Merge Intervals | Ordenar + fusionar |
| Insert Interval | Antes, solapamiento, después |
| Meeting Rooms | Ordenar y comparar |
| Non-overlapping Intervals | Greedy por final más temprano |
| Meeting Rooms II | Heap o eventos separados |

## Edge cases

- intervalos que solo se tocan;
- uno contiene completamente a otro;
- entrada desordenada;
- intervalos duplicados;
- definición inclusiva o exclusiva de extremos.

# Monotonic Stack

Mantiene elementos en orden creciente o decreciente para encontrar relaciones con vecinos.

## Señales

- siguiente mayor o menor;
- elemento anterior mayor o menor;
- temperatura futura;
- área de histogramas;
- eliminar elementos hasta mantener orden.

## Invariante

La pila conserva índices cuyos elementos todavía no han encontrado respuesta.

## Complejidad

Aunque existe un `while` dentro de un `for`, suele ser `O(n)` porque cada elemento entra y sale de la pila una sola vez.

## Edge cases

- valores iguales;
- decidir si la comparación es `<` o `<=`;
- guardar índices frente a valores;
- elementos que nunca encuentran respuesta.

# Linked Lists

## Dummy node

Un nodo ficticio elimina casos especiales al modificar la cabeza.

Úsalo para:

- fusionar listas;
- eliminar nodos;
- construir una lista resultado;
- insertar antes del primer nodo.

## Fast and slow pointers

### Señales

- encontrar el centro;
- detectar ciclos;
- localizar el inicio de un ciclo;
- encontrar el nodo `k` desde el final.

### Velocidades

```text
slow avanza 1
fast avanza 2
```

## Reversión

Estado mínimo:

```text
previous
current
next
```

Antes de modificar `current.next`, guarda el siguiente nodo.

## Edge cases

- lista vacía;
- un solo nodo;
- dos nodos;
- ciclo que comienza en la cabeza;
- eliminación de la cabeza o la cola;
- perder el resto de la lista al sobrescribir `next`.

# Árboles binarios

## Recorridos DFS

| Recorrido | Orden | Uso común |
|---|---|---|
| Preorder | raíz, izquierda, derecha | Copiar o serializar |
| Inorder | izquierda, raíz, derecha | BST en orden |
| Postorder | izquierda, derecha, raíz | Calcular desde hijos |

## BFS por niveles

Procesa la cola por tamaños:

```text
levelSize = queue.size()
repetir levelSize veces
```

## Patrón recursivo

Una función de árbol normalmente:

1. resuelve el subárbol izquierdo;
2. resuelve el derecho;
3. combina resultados con el nodo actual.

## Señales

- profundidad, altura o diámetro;
- ancestro común;
- validar BST;
- camino raíz-hoja;
- procesamiento por niveles.

## Edge cases

- raíz `null`;
- árbol de un nodo;
- árbol completamente inclinado;
- valores duplicados en BST;
- profundidad suficiente para desbordar la pila.

# Binary Search Tree

## Propiedad

En un BST típico:

```text
izquierda < nodo < derecha
```

La política para duplicados debe estar definida.

## Validación correcta

No basta comparar un nodo con sus hijos. Cada nodo debe respetar un rango heredado:

```text
lower < node.value < upper
```

## Operaciones

- búsqueda: `O(h)`;
- inserción: `O(h)`;
- eliminación: `O(h)`;
- inorder produce valores ordenados.

En el peor caso `h=n`; si está balanceado, `h=log n`.

# Heap / Priority Queue

## Señales

- top `k`;
- mínimo o máximo dinámico;
- mezclar colecciones ordenadas;
- procesar el próximo elemento con mayor prioridad;
- mediana en streaming.

## Java

Min-heap:

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
```

Max-heap:

```java
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Comparator.reverseOrder());
```

## Regla de Top K

- Para conservar los `k` mayores, usa min-heap de tamaño `k`.
- Para conservar los `k` menores, usa max-heap de tamaño `k`.

## Complejidad

- insertar/eliminar: `O(log n)`;
- consultar raíz: `O(1)`;
- construir heap: `O(n)`.

## Edge cases

- `k=0`;
- `k > n`;
- duplicados;
- comparator con overflow: evita `b-a`;
- heap vacío antes de `poll()`.

# Greedy

Greedy toma la mejor decisión local sin reconsiderarla.

## Señales

- maximizar cantidad de tareas;
- minimizar eliminaciones;
- intervalos;
- alcance máximo;
- elegir el final más temprano.

## Requisito

No uses greedy solo porque “parece lógico”. Debes justificar:

1. propiedad de elección greedy;
2. estructura óptima restante.

## Formas de justificar

- argumento de intercambio;
- mantener el mejor estado posible;
- demostrar que una decisión nunca empeora el futuro.

## Edge cases

- decisiones locales con impacto futuro;
- input que requiere ordenar primero;
- confundir greedy con DP;
- actualizar el estado demasiado pronto.

# Backtracking combinatorio

## Usos

- subsets;
- permutations;
- combinations;
- N-Queens;
- Sudoku;
- particiones de strings.

## Plantilla

```text
backtrack(state, choices):
    si state es solución:
        guardar copia
        return

    para cada choice válida:
        elegir
        backtrack(...)
        deshacer
```

## Diferencias

| Problema | Decisiones |
|---|---|
| Subsets | incluir o excluir |
| Permutations | elegir cualquier elemento no usado |
| Combinations | continuar desde un índice |
| Partitioning | elegir el siguiente corte |

## Edge cases

- guardar una referencia en vez de una copia;
- duplicados en la entrada;
- condición de terminación;
- no avanzar el índice;
- olvidar deshacer la elección.

# Dynamic Programming

DP evita repetir subproblemas.

## Señales

- contar formas;
- máximo o mínimo bajo decisiones;
- “puedes elegir” repetidamente;
- prefijos o sufijos con estados repetidos;
- solución recursiva exponencial con parámetros repetidos.

## Método para diseñar DP

1. Define el estado en una frase.
2. Escribe la recurrencia.
3. Define casos base.
4. Decide el orden de cálculo.
5. Identifica dónde está la respuesta.
6. Optimiza espacio después de tener una solución correcta.

## Memoization vs tabulation

| Memoization | Tabulation |
|---|---|
| Top-down | Bottom-up |
| Natural desde recursión | Control explícito del orden |
| Calcula estados necesarios | Puede calcular estados extra |
| Usa pila recursiva | Evita profundidad recursiva |

## Patrones DP importantes

- Fibonacci / escalones;
- House Robber;
- 0/1 Knapsack;
- Coin Change;
- Longest Common Subsequence;
- Longest Increasing Subsequence;
- DP en grillas;
- partición de strings.

## Edge cases

- estado mal definido;
- base cases incompletos;
- índices `i-1`;
- usar `0` para representar “imposible”;
- overflow al contar formas;
- optimizar memoria antes de validar la recurrencia.

# Topological Sort

Ordena un grafo dirigido respetando dependencias.

## Señales

- cursos y prerequisitos;
- orden de compilación;
- dependencias de tareas;
- decidir si todo puede completarse.

## Kahn con BFS

1. Calcula indegree.
2. Encola nodos con indegree cero.
3. Retira uno y reduce vecinos.
4. Si procesas menos de `V`, existe un ciclo.

## DFS

Usa estados `unvisited`, `visiting`, `visited` y agrega el nodo al resultado después de sus vecinos.

## Edge cases

- varios órdenes válidos;
- nodos aislados;
- self-loop;
- componentes desconectados;
- ciclo parcial.

# Union-Find / Disjoint Set

Mantiene componentes dinámicos.

## Señales

- conectar elementos;
- saber si dos nodos pertenecen al mismo grupo;
- detectar ciclo no dirigido;
- procesar aristas incrementalmente;
- Kruskal.

## Operaciones

- `find(x)`: representante del componente;
- `union(a,b)`: une componentes.

Optimizaciones:

- path compression;
- union by rank o size.

Con ambas, el coste amortizado es prácticamente constante.

## Edge cases

- inicializar todos los nodos;
- reducir el contador solo si se unen componentes distintos;
- índices fuera del rango;
- aristas duplicadas.

# Shortest Paths

## Elección del algoritmo

| Tipo de arista | Algoritmo |
|---|---|
| Sin pesos / mismo costo | BFS |
| Pesos no negativos | Dijkstra |
| Pesos negativos | Bellman-Ford |
| Todos contra todos, pequeño | Floyd-Warshall |
| DAG con pesos | Orden topológico |

## Dijkstra

Usa priority queue con pares `(distance, node)`.

### Invariante

Al extraer la menor distancia no obsoleta, es la mejor distancia conocida para ese nodo.

### Error frecuente

Marcar visitado al insertar en el heap. Un camino mejor puede aparecer después; valida al extraer o compara con `dist[node]`.

# Minimum Spanning Tree

Conecta todos los nodos con coste total mínimo.

## Algoritmos

- Kruskal: ordenar aristas + Union-Find.
- Prim: crecer desde un nodo + min-heap.

No confundir MST con shortest path: MST minimiza el coste total del árbol, no la distancia desde un origen.

# Bit Manipulation

## Operaciones

```text
x & y   AND
x | y   OR
x ^ y   XOR
x << k  desplazar izquierda
x >> k  desplazar derecha
```

## Trucos frecuentes

```text
x & 1          comprobar bit menos significativo
x & (x - 1)    eliminar el bit 1 más bajo
x ^ x = 0
x ^ 0 = x
```

## Señales

- todos los elementos aparecen dos veces excepto uno;
- subconjuntos representados por máscaras;
- potencias de dos;
- permisos o flags.

## Edge cases

- enteros con signo;
- desplazamientos de 31/63 bits;
- precedencia de operadores;
- overflow.

# Math y conteo

## Herramientas comunes

- máximo común divisor con Euclides;
- módulo;
- primalidad;
- combinatoria;
- frecuencia de factores;
- coordenadas y geometría básica.

## Módulo

Al restar:

```text
(a - b + MOD) % MOD
```

Usa `long` antes de multiplicar:

```java
long product = (long) a * b;
```

# Estrategia completa para resolver un problema

## 1. Aclarar

Antes de programar pregunta:

- ¿La entrada puede estar vacía?
- ¿Hay duplicados?
- ¿Está ordenada?
- ¿Puedo modificarla?
- ¿Qué retorno si no hay respuesta?
- ¿Los límites son inclusivos?
- ¿Puede haber negativos?

## 2. Extraer restricciones

Las restricciones sugieren complejidad:

| `n` aproximado | Complejidad razonable |
|---:|---|
| `n <= 20` | `O(2^n)` puede funcionar |
| `n <= 100` | `O(n³)` quizá |
| `n <= 1,000` | `O(n²)` quizá |
| `n <= 100,000` | `O(n log n)` u `O(n)` |
| `n >= 1,000,000` | Cerca de `O(n)` |

## 3. Resolver un ejemplo

Usa un ejemplo pequeño y registra cómo cambia el estado. Si no puedes explicar el estado, todavía no programes.

## 4. Dar la solución simple

Explica primero brute force:

- demuestra comprensión;
- establece una base correcta;
- permite comparar la optimización.

## 5. Identificar trabajo repetido

Pregunta:

- ¿Estoy recalculando sumas?
- ¿Estoy buscando repetidamente?
- ¿Estoy recorriendo los mismos prefijos?
- ¿Estoy explorando estados idénticos?

La respuesta suele conducir a prefix sums, hashing, Trie o DP.

## 6. Declarar el invariante

Ejemplos:

- “La ventana siempre tiene como máximo `k` distintos”.
- “Después de `p`, el arreglo ya está ordenado”.
- “Los nodos visitados ya fueron completamente procesados”.

## 7. Programar por capas

1. Firma.
2. Casos base.
3. Ciclo principal.
4. Helpers.
5. Resultado.

Compila pronto; no escribas veinte minutos sin ejecutar.

## 8. Probar

Haz trace de:

- caso mínimo;
- caso normal;
- caso adverso;
- ausencia de solución.

## 9. Analizar

Explica tiempo y espacio por operaciones, no solo menciones `O(n)`.

# Edge cases universales

## Arrays y strings

- vacío;
- un elemento;
- dos elementos;
- todos iguales;
- todos distintos;
- ordenado;
- orden inverso;
- duplicados;
- negativos;
- valores máximo/mínimo;
- respuesta al inicio o al final.

## Matrices

- `1×1`;
- una fila;
- una columna;
- rectangular, no cuadrada;
- esquinas y bordes;
- todo bloqueado;
- todo abierto;
- inicio igual a destino.

## Grafos y árboles

- nodo aislado;
- un solo nodo;
- componentes desconectados;
- ciclo;
- self-loop;
- múltiples caminos;
- árbol inclinado;
- raíz `null`.

## Conteos

- resultado cero;
- resultado muy grande;
- overflow de `int`;
- duplicados;
- ventanas superpuestas.

# Estrategia durante la entrevista

## Comunicación

Di en voz alta:

1. qué entendiste;
2. qué restricciones importan;
3. solución brute force;
4. patrón elegido;
5. invariante;
6. complejidad;
7. casos límite.

No permanezcas en silencio durante largos periodos.

## Si te bloqueas

1. Reduce el ejemplo.
2. Escribe brute force.
3. Identifica qué trabajo se repite.
4. Pregunta si puedes asumir algo.
5. Explica dos opciones y sus tradeoffs.

Pedir una aclaración razonable es mejor que implementar una interpretación incorrecta.

## Manejo del tiempo

- 3–5 minutos: entender y aclarar.
- 5 minutos: ejemplo y enfoque.
- 15–25 minutos: implementación.
- 5 minutos: pruebas y complejidad.

En assessment:

- lee todos los problemas primero;
- resuelve por dificultad percibida;
- cambia de pregunta después de 8–10 minutos sin progreso ejecutable;
- conserva tiempo para probar.

## Cómo presentar una optimización

```text
Brute force cuesta O(...)
El trabajo repetido es (...)
Mantendré (...) usando (...)
Eso reduce el tiempo a O(...) con O(...) espacio
```

# Estrategia de debugging

## Si hay un resultado incorrecto

Comprueba:

1. límites del ciclo;
2. actualización de punteros;
3. estado antes y después del `while`;
4. frecuencia que llega a cero;
5. restauración de backtracking;
6. comparación `<` frente a `<=`;
7. índice frente a valor.

## Si hay excepción

- arreglo vacío;
- acceso `i-1` o `i+1`;
- `poll()` sobre estructura vacía;
- clave inexistente en mapa;
- coordenada fuera de límites;
- recursión sin caso base.

## Si excede tiempo

- busca un ciclo anidado;
- elimina búsquedas lineales repetidas;
- usa HashMap/HashSet;
- considera sorting;
- identifica estados repetidos para memoization;
- poda backtracking.

# Qué memorizar y qué no

## Memoriza

- señales de cada patrón;
- invariantes;
- complejidades;
- sintaxis básica de estructuras;
- plantillas pequeñas;
- edge cases.

## No memorices

- soluciones completas;
- nombres de variables exactos;
- trucos sin comprender;
- código de problemas Hard específicos.

El objetivo es reconstruir la solución desde el patrón y sus invariantes.
