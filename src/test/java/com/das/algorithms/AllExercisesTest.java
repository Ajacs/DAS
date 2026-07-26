package com.das.algorithms;

import com.das.algorithms.arrays.*;
import com.das.algorithms.backtracking.*;
import com.das.algorithms.graphs.*;
import com.das.algorithms.grids.*;
import com.das.algorithms.hashingstrings.*;
import com.das.algorithms.matrices.*;
import com.das.algorithms.slidingwindow.*;
import java.util.*;

public final class AllExercisesTest {
    private static int passed;

    public static void main(String[] args) {
        testRunningSum();
        testMergeSortedArrays();
        testTrappingRainWater();
        testGroupAnagrams();
        testRotateImage();
        testUndirectedPath();
        testPrerequisites();
        testNumberOfIslands();
        testMinimumIsland();
        testClosestCarrot();
        testSlidingWindowExercises();
        testWordSearch();
        testWordSearchII();

        System.out.println("All tests passed: " + passed);
    }

    private static void testRunningSum() {
        assertArrayEquals(new int[] {1, 3, 6}, new RunningSumOf1DArray().runningSum(new int[] {1, 2, 3}));
        assertArrayEquals(new int[] {-2}, new RunningSumOf1DArray().runningSum(new int[] {-2}));
    }

    private static void testMergeSortedArrays() {
        int[] nums = {1, 3, 0, 0};
        new MergeSortedArrays().merge(nums, 2, new int[] {2, 4}, 2);
        assertArrayEquals(new int[] {1, 2, 3, 4}, nums);

        int[] emptyFirst = {0};
        new MergeSortedArrays().merge(emptyFirst, 0, new int[] {1}, 1);
        assertArrayEquals(new int[] {1}, emptyFirst);
    }

    private static void testTrappingRainWater() {
        var exercise = new TrappingRainWater();
        assertEquals(6, exercise.trap(new int[] {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1}));
        assertEquals(0, exercise.trap(new int[] {1, 2, 3}));
    }

    private static void testGroupAnagrams() {
        var groups = new GroupAnagrams().groupAnagrams(new String[] {"eat", "tea", "bat"});
        Set<Set<String>> normalized = new HashSet<>();
        for (List<String> group : groups) normalized.add(new HashSet<>(group));
        assertEquals(Set.of(Set.of("eat", "tea"), Set.of("bat")), normalized);
    }

    private static void testRotateImage() {
        int[][] matrix = {{1, 2}, {3, 4}};
        new RotateImage().rotate(matrix);
        assertMatrixEquals(new int[][] {{3, 1}, {4, 2}}, matrix);
    }

    private static void testUndirectedPath() {
        var edges = List.of(List.of("a", "b"), List.of("b", "c"), List.of("x", "y"));
        assertTrue(UndirectedPath.undirectedPath(edges, "a", "c"));
        assertFalse(UndirectedPath.undirectedPath(edges, "a", "x"));
    }

    private static void testPrerequisites() {
        assertTrue(PrereqqsPossible.prereqsPossible(3, List.of(List.of(0, 1), List.of(1, 2))));
        assertFalse(PrereqqsPossible.prereqsPossible(2, List.of(List.of(0, 1), List.of(1, 0))));
    }

    private static void testNumberOfIslands() {
        char[][] grid = {{'1', '0'}, {'0', '1'}};
        assertEquals(2, new NumberOfIslands().numIslands(grid));
    }

    private static void testMinimumIsland() {
        var grid = List.of(
            List.of("L", "W", "L"),
            List.of("L", "W", "W"),
            List.of("W", "W", "L")
        );
        assertEquals(1, MinimalIslands.minimumIsland(grid));
    }

    private static void testClosestCarrot() {
        var grid = List.of(
            List.of("O", "O", "C"),
            List.of("X", "X", "O")
        );
        assertEquals(2, ClosestCarrot.closestCarrot(grid, 0, 0));
        assertEquals(0, ClosestCarrot.closestCarrot(List.of(List.of("C")), 0, 0));
    }

