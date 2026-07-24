# Notas generales de algoritmos

## Grafos
Normalmente representamos Grafos usando una lista de adyacencia que representa la conexión entre un nodo y sus vecinos,

```java
Map<String, List<String>> graph = Map.of(
    "a", List.of("b", "c", "d")
);
```

En ocasiones los problemas nos piden encontrar distancias, minimos, maximos, entregandonos listas de nodos, por ejemplo en algunos problemas de grafos no dirijidos nos peuden entregar lista de pares:


```java
List<List<String>> edges = List.of(
    List.of("a", "b"),
    List.of("a", "c"),
    List.of("c", "d")
);

```

Cada lista dentro de la lista principal representa las conexiones entre nodos, donde podemos ver que por ejemplo **a** tiene conexiones con **b** y **c** con **d**, cómo lo más común es trabajar con listas de adyacencia, debemos transformar esto al respectivo mapa de adyacencia:


```
Map<String, List<String>> graph = new HashMap<>();

for(var pair : edges) {
    // pair es algo como List.of("a", "b");
    var nodeA = pair.get(0); // "a"
    var nodeB = pair.get(1); // "b"

    graph.computeifAbsent(nodeA, k -> new ArrayList<String>()).add(nodeB);
    graph.conmputeIfAbsent(nodeB, k -> new ArrayList<String>()).add(nodeA);

    return graph;
}
```

Cómo ambos nodos tienen conexiones entre si, es decir puedes ir de **"a"** a **"b"** o de **b** a **"a"**, es por eso que agregamos ambos nodos a sus respectivas listas, el método computeIfAbsent determine si el nodo existe, y en caso contrario ejecuta la función lambda que crea una nueva lista en caso de no existir y agregamos el nodo contrario

### DFS

DFS (Depth First Search) es un algoritmo para recorrer grafos en forma profunda, siempre agotando una sola dirección a la vez (si vas hacia abajo exploras todo hacia abajo, si exploras hacia arriba, exploras todo hacia arriba, etc), para poder hacer uso de este algoritmo es necesaria la utilización de un Stack (LIFO - Last In, First Out, El último en entrar es el primero en salir), es bastande común hacer uso de recursividad para hacer este tipo de traversal por ejemplo en la busqueda de islas:

```java
class Solution {
    private static int[] D_ROW = {1, -1, 0, 0};
    private static int[] D_COL = {0, 0, 1, -1};

    public int numIslands(char[][] grid) {
        var islandsCount = 0;

        for(var r = 0; r < grid.length; r++) {
            for (var c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '1') {
                    islandsCount++;
                    dfs(grid, r, c);
                }
            }
        }

        return islandsCount;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';

        for(var i = 0; i < 4; i++) {
            var newRow = r + D_ROW[i];
            var newCol = c + D_COL[i];
            dfs(grid, newRow, newCol);
        }

/*
If we're not using DELTA array to contro directions
we can use this way adding or subtracting 1 to rows and cols
        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
*/
    }
}
```

# 🏝️ Algoritmo: Número de Islas (Number of Islands)

## 📌 Concepto Clave
El problema nos pide contar cuántas islas independientes existen en un mapa bidimensional de tierra (`'1'`) y agua (`'0'`). 

### 💡 La Idea en Una Frase
> Recorres el mapa casilla por casilla. Cada vez que encuentras un pedazo de tierra (`'1'`), **incrementas el contador de islas** e inicias una **reacción en cadena (DFS) que hunde toda esa isla** convirtiéndola en agua (`'0'`) para no volver a contar ninguno de sus pedazos.

---

## 🚶‍♂️ Paso a Paso del Algoritmo

### 1. Exploración Principal (`numIslands`)
* Se recorre la matriz completa mediante dos bucles `for` (filas y columnas).
* Cada casilla se evalúa:
  * Si es agua (`'0'`), se ignora.
  * Si es tierra (`'1'`), significa que hemos descubierto **una nueva isla**.

### 2. Acción al Encontrar Tierra
1. Se incrementa el contador: `islandsCount++`.
2. Se activa la función recursiva `dfs(grid, r, c)` desde esa posición para eliminar la isla del mapa.

### 3. Proceso de Hundimiento / Inundación (`dfs`)
La función `dfs` realiza tres acciones principales:

1. **Caso Base (Límites y Condición de Parada):**
   * Si la posición `(r, c)` se sale de la matriz (fuera de rangos de fila o columna).
   * O si la casilla ya es agua (`'0'`).
   * **Acción:** `return` (frena la recursión).

2. **Hundimiento (*In-Place*):**
   * Se cambia `grid[r][c] = '0'`. Al convertir la tierra en agua, marcamos la casilla como visitada sin usar memoria extra.

3. **Expansión en 4 Direcciones:**
   * Se explora recursivamente hacia arriba, abajo, izquierda y derecha utilizando los arreglos de desplazamiento (`D_ROW` y `D_COL`):
     * **Abajo:** `(r + 1, c)`
     * **Arriba:** `(r - 1, c)`
     * **Derecha:** `(r, c + 1)`
     * **Izquierda:** `(r, c - 1)`

---

## 🛠️ Código de Referencia (Java)

