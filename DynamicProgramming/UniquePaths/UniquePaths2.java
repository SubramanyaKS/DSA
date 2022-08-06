package UniquePaths;

import java.util.Arrays;
import java.util.Scanner;

public class UniquePaths2 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        int m=in.nextInt();
        int n=in.nextInt();
        in.close();
        System.out.println(uniquepath(m,n));
    }
    public static int uniquepath(int m,int n){
        int next[] = new int[n];
        Arrays.fill(next, 0);
        for(int cr=m-1;cr>=0;cr--){
            int cur[] = new int[n];
            Arrays.fill(cur, 0);
            for(int cc=n-1;cc>=0;cc--){
                if(cr==m-1 && cc==n-1){
                    cur[cc]= 1;
                }
                else{
                    int mr=0;
                    int md=0;
                    if(cr<m-1){
                        md=next[cc];
                    }
                    if(cc<n-1){
                        mr=cur[cc+1];
                    }
                    cur[cc]=md+mr;
                }
            }
            next=cur;
        }
        return next[0];
    }
}
