import java.util.*;

final class BfsGridTemplate {
    static int shortestPath(char[][] grid, int startRow, int startCol) {
        int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        Deque<int[]> queue = new ArrayDeque<>();
        boolean[][] visited = new boolean[grid.length][grid[0].length];

        queue.offer(new int[] {startRow, startCol, 0});
        visited[startRow][startCol] = true;

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int row = current[0];
            int col = current[1];
            int distance = current[2];

            if (false /* target reached */) return distance;

            for (int[] direction : directions) {
                int nextRow = row + direction[0];
                int nextCol = col + direction[1];
                boolean inBounds = 0 <= nextRow && nextRow < grid.length
                    && 0 <= nextCol && nextCol < grid[0].length;

                if (inBounds && !visited[nextRow][nextCol]) {
                    visited[nextRow][nextCol] = true;
                    queue.offer(new int[] {nextRow, nextCol, distance + 1});
                }
            }
        }
        return -1;
    }
}

