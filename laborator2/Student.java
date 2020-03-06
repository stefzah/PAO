package lab2;

import java.util.*;
public class Student
{
    private String nume;
    private int nota;
    /**
     * Constructor for objects of class Student
     */
    public Student(String nume, int nota)
    {
        this.nume = nume;
        this.nota = nota;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void showInfo()
    {
        System.out.println("Studentul "+this.nume+" are nora "+this.nota);
    }
}
