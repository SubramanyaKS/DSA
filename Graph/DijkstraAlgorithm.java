import java.util.*;
public class DijkstraAlgorithm {
    static int[] spanningTree(int v,int s, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        PriorityQueue <Pair> pq= new PriorityQueue<>();
        boolean visited[] = new boolean[v];
        int arr[] = new int[v];
        pq.add(new Pair(s,0));
        arr[s]=0;
        while (pq.size()!=0) {
            Pair cur = pq.remove();
            int u=cur.v;
            //if current node is visited then continue
            if(visited[u]){
                continue;
            }
            //get the weight and mark visited has true
            visited[u]=true;
            //get the neighbour
            ArrayList<ArrayList<Integer>> n = adj.get(u);
            for(ArrayList<Integer> list: n){
                //get the vertex and weight
                int vertex= list.get(0);
                int wt=list.get(1);
                if(arr[vertex]>arr[u]+wt){
                    arr[vertex]=arr[u]+wt;
                    pq.add(new Pair(vertex,arr[vertex]));
                }
            }
        }
        return arr;

    }

    
}
