final class TrieTemplate {
    static final class Node {
        Node[] children = new Node[26];
        boolean isWord;
    }

    private final Node root = new Node();

    void insert(String word) {
        Node current = root;
        for (char ch : word.toCharArray()) {
            int index = ch - 'a';
            if (current.children[index] == null) {
                current.children[index] = new Node();
            }
            current = current.children[index];
        }
        current.isWord = true;
    }
}

