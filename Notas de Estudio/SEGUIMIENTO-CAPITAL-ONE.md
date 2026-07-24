# Tablero diario de seguimiento

Usa este documento para medir preparación, no solamente cantidad de problemas. Marca un problema como dominado solo si puedes resolverlo desde cero, explicar la complejidad y probar casos límite.

## Escala de dominio

| Nivel | Significado |
|---:|---|
| 0 | No reconozco el patrón |
| 1 | Lo entiendo al ver la solución |
| 2 | Lo resuelvo con pistas |
| 3 | Lo resuelvo solo, pero lentamente o con errores |
| 4 | Lo resuelvo solo dentro del tiempo objetivo |
| 5 | Lo resuelvo, pruebo y explico con seguridad |

La meta antes del examen es nivel **4 o 5** en los patrones A: arreglos, maps/sets, stacks, matrices y dos punteros.

## Registro diario

| Fecha | Tema | Problemas intentados | Resueltos solo | Tiempo promedio | Error principal | Nivel |
|---|---|---:|---:|---:|---|---:|
| 24 jul | Arreglos |  |  |  |  |  |
| 25 jul | Strings, maps y sets |  |  |  |  |  |
| 26 jul | Dos punteros y stacks |  |  |  |  |  |
| 27 jul | Matrices |  |  |  |  |  |
| 28 jul | Grillas y simulación |  |  |  |  |  |
| 29 jul | Hashing y ventanas |  |  |  |  |  |
| 30 jul | Greedy, intervalos y repaso |  |  |  |  |  |
| 31 jul | Simulación |  |  |  |  |  |

## Checklist del plan

El horario detallado y las metas de avance dentro de la plataforma están en [Plan Structy adaptado a tus horarios](PLAN-STRUCTY.md).

### 24 de julio — Arreglos

- [ ] Running Sum desde cero en 10 minutos.
- [ ] Merge Sorted Array desde cero en 15 minutos.
- [ ] Rotate Array.
- [ ] Drill de suma con vecinos y límites.
- [ ] Registrar al menos un error aprendido.

### 25 de julio — Strings, maps y sets

- [ ] Group Anagrams desde cero.
- [ ] Reverse String II.
- [ ] Valid Anagram.
- [ ] Patrón vocal/consonante estilo CodeSignal.
- [ ] Explicar una clave canónica.

### 26 de julio — Dos punteros y stacks

- [ ] Move Zeroes.
- [ ] Two Sum II.
- [ ] Valid Parentheses.
- [ ] Remove Duplicates II.
- [ ] Escribir `ArrayDeque` sin consultar.

### 27 de julio — Matrices

- [ ] Rotate Image desde cero.
- [ ] Spiral Matrix.
- [ ] Recorrido por filas en ambas direcciones.
- [ ] Recorrido por columnas en ambas direcciones.
- [ ] Recorrido serpiente y perímetro.

### 28 de julio — Grillas y simulación

- [ ] Number of Islands desde cero.
- [ ] Closest Carrot desde cero.
- [ ] Number of Enclaves.
- [ ] Simulación 2D con helpers.
- [ ] Explicar por qué BFS encuentra la menor distancia.

### 29 de julio — Hashing y ventanas

- [ ] Two Sum.
- [ ] Longest Consecutive Sequence.
- [ ] Maximum Subarray.
- [ ] Pares con suma potencia de dos.
- [ ] Longest Substring Without Repeating Characters.

### 30 de julio — Patrones secundarios

- [ ] Binary Search.
- [ ] Jump Game.
- [ ] Insert Interval.
- [ ] Prerequisites Possible.
- [ ] Escribir seis plantillas desde memoria.

### 31 de julio — Simulación y descanso

- [ ] Simulación exacta de 70 minutos.
- [ ] Resolver al menos 3 problemas completos.
- [ ] Clasificar todos los errores.
- [ ] Rehacer la solución fallida más importante.
- [ ] Cerrar el estudio temprano.

## Diario de errores

Registra reglas reutilizables. No escribas narraciones largas.

| Problema | Tipo de error | Qué ocurrió | Regla para no repetirlo | Repetir el |
|---|---|---|---|---|
|  | Comprensión / índices / patrón / Java / tiempo |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |
|  |  |  |  |  |

Ejemplo:

| Problema | Tipo de error | Qué ocurrió | Regla para no repetirlo | Repetir el |
|---|---|---|---|---|
| Merge Sorted Array | Índices | Empecé a escribir desde la izquierda | Si el buffer libre está al final, comparar y escribir desde el final | Día siguiente |

## Historial de simulaciones

| Fecha | Completos | Parciales | Minutos por problema | Bugs al enviar | Resultado |
|---|---:|---:|---|---:|---|
|  | /4 | /4 |  |  |  |
|  | /4 | /4 |  |  |  |

Después de cada simulación responde:

1. ¿Elegí bien el orden?
2. ¿Cuánto tardé en abandonar una pregunta bloqueada?
3. ¿Qué bug habría detectado con un ejemplo más pequeño?
4. ¿Perdí tiempo optimizando antes de tener una solución correcta?

## Semáforo de patrones

Actualiza la víspera del examen:

| Patrón | Nivel 0–5 | Estado |
|---|---:|---|
| Recorrido de arreglos |  | 🔴 / 🟡 / 🟢 |
| Dos punteros |  | 🔴 / 🟡 / 🟢 |
| HashMap y HashSet |  | 🔴 / 🟡 / 🟢 |
| Stack con ArrayDeque |  | 🔴 / 🟡 / 🟢 |
| Recorridos de matriz |  | 🔴 / 🟡 / 🟢 |
| DFS en grilla |  | 🔴 / 🟡 / 🟢 |
| BFS en grilla |  | 🔴 / 🟡 / 🟢 |
| Sliding window |  | 🔴 / 🟡 / 🟢 |
| Búsqueda binaria |  | 🔴 / 🟡 / 🟢 |

- 🔴: nivel 0–2, requiere un problema fácil.
- 🟡: nivel 3, requiere repetir uno conocido con cronómetro.
- 🟢: nivel 4–5, solo repaso breve.

No estudies más un patrón verde mientras haya un tema esencial en rojo.
