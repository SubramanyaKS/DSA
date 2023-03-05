package KnapSack;

import java.util.Scanner;

/**
 * KnapSackRec
 */
public class KnapSackRec {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n= in.nextInt();
        int w[] = new int[n];
        int v[] = new int[n];
        for(int i=0;i<n;i++){
            w[i]=in.nextInt();
        }
        for(int i=0;i<n;i++){
            v[i]=in.nextInt();
        }
        int wt = in.nextInt();
        in.close();
        KnapSackRec kp = new KnapSackRec();
        System.out.println(kp.KnapSackRecursive(w, v, wt, n));
    }
    public int KnapSackRecursive(int[] w,int[] v, int wt,int n){
        if(n==0|| wt==0){
            return 0;
        }
        if(w[n-1]<=wt){
            return Math.max(v[n-1]+KnapSackRecursive(w, v, wt-w[n-1], n-1),KnapSackRecursive(w, v, wt, n-1));
        }
        return KnapSackRecursive(w, v, wt, n-1);
    }
}