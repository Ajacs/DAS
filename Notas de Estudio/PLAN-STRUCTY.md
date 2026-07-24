# Plan de Structy adaptado a tus horarios

**Sábado 25 y domingo 26 de julio:** disponibilidad completa  
**Lunes 27 a viernes 31:** 19:00–22:00  
**Assessment:** sábado 1 de agosto, 4 problemas en 70 minutos

## Diagnóstico de la captura

| Módulo pendiente | Progreso | Relevancia para Capital One | Decisión |
|---|---:|---|---|
| Sliding Window | 0/18 | Alta | Estudiar fundamentos y problemas representativos |
| Two Pointer | 0/6 | Muy alta | Completar |
| Binary Search | 0/14 | Media | Estudiar fundamentos, no completar todo |
| Dynamic Programming | 0/23 | Baja para este assessment | Posponer |
| Stack | 0/7 | Muy alta | Completar |
| Array and String | 0/11 | Muy alta | Completar |
| Linked List II | 0/7 | Baja | Posponer |
| Binary Tree II | 0/12 | Baja-media | Posponer; ya tienes base DFS/BFS |
| Heap | 0/7 | Baja-media | Aprender solo operaciones básicas si sobra tiempo |
| Exhaustive Recursion | 0/12 | Baja | Posponer |
| Graph II | 0/16 | Media | Posponer; ya tienes varios grafos resueltos |
| Mixed Recall | 0/19 | Variable | Usar ejercicios seleccionados como repaso |

La captura suma **152 actividades pendientes**. La meta no será subir artificialmente el porcentaje del curso: será alcanzar velocidad y precisión en los temas probables del assessment.

## Objetivo de cobertura

### Completar

- Two Pointer: `6/6`.
- Stack: `7/7`.
- Array and String: `11/11`.

### Cobertura selectiva

- Sliding Window: entre `6 y 9` actividades fundamentales.
- Binary Search: entre `5 y 7` actividades fundamentales.
- Mixed Recall: entre `3 y 5`, escogidas entre arrays, strings, maps, stacks y matrices.

### Solo si sobra tiempo

- Heap: introducción y una actividad.
- Graph II: una actividad corta de repaso.

### Después del assessment

- Dynamic Programming.
- Linked List II.
- Binary Tree II.
- Exhaustive Recursion.
- Resto de Heap, Graph II y Mixed Recall.

## Regla para trabajar dentro de Structy

Para cada actividad:

1. Lee el enunciado y escribe un ejemplo pequeño.
2. Intenta resolver durante un máximo de 20 minutos.
3. Si te bloqueas, consulta una pista o explicación.
4. Cierra la solución.
5. Escríbela nuevamente sin copiar.
6. Registra patrón, complejidad y error.

Una actividad vista no está dominada. Solo cuenta como dominada si puedes reconstruirla sin consultar.

# Sábado 25 — Construir las herramientas esenciales

**Objetivo:** completar Two Pointer y Stack, comenzar Array and String.

Tiempo neto recomendado: aproximadamente 6 horas 30 minutos. De `17:00` a `20:00` queda bloqueado para entrenamiento y recuperación.

## 09:00–09:30 — Calentamiento

- Reescribir Merge Sorted Array sin mirar.
- Explicar qué hace cada puntero.
- Probar `m=0`, `n=0` y valores repetidos.

## 09:30–11:30 — Structy: Two Pointer

- Avanzar por las seis actividades.
- Meta: completar al menos cuatro.
- Límite: 20 minutos de intento por actividad.

Busca estas variantes:

- punteros en extremos;
- puntero lento y rápido;
- lectura y escritura;
- arreglos ordenados;
- eliminación o compactación in-place.

## 11:30–11:45 — Descanso

## 11:45–13:00 — Terminar Two Pointer

- Completar las actividades restantes.
- Rehacer desde cero la que haya requerido más ayuda.
- Escribir la plantilla de dos punteros de memoria.

## 13:00–14:30 — Comida y descanso real

## 14:30–16:45 — Structy: Stack