    private static void testSlidingWindowExercises() {
        assertEquals(List.of(1, 3), FindSubarraySum.findSubarraySum(List.of(1, 2, 3, 7, 5), 12));
        assertEquals(4, LongestSubarraySum.longestSubarraySum(List.of(1, 2, 1, 1, 1), 5));
        assertEquals(3, LongestUniqueSubstring.longestUniqueSubstring("abcabcbb"));
        assertTrue(HasSubstringAnagram.hasSubstringAnagram("cbaebabacd", "abc"));
        assertTrue(HasSubstringAnagram.hasSubstringAnagram("baa", "aa"));
        assertEquals(3, CountSubstringAnagrams.countSubstringAnagrams("catact", "cat"));
        assertEquals(8, CountSubarrayProduct.countSubarrayProduct(List.of(10, 5, 2, 6), 100));
        assertEquals(12, CountSubstringAtMostKDistinct.countSubstringAtMostKDistinct("pqpqs", 2));
        assertEquals(7, CountSubstringExactlyKDistinct.countSubstringExactlyKDistinct("pqpqs", 2));
        assertEquals(4, LongestTwoCharSubstring.longestTwoCharSubstring("ecebaaa"));
        assertEquals(0, LongestTwoCharSubstring.longestTwoCharSubstring("aaaa"));
        assertEquals(5, MaxOnesWithSingleFlip.maxOnesWithSingleFlip("10110110"));
    }

    private static void testWordSearch() {
        char[][] board = {
            {'A', 'B', 'C', 'E'},
            {'S', 'F', 'C', 'S'},
            {'A', 'D', 'E', 'E'}
        };
        char[][] original = copy(board);
        var exercise = new WordSearch();
        assertTrue(exercise.exist(board, "ABCCED"));
        assertMatrixEquals(original, board);
        assertFalse(exercise.exist(board, "ABCB"));
    }

    private static void testWordSearchII() {
        char[][] board = {
            {'o', 'a', 'a', 'n'},
            {'e', 't', 'a', 'e'},
            {'i', 'h', 'k', 'r'},
            {'i', 'f', 'l', 'v'}
        };
        var found = new WordSearchII().findWords(board, new String[] {"oath", "pea", "eat", "rain"});
        assertEquals(Set.of("oath", "eat"), new HashSet<>(found));
    }

    private static char[][] copy(char[][] matrix) {
        char[][] result = new char[matrix.length][];
        for (int i = 0; i < matrix.length; i++) result[i] = matrix[i].clone();
        return result;
    }

    private static void assertTrue(boolean condition) {
        if (!condition) throw new AssertionError("Expected true");
        passed++;
    }

    private static void assertFalse(boolean condition) {
        if (condition) throw new AssertionError("Expected false");
        passed++;
    }

    private static void assertEquals(Object expected, Object actual) {
        if (!Objects.equals(expected, actual)) {
            throw new AssertionError("Expected " + expected + " but got " + actual);
        }
        passed++;
    }

    private static void assertArrayEquals(int[] expected, int[] actual) {
        if (!Arrays.equals(expected, actual)) {
            throw new AssertionError("Expected " + Arrays.toString(expected)
                + " but got " + Arrays.toString(actual));
        }
        passed++;
    }

    private static void assertMatrixEquals(int[][] expected, int[][] actual) {
        if (!Arrays.deepEquals(expected, actual)) {
            throw new AssertionError("Expected " + Arrays.deepToString(expected)
                + " but got " + Arrays.deepToString(actual));
        }
        passed++;
    }

    private static void assertMatrixEquals(char[][] expected, char[][] actual) {
        if (!Arrays.deepEquals(expected, actual)) {
            throw new AssertionError("Expected " + Arrays.deepToString(expected)
                + " but got " + Arrays.deepToString(actual));
        }
        passed++;
    }
}
