import java.util.*;
/**
 * TopologicalSort
 */
public class TopologicalSort {
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj){
        boolean visted[] = new boolean[v];
        Stack<Integer> st = new Stack<Integer>();
        for(int i=0;i<v;i++){
            if(!visted[i]){
                dfs(adj,i,st,visted);
            }
        }
        int ans[] = new int[v];
        int i=0;
        while(!st.isEmpty()){
            ans[i++]= st.pop();
        }
        return ans;


    }
    static void dfs(ArrayList<ArrayList<Integer>> adj, int v, Stack<Integer> st, boolean visited[]){
        visited[v]=true;
        for(int n: adj.get(v)){
            if(!visited[n]){
                dfs(adj, n, st, visited);
            }
        }
        st.push(v);

    }

    
}