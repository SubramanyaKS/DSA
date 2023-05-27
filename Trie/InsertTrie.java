public class InsertTrie {
   static TrieNode root = new TrieNode();
   public static void  insert(String word){
        for (int i = 0; i < word.length(); i++) {//O(L)
            int index = word.charAt(i)-'a';
            if(root.children[index]==null){
                //create a node
                root.children[index]= new TrieNode();
            }
            if(i==word.length()-1){
                root.children[index].endOfWord=true;
            }
            root= root.children[index];
        }

   }
}
//38.00
