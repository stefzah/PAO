package ex1;

public class OutTask implements Task {

    String sir;

    OutTask(String sir){
        this.sir = sir;
    }

    public void execute(){
        System.out.println(sir);
    }

}