```java
class Solution {
    // Deltas para explorar las 4 direcciones adyacentes: Abajo, Arriba, Derecha, Izquierda
    private static int[] D_ROW = {1, -1, 0, 0};
    private static int[] D_COL = {0, 0, 1, -1};

    public int numIslands(char[][] grid) {
        var islandsCount = 0;

        for (var r = 0; r < grid.length; r++) {
            for (var c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '1') {
                    islandsCount++;
                    dfs(grid, r, c); // Hunde la isla completa
                }
            }
        }

        return islandsCount;
    }

    private void dfs(char[][] grid, int r, int c) {
        // Validar límites de la grilla y alto en casillas de agua
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] == '0') {
            return;
        }

        // Marcar la casilla como visitada (hundir tierra)
        grid[r][c] = '0';

        // Recorrer las 4 direcciones
        for (var i = 0; i < 4; i++) {
            var newRow = r + D_ROW[i];
            var newCol = c + D_COL[i];
            dfs(grid, newRow, newCol);
        }
    }
}
```

Aquí tenemos un segundo ejemplo:

# 🏝️ Algoritmo: Isla Mínima (Minimum Island - DFS)

## 📌 Concepto Clave
El objetivo es encontrar el **tamaño de la isla más pequeña** (medido en número de casillas `"L"`) dentro de un mapa representado por una matriz de tierra (`"L"`) y agua (`"W"`).

### 💡 La Idea en Una Frase
> Exploras la grilla y, cada vez que encuentras tierra (`"L"`) no visitada, usas DFS para **contar cuántas casillas componen esa isla completa** y usas una variable acumuladora para **guardar el tamaño de la isla más pequeña** vista hasta el momento.

---

## 🚶‍♂️ Paso a Paso del Algoritmo

### 1. Exploración Principal (`minimumIsland`)
* Se inicializa un conjunto `visited` (`HashSet`) para rastrear las casillas recorridas sin modificar la matriz original.
* Se establece `min = Double.POSITIVE_INFINITY` para asegurar que la primera isla encontrada reemplace este valor.
* Se recorre la matriz con dos bucles `for`:
  * Si la casilla actual es tierra (`"L"`), se invoca `traverseDFS`.
  * Si el tamaño retornado es `> 0` (es decir, pertenecía a una isla no explorada), se actualiza el mínimo: `min = Math.min(min, size)`.

### 2. Contar el Tamaño de una Isla (`traverseDFS`)
La función recursiva devuelve el número total de casillas que integran la isla conectada:

1. **Casos Base (Validaciones de Parada):**
   * **Límites:** Si la posición `(r, c)` está fuera de la matriz.
   * **Agua:** Si la casilla es `"W"`.
   * **Ya Visitado:** Si la coordenada `"r,c"` ya existe en el conjunto `visited`.
   * **Acción:** Retorna `0` (no aporta al tamaño de la isla).

2. **Registro de Visita:**
   * Se agrega la clave `"r,c"` a `visited`.
   * Se inicia el contador local con valor `1` (la casilla actual).

3. **Acumulativo de Exploración en 4 Direcciones:**
   * Mediante los arreglos `D_ROW` y `D_COL`, se explora arriba, abajo, izquierda y derecha.
   * Se suma el resultado de las llamadas recursivas al contador:
     $$\text{counter} = 1 + \text{abajo} + \text{arriba} + \text{derecha} + \text{izquierda}$$

4. **Retorno:**
   * La función devuelve el total acumulado del tamaño de la isla a la llamada padre.

---

## 🛠️ Código de Referencia (Java)

```java
import java.util.*;

class Source {

    private static int[] D_ROW = {1, -1, 0, 0};
    private static int[] D_COL = {0, 0, 1, -1};

    public static int minimumIsland(List<List<String>> grid) {
        var visited = new HashSet<String>();
        var min = Double.POSITIVE_INFINITY;

        for (var r = 0; r < grid.size(); r++) {
            for (var c = 0; c < grid.get(r).size(); c++) {
                if ("L".equals(grid.get(r).get(c))) {
                    var size = traverseDFS(grid, r, c, visited);
                    // Solo actualizamos min si se encontró una isla no visitada previamente
                    if (size > 0) {
                        min = Math.min(min, size);
                    }
                }
            }
        }
        
        return min == Double.POSITIVE_INFINITY ? 0 : (int) min;
    }

    public static double traverseDFS(List<List<String>> grid, int r, int c, Set<String> visited) {
        // 1. Validar límites de la matriz y si es casilla de agua
        if (r < 0 || r >= grid.size() || c < 0 || c >= grid.get(0).size() || "W".equals(grid.get(r).get(c))) {
            return 0;
        }

        // 2. Validar si la casilla ya fue visitada
        var visitedKey = r + "," + c;
        if (visited.contains(visitedKey)) {
            return 0;
        }

        // 3. Marcar como visitado e iniciar conteo
        visited.add(visitedKey);
        double counter = 1;

        // 4. Sumar casillas de las 4 direcciones
        for (var i = 0; i < 4; i++) {
            var newRow = D_ROW[i] + r;
            var newCol = D_COL[i] + c;
            counter += traverseDFS(grid, newRow, newCol, visited);
        }

        return counter;
    }
}




BFS