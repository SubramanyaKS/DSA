package SubsetSum;

//import java.util.*;

public class CountSubset {
    public static void main(String[] args) {
        int n = 4;
        int a[] = { 3, 5,6,7};
        int sum = 9;
        System.out.println(countSubSet(a, n, sum));
    }

    public static int countSubSet(int a[], int n, int sum) {
        int tab[][] = new int[n + 1][sum + 1];
        tab[0][0] = 1;

        for (int i = 1; i <= sum; i++)
            tab[0][i] = 0;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j <= sum; j++) {
                if (a[i - 1] > j)
                    tab[i][j] = tab[i - 1][j];

                else {
                    tab[i][j] = tab[i - 1][j] + tab[i - 1][j - a[i - 1]];
                }
            }
        }
        return tab[n][sum];
    }
}
