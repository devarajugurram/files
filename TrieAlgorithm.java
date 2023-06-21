import com.programs.Trie;

public class TrieAlgorithm {
    public static void main(String[] args) {
        Trie newTrie = new Trie();
        newTrie.insert("API");
        newTrie.insert("APIS");
        newTrie.search("MI");
    }
}
