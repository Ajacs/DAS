/*
prereqs possible

Write a method, prereqsPossible, that takes in a number of courses (n) and prerequisites as arguments. Courses have ids ranging from 0 through n - 1. A single prerequisite of List.of(A, B) means that course A must be taken before course B. The method should return a boolean indicating whether or not it is possible to complete all courses.

*/

package com.das.algorithms.graphs;

import java.util.*;

public class PrereqqsPossible {
  public static boolean prereqsPossible(int numCourses, List<List<Integer>> prereqs) {
    var visited = new HashSet<Integer>();
    var graph = buildGraph(numCourses, prereqs);
    for (var course : graph.keySet()) {
      if (detectCycle(graph, course, new HashSet<Integer>(), visited)) {
        return false;
      }
    }
    return true;
  }

  public static boolean detectCycle(
      Map<Integer, List<Integer>> graph, Integer course, HashSet<Integer> visiting, HashSet<Integer> visited) {
    if (visited.contains(course)) {
      return false;
    }

    if (visiting.contains(course)) {
      return true;
    }

    visiting.add(course);

    for (var neighbor : graph.get(course)) {
      if (detectCycle(graph, neighbor, visiting, visited)) {
        return true;
      }
    }

    visiting.remove(course);
    visited.add(course);

    return false;
  }

  public static Map<Integer, List<Integer>> buildGraph(int numCourses, List<List<Integer>> prereqs) {
    HashMap<Integer, List<Integer>> graph = new HashMap<>();
    for (int i = 0; i < numCourses; i += 1) {
      graph.put(i, new ArrayList<>());
    }

    for (List<Integer> pair : prereqs) {
      int courseA = pair.get(0);
      int courseB = pair.get(1);
      graph.get(courseA).add(courseB);
    }

    return graph;
  }

  public static void main(String[] args) {
    var prereqs = List.of(
        List.of(0, 1),
        List.of(1, 2),
        List.of(2, 3));

    System.out.println("Prerequisites: " + prereqs);
    System.out.println("Can finish:    " + prereqsPossible(4, prereqs));
  }
}
