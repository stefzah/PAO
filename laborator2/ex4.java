package lab2;

import java.util.*;
public class ex4
{
    public static void main(){
    Student[] studenti = new Student[50];
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<3;i++)
        studenti[i] =new Student(sc.next(),sc.nextInt());
    for(int i=0;i<3;i++)
        studenti[i].showInfo(); 
    }
}
