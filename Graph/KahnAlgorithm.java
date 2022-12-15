/**
 * Topological Sort using BFS
 */
import java.util.*;
public class KahnAlgorithm {
    static int[] topoSort(int v, ArrayList<ArrayList<Integer>> adj){
        boolean visited[]= new boolean[v];
        int inDegree[] = new int[v];
        for(ArrayList<Integer> list :adj){
            for(Integer e:list){
                inDegree[e]++;
            }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        bfs(adj,v,0,visited,ans,inDegree);
        int a[] = new int[v];
        int i=0;
        for(int e :ans){
            a[i++]=e;
        }
        return a;
    }
    static void bfs(ArrayList<ArrayList<Integer>> adj, int v,int p, boolean visited[],ArrayList<Integer> ans, int inDegree[]){
        Queue<Integer> queue = new  LinkedList<>();
        for(int i=0;i<v;i++){
            if(inDegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int current=queue.poll();
            ans.add(current);
            for(int n: adj.get(current)){
                if(--inDegree[n]==0){
                    queue.add(n);
                }
            }
        }
    }

    
}
