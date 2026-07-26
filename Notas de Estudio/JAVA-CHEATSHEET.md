# Java cheatsheet para entrevistas

## Arrays y strings

```java
int n = nums.length;
int m = text.length();
Arrays.sort(nums);
char[] chars = text.toCharArray();
String rebuilt = new String(chars);
```

## HashMap

```java
Map<Character, Integer> frequency = new HashMap<>();
frequency.put(ch, frequency.getOrDefault(ch, 0) + 1);
frequency.computeIfAbsent(ch, ignored -> 0);
```

## HashSet

```java
Set<Integer> visited = new HashSet<>();
if (visited.add(value)) {
    // era nuevo
}
```

## Stack y queue

```java
Deque<Integer> stack = new ArrayDeque<>();
stack.push(value);
stack.pop();
stack.peek();

Deque<Integer> queue = new ArrayDeque<>();
queue.offer(value);
queue.poll();
queue.peek();
```

## Heap

```java
PriorityQueue<Integer> minHeap = new PriorityQueue<>();
PriorityQueue<Integer> maxHeap =
    new PriorityQueue<>(Comparator.reverseOrder());
```

## Sorting con comparator

```java
intervals.sort(Comparator.comparingInt(interval -> interval[0]));
```

Evita `a - b` en comparators; puede producir overflow.

## Matrices

```java
int rows = matrix.length;
int cols = matrix[0].length;
int[][] directions = {{1,0}, {-1,0}, {0,1}, {0,-1}};
```

## Binary Search

```java
int left = 0;
int right = nums.length - 1;

while (left <= right) {
    int mid = left + (right - left) / 2;
    if (nums[mid] == target) return mid;
    if (nums[mid] < target) left = mid + 1;
    else right = mid - 1;
}
```

## Comparaciones

```java
a.equals(b);          // contenido de objetos
x == y;               // primitivos
"C".equals(value);    // seguro si value es null
```

## Overflow

```java
long sum = (long) a + b;
long product = (long) a * b;
```

## Imports frecuentes

```java
import java.util.*;
```

