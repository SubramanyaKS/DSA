/**
 * Climb Strair using space optimization
 * 
 * TC O(N) SP O(1)
 */
import java.util.Scanner;

public class ClimbStrair2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        System.out.println(noways(n));
    }
    public static int noways(int n){
        int next2=0;
        int next1=1;
        for(int i=n-1;i>=0;i--){
            int s=next1+next2;
            next2=next1;
            next1=s;
        }
        return next1;
    }
}
