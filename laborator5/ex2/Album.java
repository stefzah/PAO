package ex2;

import java.util.Comparator;

public class Album implements Comparable<Album> {

    private String nume;
    private int an;
    private Integer rating;

    Album(String nume) {
        this.nume = nume;
    }

    void setAn(int an) {
        this.an = an;
    }

    void setRating(int rating) {
        this.rating = rating;
    }

    int getAn() {
        return an;
    }

    int getRating() {
        return rating;
    }

    String getNume() {
        return nume;
    }

    @Override
    public int compareTo(Album a){
        if (this.nume.compareTo(a.nume)==0)
            return this.rating.compareTo(a.rating);
        else return this.nume.compareTo(a.nume);
    }

}
