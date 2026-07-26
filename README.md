# DAS — Preparación de entrevistas de algoritmos

Repositorio de ejercicios Java, notas, propuestas de práctica, tests y simulaciones para entrevistas técnicas.

## Inicio rápido

Requisitos:

- JDK 17 o posterior.
- Bash.

Comprueba el entorno:

```bash
java -version
javac -version
```

Comandos principales:

```bash
./run-exercise list
./run-exercise running-sum
./run-exercise all
./run-tests
./validate-repo
```

## Cómo está organizado

```text
.
├── src/
│   ├── main/java/com/das/algorithms/
│   │   ├── arrays/
│   │   ├── backtracking/
│   │   ├── graphs/
│   │   ├── grids/
│   │   ├── hashingstrings/
│   │   ├── matrices/
│   │   └── slidingwindow/
│   └── test/java/com/das/algorithms/
├── Notas de Estudio/
├── simulations/
├── templates/
├── roadmap/
├── PROGRESS.md
├── ERROR-LOG.md
├── run-exercise
├── run-tests
└── validate-repo
```

Cada categoría de `src/main` contiene:

- ejercicios resueltos y ejecutables;
- una carpeta `proposals/`;
- exactamente tres propuestas recomendadas;
- un `README.md` con el orden sugerido.

## Flujo 1: estudiar un ejercicio resuelto

### 1. Escoge una categoría

Consulta el [índice de notas](Notas%20de%20Estudio/ejercicios/README.md).

### 2. Lee solo la ficha rápida

Intenta responder sin mirar el resto:

- ¿Qué patrón utiliza?
- ¿Qué estado mantiene?
- ¿Cuál es el invariante?
- ¿Cuál es la complejidad?

### 3. Escribe la solución desde cero

No copies el archivo Java. Cuando termines, compara tu solución con la existente.

### 4. Ejecuta el ejemplo

Lista los nombres disponibles:

```bash
./run-exercise list
```

Ejecuta uno:

```bash
./run-exercise longest-unique-substring
```

### 5. Ejecuta los tests

```bash
./run-tests
```

### 6. Registra el resultado

- Nivel y tiempo: [PROGRESS.md](PROGRESS.md).
- Errores: [ERROR-LOG.md](ERROR-LOG.md).

## Flujo 2: resolver un proposal

Los proposals contienen descripción, input, output y restricciones, pero no solución.

Ejemplo:

```text
src/main/java/com/das/algorithms/arrays/proposals/
```

Proceso recomendado:

1. Selecciona un problema.
2. Inicia un cronómetro:
   - fácil: 15 minutos;
   - medium: 25 minutos;
   - hard: 35 minutos.
3. Escribe primero brute force.
4. Identifica el trabajo repetido.
5. Implementa una solución correcta.
6. Prueba casos límite.
7. Revisa la referencia únicamente después del intento.

Si decides incorporar la solución al repositorio:

1. crea una clase pública dentro de la categoría;
2. usa el package correspondiente;
3. agrega un método `main`;
4. crea su nota;
5. regístrala en `run-exercise`;
6. agrega tests;
7. ejecuta `./validate-repo`.

## Flujo 3: hacer una simulación

Abre [simulations/README.md](simulations/README.md).

Sets disponibles:

- [Set A](simulations/set-a/README.md).
- [Set B](simulations/set-b/README.md).
- [Set C](simulations/set-c/README.md).

Reglas:

1. 70 minutos exactos.
2. Lee las cuatro preguntas primero.
3. Resuelve por dificultad percibida.
4. Cambia de pregunta tras 8–10 minutos sin progreso ejecutable.
5. Reserva cinco minutos para pruebas.
6. Registra el resultado en [simulations/RESULTS.md](simulations/RESULTS.md).

No leas las propuestas antes de iniciar el cronómetro.

## Flujo 4: repaso de patrones

Recursos:

- [Manual general de patrones](Notas%20de%20Estudio/PATRONES.md).
- [Java cheatsheet](Notas%20de%20Estudio/JAVA-CHEATSHEET.md).
- [Java y estrategia](Notas%20de%20Estudio/JAVA-Y-ESTRATEGIA.md).
- [Plan final de la semana](Notas%20de%20Estudio/PLAN-FINAL-SEMANA.md).

