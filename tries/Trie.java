import java.util.Map;

public class Trie {
    private TrieNode trieNode;

    public Trie() {
        trieNode = new TrieNode();
    }

    //DOG
    public void addWord(String s) {
        //go over each char and build the Trie
        for(char c : s.toCharArray()) {
            //check if char present in the 
            if(!wordMap.containsKey(c)) {
                wordMap.put(c, new TrieNode(c));
            }
        }
    }
}

class TrieNode {
    public Map<Character, Node> map;
    public boolean isWord;

    public TrieNode() {
        map = new HashMap<>();
        isWord = false;
    }
}

