import java.util.*;
public class Main {

    public static void main(String[] args) {
        Trie2 head = new Trie2();
 
        head.insert("techie");
        head.insert("techi");
        head.insert("tech");
 
        System.out.println(head.search("tech"));            // true
        System.out.println(head.search("techi"));           // true
        System.out.println(head.search("techie"));          // true
        System.out.println(head.search("techiedelight"));   // false
 
        head.insert("techiedelight");
 
        System.out.println(head.search("tech"));            // true
        System.out.println(head.search("techi"));           // true
        System.out.println(head.search("techie"));          // true
        System.out.println(head.search("techiedelight"));   // true
    }
}
class Trie2{
    // Define the alphabet size (26 characters for `a – z`)
    private static final int CHAR_SIZE = 26;
 
    private boolean isLeaf;
    private List<Trie2> children = null;
 
    // Constructor
    Trie2()
    {
        isLeaf = false;
        children = new ArrayList<>(Collections.nCopies(CHAR_SIZE, null));
    }
 
    // Iterative function to insert a string into a Trie
    public void insert(String key)
    {
        System.out.println("Inserting \"" + key + "\"");
 
        // start from the root node
        Trie2 curr = this;
 
        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // create a new Trie node if the path does not exist
            if (curr.children.get(c - 'a') == null) {
                curr.children.set(c - 'a', new Trie2());
            }
 
            // go to the next node
            curr = curr.children.get(c - 'a');
        }
 
        // mark the current node as a leaf
        curr.isLeaf = true;
    }
 
    // Iterative function to search a key in a Trie. It returns true
    // if the key is found in the Trie; otherwise, it returns false
    public boolean search(String key)
    {
        System.out.print("Searching \"" + key + "\" : ");
 
        Trie2 curr = this;
 
        // do for each character of the key
        for (char c: key.toCharArray())
        {
            // go to the next node
            curr = curr.children.get(c - 'a');
 
            // if the string is invalid (reached end of a path in the Trie)
            if (curr == null) {
                return false;
            }
        }
 
        // return true if the current node is a leaf node and the
        // end of the string is reached
        return curr.isLeaf;
    }
}