package laborator5;

public class Main {

    public static void main(String[] args) {

        OutTask A = new OutTask("Hello");
        A.execute();

        RandomOutTask B = new RandomOutTask();
        B.execute();

        CounterOutTask C = new CounterOutTask();
        C.execute();
        C.execute();
        C.execute();
    }
}
