import java.util.*;

public class PrimsAlgorithm {


    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        int ans=0;
        PriorityQueue <Pair> pq= new PriorityQueue<>();
        boolean visited[] = new boolean[v];
        pq.add(new Pair(0,0));
        while (pq.size()!=0) {
            Pair cur = pq.remove();
            int u=cur.v;
            //if current node is visited then continue
            if(visited[u]){
                continue;
            }
            //get the weight and mark visited has true
            ans=cur.w;
            visited[u]=true;
            //get the neighbour
            ArrayList<ArrayList<Integer>> n = adj.get(u);
            for(ArrayList<Integer> list: n){
                //get the vertex and weight
                int vertex= list.get(0);
                int wt=list.get(1);
                if(visited[vertex]==false){
                    pq.add(new Pair(vertex,wt));
                }
            }
        }
        return ans;

    }
    
}
