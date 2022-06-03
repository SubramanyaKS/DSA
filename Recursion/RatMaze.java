import java.util.*;
public class RatMaze {
    static int N;
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int n=in.nextInt();
        int arr[][]=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j]=in.nextInt();
            }
        }
        in.close();
        RatMaze rat = new RatMaze();
        rat.solveMaze(arr,n);
    }
    void printSolution(int sol[][])

    {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++)
                System.out.print(" " + sol[i][j] + " ");
            System.out.println();
        }
    }
    boolean isSafe(int maze[][], int x, int y)
    {
        return (x >= 0 && x < N && y >= 0 && y < N && maze[x][y] == 1);
    }
    boolean solveMazeUtil(int maze[][], int x, int y,int sol[][])
    {

        if (x == N - 1 && y == N - 1
            && maze[x][y] == 1) {
            sol[x][y] = 1;
            return true;
        }
        if (isSafe(maze, x, y) == true) {
   
              if (sol[x][y] == 1)
                  return false;
           
            sol[x][y] = 1;
 
            if (solveMazeUtil(maze, x + 1, y, sol))
                return true;
 
           
            if (solveMazeUtil(maze, x, y + 1, sol))
                return true;
            sol[x][y] = 0;
            return false;
        }
 
        return false;
    }
    boolean solveMaze(int maze[][],int N)
    {
        int sol[][] = new int[N][N];
 
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
 
        printSolution(sol);
        return true;
    }

}
