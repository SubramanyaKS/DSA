import java.util.*;
public class ReliabilityDesign {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int cost[] = new int[n];
        double reli[] = new double[n];
        int s=0;
        for(int i=0;i<n;i++){
            cost[i]=in.nextInt();
            s+=cost[i];
        }
        for(int j=0;j<n;j++){
            reli[j]=in.nextDouble();
        }
        int maxc=in.nextInt();
        in.close();
        int ub[] = new int[n];
        int r=maxc-s;
        for(int k=0;k<n;k++){
            ub[k]=calculate(r,cost[k]);
        }
        for(int i=0;i<n;i++){
            System.out.println(ub[i]);
        }
    }
    static int calculate(int r,int a){
        return (r/a)+1;
    }
    
}
