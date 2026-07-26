# Merge Sorted Array

**Categoría:** Arreglos  
**Patrón:** Dos punteros desde el final  
**Dificultad aproximada:** Fácil  
**Fuente:** `src/main/java/com/das/algorithms/arrays/MergeSortedArrays.java`

## Ficha de 60 segundos

- **Qué pide:** fusionar dos arreglos ordenados dentro del primero.
- **Señal:** dos secuencias ordenadas y espacio libre al final.
- **Idea:** comparar los mayores elementos y escribir de derecha a izquierda.
- **Invariante:** las posiciones después de `p` ya contienen los mayores elementos en orden final.
- **Tiempo:** `O(m+n)`.
- **Espacio:** `O(1)`.

## Problema en palabras simples

`nums1` contiene `m` valores válidos y `n` espacios de reserva. `nums2` contiene `n` valores. Debes dejar la mezcla ordenada en `nums1` sin crear otro arreglo.

## Cómo reconocer el patrón

Dos entradas ordenadas sugieren dos punteros. El espacio vacío al final de `nums1` sugiere llenar desde atrás para no destruir valores todavía no procesados.

## Idea paso a paso

1. `i = m-1` apunta al último valor válido de `nums1`.
2. `j = n-1` apunta al último valor de `nums2`.
3. `p = m+n-1` apunta al lugar donde escribir.
4. Copia el mayor entre `nums1[i]` y `nums2[j]`, y mueve sus punteros.
5. Si quedan valores en `nums2`, cópialos. Los restantes de `nums1` ya están en su lugar.

## Ejemplo de bolsillo

`nums1=[1,3,0,0]`, `nums2=[2,4]`

- Escribe `4` al final.
- Escribe `3`.
- Escribe `2`.
- `1` ya ocupa su posición: `[1,2,3,4]`.

## Por qué funciona

El mayor valor pendiente solo puede estar en `nums1[i]` o `nums2[j]`. Colocarlo en `p` fija correctamente la última posición pendiente sin sobrescribir datos útiles.

## Complejidad

- **Tiempo:** `O(m+n)`, cada elemento se procesa una vez.
- **Espacio:** `O(1)` adicional.

## Casos límite

- `n = 0`: no hay nada que copiar.
- `m = 0`: se copia todo `nums2`.
- Valores iguales: cualquiera puede ir primero.

## Errores frecuentes

- Mezclar desde el inicio y sobrescribir valores de `nums1`.
- Olvidar copiar lo que quede de `nums2`.
- Copiar también el sobrante de `nums1`, aunque ya está colocado.

## Cómo explicarlo en entrevista

> Como ambos arreglos están ordenados, comparo sus extremos. Lleno el espacio libre de `nums1` desde la derecha, colocando siempre el mayor pendiente. Así evito sobrescribir valores y logro `O(m+n)` tiempo con espacio constante.

## Preguntas de entrevista

1. ¿Por qué no hace falta copiar el sobrante de `nums1`?
2. ¿Qué harías si el destino no tuviera espacio extra?
3. ¿Cómo cambia para listas enlazadas?

## Variaciones para practicar

- Merge Two Sorted Lists.
- Intersection of Two Sorted Arrays.
