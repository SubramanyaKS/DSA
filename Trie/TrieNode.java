public class TrieNode {
    TrieNode[] children;
    boolean endOfWord;

    public TrieNode(){
        children = new TrieNode[26];
        for (int i = 0; i < 26; i++) {
            children[i]=null;
        }
        endOfWord=false;
    }
}
