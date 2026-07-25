# Group Anagrams

**Categoría:** Strings y hashing  
**Patrón:** Agrupación por clave canónica  
**Dificultad aproximada:** Media  
**Fuente:** `src/main/java/com/das/algorithms/hashingstrings/GroupAnagrams.java`

## Ficha de 60 segundos

- **Qué pide:** agrupar palabras que contienen las mismas letras con igual frecuencia.
- **Señal:** formar grupos por una equivalencia.
- **Idea:** ordenar cada palabra; los anagramas producen la misma clave.
- **Invariante:** el mapa guarda, bajo cada clave, todas y solo las palabras con esa forma canónica.
- **Tiempo:** `O(N · K log K)` con `N` palabras de longitud máxima `K`.
- **Espacio:** `O(N · K)`.

## Problema en palabras simples

Dos palabras pertenecen al mismo grupo si una puede reordenarse para formar la otra. El orden de los grupos no importa.

## Cómo reconocer el patrón

Cuando el problema dice “agrupar por equivalencia”, busca una representación única para cada clase. Aquí, ordenar caracteres elimina el orden original.

## Idea paso a paso

1. Para cada palabra, ordena sus caracteres.
2. Usa el resultado como clave de un `HashMap`.
3. Agrega la palabra original a la lista de esa clave.
4. Devuelve los valores del mapa.

## Ejemplo de bolsillo

`eat → aet`, `tea → aet`, `tan → ant`.

El mapa termina con `aet: [eat, tea]` y `ant: [tan]`.

## Por qué funciona

Dos strings son anagramas si y solo si tienen el mismo multiconjunto de letras. Al ordenarlos, ese multiconjunto se convierte en una secuencia única.

## Complejidad

- **Tiempo:** `O(N · K log K)` al ordenar `N` palabras de longitud máxima `K`.
- **Espacio:** `O(N · K)` para claves y grupos.

## Casos límite

- String vacío: su clave también es `""`.
- Una sola palabra.
- Letras repetidas: la clave conserva la frecuencia.

## Errores frecuentes

- Usar un `Set<Character>`: pierde repeticiones.
- Agrupar por longitud: es necesaria, pero no suficiente.
- Omitir imports de `List`, `ArrayList` y `Arrays` al compilar fuera de LeetCode.

## Cómo explicarlo en entrevista

> Necesito una clave idéntica para todos los anagramas. Ordenar los caracteres produce esa forma canónica, que uso en un hash map para acumular las palabras originales. El costo dominante es ordenar cada palabra.

## Preguntas de entrevista

1. ¿Puedes reducir `K log K` a `K`?
2. ¿Cómo representarías un vector de 26 frecuencias sin colisiones ambiguas?
3. ¿Qué cambia si hay Unicode o mayúsculas?

## Variaciones para practicar

- Valid Anagram.
- Group Shifted Strings.
