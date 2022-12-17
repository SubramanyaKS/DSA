import java.util.*;

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
        ArrayList<Edge> edge = new ArrayList<>();
        for(int i=0;i<adj.size();i++){
            for (int j = 0; j < adj.get(i).size(); j++) {
                ArrayList<Integer> cur= adj.get(i).get(j);
                if(!added[i][cur.get(0)]){
                    added[i][cur.get(0)]=true;
                    added[cur.get(0)][i]=true;
                    edge.add(new Edge(i,cur.get(0),cur.get(i)));
                }
                
            }
        }
        p= new int[v];
        for(int i=0;i<v;i++){
            p[i]=i;
        }
        Collections.sort(edge);
        int count=1;
        int ans=0;
        for(int i=0;count<v;i++){
            Edge edges= edge.get(i);
            int rx= find(edges.src);
            int ry= find(edges.dest);
            if(rx!=ry){
                union(rx, ry);
                count++;
                ans+=edges.wt;
            }
        }
        return ans;
    }
}
