package lab2;
import java.util.*;
public class ex1{
    public static void main(){
    int n = 100;
    int[] array = new int[n];
    double sum=0;
    int counter=0;
    Scanner sc = new Scanner(System.in);
    for(int i=0;i<n;i++)
       {array[i]=sc.nextInt();
        if(array[i]!=-1)counter++;
          else break;
        sum+=array[i];
       }
    sum/=counter;
    System.out.println(sum);
}
}