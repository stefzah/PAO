package ex2;

import javax.swing.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Album[] A = new Album[5];
        A[0] = new Album("Album3");
        A[1] = new Album("Album2");
        A[2] = new Album("Album1");
        A[3] = new Album("Album1");
        A[4] = new Album("Album1");

        A[0].setRating(1);
        A[1].setRating(2);
        A[2].setRating(10);
        A[3].setRating(5);
        A[4].setRating(7);

        A[0].setAn(2000);
        A[1].setAn(1998);
        A[2].setAn(2005);
        A[3].setAn(2001);
        A[4].setAn(2015);

        Arrays.sort(A);
        for (int i = 0; i < 5; i++) {
            System.out.println(A[i].getNume()+" Rating:"+A[i].getRating()+" An:"+A[i].getAn());
        }
    }
}

