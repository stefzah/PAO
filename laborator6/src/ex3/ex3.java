package ex3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class ex3 {

    public static void main(String[] argv) throws IOException {
        FileReader fr = new FileReader("clienti.txt");
        BufferedReader buff = new BufferedReader(fr);
        String Line;
        ArrayList<client> minori = new ArrayList<>();
        ArrayList<client> majori = new ArrayList<>();
        while ((Line = buff.readLine()) != null) {
            String[] words = Line.split(" ");
            client cl = new client();
            cl.nume = words[0];
            cl.prenume = words[1];
            cl.varsta = Integer.parseInt(words[2]);
            if (cl.varsta < 18) minori.add(cl);
            else majori.add(cl);
        }
        System.out.println("Sunt " + minori.size() + " clienti minori:");
        for (int i = 0; i < minori.size(); i++) {
            System.out.println(minori.get(i).nume+" "+minori.get(i).prenume+" "+minori.get(i).varsta);
        }

        System.out.println("Sunt " + majori.size() + " clienti majori:");
        for (int i = 0; i < majori.size(); i++) {
            System.out.println(majori.get(i).nume+" "+majori.get(i).prenume+" "+majori.get(i).varsta);
        }
    }
}
