package ex1;

public class RandomOutTask implements Task {

    int nr;

    RandomOutTask(){
        nr = (int) (Math.random()*1000);
    }

    public void execute(){
        System.out.println(nr);
    }

}
