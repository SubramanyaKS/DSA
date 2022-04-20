import java.util.*;
public class ClimbStair {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        System.out.println(ways(n));
        
    }
    public static int ways(int n){
        return climb(n+1);
    }
    public static int climb(int n){
        if(n<=1){
            return n;
        }
        return climb(n-1)+climb(n-2);
    }
}
