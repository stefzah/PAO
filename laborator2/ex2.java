package lab2;

import java.util.*;
public class ex2{
    public static void main(){
    int n = 10;
    int[] array_par = new int[n];
    int[] array_impar = new int[n];
    int ct_par=0;
    int ct_impar=0;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++)
       {int val=sc.nextInt();
        if(val%2==0){array_par[ct_par]=val;ct_par++;}
          else {array_impar[ct_impar]=val;ct_impar++;}
       }
    if(ct_par>ct_impar) System.out.println("Sunt mai multe elemente pare");
      else if(ct_par<ct_impar) System.out.println("Sunt mai multe elemente impare");
      else System.out.println("Numarul de elemente pare este egal cu cel de elemente impare");
}
}