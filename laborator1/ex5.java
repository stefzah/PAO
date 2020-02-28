package lab1;
import java.util.*;

public class ex5{
    public static boolean main(String [] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean ok = true;
        for(int i=2;i<=n/2;i++){
           if(n%i==0){
               ok=false;
               break;
            }
        }
        System.out.println(ok);
        return ok;
    }    
}