Uso recomendado:

1. Escoge un patrón.
2. Lee sus señales e invariante.
3. Cierra el documento.
4. Escribe la plantilla de memoria.
5. Resuelve un problema representativo.

## Ejecutar ejercicios

```bash
./run-exercise <nombre>
```

Ejemplos:

```bash
./run-exercise merge-sorted
./run-exercise number-of-islands
./run-exercise word-search
./run-exercise word-search-ii
```

Ejecutar todos:

```bash
./run-exercise all
```

El runner compila los fuentes en `.build/classes`.

## Tests automáticos

Los tests utilizan Java puro y no necesitan JUnit, Maven ni Gradle.

```bash
./run-tests
```

El runner:

1. compila `src/main/java`;
2. compila `src/test/java`;
3. habilita assertions;
4. ejecuta casos normales y edge cases.

Los tests comprueban, entre otras cosas:

- arreglos mínimos;
- ciclos en grafos;
- ausencia de caminos;
- anagramas con repetidos;
- restauración del tablero en backtracking;
- conteos de sliding window.

## Validar la estructura

```bash
./validate-repo
```

El validador comprueba:

- que cada ejercicio tenga `main`;
- que cada ejercicio tenga una nota;
- que cada categoría tenga `proposals/`;
- que cada categoría tenga exactamente tres propuestas.

Úsalo después de agregar o mover ejercicios.

## Plantillas

La carpeta [templates](templates/README.md) contiene esqueletos para:

- Binary Search.
- Sliding Window.
- BFS en grillas.
- DFS en grafos.
- Backtracking.
- Trie.
- Union-Find.

No las copies mecánicamente. Intenta reconstruirlas de memoria.

## Seguimiento

### PROGRESS.md

Registra:

- patrón;
- nivel 0–5;
- tiempo;
- si utilizaste ayuda;
- fecha de repetición.

### ERROR-LOG.md

Clasifica errores:

- comprensión;
- selección de patrón;
- índices;
- Java;
- complejidad;
- casos límite;
- administración del tiempo.

El objetivo es encontrar errores repetidos.

## Packages

| Categoría | Package |
|---|---|
| Arrays | `com.das.algorithms.arrays` |
| Backtracking | `com.das.algorithms.backtracking` |
| Graphs | `com.das.algorithms.graphs` |
| Grids | `com.das.algorithms.grids` |
| Hashing and Strings | `com.das.algorithms.hashingstrings` |
| Matrices | `com.das.algorithms.matrices` |
| Sliding Window | `com.das.algorithms.slidingwindow` |

Las carpetas y packages deben coincidir.

## Agregar un ejercicio nuevo

Ejemplo para arrays:

```java
package com.das.algorithms.arrays;

public class NewExercise {
    public static int solve(int[] nums) {
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(solve(new int[] {1, 2, 3}));
    }
}
```

Checklist:

- [ ] Package correcto.
- [ ] Clase pública igual al nombre del archivo.
- [ ] Método `main`.
- [ ] Descripción original en inglés.
- [ ] Nota y explicación en español.
- [ ] Complejidad y edge cases.
- [ ] Registro en `run-exercise`.
- [ ] Tests.
- [ ] Tres proposals en la categoría.
- [ ] `./run-tests`.
- [ ] `./validate-repo`.

## Roadmap

Consulta [roadmap/README.md](roadmap/README.md) para las categorías posteriores al assessment:

- Stack.
- Binary Search.
- Linked Lists.
- Trees.
- Heap.
- Intervals.
- Greedy.
- Dynamic Programming.
- Union-Find.

## Solución de problemas

### Permission denied

```bash
chmod +x run-exercise run-tests validate-repo
```

### Java no encontrado

Instala JDK 17 o posterior y comprueba:

```bash
java -version
javac -version
```

### El runner no reconoce un ejercicio

Agrega su alias y clase completa a la función `class_for` de `run-exercise`.

### Falló la validación

Lee el mensaje: indicará si falta `main`, nota o proposals.

