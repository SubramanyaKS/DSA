/**
 * check cycle in undirected graph
 */
import java.util.ArrayList;

public class UnCycle {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean visited[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,-1)){
                    return true;
                }
            }


        }
        return false;
    }
    public boolean dfs(int i, ArrayList<ArrayList<Integer>> adj, boolean visited[], int p){
        visited[i]=true;
        for(Integer a: adj.get(i)){
            if (!visited[a]) {
                if(dfs(a, adj, visited, i)){
                    return true;
                }
                
            } else if(p!=a) {
                return true;
                
            }
        }
        return false;
    }
}
