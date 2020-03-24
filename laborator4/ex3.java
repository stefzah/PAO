package tema;

import java.util.Scanner;


public class ex3 {

    public static boolean Prim(Integer x) {
        for (int i = 2; i <= Math.sqrt(x); i++)
            if (x % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        int n, m, ct = 0;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        Integer[][] A = new Integer[n][m];
        Integer[][] B = new Integer[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                A[i][j] = scanner.nextInt();
                if (Prim(A[i][j])) B[i][j] = 0;
                else {
                    B[i][j] = 1;
                    ct++;
                }
            }
        }
        System.out.println(ct);
    }
}
