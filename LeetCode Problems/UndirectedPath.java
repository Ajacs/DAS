/*

undirected path
Write a method, undirectedPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB). The method should return a boolean indicating whether or not there exists a path between nodeA and nodeB.



*/

import java.util.*;

class Source {
  public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
    var visited = new HashSet<String>();
    var graph = buildGraph(edges);

    return dfs(graph, nodeA, nodeB, visited);
  }

  public static boolean dfs(Map<String, List<String>> graph, String src, String dst, Set<String> visited) {
    if (src == dst) {
      return true;
    }

    if (visited.contains(src)) {
      return false;
    }

    visited.add(src);

    for (var neighbor : graph.get(src)) {
      if (dfs(graph, neighbor, dst, visited)) {
        return true;
      }
    }

    return false;
  }

  public static Map<String, List<String>> buildGraph(List<List<String>> edges) {
    var graph = new HashMap<String, List<String>>();
    for (var pair : edges) {
      var nodeA = pair.get(0);
      var nodeB = pair.get(1);

      graph.computeIfAbsent(nodeA, k -> new ArrayList<>()).add(nodeB);
      graph.computeIfAbsent(nodeB, k -> new ArrayList<>()).add(nodeA);
    }

    return graph;
  }

  public static void run() {
    // this function behaves as `main()` for the 'run' command
    // you may sandbox in this function , but should not remove it
  }
}