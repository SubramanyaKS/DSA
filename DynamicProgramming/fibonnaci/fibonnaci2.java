/**
 * Fibonnaci series using space optimization
 */
import java.util.Scanner;

public class fibonnaci2 {
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n =in.nextInt();
        in.close();
        System.out.println(fib2(n));
    }
    public static int fib2(int n){
        
        int p1=1;
        int p2=0;
        for(int i=2;i<=n;i++){
            int cur=p1+p2;
            p2=p1;
            p1=cur;

        }
        return p1;

    }
}
