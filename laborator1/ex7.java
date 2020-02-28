package lab1;
import java.util.*;

public class ex7{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a=1,b=1,aux=0;
        if(n==1)System.out.println(a);
        else if(n==2)System.out.println(b);
        else {
          for(int i=3;i<=n;i++){
             aux=a+b;
             b=a;
             a=aux;
          }
        System.out.println(a);
       }
    }    
}