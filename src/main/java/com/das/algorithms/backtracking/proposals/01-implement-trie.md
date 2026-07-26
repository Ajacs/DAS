# Implement Trie

**Dificultad:** Media  
**Patrón:** Trie / prefix tree  
**Referencia:** [LeetCode 208](https://leetcode.com/problems/implement-trie-prefix-tree/)

## Description

Implement a Trie that supports inserting a word, checking whether a complete word exists, and checking whether any inserted word starts with a given prefix.

Required operations:

```text
insert(word)
search(word)
startsWith(prefix)
```

## Input

A sequence of method calls with lowercase English words or prefixes.

Example:

```text
insert("apple")
search("apple")
search("app")
startsWith("app")
insert("app")
search("app")
```

## Output

```text
true
false
true
true
```

Only query operations produce boolean outputs.

## Constraints

- `1 <= word.length, prefix.length <= 2,000`
- Inputs contain lowercase English letters.
- At most `30,000` operations are performed.
- Words inserted into the Trie may share prefixes.

## Qué debes aprender

- Diferenciar “este prefijo existe” de “esta palabra termina aquí”.
- Elegir entre arreglo de 26 hijos y `HashMap`.
- Entender por qué Word Search II puede descartar prefijos inexistentes.

