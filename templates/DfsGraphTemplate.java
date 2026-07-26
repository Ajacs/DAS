import java.util.*;

final class DfsGraphTemplate {
    static boolean hasPath(
        Map<Integer, List<Integer>> graph,
        int source,
        int destination,
        Set<Integer> visited
    ) {
        if (source == destination) return true;
        if (!visited.add(source)) return false;

        for (int neighbor : graph.getOrDefault(source, List.of())) {
            if (hasPath(graph, neighbor, destination, visited)) return true;
        }
        return false;
    }
}

