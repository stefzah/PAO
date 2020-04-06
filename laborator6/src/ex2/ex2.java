package ex2;

import javax.sound.midi.SysexMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) throws IOException {

        FileInputStream fin = new FileInputStream("parole.txt");
        StringBuilder S = new StringBuilder();
        int c;
        while ((c = fin.read()) != -1) {
            char k = (char) c;
            S.append(k);
        }
        ArrayList<String> STR = new ArrayList<>();
        StringBuilder str = new StringBuilder("");
        for (int i = 0; i < S.length(); i++) {
            if (Character.isDigit(S.charAt(i)) || Character.isLetter(S.charAt(i)))
                str.append(S.charAt(i));
            else if (Character.isDigit(S.charAt(i - 1)) || Character.isLetter(S.charAt(i - 1))) {
                STR.add(str.toString());
                str.delete(0, str.length());
            }
        }
        STR.add(str.toString());

        Scanner scanner = new Scanner(System.in);
        int ct_wrong = 0;
        int[] ct = new int[STR.size() / 2];
        boolean ok = false;
        while (!ok) {
            int poz = 0;
            boolean kk = false;
            String usr = scanner.nextLine();
            String pwd = scanner.nextLine();
            for (int i = 0; i < STR.size(); i += 2) {
                if (usr.equals(STR.get(i)) && pwd.equals(STR.get(i + 1))) {
                    System.out.println("Acces permis");
                    ok = true;
                    break;
                } else if (usr.equals(STR.get(i))) {
                    poz = i / 2;
                    kk = true;
                    break;
                }
            }
            if (!ok && !kk) {
                ct_wrong++;
                System.out.println("User inexistent");
                if (ct_wrong >= 5) {
                    System.out.println("Nu ai cont, inregistreaza-te");
                    break;
                }

            } else if (!ok) {
                ct[poz]++;
                ct_wrong++;
                System.out.println("Parola gresita");
                if (ct[poz] >= 3) {
                    System.out.println("Cont blocat");
                    break;
                }
            }
        }
    }
}

