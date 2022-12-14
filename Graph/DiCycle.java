import java.util.*;
public class DiCycle {
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj){
        boolean visited[] = new boolean[V];
        boolean res[] = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                if(dfs(i,adj,visited,res)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean dfs(int v,ArrayList<ArrayList<Integer>> adj, boolean visited[],boolean res[]){
        visited[v]=true;
        res[v]=true;
        for(Integer a: adj.get(v)){
            if(!visited[a]){
                if(dfs(a,adj,visited,res)){
                    return true;
                }
            }
            else if(res[a]){
                return true;

            }
        }
        res[v]=false;
        return false;

    }
}
