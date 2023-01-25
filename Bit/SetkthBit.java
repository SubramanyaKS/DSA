import java.util.Scanner;
public class SetkthBit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = in.nextLong();
        long k  =in.nextLong();
        in.close();
        SetkthBit b = new SetkthBit(); 
        b.setBit(n, k); 
        b.resetBit(n,k);
    }
    public void setBit(long n, long k){
        System.out.println((1<<k )| n);
    }
    public void resetBit(long n, long k){
        System.out.println((n & (~(1 << (k - 1)))));
    }
}
