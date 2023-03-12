import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        SumOfDigits s = new SumOfDigits();
       System.out.println( s.sumationDigit(n));

    }
    public int sumationDigit(int n){
        if(n<9){
            return n;
        }
        return sumationDigit(n/10)+n%10;
    }
}
