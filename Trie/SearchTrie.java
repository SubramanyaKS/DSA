public class SearchTrie {
    static TrieNode root = new TrieNode();
    public static boolean search(String key){
        for (int i = 0; i < key.length(); i++) {
            int index = key.charAt(i)-'a';
            if(root.children[index]==null){
                return false;
            }
            if(i==key.length()-1 && root.children[index].endOfWord==false){
                return false;
            }
           
        }
        return true;
    }
}
