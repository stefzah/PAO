package tema;

import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        int lena = a.length();
        int lenb = b.length();
        int ok = 0;
        if (lena != lenb) {
            System.out.println("Sirurile nu sunt anagrame");
            ok = 1;
        }
        if (ok == 0) {
            char[] A = a.toCharArray();
            char[] B = b.toCharArray();
            Arrays.sort(A);
            Arrays.sort(B);
            for (int i = 0; i < lena; i++)
                if (A[i] != B[i]) {
                    ok = 1;
                    System.out.println("Sirurile nu sunt anagrame");
                    break;
                }
            if (ok == 0)
                System.out.println("Sirurile sunt anagrame");
        }
    }
}