- Avanzar por las siete actividades.
- Meta: completar las siete.
- Practicar `ArrayDeque`, no `Stack`.

Debes reconocer:

- pares de apertura/cierre;
- deshacer la operación más reciente;
- expresión o anidamiento;
- siguiente elemento mayor/menor;
- pila monotónica, solo si aparece.

## 16:45–17:00 — Cierre rápido de Stack

- Rehacer Valid Parentheses o equivalente sin mirar.
- Probar entrada vacía, un símbolo y cierre incorrecto.

Si alguna actividad quedó pendiente, muévela al bloque del domingo; no invadas el horario de entrenamiento.

## 17:00–20:00 — Entrenamiento y descanso largo

- No estudiar.
- Entrenar, hidratarse y recuperarse.
- No usar este bloque para “ponerse al día”.

## 20:00–21:30 — Structy: Array and String

- Completar entre tres y cinco actividades.
- Priorizar recorridos, frecuencias, transformación y casos límite.

Si después del entrenamiento estás muy cansado, completa tres con atención en lugar de cinco apresuradas.

## 21:30–22:00 — Cierre

- Registrar errores.
- Puntuar Two Pointer, Stack y Array/String del 0 al 5.
- Elegir dos actividades para repetir el domingo.

### Resultado mínimo del sábado

- [ ] Two Pointer `6/6`.
- [ ] Stack `7/7`.
- [ ] Array and String `3/11` o más.
- [ ] Dos ejercicios rehechos sin ayuda.

# Domingo 26 — Arrays, sliding window, matrices y primera simulación

**Objetivo:** terminar Array and String, aprender sliding window básico y experimentar el formato de 70 minutos.

## 09:00–09:30 — Recuperación activa

Sin mirar notas:

- escribir dos punteros;
- escribir stack con `ArrayDeque`;
- explicar un error del sábado;
- repetir las dos actividades elegidas.

## 09:30–11:45 — Terminar Array and String

- Completar las actividades restantes hasta `11/11`.
- Marcar las actividades que involucren `HashMap` o `HashSet`.
- Rehacer la más difícil sin mirar.

## 11:45–12:00 — Descanso

## 12:00–13:30 — Structy: Sliding Window

Meta: tres o cuatro actividades introductorias.

Antes de codificar identifica:

- qué representa la ventana;
- cuándo entra `right`;
- qué vuelve inválida la ventana;
- cuándo debe avanzar `left`;
- qué guarda el map/set.

No avances a problemas Hard si la plantilla básica todavía no sale de memoria.

## 13:30–15:00 — Comida y descanso

## 15:00–16:30 — Matrices fuera de Structy

Usa [Rotate Image](ejercicios/04-rotate-image.md) y realiza:

- recorrido izquierda → derecha;
- derecha → izquierda;
- arriba → abajo;
- abajo → arriba;
- serpiente;
- perímetro;
- espiral;
- vecinos en cuatro direcciones.

Este bloque es obligatorio porque Capital One mencionó explícitamente matrices y recorridos no convencionales.

## 16:30–16:45 — Descanso

## 16:45–17:30 — Sliding Window

- Completar dos actividades adicionales.
- Rehacer una sin consultar.
- Comparar sliding window contra dos punteros.

## 17:30–18:15 — Preparar simulación

Escoge cuatro problemas no vistos recientemente:

1. arreglo/implementación;
2. string/map;
3. stack o dos punteros;
4. matriz/simulación.

## 18:15–19:25 — Simulación 1

- 70 minutos exactos.
- Sin notas, soluciones ni pausas.
- Lee los cuatro antes de empezar.
- Guarda una versión que compile antes de optimizar.

## 19:25–20:15 — Revisión

- Clasifica errores.
- Reproduce los bugs.
- Anota cuánto tiempo consumió cada pregunta.
- No rehagas todo esa noche.

### Resultado mínimo del domingo

- [ ] Array and String `11/11`.
- [ ] Sliding Window `5/18` o más.
- [ ] Ocho recorridos de matriz implementados.
- [ ] Primera simulación completa.
- [ ] Lista de los tres errores de mayor impacto.

