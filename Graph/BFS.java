import java.util.*;

public class BFS {
    private int V;
    private LinkedList<Integer> adj[];

    // constructor
    BFS(int v) {
        V = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFSTraversal(int source) {
        //visited array
        boolean visited[] = new boolean[V];
        //queue declaration
        LinkedList<Integer> queue = new LinkedList<>();
        //set the visited of root/source to true
        visited[source] = true;
        //add the source to queue
        queue.add(source);
        //untile queue is empty do following
        while (queue.size() != 0) {
            //remove the front element and add to source
            source = queue.poll();
            System.out.print(source + " ");
            //check the neighbouring node of source through iteration 
            Iterator<Integer> i = adj[source].listIterator();
            //until all neighbouring nodes
            while (i.hasNext()) {
                int neighbourNode = i.next();
                //if the node is not visted 
                //then mark it has visited
                //add the node to queue
                if (!visited[neighbourNode]) {
                    visited[neighbourNode] = true;
                    queue.add(neighbourNode);
                }
            }
        }

    }

    public static void main(String[] args) {
        BFS b = new BFS(4);
        b.addEdge(0, 1);
        b.addEdge(0, 2);
        b.addEdge(1, 2);
        b.addEdge(2, 0);
        b.addEdge(2, 3);
        b.addEdge(3, 3);
        b.BFSTraversal(2);
    }

}
