# Design Add and Search Words

**Dificultad:** Media  
**Patrón:** Trie + DFS con wildcard  
**Referencia:** [LeetCode 211](https://leetcode.com/problems/design-add-and-search-words-data-structure/)

## Description

Design a data structure that stores lowercase words and supports searches where the dot character `'.'` may match any single letter.

Required operations:

```text
addWord(word)
search(pattern)
```

## Input

A sequence of additions and searches.

Example:

```text
addWord("bad")
addWord("dad")
addWord("mad")
search("pad")
search("bad")
search(".ad")
search("b..")
```

## Output

```text
false
true
true
true
```

## Constraints

- `1 <= word.length, pattern.length <= 25`
- Added words contain lowercase English letters.
- Search patterns contain lowercase English letters or `'.'`.
- A search pattern contains at most two dots.
- At most `10,000` total operations are performed.

## Qué debes aprender

- Las letras normales siguen un solo hijo del Trie.
- Un wildcard obliga a explorar todos los hijos posibles.
- El estado recursivo combina nodo del Trie e índice del patrón, igual que Word Search II combina nodo y posición de grilla.

