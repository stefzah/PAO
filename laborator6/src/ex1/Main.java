package ex1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner scanner = new Scanner(System.in);
        FileWriter fileWriter = new FileWriter("numbers.txt");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            try {
                if (a > b) throw new OrdineInversaExcception("The first number is bigger than the second number!");
                fileWriter.write(a + " " + b + "\n");
            } catch (OrdineInversaExcception e) {
                System.out.println(e.getMessage());
                System.out.println("A correct example would be:");
                a = new Random().nextInt(100);
                b = a + 1 + new Random().nextInt(100);
                System.out.println(a + " " + b);
            }
        }
        fileWriter.close();
    }
}
