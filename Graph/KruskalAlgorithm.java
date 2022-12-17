import java.util.ArrayList;

public class KruskalAlgorithm {
    static int p[],rank[];

    static void union(int x,int y){
        int rx=find(x);
        int ry=find(y);
        if(rx==ry){
            return;
        }
        p[ry]=rx;
    }

    static int find(int x){
        if(p[x]==x){
            return x;
        }
        return find(p[x]);
    }

    static int spanningTree(int v, ArrayList<ArrayList<ArrayList<Integer>>> adj){
        boolean added[][] = new boolean[v][v];
        ArrayList<Edge> = new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            for (int j = 0; j < adj.get(i).size(); j++) {
                
            }
        }
    }
}
