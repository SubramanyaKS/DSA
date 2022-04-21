import java.util.*;
public class PowerOfTwo{
    public static boolean isPowerOfTwo(int n){
        if(n==1){
            return true;
        }
        if(n<=0 || n%2!=0){
            return false;
        }
        return isPowerOfTwo(n/2);
    }
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        in.close();
        boolean r = isPowerOfTwo(n);
        System.out.println(r);


    }
}