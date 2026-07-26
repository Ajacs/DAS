/*

Given an m x n board of characters and a list of strings words, return all words on the board.

Each word must be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once in a word.

 

Example 1:

Input: board = [["o","a","a","n"],["e","t","a","e"],["i","h","k","r"],["i","f","l","v"]], words = ["oath","pea","eat","rain"]
Output: ["eat","oath"]

Example 2:

Input: board = [["a","b"],["c","d"]], words = ["abcb"]
Output: []

 

Constraints:

    m == board.length
    n == board[i].length
    1 <= m, n <= 12
    board[i][j] is a lowercase English letter.
    1 <= words.length <= 3 * 104
    1 <= words[i].length <= 10
    words[i] consists of lowercase English letters.
    All the strings of words are unique.


*/
package com.das.algorithms.backtracking;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordSearchII {
    // 1. Definimos el nodo del Trie
    static class TrieNode {
        // Arreglo de 26 posiciones para las letras 'a' a 'z' (más rápido que un HashMap)
        TrieNode[] children = new TrieNode[26];
        String word = null; // Guardará la palabra cuando estemos en la letra final
    }

    public List<String> findWords(char[][] board, String[] words) {
        List<String> result = new ArrayList<>();

        // 2. Construimos el Trie introduciendo todas las palabras
        TrieNode root = new TrieNode();
        for (String w : words) {
            TrieNode node = root;
            for (char ch : w.toCharArray()) {
                int index = ch - 'a';
                if (node.children[index] == null) {
                    node.children[index] = new TrieNode();
                }
                node = node.children[index];
            }
            node.word = w; // Marcamos el final de la palabra
        }

        // 3. Recorremos el tablero e iniciamos el DFS solo si la letra existe en el nivel raíz del Trie
        int rows = board.length;
        int cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                char ch = board[r][c];
                if (root.children[ch - 'a'] != null) {
                    dfs(board, r, c, root, result);
                }
            }
        }

        return result;
    }

    private void dfs(char[][] board, int r, int c, TrieNode parent, List<String> result) {
        char ch = board[r][c];
        TrieNode currNode = parent.children[ch - 'a'];

        // Si la casilla no coincide con ningún camino del Trie o ya fue visitada ('#')
        if (currNode == null) {
            return;
        }

        // ¿Encontramos una palabra?
        if (currNode.word != null) {
            result.add(currNode.word);
            currNode.word = null; // Importante: Volvemos null para no duplicarla si la encontramos de nuevo
        }

        // Marcamos la celda como visitada
        board[r][c] = '#';

        // Explorar los 4 vecinos
        if (r > 0 && board[r - 1][c] != '#')
            dfs(board, r - 1, c, currNode, result);
        if (r < board.length - 1 && board[r + 1][c] != '#')
            dfs(board, r + 1, c, currNode, result);
        if (c > 0 && board[r][c - 1] != '#')
            dfs(board, r, c - 1, currNode, result);
        if (c < board[0].length - 1 && board[r][c + 1] != '#')
            dfs(board, r, c + 1, currNode, result);

        // BACKTRACKING: Restaurar la celda
        board[r][c] = ch;
    }

    public static void main(String[] args) {
        var board = new char[][] {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        var words = new String[] {"oath", "pea", "eat", "rain"};

        var exercise = new WordSearchII();
        System.out.println("Words: " + Arrays.toString(words));
        System.out.println("Found: " + exercise.findWords(board, words));
    }
}
