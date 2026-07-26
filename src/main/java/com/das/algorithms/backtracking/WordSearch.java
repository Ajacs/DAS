
/*

Given an m x n grid of characters board and a string word, return true if word exists in the grid.

The word can be constructed from letters of sequentially adjacent cells, where adjacent cells are horizontally or vertically neighboring. The same letter cell may not be used more than once.

 

Example 1:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCCED"
Output: true

Example 2:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "SEE"
Output: true

Example 3:

Input: board = [["A","B","C","E"],["S","F","C","S"],["A","D","E","E"]], word = "ABCB"
Output: false

 

Constraints:

    m == board.length
    n = board[i].length
    1 <= m, n <= 6
    1 <= word.length <= 15
    board and word consists of only lowercase and uppercase English letters.

 

Follow up: Could you use search pruning to make your solution faster with a larger board?

*/
package com.das.algorithms.backtracking;

public class WordSearch {
    public boolean exist(char[][] board, String word) {
        for (var row = 0; row < board.length; row++) {
            for (var col = 0; col < board[row].length; col++) {
                if (board[row][col] == word.charAt(0) && searchWord(row, col, board, word, 0)) {
                    return true;
                }
            }
        }
        return false;
    }

    private boolean searchWord(int row, int col, char[][] board, String word, int index) {
        if (index == word.length()) {
            return true;
        }

        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length
                || board[row][col] != word.charAt(index)) {
            return false;
        }

        var temp = board[row][col];
        board[row][col] = '#';

        var found = searchWord(row + 1, col, board, word, index + 1)
                || searchWord(row - 1, col, board, word, index + 1)
                || searchWord(row, col + 1, board, word, index + 1)
                || searchWord(row, col - 1, board, word, index + 1);

        board[row][col] = temp;
        return found;
    }

    public static void main(String[] args) {
        var board = new char[][] {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };

        var exercise = new WordSearch();
        System.out.println("ABCCED exists: " + exercise.exist(board, "ABCCED"));
    }
}
