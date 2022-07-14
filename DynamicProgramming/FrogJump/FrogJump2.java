/**
 * Frog Jump using space Optimization
 */
import java.util.Scanner;
public class FrogJump2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[]=new int[n];
        for(int i=0;i<n;i++){
            height[i]=in.nextInt();
        }
        in.close();
        System.out.println(frogj(n, height));
        

    }
    public static int frogj(int n,int[] height){
        int next2=100000;
        int next1=0;
        for(int i=n-2;i>=0;i--){
            int one = Math.abs(height[i+1]-height[i]+next1);
            int two = Math.abs(height[i+2]-height[i]+next2);
            next2=next1;
            next1=Math.min(one,two);

        }
        return next1;
    }
}
