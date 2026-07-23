import java.util.*;

class Source {
  public static int minimumIsland(List<List<String>> grid) {
    var visited = new HashSet<String>();
    var min = Double.POSITIVE_INFINITY;
    for (var r = 0; r < grid.size(); r++) {
      for (var c = 0; c < grid.get(r).size(); c++) {
        if ("L".equals(grid.get(r).get(c))) {
          var size = traverseDFS(grid, r, c, visited);
          if (size > 0) {
            min = Math.min(min, size);
          }
        }
      }
    }
    return min == Double.POSITIVE_INFINITY ? 0 : (int) min;
  }

  public static double traverseDFS(List<List<String>> grid, int r, int c, Set<String> visited) {
    // limits validations
    if (r < 0 || r >= grid.size() || c < 0 || c >= grid.get(0).size() || "W".equals(grid.get(r).get(c))) {
      return 0;
    }

    var visitedKey = r + "," + c;

    if (visited.contains(visitedKey)) {
      return 0;
    }

    visited.add(visitedKey);
    double counter = 1;

    counter += traverseDFS(grid, r + 1, c, visited);
    counter += traverseDFS(grid, r - 1, c, visited);
    counter += traverseDFS(grid, r, c + 1, visited);
    counter += traverseDFS(grid, r, c - 1, visited);

    return counter;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}