public class Pair implements Comparable<Pair>{
    int w;
    int v;
    Pair(int v,int w){
        this.w=w;
        this.v=v;
    }
    public int compareTo(Pair that){
        return this.w=that.w;
    }

}
