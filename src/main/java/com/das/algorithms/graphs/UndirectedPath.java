/*

undirected path
Write a method, undirectedPath, that takes in a list of edges for an undirected graph and two nodes (nodeA, nodeB). The method should return a boolean indicating whether or not there exists a path between nodeA and nodeB.



*/

package com.das.algorithms.graphs;

import java.util.*;

public class UndirectedPath {
  public static boolean undirectedPath(List<List<String>> edges, String nodeA, String nodeB) {
    var visited = new HashSet<String>();
    var graph = buildGraph(edges);

    return dfs(graph, nodeA, nodeB, visited);
  }

  public static boolean dfs(Map<String, List<String>> graph, String src, String dst, Set<String> visited) {
    if (src.equals(dst)) {
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

  public static void main(String[] args) {
    var edges = List.of(
        List.of("i", "j"),
        List.of("k", "i"),
        List.of("m", "k"),
        List.of("k", "l"),
        List.of("o", "n"));

    System.out.println("Edges:  " + edges);
    System.out.println("Path i -> m: " + undirectedPath(edges, "i", "m"));
  }
}
