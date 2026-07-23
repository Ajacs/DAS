/*

Closest carrot

Write a method, closestCarrot, that takes in a grid, a starting row, and a starting column. 
In the grid, "X"s are walls, "O"s are open spaces, and "C"s are carrots. 
The method should return a number representing the length of the shortest path from the starting position to a carrot. 

You may move up, down, left, or right, but cannot pass through walls (X). 
If there is no possible path to a carrot, then return -1.


*/
import java.util.*;

class Source {
  private static final int[] D_ROW = {1, -1, 0, 0};
  private static final int[] D_COL = {0, 0, 1, -1};

  public static int closestCarrot(List<List<String>> grid, int startRow, int startCol) {
    var visited = new HashSet<List<Integer>>();
    var queue = new ArrayDeque<List<Integer>>();
    queue.add(List.of(startRow, startCol, 0));

    visited.add(List.of(startRow, startCol));

    while (!queue.isEmpty()) {
      var node = queue.poll();
      var row = node.get(0);
      var col = node.get(1);
      var distance = node.get(2);

      if ("C".equals(grid.get(row).get(col))) {
        return distance;
      }

      for (var i = 0; i < 4; i++) {
        var deltaRow = D_ROW[i];
        var deltaCol = D_COL[i];
        var newRow = row + deltaRow;
        var newCol = col + deltaCol;
        var key = List.of(newRow, newCol);

        var rowInbounds = 0 <= newRow && newRow < grid.size();
        var colInbounds = 0 <= newCol && newCol < grid.get(0).size();

        if (!visited.contains(key) && rowInbounds && colInbounds && !"X".equals(grid.get(newRow).get(newCol))) {
          visited.add(key);
          queue.add(List.of(newRow, newCol, distance + 1));
        }
      }
    }
    return -1;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}