# Lunes 27 — 19:00–22:00

**Objetivo:** corregir la simulación y consolidar sliding window.

## 19:00–19:20

- Rehacer el problema más importante fallado el domingo.

## 19:20–20:35

- Structy Sliding Window.
- Completar dos o tres actividades.

## 20:35–20:45

- Descanso.

## 20:45–21:30

- Resolver Longest Substring Without Repeating Characters o equivalente.
- Explicar el estado del set/map en cada movimiento.

## 21:30–22:00

- Reescribir la plantilla.
- Registrar errores.
- Meta acumulada: Sliding Window `7–8/18`.

# Martes 28 — 19:00–22:00

**Objetivo:** búsqueda binaria e índices.

## 19:00–19:20

- Binary Search clásico desde cero.
- Probar elemento ausente y extremos.

## 19:20–20:35

- Structy Binary Search.
- Completar tres o cuatro actividades fundamentales.

Prioriza:

- búsqueda exacta;
- primera o última aparición;
- condición monotónica;
- límites `left <= right` frente a `left < right`.

## 20:35–20:45

- Descanso.

## 20:45–21:30

- Un problema de matriz o simulación con cronómetro.

## 21:30–22:00

- Corregir.
- Escribir la regla de actualización de límites que te cause más errores.

# Miércoles 29 — 19:00–22:00

**Objetivo:** maps/sets y segunda exposición a formato CodeSignal.

## 19:00–19:30

- Group Anagrams desde cero.

## 19:30–20:20

- Problema de lookup/frecuencias.
- Sugerencia: pares cuya suma sea una potencia de dos.

## 20:20–20:30

- Descanso.

## 20:30–21:40

- Mini simulación: tres problemas en 70 minutos.
- Arreglo, map/string y matriz.

## 21:40–22:00

- Registrar errores y escoger una corrección para el jueves.

# Jueves 30 — 19:00–22:00

**Objetivo:** simulación final completa.

## 19:00–19:20

- Calentamiento fácil.
- Revisar estrategia, no soluciones.

## 19:20–20:30

- Simulación 2: cuatro problemas, 70 minutos exactos.

## 20:30–20:45

- Descanso.

## 20:45–21:35

- Corregir únicamente problemas incompletos y bugs.

## 21:35–22:00

- Actualizar semáforo de patrones.
- Elegir como máximo dos debilidades para el viernes.

# Viernes 31 — 19:00–22:00

**Objetivo:** llegar descansado, no ampliar el temario.

## 19:00–19:40

- Rehacer dos problemas conocidos: uno fácil y uno medium.
- Deben salir con fluidez.

## 19:40–20:20

- Escribir de memoria:
  - dos punteros;
  - sliding window;
  - map de frecuencias;
  - stack;
  - recorrido de matriz;
  - BFS/DFS.

## 20:20–20:30

- Descanso.

## 20:30–21:00

- Repasar fichas de 60 segundos y diario de errores.

## 21:00–21:30

- Preparar equipo, conexión, identificación, cargador y entorno.

## 21:30

- Terminar. No hacer DP, Hard ni otra simulación.

# Qué hacer con los módulos pospuestos

No los ignores permanentemente; solo quedan fuera de esta semana:

1. Dynamic Programming.
2. Exhaustive Recursion.
3. Binary Tree II.
4. Linked List II.
5. Heap.
6. Graph II.
7. Mixed Recall completo.

Después del assessment, estúdialos en ese orden aproximado: recursión → árboles/listas → heap → DP → Graph II → Mixed Recall.

# Criterio de preparación para el viernes

Estás listo si puedes:

- resolver un fácil de arrays/strings en 10–15 minutos;
- resolver un medium de implementación en 20–25 minutos;
- usar `HashMap`, `HashSet` y `ArrayDeque` sin buscar sintaxis;
- recorrer una matriz en cualquier dirección;
- distinguir dos punteros de sliding window;
- completar al menos tres problemas durante una simulación;
- abandonar temporalmente un bloqueo antes de perder 15 minutos;
- conservar cinco minutos para pruebas.
