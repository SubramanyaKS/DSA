import java.util.*;

public class DFS {
    private LinkedList<Integer> adjLists[];
    private boolean visited[];

    DFS(int v) {
        adjLists = new LinkedList[v];
        visited = new boolean[v];

        for (int i = 0; i < v; i++)
            adjLists[i] = new LinkedList<Integer>();
    }

    void addEdge(int src, int dest) {
        adjLists[src].add(dest);
    }

    void DFSTraversal(int v) {
        visited[v] = true;
        System.out.println(v + " ");
        Iterator<Integer> ite = adjLists[v].listIterator();
        while (ite.hasNext()) {
            int adj = ite.next();
            if (!visited[adj])
                DFSTraversal(adj);
        }
    }

    public static void main(String[] args) {
        DFS d = new DFS(4);
        d.addEdge(0, 1);
        d.addEdge(0, 2);
        d.addEdge(1, 2);
        d.addEdge(2, 3);

        d.DFSTraversal(2);
    }

}