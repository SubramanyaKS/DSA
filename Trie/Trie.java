public class Trie {
    private TrieNode root;
    public Trie(){
        root= new TrieNode();

    }
    private class TrieNode{
        private boolean isWard;
        private TrieNode children[];

        public TrieNode(){
            this.children= new TrieNode[26];
            this.isWard=false;
        }

    }
    public boolean search(String word){
        TrieNode node = getNode(word);
        return node!=null && node.isWard;
    }
    public TrieNode getNode(String word){
        TrieNode curr =root;
        for(int i=0;i<word.length();i++){
            char c= word.charAt(i);
            if(curr.children[c-'a']==null){
                return null;
            }
            curr =curr.children[c-'a'];
        }
        return curr;

    }
    public void insert(String word){
        if(word==null || word.isEmpty()){
            throw new IllegalArgumentException("Invalid");

        }
        word=word.toLowerCase();
        TrieNode curr = root;
        for(int i=0; i< word.length();i++){
            char c= word.charAt(i);
            int index=c-'a';
            if(curr.children[index]==null){
                TrieNode node = new TrieNode();
                curr.children[index]=node;
                curr=node;
            }
            else{
                curr=curr.children[index];
            }
        }
        curr.isWard=true;


    }
    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.insert("word");
        System.out.println(trie.search("word"));
        System.out.println(trie.search("wor"));
    }
}
