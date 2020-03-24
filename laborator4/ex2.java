package tema;

import java.util.Scanner;

public class ex2 {

    public static boolean Palindrom(String str) {
        for (int i = 0; i < str.length() / 2; i++)
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) return false;
        return true;
    }

    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        String[] a = new String[n];
        String[] b = new String[n];
        int ct = 0;
        int mx = 0;
        scanner.nextLine();
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextLine();
            if (Palindrom(a[i])) {
                b[ct] = a[i];
                mx=Math.max(mx, b[ct].length());
                ct++;
            }
        }
        System.out.println("Palindroamele sunt:");
        for (int i = 0; i < ct; i++)
            System.out.println(b[i]);
        System.out.println("Lungimea celui mai mare palindrom este: "+mx);
    }
}
