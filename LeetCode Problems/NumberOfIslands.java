package LeetCode Problems;

class Solution {
    public int numIslands(char[][] grid) {
        var islandsCount = 0;

        for(var r = 0; r < grid.length; r++) {
            for (var c = 0; c < grid[r].length; c++) {
                if (grid[r][c] == '1') {
                    islandsCount++;
                    dfs(grid, r, c);
                }
            }
        }

        return islandsCount;
    }

    private void dfs(char[][] grid, int r, int c) {
        if (r < 0 || r >= grid.length || c < 0 || c >= grid[r].length || grid[r][c] == '0') {
            return;
        }

        grid[r][c] = '0';
        dfs(grid, r + 1, c); // down
        dfs(grid, r - 1, c); // up
        dfs(grid, r, c + 1); // right
        dfs(grid, r, c - 1); // left
    }
}
