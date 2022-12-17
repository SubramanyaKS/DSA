class Edge implements Comparable<Edge>{
    int src,dest,wt;

    Edge(int src,int dest,int wt){
        this.src=src;
        this.dest=dest;
        this.wt=wt;
    }
    public int compareTo(Edge that){
        return this.wt-that.wt;
    }
}