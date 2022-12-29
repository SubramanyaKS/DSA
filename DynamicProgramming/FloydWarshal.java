public class FloydWarshal {
    final static int INF = 9999, v = 4;

    public static void main(String[] args) {
        int graph[][] = { { 0, 3, INF, 5 }, { 2, 0, INF, 4 }, { INF, 1, 0, INF }, { INF, INF, 2, 0 } };
        floyd(graph);
    }
    public static void floyd(int[][] graph){
        int dist[][] = new int[v][v];

        //coping graph to distance matrix
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                dist[i][j]=graph[i][j];

                
            }
            
        }
        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    if(dist[i][k]==INF || dist[k][j]==INF){
                        continue;
                    }
                    else if(dist[i][k]+dist[k][j]<dist[i][j]){
                        dist[i][j]=dist[i][k]+dist[k][j];

                    }
                    
                }
                
            }
            
        }

        for (int i = 0; i < dist.length; i++) {
            if(dist[i][i]<0){
                System.out.print("Negative edge cycle");
                return;
            }
        }

        printMatrix(dist);
    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                System.out.print(matrix[i][j] + "  ");
                
            }
            System.out.println();
            
        }
    }

}