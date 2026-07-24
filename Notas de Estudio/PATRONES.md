# Patrones esenciales

## Suma prefija

Mantén un acumulado para responder “suma desde el inicio hasta aquí”. La relación típica es:

`prefix[i] = prefix[i - 1] + nums[i]`

Con un arreglo de prefijos también puedes calcular una suma de rango en `O(1)`.

## Dos punteros

Dos índices recorren una o más colecciones sin repetir trabajo. En arreglos ordenados, el orden permite decidir qué puntero mover. Si el destino tiene espacio al final, escribir de derecha a izquierda evita sobrescribir datos.

## Hash map y clave canónica

Convierte todos los elementos equivalentes a la misma representación. Esa representación es la clave; el valor guarda el grupo o información acumulada.

## DFS

Explora una rama hasta agotarla. Siempre necesita:

1. un caso de parada;
2. una marca de visitado;
3. visitar vecinos.

La pila puede ser la del lenguaje (recursión) o una estructura explícita.

## BFS

Explora por capas con una cola FIFO. La primera vez que alcanza un nodo ha usado el menor número de aristas, siempre que todas tengan el mismo costo.

## Componentes conectados

Recorre todos los nodos. Cada nodo todavía no visitado inicia una exploración nueva; esa exploración cubre exactamente un componente.

## Ciclos en grafos dirigidos

Un solo conjunto `visited` no basta. Se distinguen tres estados:

- no visitado;
- en la ruta actual (`visiting`);
- procesado por completo (`visited`).

Volver a un nodo `visiting` demuestra un ciclo. Volver a uno `visited` no.

## Transformaciones de matrices

Busca operaciones simples cuya composición produzca el resultado. Para rotar 90° en sentido horario:

1. transponer;
2. invertir cada fila.

