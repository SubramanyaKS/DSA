import java.util.Scanner;

public class TowersOfHonai {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.close();
        tower(n,'A','B','C');
    }
    public static void tower(int n,char begin,char end,char temp){
        if(n==1){
            System.out.println("Move disk from "+begin+ " to "+end);
            return;
        }
        tower(n-1,begin,temp,end);
        System.out.println("Move disk from "+begin+ " to "+end);
        tower(n-1,temp,end,begin);
    }

    
}
