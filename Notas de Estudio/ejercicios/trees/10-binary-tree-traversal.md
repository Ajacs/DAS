# Binary Tree Traversal

**Categoría:** Árboles binarios  
**Patrón:** DFS recursivo/iterativo y BFS por niveles  
**Estado:** El archivo fuente solo define `TreeNode`; falta implementar recorridos.  
**Fuente:** `Data Structures/Binary Tree/traversal.java`

## Ficha de 60 segundos

- **Qué pide el tema:** visitar todos los nodos en un orden definido.
- **Señal:** árbol binario y orden de procesamiento.
- **Idea:** DFS cambia la posición de “procesar raíz”; BFS usa una cola.
- **Invariante:** cada nodo alcanzable se agrega una sola vez.
- **Tiempo:** `O(n)` para cualquier recorrido.
- **Espacio:** DFS `O(h)`; BFS `O(w)`, donde `h` es altura y `w` ancho máximo.

## Problema en palabras simples

El archivo aún no contiene un ejercicio completo. Para entrevistas debes dominar cuatro órdenes:

- **Preorder:** raíz, izquierda, derecha.
- **Inorder:** izquierda, raíz, derecha.
- **Postorder:** izquierda, derecha, raíz.
- **Level order:** nivel por nivel de izquierda a derecha.

## Cómo reconocer el patrón

- Copiar/serializar o procesar padre antes que hijos: preorder.
- Árbol binario de búsqueda en orden ascendente: inorder.
- Eliminar/calcular hijos antes que padre: postorder.
- Distancia por niveles o vista más cercana: BFS.

## Idea paso a paso

Plantilla DFS:

```java
void dfs(TreeNode<?> node) {
    if (node == null) return;
    // preorder: procesar aquí
    dfs(node.left);
    // inorder: procesar aquí
    dfs(node.right);
    // postorder: procesar aquí
}
```

Plantilla BFS:

```java
var queue = new ArrayDeque<TreeNode<?>>();
queue.add(root);
while (!queue.isEmpty()) {
    var node = queue.remove();
    if (node.left != null) queue.add(node.left);
    if (node.right != null) queue.add(node.right);
}
```

## Ejemplo de bolsillo

```text
    1
   / \
  2   3
```

- Preorder: `1,2,3`
- Inorder: `2,1,3`
- Postorder: `2,3,1`
- Level order: `1,2,3`

## Por qué funciona

Cada llamada DFS se encarga de un subárbol y combina raíz, subárbol izquierdo y derecho en el orden requerido. BFS mantiene en la cola la frontera pendiente en orden de descubrimiento.

## Casos límite

- Árbol vacío.
- Un solo nodo.
- Árbol degenerado: la recursión puede alcanzar profundidad `n`.

## Errores frecuentes

- No manejar `root == null`.
- Confundir el orden por la posición donde se procesa la raíz.
- Usar tipos raw: en el fuente, `TreeNode left/right` debería idealmente ser `TreeNode<T>`.

## Cómo explicarlo en entrevista

> Cada recorrido visita una vez todos los nodos; lo que cambia es cuándo proceso la raíz respecto de sus hijos. DFS usa espacio proporcional a la altura. Si necesito niveles, uso BFS y una cola, cuyo espacio depende del ancho máximo.

## Preguntas de entrevista

1. ¿Cómo implementar inorder sin recursión?
2. ¿Qué recorrido valida naturalmente un BST?
3. ¿Cómo separar la salida por niveles?

## Variaciones para practicar

- Maximum Depth of Binary Tree.
- Binary Tree Level Order Traversal.
- Validate Binary Search Tree.

