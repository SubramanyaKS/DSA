/**
 * EgyptianFraction
 */
import java.util.*;
public class EgyptianFraction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int d=in.nextInt();
        in.close();
        printEF(n,d);
    }
    public static void printEF(int n,int d){
        if(n==0||d==0){
            return;
        }
        if(d%n==0){
            System.out.println("1/"+d/n);
            return;
        }
        if(n%d==0){
            System.out.println(n/d);
            return;
        }
        if(n>d){
            System.out.println(n/d+"+");
            printEF(n%d, d);
            return;
        }
        int np = d / n + 1;
        System.out.print("1/" + np + " + ");
        printEF(n*np-d, d*np);

    }
}