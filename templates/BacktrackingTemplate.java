import java.util.*;

final class BacktrackingTemplate {
    static void generate(
        List<Integer> choices,
        int start,
        List<Integer> current,
        List<List<Integer>> result
    ) {
        result.add(new ArrayList<>(current));

        for (int i = start; i < choices.size(); i++) {
            current.add(choices.get(i));       // choose
            generate(choices, i + 1, current, result); // explore
            current.remove(current.size() - 1); // undo
        }
    }
}

