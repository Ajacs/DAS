# Ejercicios de algoritmos en Java

El repositorio usa la estructura estándar de un proyecto Java. Cada ejercicio resuelto tiene un package, una clase pública y un método `main`, por lo que puede compilarse y ejecutarse de forma independiente.

## Requisitos

- JDK 17 o posterior.
- macOS, Linux o un entorno con Bash.

Comprueba Java con:

```bash
java -version
javac -version
```

## Listar ejercicios

Desde la raíz del proyecto:

```bash
./run-exercise list
```

## Ejecutar un ejercicio

```bash
./run-exercise running-sum
./run-exercise merge-sorted
./run-exercise group-anagrams
./run-exercise rotate-image
./run-exercise undirected-path
./run-exercise prerequisites
./run-exercise number-of-islands
./run-exercise minimum-island
./run-exercise closest-carrot
```

El runner compila los ejercicios dentro de `.build/classes` y ejecuta únicamente el seleccionado.

## Ejecutarlos todos

```bash
./run-exercise all
```

## Modificar los ejemplos

Cada archivo `.java` contiene un método `main`. Puedes cambiar los datos definidos en ese método para probar otros inputs y volver a ejecutar el mismo comando.

Ejemplo:

```text
src/main/java/com/das/algorithms/arrays/RunningSumOf1DArray.java
```

La lógica original permanece en su método principal de solución; `main` solo prepara datos y muestra el resultado.

## Estructura

```text
src/main/java/com/das/algorithms/
├── arrays/
├── hashingstrings/
├── matrices/
├── graphs/
└── grids/
```

Cada categoría contiene:

- ejercicios resueltos y ejecutables en `.java`;
- `proposals/` con tres problemas sugeridos para practicar.

Las notas y planes están en `Notas de Estudio/`.

> Las carpetas representan la **estructura de datos o dominio principal**, no siempre la técnica completa. Por ejemplo, Move Zeroes vive en `arrays` aunque use dos punteros; Two Sum con entrada desordenada vive en `hashingstrings` porque su solución objetivo utiliza un `HashMap`.

## Packages

| Categoría | Package |
|---|---|
| Arrays | `com.das.algorithms.arrays` |
| Hashing and Strings | `com.das.algorithms.hashingstrings` |
| Matrices | `com.das.algorithms.matrices` |
| Graphs | `com.das.algorithms.graphs` |
| Grids | `com.das.algorithms.grids` |

Las carpetas y las declaraciones `package` coinciden exactamente.
