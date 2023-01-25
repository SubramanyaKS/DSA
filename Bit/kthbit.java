import java.util.Scanner;
public class kthbit{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k  =in.nextLong();
        in.close();
        kthbit kb = new kthbit();
        kb.findkthbit1(n,k);

    }
    public void findkthbit1(long n,long k){
        System.out.println(((n & (1<<(k-1)))>>(k-1)));
    }
}