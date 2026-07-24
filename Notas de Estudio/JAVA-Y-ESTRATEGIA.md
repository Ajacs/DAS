# Java y estrategia para el assessment

## Recomendaciones de mayor impacto

1. Prioriza código correcto sobre la solución más ingeniosa.
2. Lee restricciones antes de decidir la complejidad.
3. Separa validación, transformación y cálculo en helpers cuando una simulación sea larga.
4. Usa nombres como `row`, `col`, `left`, `right`, `visited` y `frequency`; reducen errores bajo presión.
5. Prueba mientras construyes. No esperes al minuto 65 para ejecutar.
6. Si una solución `O(n²)` cabe en las restricciones, úsala antes que una optimización frágil.
7. Conserva los últimos cinco minutos para bordes y compilación.

## Guion de 90 segundos antes de programar

Escribe:

```text
Entrada:
Salida:
Restricción dominante:
Patrón:
Estado que mantengo:
Casos límite:
Complejidad esperada:
```

Después recorre un ejemplo de 3–5 elementos. Si no puedes explicar cómo cambia el estado, todavía no estás listo para escribir el ciclo.

## Checklist de Java

### Comparaciones

```java
// Strings
a.equals(b)
"C".equals(value) // tolera value == null

// Primitivos
x == y
```

No uses `==` para comparar el contenido de strings.

### Hash map

```java
Map<String, Integer> frequency = new HashMap<>();
frequency.put(value, frequency.getOrDefault(value, 0) + 1);
```

Agrupación:

```java
Map<String, List<String>> groups = new HashMap<>();
groups.computeIfAbsent(key, ignored -> new ArrayList<>()).add(value);
```

### Set

```java
Set<Integer> visited = new HashSet<>();
if (!visited.add(node)) {
    // ya existía
}
```

### Stack

```java
Deque<Character> stack = new ArrayDeque<>();
stack.push(value);
char top = stack.pop();
char peek = stack.peek();
```

### Cola BFS

```java
Deque<int[]> queue = new ArrayDeque<>();
queue.offer(new int[] {startRow, startCol, 0});

while (!queue.isEmpty()) {
    int[] current = queue.poll();
}
```

### Matrices

```java
int rows = matrix.length;
int cols = matrix[0].length;

for (int row = 0; row < rows; row++) {
    for (int col = 0; col < cols; col++) {
        // matrix[row][col]
    }
}
```

Vecinos:

```java
int[][] directions = {
    {1, 0}, {-1, 0}, {0, 1}, {0, -1}
};

for (int[] direction : directions) {
    int nextRow = row + direction[0];
    int nextCol = col + direction[1];

    boolean inBounds =
        0 <= nextRow && nextRow < rows &&
        0 <= nextCol && nextCol < cols;
}
```

### Ordenamiento

```java
Arrays.sort(nums);
Arrays.sort(chars);
list.sort(Comparator.comparingInt(item -> item[0]));
```

### Evitar overflow

Usa `long` para sumas, productos o contadores que puedan exceder `2,147,483,647`:

```java
long sum = (long) a + b;
```

## Plantillas que debes escribir de memoria

### Dos punteros

```java
int left = 0;
int right = nums.length - 1;

while (left < right) {
    if (/* condición */) {
        left++;
    } else {
        right--;
    }
}
```

### Sliding window

```java
int left = 0;

for (int right = 0; right < nums.length; right++) {
    // agregar nums[right]

    while (/* ventana inválida */) {
        // quitar nums[left]
        left++;
    }

    // actualizar respuesta
}
```

### DFS

```java
boolean dfs(Node node, Set<Node> visited) {
    if (/* objetivo */) return true;
    if (!visited.add(node)) return false;

    for (Node neighbor : node.neighbors) {
        if (dfs(neighbor, visited)) return true;
    }
    return false;
}
```

### BFS por niveles/distancia

```java
Deque<State> queue = new ArrayDeque<>();
Set<State> visited = new HashSet<>();

queue.offer(start);
visited.add(start);

while (!queue.isEmpty()) {
    State current = queue.poll();
    if (/* objetivo */) return current.distance;

    for (State next : neighbors(current)) {
        if (visited.add(next)) {
            queue.offer(next);
        }
    }
}
```

## Estrategia para los 70 minutos

### Primeros cinco minutos

Lee las cuatro preguntas sin programar y clasifícalas:

- **Directa:** sabes la estructura del ciclo inmediatamente.
- **Implementable:** entiendes el enfoque, pero requiere cuidado.
- **Bloqueada:** no reconoces el patrón o la implementación es extensa.

Empieza por la directa que puedas terminar y probar más rápido.

### Presupuesto recomendado

| Tiempo | Acción |
|---:|---|
| 0–5 min | Leer y ordenar las preguntas |
| 5–17 min | Primera solución completa |
| 17–32 min | Segunda solución completa |
| 32–55 min | Tercera o la más valiosa que puedas implementar |
| 55–65 min | Cuarta, solución parcial o corrección |
| 65–70 min | Casos límite y compilación |

### Cuándo cambiar de pregunta

Cambia temporalmente si:

- llevas 8–10 minutos sin código ejecutable;
- sigues cambiando de estrategia;
- no puedes explicar el estado del algoritmo;
- el problema requiere un patrón que no reconoces.

Deja comentarios con la idea y vuelve después. No permitas que una pregunta consuma la mitad del examen.

## Casos de prueba mínimos

Para arreglos y strings:

- tamaño `0` si está permitido;
- tamaño `1`;
- todos iguales;
- ya ordenado;
- orden inverso;
- repetidos;
- valores negativos.

Para matrices:

- `1×1`;
- una sola fila;
- una sola columna;
- bordes y esquinas;
- matriz rectangular;
- ningún camino / todos los caminos.

Para grafos:

- origen igual a destino;
- nodo aislado;
- ciclo;
- componentes separados;
- camino directo y camino largo.

## Qué evitar esta semana

- Memorizar soluciones completas.
- Resolver Hard durante horas.
- Cambiar de lenguaje.
- Medir progreso solo por cantidad.
- Ver una solución y marcar el problema como dominado.
- Practicar siempre sin cronómetro.
- Quedarte despierto hasta tarde la víspera.

## Mi recomendación concreta

Tu repositorio ya tiene una base fuerte en grafos y grillas. El mayor retorno antes de la prueba está en:

1. stacks con `ArrayDeque`;
2. recorridos de matrices en espiral, serpiente y por columnas;
3. dos punteros sobre arreglos;
4. frecuencia y lookup con `HashMap`;
5. dos simulaciones completas con revisión de errores.

No necesitas dominar todos los algoritmos. Necesitas reconocer rápido los patrones fundamentales, implementar sin errores y administrar los 70 minutos.

