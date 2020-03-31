package laborator5;

public class CounterOutTask implements Task{

    static int contor;

    public void execute(){
        contor++;
        System.out.println(contor);
    }

}
